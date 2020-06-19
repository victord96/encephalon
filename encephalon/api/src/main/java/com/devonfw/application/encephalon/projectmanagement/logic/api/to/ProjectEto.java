package com.devonfw.application.encephalon.projectmanagement.logic.api.to;

import java.sql.Timestamp;

import com.devonfw.application.encephalon.projectmanagement.common.api.Project;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Project
 */
public class ProjectEto extends AbstractEto implements Project {

  private static final long serialVersionUID = 1L;

  private Long status_id;

  private Long type_id;

  private Long delunit_id;

  private Long rate_card_id;

  private String pon_code;

  private String short_desc;

  private String long_desc;

  private boolean activity;

  private boolean active;

  private Timestamp create_date;

  private Timestamp modif_date;

  private String create_user;

  private String modif_user;

  @Override
  public Long getStatus_id() {

    return this.status_id;
  }

  @Override
  public void setStatus_id(Long status_id) {

    this.status_id = status_id;
  }

  @Override
  public Long getType_id() {

    return this.type_id;
  }

  @Override
  public void setType_id(Long type_id) {

    this.type_id = type_id;
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
  public Long getRate_card_id() {

    return this.rate_card_id;
  }

  @Override
  public void setRate_card_id(Long rate_card_id) {

    this.rate_card_id = rate_card_id;
  }

  @Override
  public String getPon_code() {

    return this.pon_code;
  }

  @Override
  public void setPon_code(String pon_code) {

    this.pon_code = pon_code;
  }

  @Override
  public String getShort_desc() {

    return this.short_desc;
  }

  @Override
  public void setShort_desc(String short_desc) {

    this.short_desc = short_desc;
  }

  @Override
  public String getLong_desc() {

    return this.long_desc;
  }

  @Override
  public void setLong_desc(String long_desc) {

    this.long_desc = long_desc;
  }

  @Override
  public boolean isActivity() {

    return this.activity;
  }

  @Override
  public void setActivity(boolean activity) {

    this.activity = activity;
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
    result = prime * result + ((this.status_id == null) ? 0 : this.status_id.hashCode());
    result = prime * result + ((this.type_id == null) ? 0 : this.type_id.hashCode());
    result = prime * result + ((this.delunit_id == null) ? 0 : this.delunit_id.hashCode());
    result = prime * result + ((this.rate_card_id == null) ? 0 : this.rate_card_id.hashCode());
    result = prime * result + ((this.pon_code == null) ? 0 : this.pon_code.hashCode());
    result = prime * result + ((this.short_desc == null) ? 0 : this.short_desc.hashCode());
    result = prime * result + ((this.long_desc == null) ? 0 : this.long_desc.hashCode());
    result = prime * result + ((Boolean) this.activity).hashCode();
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
    ProjectEto other = (ProjectEto) obj;
    if (this.status_id == null) {
      if (other.status_id != null) {
        return false;
      }
    } else if (!this.status_id.equals(other.status_id)) {
      return false;
    }
    if (this.type_id == null) {
      if (other.type_id != null) {
        return false;
      }
    } else if (!this.type_id.equals(other.type_id)) {
      return false;
    }
    if (this.delunit_id == null) {
      if (other.delunit_id != null) {
        return false;
      }
    } else if (!this.delunit_id.equals(other.delunit_id)) {
      return false;
    }
    if (this.rate_card_id == null) {
      if (other.rate_card_id != null) {
        return false;
      }
    } else if (!this.rate_card_id.equals(other.rate_card_id)) {
      return false;
    }
    if (this.pon_code == null) {
      if (other.pon_code != null) {
        return false;
      }
    } else if (!this.pon_code.equals(other.pon_code)) {
      return false;
    }
    if (this.short_desc == null) {
      if (other.short_desc != null) {
        return false;
      }
    } else if (!this.short_desc.equals(other.short_desc)) {
      return false;
    }
    if (this.long_desc == null) {
      if (other.long_desc != null) {
        return false;
      }
    } else if (!this.long_desc.equals(other.long_desc)) {
      return false;
    }
    if (this.activity != other.activity) {
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
