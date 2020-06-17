package com.devonfw.application.encephalon.collaboratormanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorSearchCriteriaTo;

public interface UcFindCollaborator {

  /**
   * Returns a Collaborator by its id 'id'.
   *
   * @param id The id 'id' of the Collaborator.
   * @return The {@link CollaboratorEto} with id 'id'
   */
  CollaboratorEto findCollaborator(long id);

  /**
   * Returns a paginated list of Collaborators matching the search criteria.
   *
   * @param criteria the {@link CollaboratorSearchCriteriaTo}.
   * @return the {@link List} of matching {@link CollaboratorEto}s.
   */
  Page<CollaboratorEto> findCollaborators(CollaboratorSearchCriteriaTo criteria);

}
