package com.devonfw.application.encephalon.forecastmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.forecastmanagement.logic.api.Forecastmanagement;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastEto;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastSearchCriteriaTo;
import com.devonfw.application.encephalon.forecastmanagement.service.api.rest.ForecastmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Forecastmanagement}.
 */
@Named("ForecastmanagementRestService")
public class ForecastmanagementRestServiceImpl implements ForecastmanagementRestService {

  @Inject
  private Forecastmanagement forecastmanagement;

  @Override
  public ForecastEto getForecast(long id) {

    return this.forecastmanagement.findForecast(id);
  }

  @Override
  public ForecastEto saveForecast(ForecastEto forecast) {

    return this.forecastmanagement.saveForecast(forecast);
  }

  @Override
  public void deleteForecast(long id) {

    this.forecastmanagement.deleteForecast(id);
  }

  @Override
  public Page<ForecastEto> findForecasts(ForecastSearchCriteriaTo searchCriteriaTo) {

    return this.forecastmanagement.findForecasts(searchCriteriaTo);
  }
}