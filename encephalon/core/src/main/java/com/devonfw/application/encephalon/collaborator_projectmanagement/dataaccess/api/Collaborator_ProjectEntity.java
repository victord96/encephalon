package com.devonfw.application.encephalon.collaborator_projectmanagement.dataaccess.api;

import java.math.BigDecimal;
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

import com.devonfw.application.encephalon.collaborator_projectmanagement.common.api.Collaborator_Project;
import com.devonfw.application.encephalon.collaboratormanagement.dataaccess.api.CollaboratorEntity;
import com.devonfw.application.encephalon.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.encephalon.projectmanagement.dataaccess.api.ProjectEntity;

/**
 * @author vcanizar
 */
@Entity
@Table(name = "`COLLABORATOR_PROJECT`", schema = "`Encephalon`")
public class Collaborator_ProjectEntity extends ApplicationPersistenceEntity implements Collaborator_Project {

  @Column(name = "collaborator_id")
  private Long collaborator_id;

  @Column(name = "project_id")
  private Long project_id;

  @Column(name = "begin_date")
  private Date begin_date;

  @Column(name = "end_date")
  private Date end_date;

  @Column(name = "percentage")
  private BigDecimal percentage;

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

  private CollaboratorEntity collaborator;

  private ProjectEntity project;

  private static final long serialVersionUID = 1L;

  @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
  @JoinColumn(name = "project_id", referencedColumnName = "id", insertable = false, updatable = false)
  public ProjectEntity getProject() {

    return this.project;
  }

  @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
  @JoinColumn(name = "collaborator_id", referencedColumnName = "id", insertable = false, updatable = false)
  public CollaboratorEntity getCollaborator() {

    return this.collaborator;
  }

  /**
   * @return collaborator_id
   */
  public Long getCollaborator_id() {

    return this.collaborator_id;
  }

  /**
   * @param collaborator_id new value of {@link #getcollaborator_id}.
   */
  public void setCollaborator_id(Long collaborator_id) {

    this.collaborator_id = collaborator_id;
  }

  /**
   * @return project_id
   */
  public Long getProject_id() {

    return this.project_id;
  }

  /**
   * @param project_id new value of {@link #getproject_id}.
   */
  public void setProject_id(Long project_id) {

    this.project_id = project_id;
  }

  /**
   * @return begin_date
   */
  public Date getBegin_date() {

    return this.begin_date;
  }

  /**
   * @param begin_date new value of {@link #getbegin_date}.
   */
  public void setBegin_date(Date begin_date) {

    this.begin_date = begin_date;
  }

  /**
   * @return end_date
   */
  public Date getEnd_date() {

    return this.end_date;
  }

  /**
   * @param end_date new value of {@link #getend_date}.
   */
  public void setEnd_date(Date end_date) {

    this.end_date = end_date;
  }

  /**
   * @return percentage
   */
  public BigDecimal getPercentage() {

    return this.percentage;
  }

  /**
   * @param percentage new value of {@link #getpercentage}.
   */
  public void setPercentage(BigDecimal percentage) {

    this.percentage = percentage;
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

  /**
   * @param collaborator new value of {@link #getcollaborator}.
   */
  public void setCollaborator(CollaboratorEntity collaborator) {

    this.collaborator = collaborator;
  }

  /**
   * @param project new value of {@link #getproject}.
   */
  public void setProject(ProjectEntity project) {

    this.project = project;
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
  public Long getProjectId() {

    if (this.project == null) {
      return null;
    }
    return this.project.getId();
  }

  @Override
  public void setProjectId(Long projectId) {

    if (projectId == null) {
      this.project = null;
    } else {
      ProjectEntity projectEntity = new ProjectEntity();
      projectEntity.setId(projectId);
      this.project = projectEntity;
    }
  }

}
