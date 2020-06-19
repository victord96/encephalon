package com.devonfw.application.encephalon.forecastmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.encephalon.forecastmanagement.dataaccess.api.repo.ForecastRepository;
import com.devonfw.application.encephalon.general.logic.base.AbstractUc;

/**
 * Abstract use case for Forecasts, which provides access to the commonly necessary data access objects.
 */
public class AbstractForecastUc extends AbstractUc {

  /** @see #getForecastRepository() */
  @Inject
  private ForecastRepository forecastRepository;

  /**
   * Returns the field 'forecastRepository'.
   * 
   * @return the {@link ForecastRepository} instance.
   */
  public ForecastRepository getForecastRepository() {

    return this.forecastRepository;
  }

}
