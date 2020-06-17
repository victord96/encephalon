package com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.usecase;

import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitEto;

/**
 * Interface of UcManageDelivery_Unit to centralize documentation and signatures of methods.
 */
public interface UcManageDelivery_Unit {

  /**
   * Deletes a delivery_Unit from the database by its id 'delivery_UnitId'.
   *
   * @param delivery_UnitId Id of the delivery_Unit to delete
   * @return boolean <code>true</code> if the delivery_Unit can be deleted, <code>false</code> otherwise
   */
  boolean deleteDelivery_Unit(long delivery_UnitId);

  /**
   * Saves a delivery_Unit and store it in the database.
   *
   * @param delivery_Unit the {@link Delivery_UnitEto} to create.
   * @return the new {@link Delivery_UnitEto} that has been saved with ID and version.
   */
  Delivery_UnitEto saveDelivery_Unit(Delivery_UnitEto delivery_Unit);

}
