package com.odcgroup.service.gen.t24.internal.generator;

import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;

import com.odcgroup.service.gen.t24.internal.data.ClassDefDescriptor;
import com.odcgroup.service.gen.t24.internal.data.ServiceDescriptor;
import com.odcgroup.service.gen.t24.internal.exceptions.LoadTemplateException;
import com.odcgroup.service.gen.t24.internal.utils.TypeUtils;

/**
 * Generates a Java interface from a {@link ServiceDescriptor}. 
 * @author sjunejo
 *
 */
public class JavaDataClassGenerator extends ServiceGenerator {

	private static final String TEMPLATE = "JavaDataClass.vm";
	
	private Template template;
	
	public JavaDataClassGenerator(VelocityTemplateLoader loader) throws LoadTemplateException {
		template = loader.loadTemplate(TEMPLATE);
	}
	
	public void generate(ServiceDescriptor serviceDescriptor, Writer writer, String path) {
		for (ClassDefDescriptor classDefDescriptor : serviceDescriptor.getClassDefDescriptors()) {
			generateJavaClass(serviceDescriptor, classDefDescriptor, writer, path);
		}
	}
	
	public void generateJavaClass(ServiceDescriptor service, ClassDefDescriptor classDefDescriptor, Writer writer, String path) {
		VelocityContext ctx = new VelocityContext();
		try {
			ctx.put("service", service);
			ctx.put("classDescriptor", classDefDescriptor);	
			ctx.put("typeUtils", new TypeUtils());
		
			if (writer == null) {
				//String dirName = Constants.GENERATED_JAVA_DATA_SRC_DIR + service.getDataPackageDirectory();
				String dirName = path + "/" + service.getPackageDirectory() + "/data/";
				String classFileName = classDefDescriptor.getName() + ".java";
		
				writer = createWriter(dirName, classFileName);
			}
			System.out.println("Merging Template - JavaClassGenerator: " + TEMPLATE);
			template.merge(ctx, writer);
			System.out.println("Done");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
}
