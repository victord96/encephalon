package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.Collaborator_delivery_unitmanagement;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitCto;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitSearchCriteriaTo;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.service.api.rest.Collaborator_delivery_unitmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component
 * {@link Collaborator_delivery_unitmanagement}.
 */
@Named("Collaborator_delivery_unitmanagementRestService")
public class Collaborator_delivery_unitmanagementRestServiceImpl
    implements Collaborator_delivery_unitmanagementRestService {

  @Inject
  private Collaborator_delivery_unitmanagement collaborator_delivery_unitmanagement;

  @Override
  public Collaborator_Delivery_UnitCto getCollaborator_Delivery_UnitCto(long id) {

    return this.collaborator_delivery_unitmanagement.findCollaborator_Delivery_UnitCto(id);
  }

  @Override
  public Page<Collaborator_Delivery_UnitCto> findCollaborator_Delivery_UnitCtos(
      Collaborator_Delivery_UnitSearchCriteriaTo searchCriteriaTo) {

    return this.collaborator_delivery_unitmanagement.findCollaborator_Delivery_UnitCtos(searchCriteriaTo);
  }
}