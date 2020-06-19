package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.dataaccess.api.Collaborator_Delivery_UnitEntity;
import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to.Collaborator_Delivery_UnitSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link Collaborator_Delivery_UnitEntity}
 */
public interface Collaborator_Delivery_UnitRepository extends DefaultRepository<Collaborator_Delivery_UnitEntity> {

  /**
   * @param criteria the {@link Collaborator_Delivery_UnitSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link Collaborator_Delivery_UnitEntity} objects that matched the search. If no
   *         pageable is set, it will return a unique page with all the objects that matched the search.
   */
  default Page<Collaborator_Delivery_UnitEntity> findByCriteria(Collaborator_Delivery_UnitSearchCriteriaTo criteria) {

    Collaborator_Delivery_UnitEntity alias = newDslAlias();
    JPAQuery<Collaborator_Delivery_UnitEntity> query = newDslQuery(alias);

    Long collaborator = criteria.getCollaboratorId();
    if (collaborator != null) {
      query.where($(alias.getCollaborator().getId()).eq(collaborator));
    }
    Long delivery_unit = criteria.getDelivery_unitId();
    if (delivery_unit != null) {
      query.where($(alias.getDelivery_Unit().getId()).eq(delivery_unit));
    }
    Long collaborator_id = criteria.getCollaborator_id();
    if (collaborator_id != null) {
      query.where($(alias.getCollaborator_id()).eq(collaborator_id));
    }
    Long delunit_id = criteria.getDelunit_id();
    if (delunit_id != null) {
      query.where($(alias.getDelunit_id()).eq(delunit_id));
    }
    Date begin_date = criteria.getBegin_date();
    if (begin_date != null) {
      query.where($(alias.getBegin_date()).eq(begin_date));
    }
    Date end_date = criteria.getEnd_date();
    if (end_date != null) {
      query.where($(alias.getEnd_date()).eq(end_date));
    }
    Boolean active = criteria.getActive();
    if (active != null) {
      query.where($(alias.isActive()).eq(active));
    }
    Timestamp create_date = criteria.getCreate_date();
    if (create_date != null) {
      query.where($(alias.getCreate_date()).eq(create_date));
    }
    Timestamp modif_date = criteria.getModif_date();
    if (modif_date != null) {
      query.where($(alias.getModif_date()).eq(modif_date));
    }
    String create_user = criteria.getCreate_user();
    if (create_user != null && !create_user.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getCreate_user()), create_user, criteria.getCreate_userOption());
    }
    String modif_user = criteria.getModif_user();
    if (modif_user != null && !modif_user.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getModif_user()), modif_user, criteria.getModif_userOption());
    }
    if (criteria.getPageable() == null) {
      criteria.setPageable(PageRequest.of(0, Integer.MAX_VALUE));
    } else {
      addOrderBy(query, alias, criteria.getPageable().getSort());
    }

    return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
  }

  /**
   * Add sorting to the given query on the given alias
   *
   * @param query to add sorting to
   * @param alias to retrieve columns from for sorting
   * @param sort specification of sorting
   */
  public default void addOrderBy(JPAQuery<Collaborator_Delivery_UnitEntity> query,
      Collaborator_Delivery_UnitEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "collaborator":
            if (next.isAscending()) {
              query.orderBy($(alias.getCollaborator().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getCollaborator().getId().toString()).desc());
            }
            break;
          case "delivery_unit":
            if (next.isAscending()) {
              query.orderBy($(alias.getDelivery_Unit().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getDelivery_Unit().getId().toString()).desc());
            }
            break;
          case "collaborator_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getCollaborator_id()).asc());
            } else {
              query.orderBy($(alias.getCollaborator_id()).desc());
            }
            break;
          case "delunit_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getDelunit_id()).asc());
            } else {
              query.orderBy($(alias.getDelunit_id()).desc());
            }
            break;
          case "begin_date":
            if (next.isAscending()) {
              query.orderBy($(alias.getBegin_date()).asc());
            } else {
              query.orderBy($(alias.getBegin_date()).desc());
            }
            break;
          case "end_date":
            if (next.isAscending()) {
              query.orderBy($(alias.getEnd_date()).asc());
            } else {
              query.orderBy($(alias.getEnd_date()).desc());
            }
            break;
          case "active":
            if (next.isAscending()) {
              query.orderBy($(alias.getModif_user()).asc());
            } else {
              query.orderBy($(alias.getModif_user()).desc());
            }
            break;
          case "create_date":
            if (next.isAscending()) {
              query.orderBy($(alias.getCreate_date()).asc());
            } else {
              query.orderBy($(alias.getCreate_date()).desc());
            }
            break;
          case "modif_date":
            if (next.isAscending()) {
              query.orderBy($(alias.getModif_date()).asc());
            } else {
              query.orderBy($(alias.getModif_date()).desc());
            }
            break;
          case "create_user":
            if (next.isAscending()) {
              query.orderBy($(alias.getCreate_user()).asc());
            } else {
              query.orderBy($(alias.getCreate_user()).desc());
            }
            break;
          case "modif_user":
            if (next.isAscending()) {
              query.orderBy($(alias.getModif_user()).asc());
            } else {
              query.orderBy($(alias.getModif_user()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}