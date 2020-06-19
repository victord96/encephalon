package com.devonfw.application.encephalon.projectmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.projectmanagement.logic.api.Projectmanagement;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectEto;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Projectmanagement}.
 */
@Path("/projectmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ProjectmanagementRestService {

  /**
   * Delegates to {@link Projectmanagement#findProject}.
   *
   * @param id the ID of the {@link ProjectEto}
   * @return the {@link ProjectEto}
   */
  @GET
  @Path("/project/{id}/")
  public ProjectEto getProject(@PathParam("id") long id);

  /**
   * Delegates to {@link Projectmanagement#saveProject}.
   *
   * @param project the {@link ProjectEto} to be saved
   * @return the recently created {@link ProjectEto}
   */
  @POST
  @Path("/project/")
  public ProjectEto saveProject(ProjectEto project);

  /**
   * Delegates to {@link Projectmanagement#deleteProject}.
   *
   * @param id ID of the {@link ProjectEto} to be deleted
   */
  @DELETE
  @Path("/project/{id}/")
  public void deleteProject(@PathParam("id") long id);

  /**
   * Delegates to {@link Projectmanagement#findProjectEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding projects.
   * @return the {@link Page list} of matching {@link ProjectEto}s.
   */
  @Path("/project/search")
  @POST
  public Page<ProjectEto> findProjects(ProjectSearchCriteriaTo searchCriteriaTo);

}