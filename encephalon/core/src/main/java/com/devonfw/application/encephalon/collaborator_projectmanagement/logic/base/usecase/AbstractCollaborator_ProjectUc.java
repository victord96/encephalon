package com.devonfw.application.encephalon.collaborator_projectmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.encephalon.collaborator_projectmanagement.dataaccess.api.repo.Collaborator_ProjectRepository;
import com.devonfw.application.encephalon.general.logic.base.AbstractUc;

/**
 * Abstract use case for Collaborator_Projects, which provides access to the commonly necessary data access objects.
 */
public class AbstractCollaborator_ProjectUc extends AbstractUc {

  /** @see #getCollaborator_ProjectRepository() */
  @Inject
  private Collaborator_ProjectRepository collaborator_ProjectRepository;

  /**
   * Returns the field 'collaborator_ProjectRepository'.
   * 
   * @return the {@link Collaborator_ProjectRepository} instance.
   */
  public Collaborator_ProjectRepository getCollaborator_ProjectRepository() {

    return this.collaborator_ProjectRepository;
  }

}
