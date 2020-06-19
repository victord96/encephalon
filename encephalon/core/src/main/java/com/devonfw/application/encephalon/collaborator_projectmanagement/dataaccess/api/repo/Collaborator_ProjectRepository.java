package com.devonfw.application.encephalon.collaborator_projectmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.encephalon.collaborator_projectmanagement.dataaccess.api.Collaborator_ProjectEntity;
import com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to.Collaborator_ProjectSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link Collaborator_ProjectEntity}
 */
public interface Collaborator_ProjectRepository extends DefaultRepository<Collaborator_ProjectEntity> {

  /**
   * @param criteria the {@link Collaborator_ProjectSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link Collaborator_ProjectEntity} objects that matched the search. If no pageable
   *         is set, it will return a unique page with all the objects that matched the search.
   */
  default Page<Collaborator_ProjectEntity> findByCriteria(Collaborator_ProjectSearchCriteriaTo criteria) {

    Collaborator_ProjectEntity alias = newDslAlias();
    JPAQuery<Collaborator_ProjectEntity> query = newDslQuery(alias);

    Long collaborator_id = criteria.getCollaborator_id();
    if (collaborator_id != null) {
      query.where($(alias.getCollaborator_id()).eq(collaborator_id));
    }
    Long project_id = criteria.getProject_id();
    if (project_id != null) {
      query.where($(alias.getProject_id()).eq(project_id));
    }
    Date begin_date = criteria.getBegin_date();
    if (begin_date != null) {
      query.where($(alias.getBegin_date()).eq(begin_date));
    }
    Date end_date = criteria.getEnd_date();
    if (end_date != null) {
      query.where($(alias.getEnd_date()).eq(end_date));
    }
    BigDecimal percentage = criteria.getPercentage();
    if (percentage != null) {
      query.where($(alias.getPercentage()).eq(percentage));
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
    Long collaborator = criteria.getCollaboratorId();
    if (collaborator != null) {
      query.where($(alias.getCollaborator().getId()).eq(collaborator));
    }
    Long project = criteria.getProjectId();
    if (project != null) {
      query.where($(alias.getProject().getId()).eq(project));
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
  public default void addOrderBy(JPAQuery<Collaborator_ProjectEntity> query, Collaborator_ProjectEntity alias,
      Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "collaborator_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getCollaborator_id()).asc());
            } else {
              query.orderBy($(alias.getCollaborator_id()).desc());
            }
            break;
          case "project_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getProject_id()).asc());
            } else {
              query.orderBy($(alias.getProject_id()).desc());
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
          case "percentage":
            if (next.isAscending()) {
              query.orderBy($(alias.getPercentage()).asc());
            } else {
              query.orderBy($(alias.getPercentage()).desc());
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
          case "collaborator":
            if (next.isAscending()) {
              query.orderBy($(alias.getCollaborator().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getCollaborator().getId().toString()).desc());
            }
            break;
          case "project":
            if (next.isAscending()) {
              query.orderBy($(alias.getProject().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getProject().getId().toString()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}