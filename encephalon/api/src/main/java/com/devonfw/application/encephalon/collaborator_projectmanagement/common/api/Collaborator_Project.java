package com.devonfw.application.encephalon.collaborator_projectmanagement.common.api;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import com.devonfw.application.encephalon.general.common.api.ApplicationEntity;

public interface Collaborator_Project extends ApplicationEntity {

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
   * @return begin_dateId
   */

  public Date getBegin_date();

  /**
   * @param begin_date setter for begin_date attribute
   */

  public void setBegin_date(Date begin_date);

  /**
   * @return end_dateId
   */

  public Date getEnd_date();

  /**
   * @param end_date setter for end_date attribute
   */

  public void setEnd_date(Date end_date);

  /**
   * @return percentageId
   */

  public BigDecimal getPercentage();

  /**
   * @param percentage setter for percentage attribute
   */

  public void setPercentage(BigDecimal percentage);

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

  /**
   * getter for collaboratorId attribute
   *
   * @return collaboratorId
   */

  public Long getCollaboratorId();

  /**
   * @param collaborator setter for collaborator attribute
   */

  public void setCollaboratorId(Long collaboratorId);

  /**
   * getter for projectId attribute
   *
   * @return projectId
   */

  public Long getProjectId();

  /**
   * @param project setter for project attribute
   */

  public void setProjectId(Long projectId);

}
