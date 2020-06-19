package com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to;

import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectEto;
import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Collaborator_Project
 */
public class Collaborator_ProjectCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private Collaborator_ProjectEto collaborator_Project;

  private CollaboratorEto collaborator;

  private ProjectEto project;

  public Collaborator_ProjectEto getCollaborator_Project() {

    return collaborator_Project;
  }

  public void setCollaborator_Project(Collaborator_ProjectEto collaborator_Project) {

    this.collaborator_Project = collaborator_Project;
  }

  public CollaboratorEto getCollaborator() {

    return collaborator;
  }

  public void setCollaborator(CollaboratorEto collaborator) {

    this.collaborator = collaborator;
  }

  public ProjectEto getProject() {

    return project;
  }

  public void setProject(ProjectEto project) {

    this.project = project;
  }

}
