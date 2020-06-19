package com.devonfw.application.encephalon.projectmanagement.dataaccess.api;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.devonfw.application.encephalon.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.encephalon.projectmanagement.common.api.Project;

/**
 * @author vcanizar
 */
@Entity
@Table(name = "`PROJECT`", schema = "`Encephalon`")
public class ProjectEntity extends ApplicationPersistenceEntity implements Project {

  @Column(name = "status_id")
  private Long status_id;

  @Column(name = "type_id")
  private Long type_id;

  @Column(name = "delunit_id")
  private Long delunit_id;

  @Column(name = "rate_card_id")
  private Long rate_card_id;

  @Column(name = "pon_code")
  private String pon_code;

  @Column(name = "short_desc")
  private String short_desc;

  @Column(name = "long_desc")
  private String long_desc;

  @Column(name = "activity")
  private boolean activity;

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
   * @return status_id
   */
  public Long getStatus_id() {

    return this.status_id;
  }

  /**
   * @param status_id new value of {@link #getstatus_id}.
   */
  public void setStatus_id(Long status_id) {

    this.status_id = status_id;
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
   * @return delunit_id
   */
  public Long getDelunit_id() {

    return this.delunit_id;
  }

  /**
   * @param delunit_id new value of {@link #getdelunit_id}.
   */
  public void setDelunit_id(Long delunit_id) {

    this.delunit_id = delunit_id;
  }

  /**
   * @return rate_card_id
   */
  public Long getRate_card_id() {

    return this.rate_card_id;
  }

  /**
   * @param rate_card_id new value of {@link #getrate_card_id}.
   */
  public void setRate_card_id(Long rate_card_id) {

    this.rate_card_id = rate_card_id;
  }

  /**
   * @return pon_code
   */
  public String getPon_code() {

    return this.pon_code;
  }

  /**
   * @param pon_code new value of {@link #getpon_code}.
   */
  public void setPon_code(String pon_code) {

    this.pon_code = pon_code;
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
   * @return activity
   */
  public boolean isActivity() {

    return this.activity;
  }

  /**
   * @param activity new value of {@link #getactivity}.
   */
  public void setActivity(boolean activity) {

    this.activity = activity;
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
