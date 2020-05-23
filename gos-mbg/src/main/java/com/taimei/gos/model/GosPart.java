package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GosPart implements Serializable {
    private Integer gosPartId;

    private Integer gosAssembleId;

    private Integer orderGoodsProfitId;

    private Integer userId;

    private Integer orderGoodsId;

    private Integer position;

    private Boolean isDirect;

    private Integer isFinish;

    private Long profit;

    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Integer getGosPartId() {
        return gosPartId;
    }

    public void setGosPartId(Integer gosPartId) {
        this.gosPartId = gosPartId;
    }

    public Integer getGosAssembleId() {
        return gosAssembleId;
    }

    public void setGosAssembleId(Integer gosAssembleId) {
        this.gosAssembleId = gosAssembleId;
    }

    public Integer getOrderGoodsProfitId() {
        return orderGoodsProfitId;
    }

    public void setOrderGoodsProfitId(Integer orderGoodsProfitId) {
        this.orderGoodsProfitId = orderGoodsProfitId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getIsDirect() {
        return isDirect;
    }

    public void setIsDirect(Boolean isDirect) {
        this.isDirect = isDirect;
    }

    public Integer getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Integer isFinish) {
        this.isFinish = isFinish;
    }

    public Long getProfit() {
        return profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
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
        sb.append(", gosPartId=").append(gosPartId);
        sb.append(", gosAssembleId=").append(gosAssembleId);
        sb.append(", orderGoodsProfitId=").append(orderGoodsProfitId);
        sb.append(", userId=").append(userId);
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", position=").append(position);
        sb.append(", isDirect=").append(isDirect);
        sb.append(", isFinish=").append(isFinish);
        sb.append(", profit=").append(profit);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}