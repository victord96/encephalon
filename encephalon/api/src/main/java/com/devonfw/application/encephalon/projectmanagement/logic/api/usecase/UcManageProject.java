package com.devonfw.application.encephalon.projectmanagement.logic.api.usecase;

import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectEto;

/**
 * Interface of UcManageProject to centralize documentation and signatures of methods.
 */
public interface UcManageProject {

  /**
   * Deletes a project from the database by its id 'projectId'.
   *
   * @param projectId Id of the project to delete
   * @return boolean <code>true</code> if the project can be deleted, <code>false</code> otherwise
   */
  boolean deleteProject(long projectId);

  /**
   * Saves a project and store it in the database.
   *
   * @param project the {@link ProjectEto} to create.
   * @return the new {@link ProjectEto} that has been saved with ID and version.
   */
  ProjectEto saveProject(ProjectEto project);

}
