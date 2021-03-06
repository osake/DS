/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.odcgroup.page.uimodel.impl;

import com.odcgroup.page.uimodel.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.odcgroup.page.uimodel.Action;
import com.odcgroup.page.uimodel.ActionGroup;
import com.odcgroup.page.uimodel.ActionGroups;
import com.odcgroup.page.uimodel.Actions;
import com.odcgroup.page.uimodel.EditPolicyRole;
import com.odcgroup.page.uimodel.EditPolicyRoleType;
import com.odcgroup.page.uimodel.EditorMode;
import com.odcgroup.page.uimodel.MenuItem;
import com.odcgroup.page.uimodel.MenuType;
import com.odcgroup.page.uimodel.Menus;
import com.odcgroup.page.uimodel.Palette;
import com.odcgroup.page.uimodel.PaletteGroup;
import com.odcgroup.page.uimodel.PaletteGroupItem;
import com.odcgroup.page.uimodel.RendererInfo;
import com.odcgroup.page.uimodel.Renderers;
import com.odcgroup.page.uimodel.UIModel;
import com.odcgroup.page.uimodel.UIModelFactory;
import com.odcgroup.page.uimodel.UIModelPackage;
import com.odcgroup.page.uimodel.WidgetMenu;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIModelFactoryImpl extends EFactoryImpl implements UIModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * @return UIModelFactory
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UIModelFactory init() {
		try {
			UIModelFactory theUIModelFactory = (UIModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.odcgroup.com/page/uimodel"); 
			if (theUIModelFactory != null) {
				return theUIModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UIModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UIModelPackage.UI_MODEL: return createUIModel();
			case UIModelPackage.PALETTE: return createPalette();
			case UIModelPackage.PALETTE_GROUP: return createPaletteGroup();
			case UIModelPackage.PALETTE_GROUP_ITEM: return createPaletteGroupItem();
			case UIModelPackage.RENDERERS: return createRenderers();
			case UIModelPackage.RENDERER_INFO: return createRendererInfo();
			case UIModelPackage.MENUS: return createMenus();
			case UIModelPackage.WIDGET_MENU: return createWidgetMenu();
			case UIModelPackage.ACTION_GROUPS: return createActionGroups();
			case UIModelPackage.ACTIONS: return createActions();
			case UIModelPackage.ACTION_GROUP: return createActionGroup();
			case UIModelPackage.ACTION: return createAction();
			case UIModelPackage.EDIT_POLICY_ROLE: return createEditPolicyRole();
			case UIModelPackage.MENU_ITEM: return createMenuItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UIModelPackage.MENU_TYPE:
				return createMenuTypeFromString(eDataType, initialValue);
			case UIModelPackage.EDITOR_MODE:
				return createEditorModeFromString(eDataType, initialValue);
			case UIModelPackage.EDIT_POLICY_ROLE_TYPE:
				return createEditPolicyRoleTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UIModelPackage.MENU_TYPE:
				return convertMenuTypeToString(eDataType, instanceValue);
			case UIModelPackage.EDITOR_MODE:
				return convertEditorModeToString(eDataType, instanceValue);
			case UIModelPackage.EDIT_POLICY_ROLE_TYPE:
				return convertEditPolicyRoleTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return UIModel
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIModel createUIModel() {
		UIModelImpl uiModel = new UIModelImpl();
		return uiModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return Palette
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette createPalette() {
		PaletteImpl palette = new PaletteImpl();
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return PaletteGroup
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaletteGroup createPaletteGroup() {
		PaletteGroupImpl paletteGroup = new PaletteGroupImpl();
		return paletteGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return PaletteGroupItem
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaletteGroupItem createPaletteGroupItem() {
		PaletteGroupItemImpl paletteGroupItem = new PaletteGroupItemImpl();
		return paletteGroupItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return Renderers
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Renderers createRenderers() {
		RenderersImpl renderers = new RenderersImpl();
		return renderers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return RendererInfo
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RendererInfo createRendererInfo() {
		RendererInfoImpl rendererInfo = new RendererInfoImpl();
		return rendererInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return Menus
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menus createMenus() {
		MenusImpl menus = new MenusImpl();
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return WidgetMenu
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetMenu createWidgetMenu() {
		WidgetMenuImpl widgetMenu = new WidgetMenuImpl();
		return widgetMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return ActionGroups
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroups createActionGroups() {
		ActionGroupsImpl actionGroups = new ActionGroupsImpl();
		return actionGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return Actions
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions createActions() {
		ActionsImpl actions = new ActionsImpl();
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return ActionGroup
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroup createActionGroup() {
		ActionGroupImpl actionGroup = new ActionGroupImpl();
		return actionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return UIModelPackage
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditPolicyRole createEditPolicyRole() {
		EditPolicyRoleImpl editPolicyRole = new EditPolicyRoleImpl();
		return editPolicyRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return MenuItem
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem createMenuItem() {
		MenuItemImpl menuItem = new MenuItemImpl();
		return menuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @param eDataType
	 * @param initialValue
	 * @return
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuType createMenuTypeFromString(EDataType eDataType, String initialValue) {
		MenuType result = MenuType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @param eDataType
	 * @param instanceValue
	 * @return
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMenuTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * @param eDataType
	 * @param initialValue
	 * @return
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorMode createEditorModeFromString(EDataType eDataType, String initialValue) {
		EditorMode result = EditorMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @param eDataType
	 * @param instanceValue
	 * @return
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEditorModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * @param eDataType
	 * @param initialValue
	 * @return
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditPolicyRoleType createEditPolicyRoleTypeFromString(EDataType eDataType, String initialValue) {
		EditPolicyRoleType result = EditPolicyRoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @param eDataType
	 * @param instanceValue
	 * @return
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEditPolicyRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return UIModelPackage
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIModelPackage getUIModelPackage() {
		return (UIModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return UIModelFactory
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UIModelPackage getPackage() {
		return UIModelPackage.eINSTANCE;
	}

} //UIModelFactoryImpl
