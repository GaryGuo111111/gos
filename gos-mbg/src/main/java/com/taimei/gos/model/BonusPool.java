package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class BonusPool implements Serializable {
    private Integer bonusPoolId;

    private Long bonusPoolAmount;

    private Long bonusPoolStartTime;

    private Long bonusPoolEndTime;

    private static final long serialVersionUID = 1L;

    public Integer getBonusPoolId() {
        return bonusPoolId;
    }

    public void setBonusPoolId(Integer bonusPoolId) {
        this.bonusPoolId = bonusPoolId;
    }

    public Long getBonusPoolAmount() {
        return bonusPoolAmount;
    }

    public void setBonusPoolAmount(Long bonusPoolAmount) {
        this.bonusPoolAmount = bonusPoolAmount;
    }

    public Long getBonusPoolStartTime() {
        return bonusPoolStartTime;
    }

    public void setBonusPoolStartTime(Long bonusPoolStartTime) {
        this.bonusPoolStartTime = bonusPoolStartTime;
    }

    public Long getBonusPoolEndTime() {
        return bonusPoolEndTime;
    }

    public void setBonusPoolEndTime(Long bonusPoolEndTime) {
        this.bonusPoolEndTime = bonusPoolEndTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bonusPoolId=").append(bonusPoolId);
        sb.append(", bonusPoolAmount=").append(bonusPoolAmount);
        sb.append(", bonusPoolStartTime=").append(bonusPoolStartTime);
        sb.append(", bonusPoolEndTime=").append(bonusPoolEndTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}