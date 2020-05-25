package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class RulesUserLevelLog implements Serializable {
    private Integer upLevelLogId;

    private Integer beforeLevel;

    private Integer afterLevel;

    private Byte levelType;

    private Integer createTime;

    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getUpLevelLogId() {
        return upLevelLogId;
    }

    public void setUpLevelLogId(Integer upLevelLogId) {
        this.upLevelLogId = upLevelLogId;
    }

    public Integer getBeforeLevel() {
        return beforeLevel;
    }

    public void setBeforeLevel(Integer beforeLevel) {
        this.beforeLevel = beforeLevel;
    }

    public Integer getAfterLevel() {
        return afterLevel;
    }

    public void setAfterLevel(Integer afterLevel) {
        this.afterLevel = afterLevel;
    }

    public Byte getLevelType() {
        return levelType;
    }

    public void setLevelType(Byte levelType) {
        this.levelType = levelType;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", upLevelLogId=").append(upLevelLogId);
        sb.append(", beforeLevel=").append(beforeLevel);
        sb.append(", afterLevel=").append(afterLevel);
        sb.append(", levelType=").append(levelType);
        sb.append(", createTime=").append(createTime);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}