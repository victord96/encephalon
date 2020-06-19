package com.devonfw.application.encephalon.projectmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.sql.Timestamp;
import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.encephalon.projectmanagement.dataaccess.api.ProjectEntity;
import com.devonfw.application.encephalon.projectmanagement.logic.api.to.ProjectSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link ProjectEntity}
 */
public interface ProjectRepository extends DefaultRepository<ProjectEntity> {

  /**
   * @param criteria the {@link ProjectSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link ProjectEntity} objects that matched the search. If no pageable is set, it
   *         will return a unique page with all the objects that matched the search.
   */
  default Page<ProjectEntity> findByCriteria(ProjectSearchCriteriaTo criteria) {

    ProjectEntity alias = newDslAlias();
    JPAQuery<ProjectEntity> query = newDslQuery(alias);

    Long status_id = criteria.getStatus_id();
    if (status_id != null) {
      query.where($(alias.getStatus_id()).eq(status_id));
    }
    Long type_id = criteria.getType_id();
    if (type_id != null) {
      query.where($(alias.getType_id()).eq(type_id));
    }
    Long delunit_id = criteria.getDelunit_id();
    if (delunit_id != null) {
      query.where($(alias.getDelunit_id()).eq(delunit_id));
    }
    Long rate_card_id = criteria.getRate_card_id();
    if (rate_card_id != null) {
      query.where($(alias.getRate_card_id()).eq(rate_card_id));
    }
    String pon_code = criteria.getPon_code();
    if (pon_code != null && !pon_code.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getPon_code()), pon_code, criteria.getPon_codeOption());
    }
    String short_desc = criteria.getShort_desc();
    if (short_desc != null && !short_desc.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getShort_desc()), short_desc, criteria.getShort_descOption());
    }
    String long_desc = criteria.getLong_desc();
    if (long_desc != null && !long_desc.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getLong_desc()), long_desc, criteria.getLong_descOption());
    }
    Boolean activity = criteria.getActivity();
    if (activity != null) {
      query.where($(alias.isActivity()).eq(activity));
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
  public default void addOrderBy(JPAQuery<ProjectEntity> query, ProjectEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "status_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getStatus_id()).asc());
            } else {
              query.orderBy($(alias.getStatus_id()).desc());
            }
            break;
          case "type_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getType_id()).asc());
            } else {
              query.orderBy($(alias.getType_id()).desc());
            }
            break;
          case "delunit_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getDelunit_id()).asc());
            } else {
              query.orderBy($(alias.getDelunit_id()).desc());
            }
            break;
          case "rate_card_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getRate_card_id()).asc());
            } else {
              query.orderBy($(alias.getRate_card_id()).desc());
            }
            break;
          case "pon_code":
            if (next.isAscending()) {
              query.orderBy($(alias.getPon_code()).asc());
            } else {
              query.orderBy($(alias.getPon_code()).desc());
            }
            break;
          case "short_desc":
            if (next.isAscending()) {
              query.orderBy($(alias.getShort_desc()).asc());
            } else {
              query.orderBy($(alias.getShort_desc()).desc());
            }
            break;
          case "long_desc":
            if (next.isAscending()) {
              query.orderBy($(alias.getLong_desc()).asc());
            } else {
              query.orderBy($(alias.getLong_desc()).desc());
            }
            break;
          case "activity":
            if (next.isAscending()) {
              query.orderBy($(alias.getModif_user()).asc());
            } else {
              query.orderBy($(alias.getModif_user()).desc());
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