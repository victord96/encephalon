package com.devonfw.application.encephalon.forecastmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.forecastmanagement.logic.api.Forecastmanagement;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastEto;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastSearchCriteriaTo;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.usecase.UcFindForecast;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.usecase.UcManageForecast;
import com.devonfw.application.encephalon.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of forecastmanagement
 */
@Named
public class ForecastmanagementImpl extends AbstractComponentFacade implements Forecastmanagement {

  @Inject
  private UcFindForecast ucFindForecast;

  @Inject
  private UcManageForecast ucManageForecast;

  @Override
  public ForecastEto findForecast(long id) {

    return this.ucFindForecast.findForecast(id);
  }

  @Override
  public Page<ForecastEto> findForecasts(ForecastSearchCriteriaTo criteria) {

    return this.ucFindForecast.findForecasts(criteria);
  }

  @Override
  public ForecastEto saveForecast(ForecastEto forecast) {

    return this.ucManageForecast.saveForecast(forecast);
  }

  @Override
  public boolean deleteForecast(long id) {

    return this.ucManageForecast.deleteForecast(id);
  }
}
