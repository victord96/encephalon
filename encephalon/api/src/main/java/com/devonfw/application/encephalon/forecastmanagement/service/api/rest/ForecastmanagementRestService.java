package com.devonfw.application.encephalon.forecastmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.forecastmanagement.logic.api.Forecastmanagement;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastEto;
import com.devonfw.application.encephalon.forecastmanagement.logic.api.to.ForecastSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Forecastmanagement}.
 */
@Path("/forecastmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ForecastmanagementRestService {

  /**
   * Delegates to {@link Forecastmanagement#findForecast}.
   *
   * @param id the ID of the {@link ForecastEto}
   * @return the {@link ForecastEto}
   */
  @GET
  @Path("/forecast/{id}/")
  public ForecastEto getForecast(@PathParam("id") long id);

  /**
   * Delegates to {@link Forecastmanagement#saveForecast}.
   *
   * @param forecast the {@link ForecastEto} to be saved
   * @return the recently created {@link ForecastEto}
   */
  @POST
  @Path("/forecast/")
  public ForecastEto saveForecast(ForecastEto forecast);

  /**
   * Delegates to {@link Forecastmanagement#deleteForecast}.
   *
   * @param id ID of the {@link ForecastEto} to be deleted
   */
  @DELETE
  @Path("/forecast/{id}/")
  public void deleteForecast(@PathParam("id") long id);

  /**
   * Delegates to {@link Forecastmanagement#findForecastEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding forecasts.
   * @return the {@link Page list} of matching {@link ForecastEto}s.
   */
  @Path("/forecast/search")
  @POST
  public Page<ForecastEto> findForecasts(ForecastSearchCriteriaTo searchCriteriaTo);

}