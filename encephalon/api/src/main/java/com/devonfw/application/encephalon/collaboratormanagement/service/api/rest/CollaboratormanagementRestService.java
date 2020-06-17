package com.devonfw.application.encephalon.collaboratormanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaboratormanagement.logic.api.Collaboratormanagement;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Collaboratormanagement}.
 */
@Path("/collaboratormanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface CollaboratormanagementRestService {

  /**
   * Delegates to {@link Collaboratormanagement#findCollaborator}.
   *
   * @param id the ID of the {@link CollaboratorEto}
   * @return the {@link CollaboratorEto}
   */
  @GET
  @Path("/collaborator/{id}/")
  public CollaboratorEto getCollaborator(@PathParam("id") long id);

  /**
   * Delegates to {@link Collaboratormanagement#saveCollaborator}.
   *
   * @param collaborator the {@link CollaboratorEto} to be saved
   * @return the recently created {@link CollaboratorEto}
   */
  @POST
  @Path("/collaborator/")
  public CollaboratorEto saveCollaborator(CollaboratorEto collaborator);

  /**
   * Delegates to {@link Collaboratormanagement#deleteCollaborator}.
   *
   * @param id ID of the {@link CollaboratorEto} to be deleted
   */
  @DELETE
  @Path("/collaborator/{id}/")
  public void deleteCollaborator(@PathParam("id") long id);

  /**
   * Delegates to {@link Collaboratormanagement#findCollaboratorEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding collaborators.
   * @return the {@link Page list} of matching {@link CollaboratorEto}s.
   */
  @Path("/collaborator/search")
  @POST
  public Page<CollaboratorEto> findCollaborators(CollaboratorSearchCriteriaTo searchCriteriaTo);

}