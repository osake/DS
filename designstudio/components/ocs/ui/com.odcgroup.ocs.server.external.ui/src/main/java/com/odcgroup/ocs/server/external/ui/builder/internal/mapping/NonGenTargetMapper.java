package com.odcgroup.ocs.server.external.ui.builder.internal.mapping;

import java.io.File;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.odcgroup.ocs.server.external.builder.internal.delta.ServerLocationConstants;
import com.odcgroup.ocs.server.external.builder.internal.mapping.PrepareDeploymentHelper;
import com.odcgroup.ocs.server.external.model.IExternalServer;
import com.odcgroup.ocs.server.external.ui.OCSServerUIExternalCore;
import com.odcgroup.ocs.server.external.ui.builder.ProjectHelper;

/**
 * Find the corresponding target file in the server for artifacts which
 * are not generated by DS.
 * @author yan
 */
public class NonGenTargetMapper extends AbstractTargetMapper {

	// target key in the builder configuration
	public static final String TARGET_KEY = "target";

	private static final String JAR_EXTENSION = ".jar";

	private static final String WAR_EXTENSION = ".war";

	// Target folder where files will be deployed on the server
	private String targetServerFolder;

	private String forcedTargetServerFolder;

	private String extension;

	// Project name
	private IProject project;

	/**
	 * Initialize the mappings used to find the target file/folder in the
	 * server.
	 */
	public NonGenTargetMapper(IExternalServer classicalServer, IProject project) {
		super(classicalServer);
		this.project = project;
	}

	/* (non-Javadoc)
	 * @see com.odcgroup.ocs.server.builder.internal.mapping.TargetMapper#configure(java.util.Map)
	 */
	public void configure(Map<String, String> builderConfig) {
		super.configure(builderConfig);
		if (builderConfig.containsKey(TARGET_KEY)) {
			this.forcedTargetServerFolder = StringUtils.replace(builderConfig.get(TARGET_KEY),
					"${project}", project.getName());
			this.extension = "";
		} else {
			this.forcedTargetServerFolder = null;
			if (project.getFile(ProjectHelper.getOutputFolder(project) + "BLOCK-INF/block.xml").exists()) {
				// wui block
				this.targetServerFolder = ServerLocationConstants.WUI_BLOCK_LOCATION;
				this.extension = JAR_EXTENSION;
			} else if (project.getFile(ProjectHelper.getOutputFolder(project) + "WEB-INF/web.xml").exists()) {
				// web project
				this.targetServerFolder = ServerLocationConstants.WAR_LOCATION;
				this.extension = WAR_EXTENSION;
			} else if (project.getFile(ProjectHelper.getOutputFolder(project) + "META-INF/ejb-jar.xml").exists()) {
				// ejb project
				this.targetServerFolder = ServerLocationConstants.EJB_JAR_LOCATION;
				this.extension = JAR_EXTENSION;
			} else {
				// utility jar
				this.targetServerFolder = ServerLocationConstants.UTILITY_JAR_LOCATION;
				this.extension = JAR_EXTENSION;
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.odcgroup.ocs.server.builder.internal.mapping.TargetMapper#getTarget(java.lang.String)
	 */
	public File getTarget(String source) throws CoreException {
		String pathToFile = StringUtils.removeStart(source, ProjectHelper.getOutputFolder(project));
		if (extension.equals(WAR_EXTENSION)) {
			// deploy classes to WEB-INF/classes, and other files at the root of the project
			if (pathToFile.endsWith(".class")) {
				pathToFile = "WEB-INF/classes/" + pathToFile;
			}
		}
		return new File(getDestination() + File.separator + pathToFile);
	}

	protected String getDestination() throws CoreException {
		String serverInstallationDirectory = super.getDestination();

		if (forcedTargetServerFolder == null) {
			return serverInstallationDirectory + File.separator + targetServerFolder + File.separator + project.getName() + extension;
		} else {
			return serverInstallationDirectory + File.separator + forcedTargetServerFolder;
		}
	}

	/* (non-Javadoc)
	 * @see com.odcgroup.ocs.server.builder.internal.mapping.TargetMapper#needsPrepareDeploymentDestinations()
	 */
	public boolean needsPrepareDeploymentDestinations() throws CoreException {
		return PrepareDeploymentHelper.needsPrepareDeployment(getDestination());
	}

	/* (non-Javadoc)
	 * @see com.odcgroup.ocs.server.builder.internal.mapping.TargetMapper#unjarDestinations()
	 */
	public IStatus prepareDeploymentDestinations() throws CoreException {
		return PrepareDeploymentHelper.prepare(getDestination());
	}


	@Override
	public IStatus undeployDestinations() throws CoreException {
		File backupFile = new File(getDestination() + ".original");
		OCSServerUIExternalCore.getDefault().getDeployBuilderConsole().printInfo("Undeploying: " + getDestination());
		IStatus status = PrepareDeploymentHelper.restoreBackupJar(backupFile);
		if (status != Status.OK_STATUS) {
			OCSServerUIExternalCore.getDefault().getDeployBuilderConsole().printError("Undeploying failure: " + status.getMessage());
		}
		return status;
	}
}
