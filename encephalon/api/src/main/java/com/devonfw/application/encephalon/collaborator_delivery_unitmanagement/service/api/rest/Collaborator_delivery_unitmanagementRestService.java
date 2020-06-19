package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.Collaborator_delivery_unitmanagement;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitCto;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component
 * {@link Collaborator_delivery_unitmanagement}.
 */
@Path("/collaborator_delivery_unitmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface Collaborator_delivery_unitmanagementRestService {

  /**
   * Delegates to {@link Collaborator_delivery_unitmanagement#findCollaborator_Delivery_UnitCto}.
   *
   * @param id the ID of the {@link Collaborator_Delivery_UnitCto}
   * @return the {@link Collaborator_Delivery_UnitCto}
   */
  @GET
  @Path("/collaborator_delivery_unit/cto/{id}/")
  public Collaborator_Delivery_UnitCto getCollaborator_Delivery_UnitCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Collaborator_delivery_unitmanagement#findCollaborator_Delivery_UnitCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding collaborator_delivery_units.
   * @return the {@link Page list} of matching {@link Collaborator_Delivery_UnitCto}s.
   */
  @Path("/collaborator_delivery_unit/cto/search")
  @POST
  public Page<Collaborator_Delivery_UnitCto> findCollaborator_Delivery_UnitCtos(
      Collaborator_Delivery_UnitSearchCriteriaTo searchCriteriaTo);

}