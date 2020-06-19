package com.devonfw.application.encephalon.projectmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.encephalon.general.logic.base.AbstractUc;
import com.devonfw.application.encephalon.projectmanagement.dataaccess.api.repo.ProjectRepository;

/**
 * Abstract use case for Projects, which provides access to the commonly necessary data access objects.
 */
public class AbstractProjectUc extends AbstractUc {

  /** @see #getProjectRepository() */
  @Inject
  private ProjectRepository projectRepository;

  /**
   * Returns the field 'projectRepository'.
   * 
   * @return the {@link ProjectRepository} instance.
   */
  public ProjectRepository getProjectRepository() {

    return this.projectRepository;
  }

}
