package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to;

import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitEto;
import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Collaborator_Delivery_Unit
 */
public class Collaborator_Delivery_UnitCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private Collaborator_Delivery_UnitEto collaborator_Delivery_Unit;

  private CollaboratorEto collaborator;

  private Delivery_UnitEto delivery_unit;

  public Collaborator_Delivery_UnitEto getCollaborator_Delivery_Unit() {

    return collaborator_Delivery_Unit;
  }

  public void setCollaborator_Delivery_Unit(Collaborator_Delivery_UnitEto collaborator_Delivery_Unit) {

    this.collaborator_Delivery_Unit = collaborator_Delivery_Unit;
  }

  public CollaboratorEto getCollaborator() {

    return collaborator;
  }

  public void setCollaborator(CollaboratorEto collaborator) {

    this.collaborator = collaborator;
  }

  public Delivery_UnitEto getDelivery_unit() {

    return delivery_unit;
  }

  public void setDelivery_unit(Delivery_UnitEto delivery_unit) {

    this.delivery_unit = delivery_unit;
  }

}
