package com.devonfw.application.encephalon.collaborator_projectmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.Collaborator_projectmanagement;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectCto;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectSearchCriteriaTo;
import com.devonfw.application.encephalon.collaborator_projectmanagement.service.api.rest.Collaborator_projectmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component
 * {@link Collaborator_projectmanagement}.
 */
@Named("Collaborator_projectmanagementRestService")
public class Collaborator_projectmanagementRestServiceImpl implements Collaborator_projectmanagementRestService {

  @Inject
  private Collaborator_projectmanagement collaborator_projectmanagement;

  @Override
  public Collaborator_ProjectCto getCollaborator_ProjectCto(long id) {

    return this.collaborator_projectmanagement.findCollaborator_ProjectCto(id);
  }

  @Override
  public Page<Collaborator_ProjectCto> findCollaborator_ProjectCtos(
      Collaborator_ProjectSearchCriteriaTo searchCriteriaTo) {

    return this.collaborator_projectmanagement.findCollaborator_ProjectCtos(searchCriteriaTo);
  }
}