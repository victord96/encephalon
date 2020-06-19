package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.dataaccess.api.repo.Collaborator_Delivery_UnitRepository;
import com.devonfw.application.encephalon.general.logic.base.AbstractUc;

/**
 * Abstract use case for Collaborator_Delivery_Units, which provides access to the commonly necessary data access
 * objects.
 */
public class AbstractCollaborator_Delivery_UnitUc extends AbstractUc {

  /** @see #getCollaborator_Delivery_UnitRepository() */
  @Inject
  private Collaborator_Delivery_UnitRepository collaborator_Delivery_UnitRepository;

  /**
   * Returns the field 'collaborator_Delivery_UnitRepository'.
   * 
   * @return the {@link Collaborator_Delivery_UnitRepository} instance.
   */
  public Collaborator_Delivery_UnitRepository getCollaborator_Delivery_UnitRepository() {

    return this.collaborator_Delivery_UnitRepository;
  }

}
