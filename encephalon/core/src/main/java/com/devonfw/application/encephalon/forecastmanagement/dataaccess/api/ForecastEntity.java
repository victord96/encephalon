package com.devonfw.application.encephalon.forecastmanagement.dataaccess.api;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.devonfw.application.encephalon.forecastmanagement.common.api.Forecast;
import com.devonfw.application.encephalon.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author vcanizar
 */
@Entity
@Table(name = "`FORECAST`", schema = "`Encephalon`")
public class ForecastEntity extends ApplicationPersistenceEntity implements Forecast {

  @Column(name = "collaborator_id")
  private Long collaborator_id;

  @Column(name = "project_id")
  private Long project_id;

  @Column(name = "date_fs")
  private Date date_fs;

  @Column(name = "hours")
  private BigDecimal hours;

  @Column(name = "active")
  private boolean active;

  @Column(name = "create_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Timestamp create_date;

  @Column(name = "modif_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Timestamp modif_date;

  @Column(name = "create_user")
  private String create_user;

  @Column(name = "modif_user")
  private String modif_user;

  private static final long serialVersionUID = 1L;

  /**
   * @return collaborator_id
   */
  public Long getCollaborator_id() {

    return this.collaborator_id;
  }

  /**
   * @param collaborator_id new value of {@link #getcollaborator_id}.
   */
  public void setCollaborator_id(Long collaborator_id) {

    this.collaborator_id = collaborator_id;
  }

  /**
   * @return project_id
   */
  public Long getProject_id() {

    return this.project_id;
  }

  /**
   * @param project_id new value of {@link #getproject_id}.
   */
  public void setProject_id(Long project_id) {

    this.project_id = project_id;
  }

  /**
   * @return date_fs
   */
  public Date getDate_fs() {

    return this.date_fs;
  }

  /**
   * @param date_fs new value of {@link #getdate_fs}.
   */
  public void setDate_fs(Date date_fs) {

    this.date_fs = date_fs;
  }

  /**
   * @return hours
   */
  public BigDecimal getHours() {

    return this.hours;
  }

  /**
   * @param hours new value of {@link #gethours}.
   */
  public void setHours(BigDecimal hours) {

    this.hours = hours;
  }

  /**
   * @return active
   */
  public boolean isActive() {

    return this.active;
  }

  /**
   * @param active new value of {@link #getactive}.
   */
  public void setActive(boolean active) {

    this.active = active;
  }

  /**
   * @return create_date
   */
  public Timestamp getCreate_date() {

    return this.create_date;
  }

  /**
   * @param create_date new value of {@link #getcreate_date}.
   */
  public void setCreate_date(Timestamp create_date) {

    this.create_date = create_date;
  }

  /**
   * @return modif_date
   */
  public Timestamp getModif_date() {

    return this.modif_date;
  }

  /**
   * @param modif_date new value of {@link #getmodif_date}.
   */
  public void setModif_date(Timestamp modif_date) {

    this.modif_date = modif_date;
  }

  /**
   * @return create_user
   */
  public String getCreate_user() {

    return this.create_user;
  }

  /**
   * @param create_user new value of {@link #getcreate_user}.
   */
  public void setCreate_user(String create_user) {

    this.create_user = create_user;
  }

  /**
   * @return modif_user
   */
  public String getModif_user() {

    return this.modif_user;
  }

  /**
   * @param modif_user new value of {@link #getmodif_user}.
   */
  public void setModif_user(String modif_user) {

    this.modif_user = modif_user;
  }

}
