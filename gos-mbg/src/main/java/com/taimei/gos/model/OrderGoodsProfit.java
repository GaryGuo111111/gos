package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class OrderGoodsProfit implements Serializable {
    private Integer orderGoodsProfitId;

    private Integer userId;

    private Integer orderId;

    private Integer beneficiaryId;

    private Integer orderGoodsId;

    private Integer quantity;

    private Integer type;

    private Integer createTime;

    private Byte isSend;

    private Integer sendTime;

    private Byte isDelete;

    private Integer deleteTime;

    private Long profit;

    private static final long serialVersionUID = 1L;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Integer beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Byte getIsSend() {
        return isSend;
    }

    public void setIsSend(Byte isSend) {
        this.isSend = isSend;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Long getProfit() {
        return profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderGoodsProfitId=").append(orderGoodsProfitId);
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", beneficiaryId=").append(beneficiaryId);
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", quantity=").append(quantity);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", isSend=").append(isSend);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", profit=").append(profit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}