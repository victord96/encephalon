package com.devonfw.application.encephalon.collaboratormanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.collaboratormanagement.dataaccess.api.CollaboratorEntity;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorSearchCriteriaTo;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.usecase.UcFindCollaborator;
import com.devonfw.application.encephalon.collaboratormanagement.logic.base.usecase.AbstractCollaboratorUc;

/**
 * Use case implementation for searching, filtering and getting Collaborators
 */
@Named
@Validated
@Transactional
public class UcFindCollaboratorImpl extends AbstractCollaboratorUc implements UcFindCollaborator {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindCollaboratorImpl.class);

  @Override
  public CollaboratorEto findCollaborator(long id) {

    LOG.debug("Get Collaborator with id {} from database.", id);
    Optional<CollaboratorEntity> foundEntity = getCollaboratorRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), CollaboratorEto.class);
    else
      return null;
  }

  @Override
  public Page<CollaboratorEto> findCollaborators(CollaboratorSearchCriteriaTo criteria) {

    Page<CollaboratorEntity> collaborators = getCollaboratorRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(collaborators, CollaboratorEto.class);
  }

}
