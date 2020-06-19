package com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectCto;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectSearchCriteriaTo;

public interface UcFindCollaborator_Project {

  /**
   * Returns a composite Collaborator_Project by its id 'id'.
   *
   * @param id The id 'id' of the Collaborator_Project.
   * @return The {@link Collaborator_ProjectCto} with id 'id'
   */
  Collaborator_ProjectCto findCollaborator_ProjectCto(long id);

  /**
   * Returns a paginated list of composite Collaborator_Projects matching the search criteria.
   *
   * @param criteria the {@link Collaborator_ProjectSearchCriteriaTo}.
   * @return the {@link List} of matching {@link Collaborator_ProjectCto}s.
   */
  Page<Collaborator_ProjectCto> findCollaborator_ProjectCtos(Collaborator_ProjectSearchCriteriaTo criteria);

}
