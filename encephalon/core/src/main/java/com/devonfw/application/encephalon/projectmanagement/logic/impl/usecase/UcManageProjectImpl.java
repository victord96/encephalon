package com.devonfw.application.encephalon.projectmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.projectmanagement.dataaccess.api.ProjectEntity;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectEto;
import com.devonfw.application.encephalon.projectmanagement.logic.api.usecase.UcManageProject;
import com.devonfw.application.encephalon.projectmanagement.logic.base.usecase.AbstractProjectUc;

/**
 * Use case implementation for modifying and deleting Projects
 */
@Named
@Validated
@Transactional
public class UcManageProjectImpl extends AbstractProjectUc implements UcManageProject {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageProjectImpl.class);

  @Override
  public boolean deleteProject(long projectId) {

    ProjectEntity project = getProjectRepository().find(projectId);
    getProjectRepository().delete(project);
    LOG.debug("The project with id '{}' has been deleted.", projectId);
    return true;
  }

  @Override
  public ProjectEto saveProject(ProjectEto project) {

    Objects.requireNonNull(project, "project");

    ProjectEntity projectEntity = getBeanMapper().map(project, ProjectEntity.class);

    // initialize, validate projectEntity here if necessary
    ProjectEntity resultEntity = getProjectRepository().save(projectEntity);
    LOG.debug("Project with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, ProjectEto.class);
  }
}
