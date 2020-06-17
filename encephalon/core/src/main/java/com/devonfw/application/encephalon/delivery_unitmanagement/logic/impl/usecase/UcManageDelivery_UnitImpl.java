package com.devonfw.application.encephalon.delivery_unitmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.delivery_unitmanagement.dataaccess.api.Delivery_UnitEntity;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitEto;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.usecase.UcManageDelivery_Unit;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.base.usecase.AbstractDelivery_UnitUc;

/**
 * Use case implementation for modifying and deleting Delivery_Units
 */
@Named
@Validated
@Transactional
public class UcManageDelivery_UnitImpl extends AbstractDelivery_UnitUc implements UcManageDelivery_Unit {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageDelivery_UnitImpl.class);

  @Override
  public boolean deleteDelivery_Unit(long delivery_UnitId) {

    Delivery_UnitEntity delivery_Unit = getDelivery_UnitRepository().find(delivery_UnitId);
    getDelivery_UnitRepository().delete(delivery_Unit);
    LOG.debug("The delivery_Unit with id '{}' has been deleted.", delivery_UnitId);
    return true;
  }

  @Override
  public Delivery_UnitEto saveDelivery_Unit(Delivery_UnitEto delivery_Unit) {

    Objects.requireNonNull(delivery_Unit, "delivery_Unit");

    Delivery_UnitEntity delivery_UnitEntity = getBeanMapper().map(delivery_Unit, Delivery_UnitEntity.class);

    // initialize, validate delivery_UnitEntity here if necessary
    Delivery_UnitEntity resultEntity = getDelivery_UnitRepository().save(delivery_UnitEntity);
    LOG.debug("Delivery_Unit with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, Delivery_UnitEto.class);
  }
}
