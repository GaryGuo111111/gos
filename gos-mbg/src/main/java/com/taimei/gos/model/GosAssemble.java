package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GosAssemble implements Serializable {
    private Integer gosAssembleId;

    private Integer userId;

    private Boolean isSuccess;

    private Long successTime;

    private Boolean isFinish;

    private Integer finishTime;

    private Long profit;

    private Boolean isLock;

    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Integer getGosAssembleId() {
        return gosAssembleId;
    }

    public void setGosAssembleId(Integer gosAssembleId) {
        this.gosAssembleId = gosAssembleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Long getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Long successTime) {
        this.successTime = successTime;
    }

    public Boolean getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
    }

    public Integer getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
    }

    public Long getProfit() {
        return profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
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
        sb.append(", gosAssembleId=").append(gosAssembleId);
        sb.append(", userId=").append(userId);
        sb.append(", isSuccess=").append(isSuccess);
        sb.append(", successTime=").append(successTime);
        sb.append(", isFinish=").append(isFinish);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", profit=").append(profit);
        sb.append(", isLock=").append(isLock);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}