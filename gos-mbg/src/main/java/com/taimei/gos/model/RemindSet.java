package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class RemindSet implements Serializable {
    private Integer remindSetId;

    private Integer userType;

    private Integer userId;

    private Long remindType;

    private Boolean isRemind;

    private Integer intervalMin;

    private static final long serialVersionUID = 1L;

    public Integer getRemindSetId() {
        return remindSetId;
    }

    public void setRemindSetId(Integer remindSetId) {
        this.remindSetId = remindSetId;
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

    public Long getRemindType() {
        return remindType;
    }

    public void setRemindType(Long remindType) {
        this.remindType = remindType;
    }

    public Boolean getIsRemind() {
        return isRemind;
    }

    public void setIsRemind(Boolean isRemind) {
        this.isRemind = isRemind;
    }

    public Integer getIntervalMin() {
        return intervalMin;
    }

    public void setIntervalMin(Integer intervalMin) {
        this.intervalMin = intervalMin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", remindSetId=").append(remindSetId);
        sb.append(", userType=").append(userType);
        sb.append(", userId=").append(userId);
        sb.append(", remindType=").append(remindType);
        sb.append(", isRemind=").append(isRemind);
        sb.append(", intervalMin=").append(intervalMin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}