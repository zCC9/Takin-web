package com.pamirs.takin.entity.domain.entity;

import java.util.Date;

public class TDictionaryData {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.DICT_TYPE
     *
     * @mbggenerated
     */
    private String dictType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.VALUE_ORDER
     *
     * @mbggenerated
     */
    private Integer valueOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.VALUE_NAME
     *
     * @mbggenerated
     */
    private String valueName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.VALUE_CODE
     *
     * @mbggenerated
     */
    private String valueCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.LANGUAGE
     *
     * @mbggenerated
     */
    private String language;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.ACTIVE
     *
     * @mbggenerated
     */
    private String active;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.MODIFY_TIME
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.CREATE_USER_CODE
     *
     * @mbggenerated
     */
    private String createUserCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.MODIFY_USER_CODE
     *
     * @mbggenerated
     */
    private String modifyUserCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.NOTE_INFO
     *
     * @mbggenerated
     */
    private String noteInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary_data.VERSION_NO
     *
     * @mbggenerated
     */
    private Long versionNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_data
     *
     * @mbggenerated
     */
    public TDictionaryData(String id, String dictType, Integer valueOrder, String valueName, String valueCode,
        String language, String active, Date createTime, Date modifyTime, String createUserCode, String modifyUserCode,
        String noteInfo, Long versionNo) {
        this.id = id;
        this.dictType = dictType;
        this.valueOrder = valueOrder;
        this.valueName = valueName;
        this.valueCode = valueCode;
        this.language = language;
        this.active = active;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.createUserCode = createUserCode;
        this.modifyUserCode = modifyUserCode;
        this.noteInfo = noteInfo;
        this.versionNo = versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_data
     *
     * @mbggenerated
     */
    public TDictionaryData() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.ID
     *
     * @return the value of t_dictionary_data.ID
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.ID
     *
     * @param id the value for t_dictionary_data.ID
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.DICT_TYPE
     *
     * @return the value of t_dictionary_data.DICT_TYPE
     * @mbggenerated
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.DICT_TYPE
     *
     * @param dictType the value for t_dictionary_data.DICT_TYPE
     * @mbggenerated
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.VALUE_ORDER
     *
     * @return the value of t_dictionary_data.VALUE_ORDER
     * @mbggenerated
     */
    public Integer getValueOrder() {
        return valueOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.VALUE_ORDER
     *
     * @param valueOrder the value for t_dictionary_data.VALUE_ORDER
     * @mbggenerated
     */
    public void setValueOrder(Integer valueOrder) {
        this.valueOrder = valueOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.VALUE_NAME
     *
     * @return the value of t_dictionary_data.VALUE_NAME
     * @mbggenerated
     */
    public String getValueName() {
        return valueName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.VALUE_NAME
     *
     * @param valueName the value for t_dictionary_data.VALUE_NAME
     * @mbggenerated
     */
    public void setValueName(String valueName) {
        this.valueName = valueName == null ? null : valueName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.VALUE_CODE
     *
     * @return the value of t_dictionary_data.VALUE_CODE
     * @mbggenerated
     */
    public String getValueCode() {
        return valueCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.VALUE_CODE
     *
     * @param valueCode the value for t_dictionary_data.VALUE_CODE
     * @mbggenerated
     */
    public void setValueCode(String valueCode) {
        this.valueCode = valueCode == null ? null : valueCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.LANGUAGE
     *
     * @return the value of t_dictionary_data.LANGUAGE
     * @mbggenerated
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.LANGUAGE
     *
     * @param language the value for t_dictionary_data.LANGUAGE
     * @mbggenerated
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.ACTIVE
     *
     * @return the value of t_dictionary_data.ACTIVE
     * @mbggenerated
     */
    public String getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.ACTIVE
     *
     * @param active the value for t_dictionary_data.ACTIVE
     * @mbggenerated
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.CREATE_TIME
     *
     * @return the value of t_dictionary_data.CREATE_TIME
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.CREATE_TIME
     *
     * @param createTime the value for t_dictionary_data.CREATE_TIME
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.MODIFY_TIME
     *
     * @return the value of t_dictionary_data.MODIFY_TIME
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.MODIFY_TIME
     *
     * @param modifyTime the value for t_dictionary_data.MODIFY_TIME
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.CREATE_USER_CODE
     *
     * @return the value of t_dictionary_data.CREATE_USER_CODE
     * @mbggenerated
     */
    public String getCreateUserCode() {
        return createUserCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.CREATE_USER_CODE
     *
     * @param createUserCode the value for t_dictionary_data.CREATE_USER_CODE
     * @mbggenerated
     */
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode == null ? null : createUserCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.MODIFY_USER_CODE
     *
     * @return the value of t_dictionary_data.MODIFY_USER_CODE
     * @mbggenerated
     */
    public String getModifyUserCode() {
        return modifyUserCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.MODIFY_USER_CODE
     *
     * @param modifyUserCode the value for t_dictionary_data.MODIFY_USER_CODE
     * @mbggenerated
     */
    public void setModifyUserCode(String modifyUserCode) {
        this.modifyUserCode = modifyUserCode == null ? null : modifyUserCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.NOTE_INFO
     *
     * @return the value of t_dictionary_data.NOTE_INFO
     * @mbggenerated
     */
    public String getNoteInfo() {
        return noteInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.NOTE_INFO
     *
     * @param noteInfo the value for t_dictionary_data.NOTE_INFO
     * @mbggenerated
     */
    public void setNoteInfo(String noteInfo) {
        this.noteInfo = noteInfo == null ? null : noteInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary_data.VERSION_NO
     *
     * @return the value of t_dictionary_data.VERSION_NO
     * @mbggenerated
     */
    public Long getVersionNo() {
        return versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary_data.VERSION_NO
     *
     * @param versionNo the value for t_dictionary_data.VERSION_NO
     * @mbggenerated
     */
    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }
}
