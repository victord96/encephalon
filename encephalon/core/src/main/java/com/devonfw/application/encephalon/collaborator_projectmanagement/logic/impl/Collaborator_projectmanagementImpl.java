package com.devonfw.application.encephalon.collaborator_projectmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.Collaborator_projectmanagement;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectCto;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectSearchCriteriaTo;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.usecase.UcFindCollaborator_Project;
import com.devonfw.application.encephalon.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of collaborator_projectmanagement
 */
@Named
public class Collaborator_projectmanagementImpl extends AbstractComponentFacade
    implements Collaborator_projectmanagement {

  @Inject
  private UcFindCollaborator_Project ucFindCollaborator_Project;

  @Override
  public Collaborator_ProjectCto findCollaborator_ProjectCto(long id) {

    return ucFindCollaborator_Project.findCollaborator_ProjectCto(id);
  }

  @Override
  public Page<Collaborator_ProjectCto> findCollaborator_ProjectCtos(Collaborator_ProjectSearchCriteriaTo criteria) {

    return ucFindCollaborator_Project.findCollaborator_ProjectCtos(criteria);
  }
}
