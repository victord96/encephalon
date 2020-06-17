package com.devonfw.application.encephalon.delivery_unitmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.Delivery_unitmanagement;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitEto;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitSearchCriteriaTo;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.usecase.UcFindDelivery_Unit;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.usecase.UcManageDelivery_Unit;
import com.devonfw.application.encephalon.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of delivery_unitmanagement
 */
@Named
public class Delivery_unitmanagementImpl extends AbstractComponentFacade implements Delivery_unitmanagement {

  @Inject
  private UcFindDelivery_Unit ucFindDelivery_Unit;

  @Inject
  private UcManageDelivery_Unit ucManageDelivery_Unit;

  @Override
  public Delivery_UnitEto findDelivery_Unit(long id) {

    return this.ucFindDelivery_Unit.findDelivery_Unit(id);
  }

  @Override
  public Page<Delivery_UnitEto> findDelivery_Units(Delivery_UnitSearchCriteriaTo criteria) {

    return this.ucFindDelivery_Unit.findDelivery_Units(criteria);
  }

  @Override
  public Delivery_UnitEto saveDelivery_Unit(Delivery_UnitEto delivery_unit) {

    return this.ucManageDelivery_Unit.saveDelivery_Unit(delivery_unit);
  }

  @Override
  public boolean deleteDelivery_Unit(long id) {

    return this.ucManageDelivery_Unit.deleteDelivery_Unit(id);
  }
}
