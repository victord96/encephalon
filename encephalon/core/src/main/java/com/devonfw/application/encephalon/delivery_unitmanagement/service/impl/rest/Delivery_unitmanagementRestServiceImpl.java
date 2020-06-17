package com.devonfw.application.encephalon.delivery_unitmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.Delivery_unitmanagement;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitEto;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitSearchCriteriaTo;
import com.devonfw.application.encephalon.delivery_unitmanagement.service.api.rest.Delivery_unitmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Delivery_unitmanagement}.
 */
@Named("Delivery_unitmanagementRestService")
public class Delivery_unitmanagementRestServiceImpl implements Delivery_unitmanagementRestService {

  @Inject
  private Delivery_unitmanagement delivery_unitmanagement;

  @Override
  public Delivery_UnitEto getDelivery_Unit(long id) {

    return this.delivery_unitmanagement.findDelivery_Unit(id);
  }

  @Override
  public Delivery_UnitEto saveDelivery_Unit(Delivery_UnitEto delivery_unit) {

    return this.delivery_unitmanagement.saveDelivery_Unit(delivery_unit);
  }

  @Override
  public void deleteDelivery_Unit(long id) {

    this.delivery_unitmanagement.deleteDelivery_Unit(id);
  }

  @Override
  public Page<Delivery_UnitEto> findDelivery_Units(Delivery_UnitSearchCriteriaTo searchCriteriaTo) {

    return this.delivery_unitmanagement.findDelivery_Units(searchCriteriaTo);
  }
}