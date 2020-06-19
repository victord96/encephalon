package com.devonfw.application.encephalon.forecastmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastEto;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastSearchCriteriaTo;

public interface UcFindForecast {

  /**
   * Returns a Forecast by its id 'id'.
   *
   * @param id The id 'id' of the Forecast.
   * @return The {@link ForecastEto} with id 'id'
   */
  ForecastEto findForecast(long id);

  /**
   * Returns a paginated list of Forecasts matching the search criteria.
   *
   * @param criteria the {@link ForecastSearchCriteriaTo}.
   * @return the {@link List} of matching {@link ForecastEto}s.
   */
  Page<ForecastEto> findForecasts(ForecastSearchCriteriaTo criteria);

}
