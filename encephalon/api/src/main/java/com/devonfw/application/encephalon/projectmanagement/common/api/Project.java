package com.devonfw.application.encephalon.projectmanagement.common.api;

import java.sql.Timestamp;

import com.devonfw.application.encephalon.general.common.api.ApplicationEntity;

public interface Project extends ApplicationEntity {

  /**
   * @return status_idId
   */

  public Long getStatus_id();

  /**
   * @param status_id setter for status_id attribute
   */

  public void setStatus_id(Long status_id);

  /**
   * @return type_idId
   */

  public Long getType_id();

  /**
   * @param type_id setter for type_id attribute
   */

  public void setType_id(Long type_id);

  /**
   * @return delunit_idId
   */

  public Long getDelunit_id();

  /**
   * @param delunit_id setter for delunit_id attribute
   */

  public void setDelunit_id(Long delunit_id);

  /**
   * @return rate_card_idId
   */

  public Long getRate_card_id();

  /**
   * @param rate_card_id setter for rate_card_id attribute
   */

  public void setRate_card_id(Long rate_card_id);

  /**
   * @return pon_codeId
   */

  public String getPon_code();

  /**
   * @param pon_code setter for pon_code attribute
   */

  public void setPon_code(String pon_code);

  /**
   * @return short_descId
   */

  public String getShort_desc();

  /**
   * @param short_desc setter for short_desc attribute
   */

  public void setShort_desc(String short_desc);

  /**
   * @return long_descId
   */

  public String getLong_desc();

  /**
   * @param long_desc setter for long_desc attribute
   */

  public void setLong_desc(String long_desc);

  /**
   * @return activityId
   */

  public boolean isActivity();

  /**
   * @param activity setter for activity attribute
   */

  public void setActivity(boolean activity);

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
