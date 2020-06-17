package com.devonfw.application.encephalon.delivery_unitmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.sql.Timestamp;
import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.encephalon.delivery_unitmanagement.dataaccess.api.Delivery_UnitEntity;
import com.devonfw.application.encephalon.delivery_unitmanagement.logic.api.to.Delivery_UnitSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link Delivery_UnitEntity}
 */
public interface Delivery_UnitRepository extends DefaultRepository<Delivery_UnitEntity> {

  /**
   * @param criteria the {@link Delivery_UnitSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link Delivery_UnitEntity} objects that matched the search. If no pageable is set,
   *         it will return a unique page with all the objects that matched the search.
   */
  default Page<Delivery_UnitEntity> findByCriteria(Delivery_UnitSearchCriteriaTo criteria) {

    Delivery_UnitEntity alias = newDslAlias();
    JPAQuery<Delivery_UnitEntity> query = newDslQuery(alias);

    Long orgunit_id = criteria.getOrgunit_id();
    if (orgunit_id != null) {
      query.where($(alias.getOrgunit_id()).eq(orgunit_id));
    }
    String short_desc = criteria.getShort_desc();
    if (short_desc != null && !short_desc.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getShort_desc()), short_desc, criteria.getShort_descOption());
    }
    String long_desc = criteria.getLong_desc();
    if (long_desc != null && !long_desc.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getLong_desc()), long_desc, criteria.getLong_descOption());
    }
    Integer working_hours = criteria.getWorking_hours();
    if (working_hours != null) {
      query.where($(alias.getWorking_hours()).eq(working_hours));
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
  public default void addOrderBy(JPAQuery<Delivery_UnitEntity> query, Delivery_UnitEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "orgunit_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getOrgunit_id()).asc());
            } else {
              query.orderBy($(alias.getOrgunit_id()).desc());
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
          case "working_hours":
            if (next.isAscending()) {
              query.orderBy($(alias.getWorking_hours()).asc());
            } else {
              query.orderBy($(alias.getWorking_hours()).desc());
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