package com.devonfw.application.encephalon.forecastmanagement.logic.api.usecase;

import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastEto;

/**
 * Interface of UcManageForecast to centralize documentation and signatures of methods.
 */
public interface UcManageForecast {

  /**
   * Deletes a forecast from the database by its id 'forecastId'.
   *
   * @param forecastId Id of the forecast to delete
   * @return boolean <code>true</code> if the forecast can be deleted, <code>false</code> otherwise
   */
  boolean deleteForecast(long forecastId);

  /**
   * Saves a forecast and store it in the database.
   *
   * @param forecast the {@link ForecastEto} to create.
   * @return the new {@link ForecastEto} that has been saved with ID and version.
   */
  ForecastEto saveForecast(ForecastEto forecast);

}
