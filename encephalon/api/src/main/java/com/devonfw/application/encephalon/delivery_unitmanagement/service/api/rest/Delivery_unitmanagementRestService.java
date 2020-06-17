package com.devonfw.application.encephalon.delivery_unitmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.Delivery_unitmanagement;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitEto;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Delivery_unitmanagement}.
 */
@Path("/delivery_unitmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface Delivery_unitmanagementRestService {

  /**
   * Delegates to {@link Delivery_unitmanagement#findDelivery_Unit}.
   *
   * @param id the ID of the {@link Delivery_UnitEto}
   * @return the {@link Delivery_UnitEto}
   */
  @GET
  @Path("/delivery_unit/{id}/")
  public Delivery_UnitEto getDelivery_Unit(@PathParam("id") long id);

  /**
   * Delegates to {@link Delivery_unitmanagement#saveDelivery_Unit}.
   *
   * @param delivery_unit the {@link Delivery_UnitEto} to be saved
   * @return the recently created {@link Delivery_UnitEto}
   */
  @POST
  @Path("/delivery_unit/")
  public Delivery_UnitEto saveDelivery_Unit(Delivery_UnitEto delivery_unit);

  /**
   * Delegates to {@link Delivery_unitmanagement#deleteDelivery_Unit}.
   *
   * @param id ID of the {@link Delivery_UnitEto} to be deleted
   */
  @DELETE
  @Path("/delivery_unit/{id}/")
  public void deleteDelivery_Unit(@PathParam("id") long id);

  /**
   * Delegates to {@link Delivery_unitmanagement#findDelivery_UnitEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding delivery_units.
   * @return the {@link Page list} of matching {@link Delivery_UnitEto}s.
   */
  @Path("/delivery_unit/search")
  @POST
  public Page<Delivery_UnitEto> findDelivery_Units(Delivery_UnitSearchCriteriaTo searchCriteriaTo);

}