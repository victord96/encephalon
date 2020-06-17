package com.devonfw.application.encephalon.delivery_unitmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.encephalon.delivery_unitmanagement.dataaccess.api.repo.Delivery_UnitRepository;
import com.devonfw.application.encephalon.general.logic.base.AbstractUc;

/**
 * Abstract use case for Delivery_Units, which provides access to the commonly necessary data access objects.
 */
public class AbstractDelivery_UnitUc extends AbstractUc {

  /** @see #getDelivery_UnitRepository() */
  @Inject
  private Delivery_UnitRepository delivery_UnitRepository;

  /**
   * Returns the field 'delivery_UnitRepository'.
   * 
   * @return the {@link Delivery_UnitRepository} instance.
   */
  public Delivery_UnitRepository getDelivery_UnitRepository() {

    return this.delivery_UnitRepository;
  }

}
