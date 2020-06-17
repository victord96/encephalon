package com.devonfw.application.encephalon.delivery_unitmanagement.dataaccess.api;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.devonfw.application.encephalon.delivery_unitmanagement.common.api.Delivery_Unit;
import com.devonfw.application.encephalon.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author vcanizar
 */
@Entity
@Table(name = "`DELIVERY_UNIT`", schema = "`Encephalon`")
public class Delivery_UnitEntity extends ApplicationPersistenceEntity implements Delivery_Unit {

  @Column(name = "orgunit_id")
  private Long orgunit_id;

  @Column(name = "short_desc")
  private String short_desc;

  @Column(name = "long_desc")
  private String long_desc;

  @Column(name = "working_hours")
  private int working_hours;

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
   * @return orgunit_id
   */
  public Long getOrgunit_id() {

    return this.orgunit_id;
  }

  /**
   * @param orgunit_id new value of {@link #getorgunit_id}.
   */
  public void setOrgunit_id(Long orgunit_id) {

    this.orgunit_id = orgunit_id;
  }

  /**
   * @return short_desc
   */
  public String getShort_desc() {

    return this.short_desc;
  }

  /**
   * @param short_desc new value of {@link #getshort_desc}.
   */
  public void setShort_desc(String short_desc) {

    this.short_desc = short_desc;
  }

  /**
   * @return long_desc
   */
  public String getLong_desc() {

    return this.long_desc;
  }

  /**
   * @param long_desc new value of {@link #getlong_desc}.
   */
  public void setLong_desc(String long_desc) {

    this.long_desc = long_desc;
  }

  /**
   * @return working_hours
   */
  public int getWorking_hours() {

    return this.working_hours;
  }

  /**
   * @param working_hours new value of {@link #getworking_hours}.
   */
  public void setWorking_hours(int working_hours) {

    this.working_hours = working_hours;
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
