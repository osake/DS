package com.odcgroup.dataframework.generation

import com.odcgroup.t24.enquiry.util.EMEntity
import com.odcgroup.t24.enquiry.util.EMEntityModel
import com.odcgroup.t24.enquiry.util.EMProperty
import java.util.HashMap
import org.eclipse.xtend.expression.Variable
import org.eclipse.xtext.generator.IFileSystemAccess
import com.odcgroup.iris.generator.IIRISGenerator

class javaGenerator implements IIRISGenerator {

	override doGenerate(EMEntityModel entityModel, IFileSystemAccess fsa, HashMap<String, Variable> globalVars) {
		var filename = globalVars.get("fileName").value.toString
		fsa.generateFile(
			filename,
			renderJavaTxt(entityModel, globalVars)
		)
	}

	def renderJavaTxt(EMEntityModel entityModel, HashMap<String, Variable> globalVars) '''
		�renderFileStart()�
		�renderClasses(entityModel)�
		�renderFileEnd()�
	'''

	def renderFileStart() '''
		//
		// Code generated by data framework DS cartridge (javaGenerator.xtend).
		//
		// Used by data frameworks producers for accessing DB mode enquiries.
		//
		package com.temenos.dataframework.rodb;
		
		import javax.persistence.Basic;
		import javax.persistence.Entity;
		import javax.persistence.Id;
		
		@Entity
	'''
	
	def renderFileEnd() '''
	'''

	def renderClasses(EMEntityModel entityModel) ''' 
			�FOR entity : entityModel.entities� 
				�entity.renderClass()�
			�ENDFOR�
	'''

	def renderClass(EMEntity entity) '''
		public class �entity.getName()� {

			@Id
			@Basic(optional = false)
					
			�FOR property: entity.properties�
				�property.renderProperty�
			�ENDFOR�
		
			public �entity.getName()�() {
			}
		}
	'''
	
	def renderProperty(EMProperty property) '''		
			private String �property.name�;
	'''
}
