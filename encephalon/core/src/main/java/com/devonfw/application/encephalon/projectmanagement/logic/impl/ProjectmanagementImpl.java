package com.devonfw.application.encephalon.projectmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.encephalon.projectmanagement.logic.api.Projectmanagement;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectEto;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectSearchCriteriaTo;
import com.devonfw.application.encephalon.projectmanagement.logic.api.usecase.UcFindProject;
import com.devonfw.application.encephalon.projectmanagement.logic.api.usecase.UcManageProject;

/**
 * Implementation of component interface of projectmanagement
 */
@Named
public class ProjectmanagementImpl extends AbstractComponentFacade implements Projectmanagement {

  @Inject
  private UcFindProject ucFindProject;

  @Inject
  private UcManageProject ucManageProject;

  @Override
  public ProjectEto findProject(long id) {

    return this.ucFindProject.findProject(id);
  }

  @Override
  public Page<ProjectEto> findProjects(ProjectSearchCriteriaTo criteria) {

    return this.ucFindProject.findProjects(criteria);
  }

  @Override
  public ProjectEto saveProject(ProjectEto project) {

    return this.ucManageProject.saveProject(project);
  }

  @Override
  public boolean deleteProject(long id) {

    return this.ucManageProject.deleteProject(id);
  }
}
