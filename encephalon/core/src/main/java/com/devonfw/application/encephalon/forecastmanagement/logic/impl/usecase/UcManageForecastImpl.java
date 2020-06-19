package com.devonfw.application.encephalon.forecastmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.forecastmanagement.dataaccess.api.ForecastEntity;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastEto;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.usecase.UcManageForecast;
import com.devonfw.application.encephalon.forecastmanagement.logic.base.usecase.AbstractForecastUc;

/**
 * Use case implementation for modifying and deleting Forecasts
 */
@Named
@Validated
@Transactional
public class UcManageForecastImpl extends AbstractForecastUc implements UcManageForecast {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageForecastImpl.class);

  @Override
  public boolean deleteForecast(long forecastId) {

    ForecastEntity forecast = getForecastRepository().find(forecastId);
    getForecastRepository().delete(forecast);
    LOG.debug("The forecast with id '{}' has been deleted.", forecastId);
    return true;
  }

  @Override
  public ForecastEto saveForecast(ForecastEto forecast) {

    Objects.requireNonNull(forecast, "forecast");

    ForecastEntity forecastEntity = getBeanMapper().map(forecast, ForecastEntity.class);

    // initialize, validate forecastEntity here if necessary
    ForecastEntity resultEntity = getForecastRepository().save(forecastEntity);
    LOG.debug("Forecast with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, ForecastEto.class);
  }
}
