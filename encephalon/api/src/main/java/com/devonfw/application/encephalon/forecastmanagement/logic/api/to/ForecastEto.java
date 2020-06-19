package com.devonfw.application.encephalon.forecastmanagement.logic.api.to;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import com.devonfw.application.encephalon.forecastmanagement.common.api.Forecast;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Forecast
 */
public class ForecastEto extends AbstractEto implements Forecast {

  private static final long serialVersionUID = 1L;

  private Long collaborator_id;

  private Long project_id;

  private Date date_fs;

  private BigDecimal hours;

  private boolean active;

  private Timestamp create_date;

  private Timestamp modif_date;

  private String create_user;

  private String modif_user;

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
  public Date getDate_fs() {

    return this.date_fs;
  }

  @Override
  public void setDate_fs(Date date_fs) {

    this.date_fs = date_fs;
  }

  @Override
  public BigDecimal getHours() {

    return this.hours;
  }

  @Override
  public void setHours(BigDecimal hours) {

    this.hours = hours;
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
    result = prime * result + ((this.collaborator_id == null) ? 0 : this.collaborator_id.hashCode());
    result = prime * result + ((this.project_id == null) ? 0 : this.project_id.hashCode());
    result = prime * result + ((this.date_fs == null) ? 0 : this.date_fs.hashCode());
    result = prime * result + ((this.hours == null) ? 0 : this.hours.hashCode());
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
    ForecastEto other = (ForecastEto) obj;
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
    if (this.date_fs == null) {
      if (other.date_fs != null) {
        return false;
      }
    } else if (!this.date_fs.equals(other.date_fs)) {
      return false;
    }
    if (this.hours == null) {
      if (other.hours != null) {
        return false;
      }
    } else if (!this.hours.equals(other.hours)) {
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
