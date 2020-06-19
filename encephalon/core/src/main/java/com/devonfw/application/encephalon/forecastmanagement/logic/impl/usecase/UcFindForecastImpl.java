package com.devonfw.application.encephalon.forecastmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.forecastmanagement.dataaccess.api.ForecastEntity;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastEto;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastSearchCriteriaTo;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.usecase.UcFindForecast;
import com.devonfw.application.encephalon.forecastmanagement.logic.base.usecase.AbstractForecastUc;

/**
 * Use case implementation for searching, filtering and getting Forecasts
 */
@Named
@Validated
@Transactional
public class UcFindForecastImpl extends AbstractForecastUc implements UcFindForecast {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindForecastImpl.class);

  @Override
  public ForecastEto findForecast(long id) {

    LOG.debug("Get Forecast with id {} from database.", id);
    Optional<ForecastEntity> foundEntity = getForecastRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), ForecastEto.class);
    else
      return null;
  }

  @Override
  public Page<ForecastEto> findForecasts(ForecastSearchCriteriaTo criteria) {

    Page<ForecastEntity> forecasts = getForecastRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(forecasts, ForecastEto.class);
  }

}
