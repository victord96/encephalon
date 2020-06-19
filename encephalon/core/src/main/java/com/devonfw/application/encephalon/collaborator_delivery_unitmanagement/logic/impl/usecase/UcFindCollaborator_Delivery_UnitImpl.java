package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.impl.usecase;

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

import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.dataaccess.api.Collaborator_Delivery_UnitEntity;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitCto;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitEto;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitSearchCriteriaTo;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.usecase.UcFindCollaborator_Delivery_Unit;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.base.usecase.AbstractCollaborator_Delivery_UnitUc;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitEto;

/**
 * Use case implementation for searching, filtering and getting Collaborator_Delivery_Units
 */
@Named
@Validated
@Transactional
public class UcFindCollaborator_Delivery_UnitImpl extends AbstractCollaborator_Delivery_UnitUc
    implements UcFindCollaborator_Delivery_Unit {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindCollaborator_Delivery_UnitImpl.class);

  @Override
  public Collaborator_Delivery_UnitCto findCollaborator_Delivery_UnitCto(long id) {

    LOG.debug("Get Collaborator_Delivery_UnitCto with id {} from database.", id);
    Collaborator_Delivery_UnitEntity entity = getCollaborator_Delivery_UnitRepository().find(id);
    Collaborator_Delivery_UnitCto cto = new Collaborator_Delivery_UnitCto();
    cto.setCollaborator_Delivery_Unit(getBeanMapper().map(entity, Collaborator_Delivery_UnitEto.class));
    cto.setCollaborator(getBeanMapper().map(entity.getCollaborator(), CollaboratorEto.class));
    cto.setDelivery_unit(getBeanMapper().map(entity.getDelivery_Unit(), Delivery_UnitEto.class));

    return cto;
  }

  @Override
  public Page<Collaborator_Delivery_UnitCto> findCollaborator_Delivery_UnitCtos(
      Collaborator_Delivery_UnitSearchCriteriaTo criteria) {

    Page<Collaborator_Delivery_UnitEntity> collaborator_delivery_units = getCollaborator_Delivery_UnitRepository()
        .findByCriteria(criteria);
    List<Collaborator_Delivery_UnitCto> ctos = new ArrayList<>();
    for (Collaborator_Delivery_UnitEntity entity : collaborator_delivery_units.getContent()) {
      Collaborator_Delivery_UnitCto cto = new Collaborator_Delivery_UnitCto();
      cto.setCollaborator_Delivery_Unit(getBeanMapper().map(entity, Collaborator_Delivery_UnitEto.class));
      cto.setCollaborator(getBeanMapper().map(entity.getCollaborator(), CollaboratorEto.class));
      cto.setDelivery_unit(getBeanMapper().map(entity.getDelivery_Unit(), Delivery_UnitEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, collaborator_delivery_units.getTotalElements());
  }
}
