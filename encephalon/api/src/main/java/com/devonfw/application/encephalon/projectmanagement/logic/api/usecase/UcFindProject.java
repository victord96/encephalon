package com.devonfw.application.encephalon.projectmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectEto;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectSearchCriteriaTo;

public interface UcFindProject {

  /**
   * Returns a Project by its id 'id'.
   *
   * @param id The id 'id' of the Project.
   * @return The {@link ProjectEto} with id 'id'
   */
  ProjectEto findProject(long id);

  /**
   * Returns a paginated list of Projects matching the search criteria.
   *
   * @param criteria the {@link ProjectSearchCriteriaTo}.
   * @return the {@link List} of matching {@link ProjectEto}s.
   */
  Page<ProjectEto> findProjects(ProjectSearchCriteriaTo criteria);

}
