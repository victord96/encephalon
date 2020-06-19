package com.devonfw.application.encephalon.collaborator_projectmanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.collaborator_projectmanagement.dataaccess.api.Collaborator_ProjectEntity;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectCto;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectEto;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectSearchCriteriaTo;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.usecase.UcFindCollaborator_Project;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.base.usecase.AbstractCollaborator_ProjectUc;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectEto;

/**
 * Use case implementation for searching, filtering and getting Collaborator_Projects
 */
@Named
@Validated
@Transactional
public class UcFindCollaborator_ProjectImpl extends AbstractCollaborator_ProjectUc
    implements UcFindCollaborator_Project {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindCollaborator_ProjectImpl.class);

  @Override
  public Collaborator_ProjectCto findCollaborator_ProjectCto(long id) {

    LOG.debug("Get Collaborator_ProjectCto with id {} from database.", id);
    Collaborator_ProjectEntity entity = getCollaborator_ProjectRepository().find(id);
    Collaborator_ProjectCto cto = new Collaborator_ProjectCto();
    cto.setCollaborator_Project(getBeanMapper().map(entity, Collaborator_ProjectEto.class));
    cto.setCollaborator(getBeanMapper().map(entity.getCollaborator(), CollaboratorEto.class));
    cto.setProject(getBeanMapper().map(entity.getProject(), ProjectEto.class));

    return cto;
  }

  @Override
  public Page<Collaborator_ProjectCto> findCollaborator_ProjectCtos(Collaborator_ProjectSearchCriteriaTo criteria) {

    Page<Collaborator_ProjectEntity> collaborator_projects = getCollaborator_ProjectRepository()
        .findByCriteria(criteria);
    List<Collaborator_ProjectCto> ctos = new ArrayList<>();
    for (Collaborator_ProjectEntity entity : collaborator_projects.getContent()) {
      Collaborator_ProjectCto cto = new Collaborator_ProjectCto();
      cto.setCollaborator_Project(getBeanMapper().map(entity, Collaborator_ProjectEto.class));
      cto.setCollaborator(getBeanMapper().map(entity.getCollaborator(), CollaboratorEto.class));
      cto.setProject(getBeanMapper().map(entity.getProject(), ProjectEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, collaborator_projects.getTotalElements());
  }
}
