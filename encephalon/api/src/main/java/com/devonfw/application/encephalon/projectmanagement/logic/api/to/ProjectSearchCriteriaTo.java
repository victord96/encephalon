package com.devonfw.application.encephalon.projectmanagement.logic.api.to;

import java.sql.Timestamp;

import com.devonfw.application.encephalon.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.encephalon.projectmanagement.common.api.Project}s.
 */
public class ProjectSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long status_id;

  private Long type_id;

  private Long delunit_id;

  private Long rate_card_id;

  private String pon_code;

  private String short_desc;

  private String long_desc;

  private Boolean activity;

  private Boolean active;

  private Timestamp create_date;

  private Timestamp modif_date;

  private String create_user;

  private String modif_user;

  private StringSearchConfigTo pon_codeOption;

  private StringSearchConfigTo short_descOption;

  private StringSearchConfigTo long_descOption;

  private StringSearchConfigTo create_userOption;

  private StringSearchConfigTo modif_userOption;

  /**
   * @return status_idId
   */

  public Long getStatus_id() {

    return this.status_id;
  }

  /**
   * @param status_id setter for status_id attribute
   */

  public void setStatus_id(Long status_id) {

    this.status_id = status_id;
  }

  /**
   * @return type_idId
   */

  public Long getType_id() {

    return this.type_id;
  }

  /**
   * @param type_id setter for type_id attribute
   */

  public void setType_id(Long type_id) {

    this.type_id = type_id;
  }

  /**
   * @return delunit_idId
   */

  public Long getDelunit_id() {

    return this.delunit_id;
  }

  /**
   * @param delunit_id setter for delunit_id attribute
   */

  public void setDelunit_id(Long delunit_id) {

    this.delunit_id = delunit_id;
  }

  /**
   * @return rate_card_idId
   */

  public Long getRate_card_id() {

    return this.rate_card_id;
  }

  /**
   * @param rate_card_id setter for rate_card_id attribute
   */

  public void setRate_card_id(Long rate_card_id) {

    this.rate_card_id = rate_card_id;
  }

  /**
   * @return pon_codeId
   */

  public String getPon_code() {

    return this.pon_code;
  }

  /**
   * @param pon_code setter for pon_code attribute
   */

  public void setPon_code(String pon_code) {

    this.pon_code = pon_code;
  }

  /**
   * @return short_descId
   */

  public String getShort_desc() {

    return this.short_desc;
  }

  /**
   * @param short_desc setter for short_desc attribute
   */

  public void setShort_desc(String short_desc) {

    this.short_desc = short_desc;
  }

  /**
   * @return long_descId
   */

  public String getLong_desc() {

    return this.long_desc;
  }

  /**
   * @param long_desc setter for long_desc attribute
   */

  public void setLong_desc(String long_desc) {

    this.long_desc = long_desc;
  }

  /**
   * @return activityId
   */

  public Boolean getActivity() {

    return this.activity;
  }

  /**
   * @param activity setter for activity attribute
   */

  public void setActivity(Boolean activity) {

    this.activity = activity;
  }

  /**
   * @return activeId
   */

  public Boolean getActive() {

    return this.active;
  }

  /**
   * @param active setter for active attribute
   */

  public void setActive(Boolean active) {

    this.active = active;
  }

  /**
   * @return create_dateId
   */

  public Timestamp getCreate_date() {

    return this.create_date;
  }

  /**
   * @param create_date setter for create_date attribute
   */

  public void setCreate_date(Timestamp create_date) {

    this.create_date = create_date;
  }

  /**
   * @return modif_dateId
   */

  public Timestamp getModif_date() {

    return this.modif_date;
  }

  /**
   * @param modif_date setter for modif_date attribute
   */

  public void setModif_date(Timestamp modif_date) {

    this.modif_date = modif_date;
  }

  /**
   * @return create_userId
   */

  public String getCreate_user() {

    return this.create_user;
  }

  /**
   * @param create_user setter for create_user attribute
   */

  public void setCreate_user(String create_user) {

    this.create_user = create_user;
  }

  /**
   * @return modif_userId
   */

  public String getModif_user() {

    return this.modif_user;
  }

  /**
   * @param modif_user setter for modif_user attribute
   */

  public void setModif_user(String modif_user) {

    this.modif_user = modif_user;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getPon_code() pon_code}.
   */
  public StringSearchConfigTo getPon_codeOption() {

    return this.pon_codeOption;
  }

  /**
   * @param pon_codeOption new value of {@link #getPon_codeOption()}.
   */
  public void setPon_codeOption(StringSearchConfigTo pon_codeOption) {

    this.pon_codeOption = pon_codeOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getShort_desc() short_desc}.
   */
  public StringSearchConfigTo getShort_descOption() {

    return this.short_descOption;
  }

  /**
   * @param short_descOption new value of {@link #getShort_descOption()}.
   */
  public void setShort_descOption(StringSearchConfigTo short_descOption) {

    this.short_descOption = short_descOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getLong_desc() long_desc}.
   */
  public StringSearchConfigTo getLong_descOption() {

    return this.long_descOption;
  }

  /**
   * @param long_descOption new value of {@link #getLong_descOption()}.
   */
  public void setLong_descOption(StringSearchConfigTo long_descOption) {

    this.long_descOption = long_descOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getCreate_user() create_user}.
   */
  public StringSearchConfigTo getCreate_userOption() {

    return this.create_userOption;
  }

  /**
   * @param create_userOption new value of {@link #getCreate_userOption()}.
   */
  public void setCreate_userOption(StringSearchConfigTo create_userOption) {

    this.create_userOption = create_userOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getModif_user() modif_user}.
   */
  public StringSearchConfigTo getModif_userOption() {

    return this.modif_userOption;
  }

  /**
   * @param modif_userOption new value of {@link #getModif_userOption()}.
   */
  public void setModif_userOption(StringSearchConfigTo modif_userOption) {

    this.modif_userOption = modif_userOption;
  }

}
