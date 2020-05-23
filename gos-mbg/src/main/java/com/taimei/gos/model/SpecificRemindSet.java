package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpecificRemindSet implements Serializable {
    private Integer specificRemindSetId;

    private Integer userType;

    private Integer userId;

    private String bid;

    private Long remindType;

    private Integer lastRemindTime;

    private String triggerRules;

    private static final long serialVersionUID = 1L;

    public Integer getSpecificRemindSetId() {
        return specificRemindSetId;
    }

    public void setSpecificRemindSetId(Integer specificRemindSetId) {
        this.specificRemindSetId = specificRemindSetId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Long getRemindType() {
        return remindType;
    }

    public void setRemindType(Long remindType) {
        this.remindType = remindType;
    }

    public Integer getLastRemindTime() {
        return lastRemindTime;
    }

    public void setLastRemindTime(Integer lastRemindTime) {
        this.lastRemindTime = lastRemindTime;
    }

    public String getTriggerRules() {
        return triggerRules;
    }

    public void setTriggerRules(String triggerRules) {
        this.triggerRules = triggerRules;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", specificRemindSetId=").append(specificRemindSetId);
        sb.append(", userType=").append(userType);
        sb.append(", userId=").append(userId);
        sb.append(", bid=").append(bid);
        sb.append(", remindType=").append(remindType);
        sb.append(", lastRemindTime=").append(lastRemindTime);
        sb.append(", triggerRules=").append(triggerRules);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}