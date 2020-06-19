package com.devonfw.application.encephalon.forecastmanagement.logic.api.to;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import com.devonfw.application.encephalon.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.encephalon.forecastmanagement.common.api.Forecast}s.
 */
public class ForecastSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long collaborator_id;

  private Long project_id;

  private Date date_fs;

  private BigDecimal hours;

  private Boolean active;

  private Timestamp create_date;

  private Timestamp modif_date;

  private String create_user;

  private String modif_user;

  private StringSearchConfigTo create_userOption;

  private StringSearchConfigTo modif_userOption;

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
   * @return project_idId
   */

  public Long getProject_id() {

    return this.project_id;
  }

  /**
   * @param project_id setter for project_id attribute
   */

  public void setProject_id(Long project_id) {

    this.project_id = project_id;
  }

  /**
   * @return date_fsId
   */

  public Date getDate_fs() {

    return this.date_fs;
  }

  /**
   * @param date_fs setter for date_fs attribute
   */

  public void setDate_fs(Date date_fs) {

    this.date_fs = date_fs;
  }

  /**
   * @return hoursId
   */

  public BigDecimal getHours() {

    return this.hours;
  }

  /**
   * @param hours setter for hours attribute
   */

  public void setHours(BigDecimal hours) {

    this.hours = hours;
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
