package com.odcgroup.aaa.generation.udentities;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.odcgroup.aaa.core.AAACore;
import com.odcgroup.aaa.core.UDEHelper;
import com.odcgroup.aaa.generation.gateway.line.ATT;
import com.odcgroup.aaa.generation.gateway.line.CMD;
import com.odcgroup.aaa.generation.gateway.line.CMDType;
import com.odcgroup.aaa.generation.gateway.line.DAT;
import com.odcgroup.aaa.generation.gateway.line.value.DATBooleanValue;
import com.odcgroup.aaa.generation.gateway.line.value.DATNumberValue;
import com.odcgroup.aaa.generation.gateway.line.value.DATStringValue;
import com.odcgroup.aaa.generation.gateway.line.value.DATValue;
import com.odcgroup.aaa.generation.gateway.validator.GatewayMultiValidationException;
import com.odcgroup.aaa.generation.gateway.validator.GatewayValidationException;
import com.odcgroup.aaa.generation.gateway.validator.GatewayValidator;
import com.odcgroup.aaa.generation.gateway.writer.Generator;
import com.odcgroup.aaa.generation.gateway.writer.Settings;
import com.odcgroup.mdf.ecore.PrimitivesDomain;
import com.odcgroup.mdf.ext.aaa.AAAAspect;
import com.odcgroup.mdf.metamodel.MdfAssociation;
import com.odcgroup.mdf.metamodel.MdfAttribute;
import com.odcgroup.mdf.metamodel.MdfBusinessType;
import com.odcgroup.mdf.metamodel.MdfClass;
import com.odcgroup.mdf.metamodel.MdfConstants;
import com.odcgroup.mdf.metamodel.MdfDomain;
import com.odcgroup.mdf.metamodel.MdfEntity;
import com.odcgroup.mdf.metamodel.MdfEnumValue;
import com.odcgroup.mdf.metamodel.MdfEnumeration;
import com.odcgroup.mdf.metamodel.MdfProperty;
import com.odcgroup.mdf.metamodel.MdfReverseAssociation;
import com.odcgroup.mdf.model.translation.ModelLocaleHelper;
import com.odcgroup.translation.core.ITranslation;
import com.odcgroup.translation.core.ITranslationKind;
import com.odcgroup.translation.core.ITranslationManager;
import com.odcgroup.translation.core.TranslationCore;
import com.odcgroup.translation.core.TranslationException;
import com.odcgroup.workbench.core.IOfsModelResource;
import com.odcgroup.workbench.core.OfsCore;
import com.odcgroup.workbench.core.repository.ModelURIConverter;
import com.odcgroup.workbench.core.repository.OfsResourceHelper;
import com.odcgroup.workbench.generation.cartridge.AbstractCodeGenerator;

public class UDEntitiesCodeGenerator extends AbstractCodeGenerator {

	// xd_entity will be marked "generated by DS" with this nature_e flag
	private static final String DS_NATURE_E = "4";
	private static final String DS_SECURITY = "1";

	private static final boolean GENERATE_TRANSLATION = true;

	private final static Logger logger = LoggerFactory.getLogger(UDEntitiesCodeGenerator.class);

	private static final String INVALID = "INVALID";
	private Generator generator;
	private GatewayValidator validator;
	
	public UDEntitiesCodeGenerator() {
		Settings settings = new Settings();
		generator = new Generator(settings);
		generator.setOnlyIncludeHeadersSettings("SEPARATOR", "QUOTE");
		validator = new GatewayValidator(settings);
	}

	@Override
	public void doRun(IProject project, IContainer outputContainer,
			Collection<IOfsModelResource> modelResources, List<IStatus> nonOkStatuses) {
		if (hasTripleANature(project)) {
			Collection<IOfsModelResource> domainResources = 
					OfsResourceHelper.filter(modelResources, new String[]{"domain"});
			CMDsByTypeList cmds = new CMDsByTypeList();
			for (IOfsModelResource modelResource: domainResources) {
				MdfDomain mdfDomain = getMdfDomain(modelResource);
				if (hasUDEntityAnnotation(mdfDomain)) {
					generateCMD(project, mdfDomain, cmds, GENERATE_TRANSLATION);
				}
			}
			// Any commands generated ?
			if (!cmds.isEmpty()) {
				String gatewayFileContents;
				try {
					gatewayFileContents = generator.generateCommands(cmds.getAllCMDs(), project.getName(), OfsCore.getVersionNumber());
					writeGatewayFile(outputContainer, getGeneratedImportFile(project), gatewayFileContents);
				} catch (GatewayValidationException e) {
					String errorMsg = "Unable to generate the UD Entities gateway import file";
					newCoreException(e, nonOkStatuses, errorMsg);
				} catch (CoreException e) {
					newCoreException(e, nonOkStatuses, null);
				}
			}
		}
	}

