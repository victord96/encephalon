package com.devonfw.application.encephalon.collaboratormanagement.dataaccess.api;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.devonfw.application.encephalon.collaboratormanagement.common.api.Collaborator;
import com.devonfw.application.encephalon.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author vcanizar
 */
@Entity
@Table(name = "`COLLABORATOR`", schema = "`Encephalon`")
public class CollaboratorEntity extends ApplicationPersistenceEntity implements Collaborator {

  @Column(name = "calendar_id")
  private Long calendar_id;

  @Column(name = "type_id")
  private Long type_id;

  @Column(name = "first_name")
  private String first_name;

  @Column(name = "last_name")
  private String last_name;

  @Column(name = "company_start_date")
  private Date company_start_date;

  @Column(name = "company_end_date")
  private Date company_end_date;

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
   * @return calendar_id
   */
  public Long getCalendar_id() {

    return this.calendar_id;
  }

  /**
   * @param calendar_id new value of {@link #getcalendar_id}.
   */
  public void setCalendar_id(Long calendar_id) {

    this.calendar_id = calendar_id;
  }

  /**
   * @return type_id
   */
  public Long getType_id() {

    return this.type_id;
  }

  /**
   * @param type_id new value of {@link #gettype_id}.
   */
  public void setType_id(Long type_id) {

    this.type_id = type_id;
  }

  /**
   * @return first_name
   */
  public String getFirst_name() {

    return this.first_name;
  }

  /**
   * @param first_name new value of {@link #getfirst_name}.
   */
  public void setFirst_name(String first_name) {

    this.first_name = first_name;
  }

  /**
   * @return last_name
   */
  public String getLast_name() {

    return this.last_name;
  }

  /**
   * @param last_name new value of {@link #getlast_name}.
   */
  public void setLast_name(String last_name) {

    this.last_name = last_name;
  }

  /**
   * @return company_start_date
   */
  public Date getCompany_start_date() {

    return this.company_start_date;
  }

  /**
   * @param company_start_date new value of {@link #getcompany_start_date}.
   */
  public void setCompany_start_date(Date company_start_date) {

    this.company_start_date = company_start_date;
  }

  /**
   * @return company_end_date
   */
  public Date getCompany_end_date() {

    return this.company_end_date;
  }

  /**
   * @param company_end_date new value of {@link #getcompany_end_date}.
   */
  public void setCompany_end_date(Date company_end_date) {

    this.company_end_date = company_end_date;
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
