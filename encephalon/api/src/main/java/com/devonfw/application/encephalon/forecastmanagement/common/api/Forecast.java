package com.devonfw.application.encephalon.forecastmanagement.common.api;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import com.devonfw.application.encephalon.general.common.api.ApplicationEntity;

public interface Forecast extends ApplicationEntity {

  /**
   * @return collaborator_idId
   */

  public Long getCollaborator_id();

  /**
   * @param collaborator_id setter for collaborator_id attribute
   */

  public void setCollaborator_id(Long collaborator_id);

  /**
   * @return project_idId
   */

  public Long getProject_id();

  /**
   * @param project_id setter for project_id attribute
   */

  public void setProject_id(Long project_id);

  /**
   * @return date_fsId
   */

  public Date getDate_fs();

  /**
   * @param date_fs setter for date_fs attribute
   */

  public void setDate_fs(Date date_fs);

  /**
   * @return hoursId
   */

  public BigDecimal getHours();

  /**
   * @param hours setter for hours attribute
   */

  public void setHours(BigDecimal hours);

  /**
   * @return activeId
   */

  public boolean isActive();

  /**
   * @param active setter for active attribute
   */

  public void setActive(boolean active);

  /**
   * @return create_dateId
   */

  public Timestamp getCreate_date();

  /**
   * @param create_date setter for create_date attribute
   */

  public void setCreate_date(Timestamp create_date);

  /**
   * @return modif_dateId
   */

  public Timestamp getModif_date();

  /**
   * @param modif_date setter for modif_date attribute
   */

  public void setModif_date(Timestamp modif_date);

  /**
   * @return create_userId
   */

  public String getCreate_user();

  /**
   * @param create_user setter for create_user attribute
   */

  public void setCreate_user(String create_user);

  /**
   * @return modif_userId
   */

  public String getModif_user();

  /**
   * @param modif_user setter for modif_user attribute
   */

  public void setModif_user(String modif_user);

}
