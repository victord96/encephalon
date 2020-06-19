package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.Collaborator_delivery_unitmanagement;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitCto;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitSearchCriteriaTo;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.usecase.UcFindCollaborator_Delivery_Unit;
import com.devonfw.application.encephalon.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of collaborator_delivery_unitmanagement
 */
@Named
public class Collaborator_delivery_unitmanagementImpl extends AbstractComponentFacade
    implements Collaborator_delivery_unitmanagement {

  @Inject
  private UcFindCollaborator_Delivery_Unit ucFindCollaborator_Delivery_Unit;

  @Override
  public Collaborator_Delivery_UnitCto findCollaborator_Delivery_UnitCto(long id) {

    return ucFindCollaborator_Delivery_Unit.findCollaborator_Delivery_UnitCto(id);
  }

  @Override
  public Page<Collaborator_Delivery_UnitCto> findCollaborator_Delivery_UnitCtos(
      Collaborator_Delivery_UnitSearchCriteriaTo criteria) {

    return ucFindCollaborator_Delivery_Unit.findCollaborator_Delivery_UnitCtos(criteria);
  }
}