	public static String getGeneratedImportFile(IProject project) {
		return project.getName() + "-ude.usr.imp";
	}

	private boolean hasTripleANature(IProject project) {
		return AAACore.hasAAANature(project);
	}

	private boolean hasUDEntityAnnotation(MdfDomain mdfDomain) {
		if (mdfDomain != null) {
			return AAAAspect.isTripleAUDEntities(mdfDomain);
		} else {
			return false;
		}
	}

	private MdfDomain getMdfDomain(IOfsModelResource modelResource) {
		EObject model;
		try {
			model = modelResource.getEMFModel().get(0);
			if (model instanceof MdfDomain) {
				return (MdfDomain)model;
			} else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	private void generateCMD(IProject project, MdfDomain mdfDomain, CMDsByTypeList cmds, boolean generateTranslation) {
		ITranslationManager translationManager = TranslationCore.getTranslationManager(project);
		
		// TODO: refactor by adding a method in ITranslationPreference: getAllLocales()
		List<Locale> allLocales = new ArrayList<Locale>();
		allLocales.add(translationManager.getPreferences().getDefaultLocale());
		allLocales.addAll(translationManager.getPreferences().getAdditionalLocales());
		
		for (MdfClass mdfClass : (List<MdfClass>)mdfDomain.getClasses()) {
			generate_xd_entity(mdfClass, cmds);
			if (generateTranslation) {
				generate_xd_label_for_xd_entity(translationManager, allLocales, mdfClass, cmds);
			}
			for (MdfProperty property : (List<MdfProperty>)mdfClass.getProperties()) {
				if (generateTranslation) {
					generate_xd_label_for_xd_attribute(translationManager, allLocales, property, cmds);
				}
				if (property instanceof MdfAttribute) {
					MdfAttribute attribute = (MdfAttribute)property;
					generate_xd_attribute(attribute, cmds);
					if (attribute.getType() instanceof MdfEnumeration) {
						generate_xd_attribute_parent(attribute, (MdfEnumeration)attribute.getType(), cmds);
					}
				} else if (property instanceof MdfAssociation) {
					MdfAssociation association = (MdfAssociation)property;
					generate_xd_attribute(association, cmds);
					if (isStandardEntity(association.getType())) {
						generate_xd_attribute_parent(association, cmds);
					}
					if (association.getReverse() != null) {
						generate_xd_entity_parent_entity(association.getReverse(), cmds);
					}
				} else if (property instanceof MdfReverseAssociation) {
					MdfReverseAssociation reverse = (MdfReverseAssociation)property;
					generate_xd_attribute(reverse, cmds);
				}
			}
		}
		
		for (MdfEnumeration mdfEnum : (List<MdfEnumeration>)mdfDomain.getEnumerations()) {
			for (MdfEnumValue enumValue : (List<MdfEnumValue>)mdfEnum.getValues()) {
				generate_xd_perm_value(enumValue, cmds);
				if (generateTranslation) {
					generate_xd_label_for_xd_perm_values(translationManager, allLocales, enumValue, cmds);
				}
			}
		}
		
		//DS-5258 UDE Security
		generate_security(mdfDomain, cmds);
	}
	
	/**
	 * @param mdfDomain
	 * @param cmds
	 */
	@SuppressWarnings("unchecked")
	protected void generate_security(MdfDomain mdfDomain, CMDsByTypeList cmds) {
		List<MdfClass> securedEntities = getSecuredEntities(mdfDomain.getClasses());
		generate_xd_entity_security(mdfDomain, cmds, securedEntities);
		generate_xd_attribute_security(mdfDomain, cmds, securedEntities);
		generate_xd_attribute_security_rights(mdfDomain, cmds, securedEntities);
	}
	
	/**
	 * @param mdfDomain
	 * @param cmds
	 * @param securedEntities
	 */
	private void generate_xd_attribute_security_rights(MdfDomain mdfDomain,
			CMDsByTypeList cmds, List<MdfClass> securedEntities) {
		ATT att;
		if (cmds.xd_attribute_security_rights== null) {
			cmds.xd_attribute_security_rights = new CMD(CMDType.INSUPDDEF, "xd_attribute");
			att = new ATT(
					"sqlname_c", 
					"xd_entity_id.sqlname_c",
					"name",
					"datatype_dict_id.sqlname_c",
					"calculated_e",
					"default_c",
					"parent_xd_attrib_id.sqlname_c",
					"parent_xd_attrib_id.xd_entity_id.sqlname_c",
					"edit_e",
					"subtype_mask");
			cmds.xd_attribute_security_rights.setATT(att);
			cmds.xd_attribute_security_rights.setComment("add attributes for update and delete rights");
		} else {
			att = cmds.xd_attribute_security_rights.getATT();
		}
		
		for (MdfClass mdfClass : securedEntities) {
			DAT dat1 = new DAT(new DATStringValue("update_right_f"),
					new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(mdfClass))),
					new DATStringValue("Update Right"),
					new DATStringValue("flag_t"),
					new DATNumberValue(3),
					new DATNumberValue(0),
					new DATStringValue("auth_update_f"),
					new DATStringValue("data_prof_compo"),
					new DATNumberValue(0),
					new DATNumberValue(0));
			att.addDAT(dat1);			
			DAT dat2 = new DAT(new DATStringValue("delete_right_f"),
					new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(mdfClass))),
					new DATStringValue("Delete Right"),
					new DATStringValue("flag_t"),
					new DATNumberValue(3),
					new DATNumberValue(0),
					new DATStringValue("auth_delete_f"),
					new DATStringValue("data_prof_compo"),
					new DATNumberValue(0),
					new DATNumberValue(0));
			att.addDAT(dat2);			
		}
		validate(att);
	}

	/**
	 * @param mdfDomain
	 * @param cmds
	 * @param securedEntities
	 */
	private void generate_xd_attribute_security(MdfDomain mdfDomain,
			CMDsByTypeList cmds, List<MdfClass> securedEntities) {
		ATT att;
		if (cmds.xd_attribute_security== null) {
			cmds.xd_attribute_security = new CMD(CMDType.INSUPDDEF, "xd_attribute");
			att = new ATT(
					"sqlname_c", 
					"xd_entity_id.sqlname_c",
					"name",
					"datatype_dict_id.sqlname_c",
					"ref_xd_entity_id.sqlname_c",
					"primary_f",
					"mandatory_f",
					"db_mandatory_f",
					"default_c",
					"perm_val_f",
					"business_key_f",
					"logical_f");
			cmds.xd_attribute_security.setATT(att);
			cmds.xd_attribute_security.setComment("add data security profile");
		} else {
			att = cmds.xd_attribute_security.getATT();
		}
		
		for (MdfClass mdfClass : securedEntities) {
			DAT dat = new DAT(new DATStringValue("data_secu_prof_id"),
					new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(mdfClass))),
					new DATStringValue("DataSecuProfId"),
					new DATStringValue("id_t"),
					new DATStringValue("data_secu_prof"),
					new DATNumberValue(0),
					new DATNumberValue(1),
					new DATNumberValue(1),
					new DATStringValue("NULL"),
					new DATNumberValue(0),
					new DATNumberValue(0),
					new DATNumberValue(0));
			att.addDAT(dat);			
		}
		validate(att);
	}


	/**
	 * @param domain
	 * @param cmds
	 * @param securedEntities
	 */
	private void generate_xd_entity_security(MdfDomain domain, 
			CMDsByTypeList cmds, List<MdfClass> securedEntities) {
		if (!securedEntities.isEmpty()) {
			ATT att;
			if (cmds.xd_entity_security == null) {
				cmds.xd_entity_security = new CMD(CMDType.INSUPDDEF, "xd_entity");
				att = new ATT(
						"sqlname_c",
						"secured_f");
				cmds.xd_entity_security.setATT(att);
				cmds.xd_entity_security.setComment("Active security");
			} else {
				att = cmds.xd_entity_security.getATT();
			}
			
			for (MdfClass mdfClass : securedEntities) {
				DAT dat = new DAT(
						new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(mdfClass))), 
						new DATStringValue(DS_SECURITY));
				att.addDAT(dat);			
			}
			validate(att);
		}
		
	}

	/**
	 * @param classes
	 * @return
	 */
	private List<MdfClass> getSecuredEntities(List<MdfClass> classes) {
		List<MdfClass> sList = new ArrayList<MdfClass>();
		for (MdfClass mdfClass : classes) {
			if (AAAAspect.getTripleAEntitySecured(mdfClass)) {
				sList.add(mdfClass);
			}
		}
		return sList;
	}

	protected void generate_xd_entity(MdfClass mdfClass,
			CMDsByTypeList cmds) {
		ATT att;
		if (cmds.xd_entity == null) {
			cmds.xd_entity = new CMD(CMDType.INSUPDDEF, "xd_entity");
			att = new ATT(
					"sqlname_c", 
					"name",
					"nature_e");
			cmds.xd_entity.setATT(att);
		} else {
			att = cmds.xd_entity.getATT();
		}
		
		DAT dat = new DAT(
				new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(mdfClass))), 
				new DATStringValue(mandatory(AAAAspect.getTripleAEntityName(mdfClass))),
				new DATStringValue(DS_NATURE_E));
		att.addDAT(dat);
		validate(att);
	}

	protected void generate_xd_attribute(MdfProperty property,
			CMDsByTypeList cmds) {
		ATT att;
		if (cmds.xd_attribute== null) {
			cmds.xd_attribute = new CMD(CMDType.INSUPDDEF, "xd_attribute");
			att = new ATT(
					"sqlname_c", 
					"xd_entity_id.sqlname_c",
					"name",
					"datatype_dict_id.sqlname_c",
					"ref_xd_entity_id.sqlname_c",
					"primary_f",
					"mandatory_f",
					"db_mandatory_f",
					"default_c",
					"perm_val_f",
					"business_key_f",
					"logical_f");
			cmds.xd_attribute.setATT(att);
		} else {
			att = cmds.xd_attribute.getATT();
		}
		
		String datatype_dict_id_sqlname_c = INVALID; // Will occur only with invalid model
		if (property instanceof MdfAssociation) {
			MdfAssociation assoc = (MdfAssociation) property;
			String datatype = AAAAspect.getTripleAAttributeDataType(assoc);
			if (StringUtils.isEmpty(datatype)) {
				datatype = "id_t";
			}
			datatype_dict_id_sqlname_c = datatype;
		} else if (property instanceof MdfReverseAssociation) {
			datatype_dict_id_sqlname_c = "id_t";
		} else if (property.getType() instanceof MdfBusinessType) {
			MdfBusinessType businessType = (MdfBusinessType)property.getType();
			datatype_dict_id_sqlname_c = AAAAspect.getTripleABusinessType(businessType);
		} else if (property.getType() instanceof MdfEnumeration) {
			MdfEnumeration mdfEnum = (MdfEnumeration)property.getType();
			if (isEnumBasedOnInteger(mdfEnum)) {
				datatype_dict_id_sqlname_c = "enum_t";
			} else if (isEnumBasedOnBoolean(mdfEnum)) {
				datatype_dict_id_sqlname_c = "flag_t";
			} else if (isEnumBasedOnEnumMask(mdfEnum)) {
				datatype_dict_id_sqlname_c = "enummask_t";
			}
		}
		if (datatype_dict_id_sqlname_c == INVALID) {
			logger.warn("INVALID VALUE!!", new RuntimeException("Invalid value for " + property.getQualifiedName().getQualifiedName()));
		}
		
		String ref_xd_entity_id_sqlname_c;
		if (property instanceof MdfAssociation) {
			MdfAssociation association = (MdfAssociation)property;
			ref_xd_entity_id_sqlname_c = mandatory(AAAAspect.getTripleAEntitySQLName(association.getType()));
		} else if (property instanceof MdfReverseAssociation) {
			MdfReverseAssociation reverse = (MdfReverseAssociation)property;
			ref_xd_entity_id_sqlname_c = mandatory(AAAAspect.getTripleAEntitySQLName(reverse.getType()));
		} else {
			ref_xd_entity_id_sqlname_c = null;
		}
		
		String default_c;
		if (property instanceof MdfAttribute) {
			MdfAttribute attribute = (MdfAttribute)property;
			MdfEntity type = attribute.getType();
			if (type instanceof MdfBusinessType) {
				type = ((MdfBusinessType)type).getType();
			}
			
			if (type != null) {
				if (type.equals(PrimitivesDomain.BOOLEAN) || 
						type.equals(PrimitivesDomain.BOOLEAN_OBJ)) {
					default_c = "true".equalsIgnoreCase(attribute.getDefault())?"1":"0";
				} else if (type instanceof MdfEnumeration) {
					MdfEnumeration mdfEnum = (MdfEnumeration)type;
					MdfEnumValue enumValue = mdfEnum.getValue(attribute.getDefault());
					if (enumValue != null) {
						if (mdfEnum.getType().equals(PrimitivesDomain.BOOLEAN) ||
								mdfEnum.getType().equals(PrimitivesDomain.BOOLEAN_OBJ)) {
							default_c = (enumValue.getValue().equals("true"))?"1":"0";
						} else {
							default_c = enumValue.getValue();
						}
					} else {
						default_c = INVALID; // TODO add validation rule
					}
				} else {
					default_c = attribute.getDefault();
				}
			} else {
				default_c = INVALID; // TODO add validation rule
			}
		} else {
			default_c = null;
		}
		
		int perm_val_f = 0;
		if (property.getType() instanceof MdfEnumeration) {
			perm_val_f = 1;
		}
		
		int logical_f = 0;
		if (property instanceof MdfAssociation) {
			MdfAssociation association = (MdfAssociation)property;
			if (association.getMultiplicity() == MdfConstants.MULTIPLICITY_MANY) {
				logical_f = 1;
			}
		} else if (property instanceof MdfReverseAssociation) {
			MdfReverseAssociation reverseAssociation = (MdfReverseAssociation)property;
			if (reverseAssociation.getMultiplicity() == MdfConstants.MULTIPLICITY_MANY) {
				logical_f = 1;
		}
		}
		
		DAT dat = new DAT(
				new DATStringValue(mandatory(AAAAspect.getTripleAAttributeSQLName(property))),
				new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(property.getParentClass()))),
				new DATStringValue(mandatory(AAAAspect.getTripleAAttributeName(property))),
				new DATStringValue(mandatory(datatype_dict_id_sqlname_c)),
				new DATStringValue(ref_xd_entity_id_sqlname_c),
				new DATNumberValue(property.isPrimaryKey()?1:0),
				new DATNumberValue(property.isRequired()?1:0),
				new DATNumberValue(property.isRequired()?1:0),
				new DATStringValue(default_c),
				new DATNumberValue(perm_val_f),
				new DATNumberValue(property.isBusinessKey()?1:0),
				new DATNumberValue(logical_f));
		att.addDAT(dat);
		validate(att);
	}
	
	protected void generate_xd_perm_value(MdfEnumValue enumValue,
			CMDsByTypeList cmds) {
		ATT att;
		if (cmds.xd_perm_value == null) {
			cmds.xd_perm_value = new CMD(CMDType.INSUPDDEF, "xd_perm_value");
			att = new ATT(
					"xd_attrib_id.sqlname_c",
					"xd_attrib_id.xd_entity_id.sqlname_c",
					"perm_val_nat_e",
					"name",
					"rank_n");
			cmds.xd_perm_value.setATT(att);
		} else {
			att = cmds.xd_perm_value.getATT();
		}
		
		DATValue datEnumValue;
		if (enumValue.getParentEnumeration().getType().equals(PrimitivesDomain.BOOLEAN) ||
				enumValue.getParentEnumeration().getType().equals(PrimitivesDomain.BOOLEAN_OBJ)) {
			if (enumValue.getValue().equalsIgnoreCase("true")) {
				datEnumValue = new DATBooleanValue(true);
			} else if (enumValue.getValue().equalsIgnoreCase("false")) {
				datEnumValue = new DATBooleanValue(false);
			} else if (!StringUtils.isEmpty(enumValue.getValue())) {
				datEnumValue = new DATStringValue(INVALID);
			} else {
				datEnumValue = new DATStringValue(mandatory(enumValue.getValue()));
			}
		} else {
			datEnumValue = new DATStringValue(mandatory(enumValue.getValue()));
		}
		
		MdfEnumeration mdfEnum = enumValue.getParentEnumeration();

		// Resolve attribute sql name reference
		String attributeSqlNameRef = AAAAspect.getTripleAAttributeSQLName(mdfEnum);
		String attributeSqlName = UDEHelper.getInstance().resolveAttributeSqlNameReference(enumValue, attributeSqlNameRef);
		
		// Resolve entity sql name reference
		String entitySqlNameRef = AAAAspect.getTripleAEntitySQLName(mdfEnum);
		String entitySqlName = UDEHelper.getInstance().resolveEntitySqlNameReference(enumValue, entitySqlNameRef);

		DAT dat = new DAT(
				new DATStringValue(mandatory(attributeSqlName)),
				new DATStringValue(mandatory(entitySqlName)),
				datEnumValue,
				new DATStringValue(mandatory(AAAAspect.getTripleAPermittedValueName(enumValue))),
				new DATStringValue(mandatory(AAAAspect.getTripleAPermittedValueRank(enumValue))));
		att.addDAT(dat);
		validate(att);
	}

	protected void generate_xd_attribute_parent(
			MdfAttribute attribute, MdfEnumeration mdfEnumeration, CMDsByTypeList cmds) {
		CMD cmd;
		if (cmds.xd_attribute_parent == null) {
			cmd = new CMD(CMDType.UPDATE, "xd_attribute");
			ATT att = new ATT(
					"sqlname_c",
					"xd_entity_id.sqlname_c",
					"parent_xd_attrib_id.sqlname_c",
					"parent_xd_attrib_id.xd_entity_id.sqlname_c");
			cmd.setATT(att);
		} else { 
			cmd = cmds.xd_attribute_parent;
		}
		
		// Resolve attribute sql name reference
		String enumAttributeSqlNameRef = AAAAspect.getTripleAAttributeSQLName(mdfEnumeration);
		String enumAttributeSqlName = UDEHelper.getInstance().resolveAttributeSqlNameReference(attribute, enumAttributeSqlNameRef);
		
		// Resolve entity sql name reference
		String enumEntitySqlNameRef = AAAAspect.getTripleAEntitySQLName(mdfEnumeration);
		String enumEntitySqlName = UDEHelper.getInstance().resolveEntitySqlNameReference(attribute, enumEntitySqlNameRef);
		
		String attributeAttributeSQLName = AAAAspect.getTripleAAttributeSQLName(attribute);
		String attributeEntitySQLName = AAAAspect.getTripleAEntitySQLName(attribute.getParentClass());
		
		if (!StringUtils.equals(attributeAttributeSQLName, enumAttributeSqlName) || 
				!StringUtils.equals(attributeEntitySQLName, enumEntitySqlName)) {
			DAT dat = new DAT(
					new DATStringValue(mandatory(attributeAttributeSQLName)),
					new DATStringValue(mandatory(attributeEntitySQLName)),
					new DATStringValue(mandatory(enumAttributeSqlName)),
					new DATStringValue(mandatory(enumEntitySqlName)));
			cmd.getATT().addDAT(dat);
			if (cmds.xd_attribute_parent == null) {
				cmds.xd_attribute_parent = cmd;
			}
			validate(cmd.getATT());
		}
	}
	
	protected void generate_xd_attribute_parent(
			MdfAssociation association, CMDsByTypeList cmds) {
		String parentTypeAttr = AAAAspect.getTripleAParentTypeAttr(association);
		String parentTypeEntity = AAAAspect.getTripleAParentTypeEntity(association);
		
		// Parent reference is optional
		if (StringUtils.isEmpty(parentTypeAttr) && StringUtils.isEmpty(parentTypeEntity)) {
			return;
		}
		
		// Resolve parent attribute sql name
		parentTypeAttr = UDEHelper.getInstance().resolveAttributeSqlNameReference(association, parentTypeAttr);
		
		// Resolve parent entity sql name
		parentTypeEntity = UDEHelper.getInstance().resolveEntitySqlNameReference(association,
				parentTypeEntity);

		ATT att;
		if (cmds.xd_attribute_parent == null) {
			cmds.xd_attribute_parent = new CMD(CMDType.UPDATE, "xd_attribute");
			att = new ATT(
					"sqlname_c",
					"xd_entity_id.sqlname_c",
					"parent_xd_attrib_id.sqlname_c",
					"parent_xd_attrib_id.xd_entity_id.sqlname_c");
			cmds.xd_attribute_parent.setATT(att);
		} else {
			att = cmds.xd_attribute_parent.getATT();
		}
		
		DAT dat = new DAT(
				new DATStringValue(mandatory(AAAAspect.getTripleAAttributeSQLName(association))),
				new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(association.getParentClass()))),
				new DATStringValue(mandatory(parentTypeAttr)),
				new DATStringValue(mandatory(parentTypeEntity)));
		att.addDAT(dat);
		validate(att);
	}

	protected void generate_xd_entity_parent_entity(
			MdfReverseAssociation reverseAssociation, CMDsByTypeList cmds) {
		ATT att;
		if (cmds.xd_entity_parent_entity == null) {
			cmds.xd_entity_parent_entity = new CMD(CMDType.UPDATE, "xd_entity");
			att = new ATT(
					"sqlname_c",
					"parent_xd_attrib_id.sqlname_c",
					"parent_xd_attrib_id.xd_entity_id.sqlname_c");
			cmds.xd_entity_parent_entity.setATT(att);
		} else {
			att = cmds.xd_entity_parent_entity.getATT();
		}
		DAT dat = new DAT(
				new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(reverseAssociation.getAssociation().getParentClass()))),
				new DATStringValue(mandatory(AAAAspect.getTripleAAttributeSQLName(reverseAssociation.getAssociation()))),
				new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(reverseAssociation.getAssociation().getParentClass()))));
		att.addDAT(dat);
		validate(att);
	}
	
	protected void generate_xd_label_for_xd_entity(ITranslationManager translationManager, List<Locale> allLocales, MdfClass mdfClass,
			CMDsByTypeList cmds) {
		ATT att;
		CMD cmd;
		if (cmds.xd_label_for_xd_entity == null) {
			cmd = new CMD(CMDType.INSUPDDEF, "xd_label", "xd_entity");
			att = new ATT(
					"language_dict_id.code",
					"object_id.sqlname_c",
					"name");
			cmd.setATT(att);
		} else {
			cmd = cmds.xd_label_for_xd_entity;
			att = cmd.getATT();
		}
		ITranslation translation = translationManager.getTranslation(mdfClass);
		for (Locale locale: allLocales) {
			try {
				String text = translation.getText(ITranslationKind.NAME, locale);
				if (StringUtils.isNotEmpty(text)) {
					DAT dat = new DAT(
							new DATStringValue(mandatory(ModelLocaleHelper.getInstance().convertToTALocale(locale.toString()))),
							new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(mdfClass))),
							new DATStringValue(mandatory(text)));
					att.addDAT(dat);
					validate(att);
				}
			} catch (TranslationException e) {
				// Ignore it
			}
		}
		
		if (cmds.xd_label_for_xd_entity == null && 
				att.getDATs().size() > 0) {
			cmds.xd_label_for_xd_entity = cmd;
		}
	}

	protected void generate_xd_label_for_xd_attribute(
			ITranslationManager translationManager, List<Locale> allLocales, MdfProperty property, CMDsByTypeList cmds) {
		ATT att;
		CMD cmd;
		if (cmds.xd_label_for_xd_attribute == null) {
			cmd = new CMD(CMDType.INSUPDDEF, "xd_label", "xd_attribute");
			att = new ATT(
					"language_dict_id.code",
					"object_id.sqlname_c",
					"object_id.xd_entity_id.sqlname_c",
					"name");
			cmd.setATT(att);
		} else {
			cmd = cmds.xd_label_for_xd_attribute;
			att = cmd.getATT();
		}
		
		ITranslation translation = translationManager.getTranslation(property);
		for (Locale locale: allLocales) {
			try {
				String text = translation.getText(ITranslationKind.NAME, locale);
				if (StringUtils.isNotEmpty(text)) {
					DAT dat = new DAT(
							new DATStringValue(mandatory(ModelLocaleHelper.getInstance().convertToTALocale(locale.toString()))),
							new DATStringValue(mandatory(AAAAspect.getTripleAAttributeSQLName(property))),
							new DATStringValue(mandatory(AAAAspect.getTripleAEntitySQLName(property.getParentClass()))),
							new DATStringValue(mandatory(text)));
					att.addDAT(dat);
				}
			} catch (TranslationException e) {
				// Ignore it
			}
			
		}
		
		if (cmds.xd_label_for_xd_attribute != null) {
			validate(att);
		} else if (att.getDATs().size() > 0) {
			cmds.xd_label_for_xd_attribute = cmd;
			validate(att);
		}
	}

	protected void generate_xd_label_for_xd_perm_values(
			ITranslationManager translationManager, List<Locale> allLocales, MdfEnumValue enumValue, CMDsByTypeList cmds) {
		ATT att;
		CMD cmd;
		if (cmds.xs_label_for_xd_perm_values == null) {
			cmd = new CMD(CMDType.INSUPDDEF, "xd_label", "xd_perm_value");
			att = new ATT(
					"language_dict_id.code",
					"object_id.xd_attrib_id.sqlname_c",
					"object_id.xd_attrib_id.xd_entity_id.sqlname_c",
					"object_id.perm_val_nat_e",
					"name");
			cmd.setATT(att);
		} else {
			cmd = cmds.xs_label_for_xd_perm_values;
			att = cmd.getATT();
		}
		
		ITranslation translation = translationManager.getTranslation(enumValue);
		for (Locale locale: allLocales) {
			try {
				String text = translation.getText(ITranslationKind.NAME, locale);
				if (StringUtils.isNotEmpty(text)) {
					String tripleAAttributeSQLNameRef = AAAAspect.getTripleAAttributeSQLName(enumValue.getParentEnumeration());
					String tripleAAttributeSQLName = UDEHelper.getInstance().resolveAttributeSqlNameReference(enumValue, tripleAAttributeSQLNameRef); 
					String tripleAEntitySQLNameRef = AAAAspect.getTripleAEntitySQLName(enumValue.getParentEnumeration());
					String tripleAEntitySQLName = UDEHelper.getInstance().resolveEntitySqlNameReference(enumValue, tripleAEntitySQLNameRef);
					String enumValueValue;
					if (enumValue.getParentEnumeration().getType().equals(PrimitivesDomain.BOOLEAN) ||
							enumValue.getParentEnumeration().getType().equals(PrimitivesDomain.BOOLEAN_OBJ)) {
						enumValueValue = (enumValue.getValue().equals("true"))?"1":"0";
					} else {
						enumValueValue = enumValue.getValue();
					}
					DAT dat = new DAT(
							new DATStringValue(ModelLocaleHelper.getInstance().convertToTALocale(locale.toString())),
							new DATStringValue(tripleAAttributeSQLName),
							new DATStringValue(tripleAEntitySQLName),
							new DATStringValue(enumValueValue),
							//new DATStringValue(AAAAspect.getTripleAPermittedValueName(enumValue)),
							new DATStringValue(text));
					att.addDAT(dat);
				}
			} catch (TranslationException e) {
				// Ignore it
			}
		}
		if (cmds.xs_label_for_xd_perm_values != null) {
			validate(att);
		} else if (att.getDATs().size() > 0) {
			cmds.xs_label_for_xd_perm_values = cmd;
			validate(att);
		}
	}

	private boolean isStandardEntity(MdfEntity type) {
		if (type instanceof EObject) {
			Resource resource = ((EObject)type).eResource();
			if (resource != null) {
				URI uri = resource.getURI();
				IProject project = getProject(type.getParentDomain());
				return uri.path().equals("/" + AAACore.AAA_ENTITIES_MODEL) &&
					AAACore.hasAAANature(project);
			}
		}
		return false;
	}

	private IProject getProject(MdfDomain domain) {
		Resource resource = ((EObject)domain).eResource();
		if (resource != null) {
			URIConverter uriConverter = resource.getResourceSet().getURIConverter();
			if (uriConverter instanceof ModelURIConverter) {
				return ((ModelURIConverter)uriConverter).getOfsProject().getProject();
			}
		}
		return null;
	}

	private void writeGatewayFile(IContainer outputContainer, String fileName,
			String gatewayFileContents) throws CoreException {
		try {
			IFile file = outputContainer.getFile(new Path(fileName));
			InputStream is;
				is = new ByteArrayInputStream(gatewayFileContents.getBytes("UTF-8"));
			if (!file.exists()) {
				file.create(is, true, null);
			} else {
				file.setContents(is, true, false, null);
			}
			file.setCharset("UTF-8", null);
		} catch (UnsupportedEncodingException e) {
			newCoreException("Unable to create the UTF-8 contents", e);
		}
	}

	private void validate(ATT att) {
		try {
			validator.validate(att);
		} catch (GatewayMultiValidationException e) {
			logger.warn("The generated gateway commands are not valid in ATT " + att.toString(), e);
		}
	}
	
	// DS-4763 - support for "EnumMask/enummask_t"
	private boolean isEnumBasedOnEnumMask(MdfEnumeration mdfEnum) {
		return mdfEnum.getType().getName().equals("EnumMask");
	}
	
	private boolean isEnumBasedOnBoolean(MdfEnumeration mdfEnum) {
		return mdfEnum.getType().equals(PrimitivesDomain.BOOLEAN) ||
				mdfEnum.getType().equals(PrimitivesDomain.BOOLEAN_OBJ);
	}

	private boolean isEnumBasedOnInteger(MdfEnumeration mdfEnum) {
		return mdfEnum.getType().equals(PrimitivesDomain.INTEGER) ||
				mdfEnum.getType().equals(PrimitivesDomain.INTEGER_OBJ);
	}
	
	private String mandatory(String str) {
		if (StringUtils.isEmpty(str)) {
			return "MANDATORY_FIELD_MISSING";
		} else {
			return str;
		}
	}
	
}