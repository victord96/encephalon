package com.devonfw.application.encephalon.projectmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.projectmanagement.logic.api.Projectmanagement;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectEto;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectSearchCriteriaTo;
import com.devonfw.application.encephalon.projectmanagement.service.api.rest.ProjectmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Projectmanagement}.
 */
@Named("ProjectmanagementRestService")
public class ProjectmanagementRestServiceImpl implements ProjectmanagementRestService {

  @Inject
  private Projectmanagement projectmanagement;

  @Override
  public ProjectEto getProject(long id) {

    return this.projectmanagement.findProject(id);
  }

  @Override
  public ProjectEto saveProject(ProjectEto project) {

    return this.projectmanagement.saveProject(project);
  }

  @Override
  public void deleteProject(long id) {

    this.projectmanagement.deleteProject(id);
  }

  @Override
  public Page<ProjectEto> findProjects(ProjectSearchCriteriaTo searchCriteriaTo) {

    return this.projectmanagement.findProjects(searchCriteriaTo);
  }
}