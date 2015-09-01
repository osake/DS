package com.odcgroup.dataframework.generation;

import com.odcgroup.iris.generator.IIRISGenerator;
import com.odcgroup.t24.enquiry.util.EMEntity;
import com.odcgroup.t24.enquiry.util.EMEntityModel;
import com.odcgroup.t24.enquiry.util.EMProperty;
import java.util.HashMap;
import java.util.List;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class javaGenerator implements IIRISGenerator {
  public void doGenerate(final EMEntityModel entityModel, final IFileSystemAccess fsa, final HashMap<String, Variable> globalVars) {
    Variable _get = globalVars.get("fileName");
    Object _value = _get.getValue();
    String filename = _value.toString();
    CharSequence _renderJavaTxt = this.renderJavaTxt(entityModel, globalVars);
    fsa.generateFile(filename, _renderJavaTxt);
  }
  
  public CharSequence renderJavaTxt(final EMEntityModel entityModel, final HashMap<String, Variable> globalVars) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _renderFileStart = this.renderFileStart();
    _builder.append(_renderFileStart, "");
    _builder.newLineIfNotEmpty();
    CharSequence _renderClasses = this.renderClasses(entityModel);
    _builder.append(_renderClasses, "");
    _builder.newLineIfNotEmpty();
    CharSequence _renderFileEnd = this.renderFileEnd();
    _builder.append(_renderFileEnd, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence renderFileStart() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Code generated by data framework DS cartridge (javaGenerator.xtend).");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Used by data frameworks producers for accessing DB mode enquiries.");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("package com.temenos.dataframework.rodb;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.persistence.Basic;");
    _builder.newLine();
    _builder.append("import javax.persistence.Entity;");
    _builder.newLine();
    _builder.append("import javax.persistence.Id;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence renderFileEnd() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence renderClasses(final EMEntityModel entityModel) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<EMEntity> _entities = entityModel.getEntities();
      for(final EMEntity entity : _entities) {
        CharSequence _renderClass = this.renderClass(entity);
        _builder.append(_renderClass, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence renderClass(final EMEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = entity.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Basic(optional = false)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      List<EMProperty> _properties = entity.getProperties();
      for(final EMProperty property : _properties) {
        _builder.append("\t");
        CharSequence _renderProperty = this.renderProperty(property);
        _builder.append(_renderProperty, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = entity.getName();
    _builder.append(_name_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence renderProperty(final EMProperty property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private String ");
    String _name = property.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}