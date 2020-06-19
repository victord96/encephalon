package com.devonfw.application.encephalon.collaborator_projectmanagement.logic.api.to;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import com.devonfw.application.encephalon.collaborator_projectmanagement.common.api.Collaborator_Project;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Collaborator_Project
 */
public class Collaborator_ProjectEto extends AbstractEto implements Collaborator_Project {

  private static final long serialVersionUID = 1L;

  private Long collaborator_id;

  private Long project_id;

  private Date begin_date;

  private Date end_date;

  private BigDecimal percentage;

  private boolean active;

  private Timestamp create_date;

  private Timestamp modif_date;

  private String create_user;

  private String modif_user;

  private Long collaboratorId;

  private Long projectId;

  @Override
  public Long getCollaborator_id() {

    return this.collaborator_id;
  }

  @Override
  public void setCollaborator_id(Long collaborator_id) {

    this.collaborator_id = collaborator_id;
  }

  @Override
  public Long getProject_id() {

    return this.project_id;
  }

  @Override
  public void setProject_id(Long project_id) {

    this.project_id = project_id;
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
  public BigDecimal getPercentage() {

    return this.percentage;
  }

  @Override
  public void setPercentage(BigDecimal percentage) {

    this.percentage = percentage;
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
  public Long getCollaboratorId() {

    return this.collaboratorId;
  }

  @Override
  public void setCollaboratorId(Long collaboratorId) {

    this.collaboratorId = collaboratorId;
  }

  @Override
  public Long getProjectId() {

    return this.projectId;
  }

  @Override
  public void setProjectId(Long projectId) {

    this.projectId = projectId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.collaborator_id == null) ? 0 : this.collaborator_id.hashCode());
    result = prime * result + ((this.project_id == null) ? 0 : this.project_id.hashCode());
    result = prime * result + ((this.begin_date == null) ? 0 : this.begin_date.hashCode());
    result = prime * result + ((this.end_date == null) ? 0 : this.end_date.hashCode());
    result = prime * result + ((this.percentage == null) ? 0 : this.percentage.hashCode());
    result = prime * result + ((Boolean) this.active).hashCode();
    result = prime * result + ((this.create_date == null) ? 0 : this.create_date.hashCode());
    result = prime * result + ((this.modif_date == null) ? 0 : this.modif_date.hashCode());
    result = prime * result + ((this.create_user == null) ? 0 : this.create_user.hashCode());
    result = prime * result + ((this.modif_user == null) ? 0 : this.modif_user.hashCode());

    result = prime * result + ((this.collaboratorId == null) ? 0 : this.collaboratorId.hashCode());

    result = prime * result + ((this.projectId == null) ? 0 : this.projectId.hashCode());
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
    Collaborator_ProjectEto other = (Collaborator_ProjectEto) obj;
    if (this.collaborator_id == null) {
      if (other.collaborator_id != null) {
        return false;
      }
    } else if (!this.collaborator_id.equals(other.collaborator_id)) {
      return false;
    }
    if (this.project_id == null) {
      if (other.project_id != null) {
        return false;
      }
    } else if (!this.project_id.equals(other.project_id)) {
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
    if (this.percentage == null) {
      if (other.percentage != null) {
        return false;
      }
    } else if (!this.percentage.equals(other.percentage)) {
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

    if (this.collaboratorId == null) {
      if (other.collaboratorId != null) {
        return false;
      }
    } else if (!this.collaboratorId.equals(other.collaboratorId)) {
      return false;
    }

    if (this.projectId == null) {
      if (other.projectId != null) {
        return false;
      }
    } else if (!this.projectId.equals(other.projectId)) {
      return false;
    }
    return true;
  }
}
