package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to;

import java.sql.Date;
import java.sql.Timestamp;

import com.devonfw.application.encephalon.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.common.api.Collaborator_Delivery_Unit}s.
 */
public class Collaborator_Delivery_UnitSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long collaboratorId;

  private Long delivery_unitId;

  private Long collaborator_id;

  private Long delunit_id;

  private Date begin_date;

  private Date end_date;

  private Boolean active;

  private Timestamp create_date;

  private Timestamp modif_date;

  private String create_user;

  private String modif_user;

  private StringSearchConfigTo create_userOption;

  private StringSearchConfigTo modif_userOption;

  /**
   * getter for collaboratorId attribute
   *
   * @return collaboratorId
   */

  public Long getCollaboratorId() {

    return this.collaboratorId;
  }

  /**
   * @param collaborator setter for collaborator attribute
   */

  public void setCollaboratorId(Long collaboratorId) {

    this.collaboratorId = collaboratorId;
  }

  /**
   * getter for delivery_unitId attribute
   *
   * @return delivery_unitId
   */

  public Long getDelivery_unitId() {

    return this.delivery_unitId;
  }

  /**
   * @param delivery_unit setter for delivery_unit attribute
   */

  public void setDelivery_unitId(Long delivery_unitId) {

    this.delivery_unitId = delivery_unitId;
  }

  /**
   * @return collaborator_idId
   */

  public Long getCollaborator_id() {

    return this.collaborator_id;
  }

  /**
   * @param collaborator_id setter for collaborator_id attribute
   */

  public void setCollaborator_id(Long collaborator_id) {

    this.collaborator_id = collaborator_id;
  }

  /**
   * @return delunit_idId
   */

  public Long getDelunit_id() {

    return this.delunit_id;
  }

  /**
   * @param delunit_id setter for delunit_id attribute
   */

  public void setDelunit_id(Long delunit_id) {

    this.delunit_id = delunit_id;
  }

  /**
   * @return begin_dateId
   */

  public Date getBegin_date() {

    return this.begin_date;
  }

  /**
   * @param begin_date setter for begin_date attribute
   */

  public void setBegin_date(Date begin_date) {

    this.begin_date = begin_date;
  }

  /**
   * @return end_dateId
   */

  public Date getEnd_date() {

    return this.end_date;
  }

  /**
   * @param end_date setter for end_date attribute
   */

  public void setEnd_date(Date end_date) {

    this.end_date = end_date;
  }

  /**
   * @return activeId
   */

  public Boolean getActive() {

    return this.active;
  }

  /**
   * @param active setter for active attribute
   */

  public void setActive(Boolean active) {

    this.active = active;
  }

  /**
   * @return create_dateId
   */

  public Timestamp getCreate_date() {

    return this.create_date;
  }

  /**
   * @param create_date setter for create_date attribute
   */

  public void setCreate_date(Timestamp create_date) {

    this.create_date = create_date;
  }

  /**
   * @return modif_dateId
   */

  public Timestamp getModif_date() {

    return this.modif_date;
  }

  /**
   * @param modif_date setter for modif_date attribute
   */

  public void setModif_date(Timestamp modif_date) {

    this.modif_date = modif_date;
  }

  /**
   * @return create_userId
   */

  public String getCreate_user() {

    return this.create_user;
  }

  /**
   * @param create_user setter for create_user attribute
   */

  public void setCreate_user(String create_user) {

    this.create_user = create_user;
  }

  /**
   * @return modif_userId
   */

  public String getModif_user() {

    return this.modif_user;
  }

  /**
   * @param modif_user setter for modif_user attribute
   */

  public void setModif_user(String modif_user) {

    this.modif_user = modif_user;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getCreate_user() create_user}.
   */
  public StringSearchConfigTo getCreate_userOption() {

    return this.create_userOption;
  }

  /**
   * @param create_userOption new value of {@link #getCreate_userOption()}.
   */
  public void setCreate_userOption(StringSearchConfigTo create_userOption) {

    this.create_userOption = create_userOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getModif_user() modif_user}.
   */
  public StringSearchConfigTo getModif_userOption() {

    return this.modif_userOption;
  }

  /**
   * @param modif_userOption new value of {@link #getModif_userOption()}.
   */
  public void setModif_userOption(StringSearchConfigTo modif_userOption) {

    this.modif_userOption = modif_userOption;
  }

}
