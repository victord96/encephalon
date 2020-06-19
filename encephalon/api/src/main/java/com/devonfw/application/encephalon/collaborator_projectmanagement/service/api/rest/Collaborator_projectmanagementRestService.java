package com.devonfw.application.encephalon.collaborator_projectmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.Collaborator_projectmanagement;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectCto;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component
 * {@link Collaborator_projectmanagement}.
 */
@Path("/collaborator_projectmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface Collaborator_projectmanagementRestService {

  /**
   * Delegates to {@link Collaborator_projectmanagement#findCollaborator_ProjectCto}.
   *
   * @param id the ID of the {@link Collaborator_ProjectCto}
   * @return the {@link Collaborator_ProjectCto}
   */
  @GET
  @Path("/collaborator_project/cto/{id}/")
  public Collaborator_ProjectCto getCollaborator_ProjectCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Collaborator_projectmanagement#findCollaborator_ProjectCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding collaborator_projects.
   * @return the {@link Page list} of matching {@link Collaborator_ProjectCto}s.
   */
  @Path("/collaborator_project/cto/search")
  @POST
  public Page<Collaborator_ProjectCto> findCollaborator_ProjectCtos(
      Collaborator_ProjectSearchCriteriaTo searchCriteriaTo);

}