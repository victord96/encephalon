package com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.logic.api.to;

import java.sql.Date;
import java.sql.Timestamp;

import com.devonfw.application.encephalon.collaborator_delivery_unitmanagement.common.api.Collaborator_Delivery_Unit;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Collaborator_Delivery_Unit
 */
public class Collaborator_Delivery_UnitEto extends AbstractEto implements Collaborator_Delivery_Unit {

  private static final long serialVersionUID = 1L;

  private Long collaboratorId;

  private Long delivery_unitId;

  private Long collaborator_id;

  private Long delunit_id;

  private Date begin_date;

  private Date end_date;

  private boolean active;

  private Timestamp create_date;

  private Timestamp modif_date;

  private String create_user;

  private String modif_user;

  @Override
  public Long getCollaboratorId() {

    return this.collaboratorId;
  }

  @Override
  public void setCollaboratorId(Long collaboratorId) {

    this.collaboratorId = collaboratorId;
  }

  @Override
  public Long getDelivery_unitId() {

    return this.delivery_unitId;
  }

  @Override
  public void setDelivery_unitId(Long delivery_unitId) {

    this.delivery_unitId = delivery_unitId;
  }

  @Override
  public Long getCollaborator_id() {

    return this.collaborator_id;
  }

  @Override
  public void setCollaborator_id(Long collaborator_id) {

    this.collaborator_id = collaborator_id;
  }

  @Override
  public Long getDelunit_id() {

    return this.delunit_id;
  }

  @Override
  public void setDelunit_id(Long delunit_id) {

    this.delunit_id = delunit_id;
  }

  @Override
  public Date getBegin_date() {

    return this.begin_date;
  }

  @Override
  public void setBegin_date(Date begin_date) {

    this.begin_date = begin_date;
  }

  @Override
  public Date getEnd_date() {

    return this.end_date;
  }

  @Override
  public void setEnd_date(Date end_date) {

    this.end_date = end_date;
  }

  @Override
  public boolean isActive() {

    return this.active;
  }

  @Override
  public void setActive(boolean active) {

    this.active = active;
  }

  @Override
  public Timestamp getCreate_date() {

    return this.create_date;
  }

  @Override
  public void setCreate_date(Timestamp create_date) {

    this.create_date = create_date;
  }

  @Override
  public Timestamp getModif_date() {

    return this.modif_date;
  }

  @Override
  public void setModif_date(Timestamp modif_date) {

    this.modif_date = modif_date;
  }

  @Override
  public String getCreate_user() {

    return this.create_user;
  }

  @Override
  public void setCreate_user(String create_user) {

    this.create_user = create_user;
  }

  @Override
  public String getModif_user() {

    return this.modif_user;
  }

  @Override
  public void setModif_user(String modif_user) {

    this.modif_user = modif_user;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();

    result = prime * result + ((this.collaboratorId == null) ? 0 : this.collaboratorId.hashCode());

    result = prime * result + ((this.delivery_unitId == null) ? 0 : this.delivery_unitId.hashCode());
    result = prime * result + ((this.collaborator_id == null) ? 0 : this.collaborator_id.hashCode());
    result = prime * result + ((this.delunit_id == null) ? 0 : this.delunit_id.hashCode());
    result = prime * result + ((this.begin_date == null) ? 0 : this.begin_date.hashCode());
    result = prime * result + ((this.end_date == null) ? 0 : this.end_date.hashCode());
    result = prime * result + ((Boolean) this.active).hashCode();
    result = prime * result + ((this.create_date == null) ? 0 : this.create_date.hashCode());
    result = prime * result + ((this.modif_date == null) ? 0 : this.modif_date.hashCode());
    result = prime * result + ((this.create_user == null) ? 0 : this.create_user.hashCode());
    result = prime * result + ((this.modif_user == null) ? 0 : this.modif_user.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    Collaborator_Delivery_UnitEto other = (Collaborator_Delivery_UnitEto) obj;

    if (this.collaboratorId == null) {
      if (other.collaboratorId != null) {
        return false;
      }
    } else if (!this.collaboratorId.equals(other.collaboratorId)) {
      return false;
    }

    if (this.delivery_unitId == null) {
      if (other.delivery_unitId != null) {
        return false;
      }
    } else if (!this.delivery_unitId.equals(other.delivery_unitId)) {
      return false;
    }
    if (this.collaborator_id == null) {
      if (other.collaborator_id != null) {
        return false;
      }
    } else if (!this.collaborator_id.equals(other.collaborator_id)) {
      return false;
    }
    if (this.delunit_id == null) {
      if (other.delunit_id != null) {
        return false;
      }
    } else if (!this.delunit_id.equals(other.delunit_id)) {
      return false;
    }
    if (this.begin_date == null) {
      if (other.begin_date != null) {
        return false;
      }
    } else if (!this.begin_date.equals(other.begin_date)) {
      return false;
    }
    if (this.end_date == null) {
      if (other.end_date != null) {
        return false;
      }
    } else if (!this.end_date.equals(other.end_date)) {
      return false;
    }
    if (this.active != other.active) {
      return false;
    }
    if (this.create_date == null) {
      if (other.create_date != null) {
        return false;
      }
    } else if (!this.create_date.equals(other.create_date)) {
      return false;
    }
    if (this.modif_date == null) {
      if (other.modif_date != null) {
        return false;
      }
    } else if (!this.modif_date.equals(other.modif_date)) {
      return false;
    }
    if (this.create_user == null) {
      if (other.create_user != null) {
        return false;
      }
    } else if (!this.create_user.equals(other.create_user)) {
      return false;
    }
    if (this.modif_user == null) {
      if (other.modif_user != null) {
        return false;
      }
    } else if (!this.modif_user.equals(other.modif_user)) {
      return false;
    }
    return true;
  }
}
