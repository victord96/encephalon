package com.devonfw.application.encephalon.delivery_unitmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.delivery_unitmanagement.dataaccess.api.Delivery_UnitEntity;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitEto;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitSearchCriteriaTo;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.usecase.UcFindDelivery_Unit;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.base.usecase.AbstractDelivery_UnitUc;

/**
 * Use case implementation for searching, filtering and getting Delivery_Units
 */
@Named
@Validated
@Transactional
public class UcFindDelivery_UnitImpl extends AbstractDelivery_UnitUc implements UcFindDelivery_Unit {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindDelivery_UnitImpl.class);

  @Override
  public Delivery_UnitEto findDelivery_Unit(long id) {

    LOG.debug("Get Delivery_Unit with id {} from database.", id);
    Optional<Delivery_UnitEntity> foundEntity = getDelivery_UnitRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), Delivery_UnitEto.class);
    else
      return null;
  }

  @Override
  public Page<Delivery_UnitEto> findDelivery_Units(Delivery_UnitSearchCriteriaTo criteria) {

    Page<Delivery_UnitEntity> delivery_units = getDelivery_UnitRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(delivery_units, Delivery_UnitEto.class);
  }

}
