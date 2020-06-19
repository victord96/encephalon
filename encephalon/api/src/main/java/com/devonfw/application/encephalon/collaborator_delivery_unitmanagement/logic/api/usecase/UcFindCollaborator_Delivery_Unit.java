package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitCto;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitSearchCriteriaTo;

public interface UcFindCollaborator_Delivery_Unit {

  /**
   * Returns a composite Collaborator_Delivery_Unit by its id 'id'.
   *
   * @param id The id 'id' of the Collaborator_Delivery_Unit.
   * @return The {@link Collaborator_Delivery_UnitCto} with id 'id'
   */
  Collaborator_Delivery_UnitCto findCollaborator_Delivery_UnitCto(long id);

  /**
   * Returns a paginated list of composite Collaborator_Delivery_Units matching the search criteria.
   *
   * @param criteria the {@link Collaborator_Delivery_UnitSearchCriteriaTo}.
   * @return the {@link List} of matching {@link Collaborator_Delivery_UnitCto}s.
   */
  Page<Collaborator_Delivery_UnitCto> findCollaborator_Delivery_UnitCtos(
      Collaborator_Delivery_UnitSearchCriteriaTo criteria);

}
