package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class BonusPoolSettlement implements Serializable {
    private Integer bonusPoolSettlementId;

    private Integer bonusPoolId;

    private Integer userId;

    private Integer assembleAmount;

    private Long bonusAmount;

    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Integer getBonusPoolSettlementId() {
        return bonusPoolSettlementId;
    }

    public void setBonusPoolSettlementId(Integer bonusPoolSettlementId) {
        this.bonusPoolSettlementId = bonusPoolSettlementId;
    }

    public Integer getBonusPoolId() {
        return bonusPoolId;
    }

    public void setBonusPoolId(Integer bonusPoolId) {
        this.bonusPoolId = bonusPoolId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAssembleAmount() {
        return assembleAmount;
    }

    public void setAssembleAmount(Integer assembleAmount) {
        this.assembleAmount = assembleAmount;
    }

    public Long getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(Long bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bonusPoolSettlementId=").append(bonusPoolSettlementId);
        sb.append(", bonusPoolId=").append(bonusPoolId);
        sb.append(", userId=").append(userId);
        sb.append(", assembleAmount=").append(assembleAmount);
        sb.append(", bonusAmount=").append(bonusAmount);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}