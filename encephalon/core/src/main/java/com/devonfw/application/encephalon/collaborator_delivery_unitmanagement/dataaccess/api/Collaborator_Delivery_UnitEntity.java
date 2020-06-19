package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.dataaccess.api;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.common.api.Collaborator_Delivery_Unit;
import com.devonfw.application.encephalon.collaboratormanagement.dataaccess.api.CollaboratorEntity;
import com.devonfw.application.encephalon.delivery_unitmanagement.dataaccess.api.Delivery_UnitEntity;
import com.devonfw.application.encephalon.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author vcanizar
 */
@Entity
@Table(name = "`COLLABORATOR_DELIVERY_UNIT`", schema = "`Encephalon`")
public class Collaborator_Delivery_UnitEntity extends ApplicationPersistenceEntity
    implements Collaborator_Delivery_Unit {

  private CollaboratorEntity collaborator;

  private Delivery_UnitEntity delivery_unit;

  @Column(name = "collaborator_id")
  private Long collaborator_id;

  @Column(name = "delunit_id")
  private Long delunit_id;

  @Column(name = "begin_date")
  private Date begin_date;

  @Column(name = "end_date")
  private Date end_date;

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

  @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
  @JoinColumn(name = "delunit_id", referencedColumnName = "id", insertable = false, updatable = false)
  public Delivery_UnitEntity getDelivery_Unit() {

    return this.delivery_unit;
  }

  @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
  @JoinColumn(name = "collaborator_id", referencedColumnName = "id", insertable = false, updatable = false)
  public CollaboratorEntity getCollaborator() {

    return this.collaborator;
  }

  /**
   * @return collaborator_id
   */
  @Override
  public Long getCollaborator_id() {

    return this.collaborator_id;
  }

  /**
   * @param collaborator_id new value of {@link #getcollaborator_id}.
   */
  @Override
  public void setCollaborator_id(Long collaborator_id) {

    this.collaborator_id = collaborator_id;
  }

  /**
   * @return delunit_id
   */
  @Override
  public Long getDelunit_id() {

    return this.delunit_id;
  }

  /**
   * @param delunit_id new value of {@link #getdelunit_id}.
   */
  @Override
  public void setDelunit_id(Long delunit_id) {

    this.delunit_id = delunit_id;
  }

  /**
   * @return begin_date
   */
  @Override
  public Date getBegin_date() {

    return this.begin_date;
  }

  /**
   * @param begin_date new value of {@link #getbegin_date}.
   */
  @Override
  public void setBegin_date(Date begin_date) {

    this.begin_date = begin_date;
  }

  /**
   * @return end_date
   */
  @Override
  public Date getEnd_date() {

    return this.end_date;
  }

  /**
   * @param end_date new value of {@link #getend_date}.
   */
  @Override
  public void setEnd_date(Date end_date) {

    this.end_date = end_date;
  }

  /**
   * @return active
   */
  @Override
  public boolean isActive() {

    return this.active;
  }

  /**
   * @param active new value of {@link #getactive}.
   */
  @Override
  public void setActive(boolean active) {

    this.active = active;
  }

  /**
   * @return create_date
   */
  @Override
  public Timestamp getCreate_date() {

    return this.create_date;
  }

  /**
   * @param create_date new value of {@link #getcreate_date}.
   */
  @Override
  public void setCreate_date(Timestamp create_date) {

    this.create_date = create_date;
  }

  /**
   * @return modif_date
   */
  @Override
  public Timestamp getModif_date() {

    return this.modif_date;
  }

  /**
   * @param modif_date new value of {@link #getmodif_date}.
   */
  @Override
  public void setModif_date(Timestamp modif_date) {

    this.modif_date = modif_date;
  }

  /**
   * @return create_user
   */
  @Override
  public String getCreate_user() {

    return this.create_user;
  }

  /**
   * @param create_user new value of {@link #getcreate_user}.
   */
  @Override
  public void setCreate_user(String create_user) {

    this.create_user = create_user;
  }

  /**
   * @return modif_user
   */
  @Override
  public String getModif_user() {

    return this.modif_user;
  }

  /**
   * @param modif_user new value of {@link #getmodif_user}.
   */
  @Override
  public void setModif_user(String modif_user) {

    this.modif_user = modif_user;
  }

  /**
   * @param collaborator new value of {@link #getcollaborator}.
   */
  public void setCollaborator(CollaboratorEntity collaborator) {

    this.collaborator = collaborator;
  }

  /**
   * @param delivery_unit new value of {@link #getdelivery_unit}.
   */
  public void setDelivery_Unit(Delivery_UnitEntity delivery_unit) {

    this.delivery_unit = delivery_unit;
  }

  @Override
  @Transient
  public Long getCollaboratorId() {

    if (this.collaborator == null) {
      return null;
    }
    return this.collaborator.getId();
  }

  @Override
  public void setCollaboratorId(Long collaboratorId) {

    if (collaboratorId == null) {
      this.collaborator = null;
    } else {
      CollaboratorEntity collaboratorEntity = new CollaboratorEntity();
      collaboratorEntity.setId(collaboratorId);
      this.collaborator = collaboratorEntity;
    }
  }

  @Override
  @Transient
  public Long getDelivery_unitId() {

    if (this.delivery_unit == null) {
      return null;
    }
    return this.delivery_unit.getId();
  }

  @Override
  public void setDelivery_unitId(Long delivery_unitId) {

    if (delivery_unitId == null) {
      this.delivery_unit = null;
    } else {
      Delivery_UnitEntity delivery_UnitEntity = new Delivery_UnitEntity();
      delivery_UnitEntity.setId(delivery_unitId);
      this.delivery_unit = delivery_UnitEntity;
    }
  }

}
