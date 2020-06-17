package com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitEto;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitSearchCriteriaTo;

public interface UcFindDelivery_Unit {

  /**
   * Returns a Delivery_Unit by its id 'id'.
   *
   * @param id The id 'id' of the Delivery_Unit.
   * @return The {@link Delivery_UnitEto} with id 'id'
   */
  Delivery_UnitEto findDelivery_Unit(long id);

  /**
   * Returns a paginated list of Delivery_Units matching the search criteria.
   *
   * @param criteria the {@link Delivery_UnitSearchCriteriaTo}.
   * @return the {@link List} of matching {@link Delivery_UnitEto}s.
   */
  Page<Delivery_UnitEto> findDelivery_Units(Delivery_UnitSearchCriteriaTo criteria);

}
