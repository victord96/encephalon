package com.devonfw.application.encephalon.projectmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.projectmanagement.dataaccess.api.ProjectEntity;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectEto;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectSearchCriteriaTo;
import com.devonfw.application.encephalon.projectmanagement.logic.api.usecase.UcFindProject;
import com.devonfw.application.encephalon.projectmanagement.logic.base.usecase.AbstractProjectUc;

/**
 * Use case implementation for searching, filtering and getting Projects
 */
@Named
@Validated
@Transactional
public class UcFindProjectImpl extends AbstractProjectUc implements UcFindProject {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindProjectImpl.class);

  @Override
  public ProjectEto findProject(long id) {

    LOG.debug("Get Project with id {} from database.", id);
    Optional<ProjectEntity> foundEntity = getProjectRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), ProjectEto.class);
    else
      return null;
  }

  @Override
  public Page<ProjectEto> findProjects(ProjectSearchCriteriaTo criteria) {

    Page<ProjectEntity> projects = getProjectRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(projects, ProjectEto.class);
  }

}
