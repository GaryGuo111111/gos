package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SalesBonus implements Serializable {
    private Integer salesBonusId;

    private Integer userId;

    private Integer orderId;

    private Integer orderGoodsId;

    private Integer quantity;

    private Integer beneficiaryId;

    private Long salesBonus;

    private Byte type;

    private Integer createTime;

    private Boolean isSend;

    private Integer sendTime;

    private Boolean isDelete;

    private Integer deleteTime;

    private static final long serialVersionUID = 1L;

    public Integer getSalesBonusId() {
        return salesBonusId;
    }

    public void setSalesBonusId(Integer salesBonusId) {
        this.salesBonusId = salesBonusId;
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

    public Integer getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Integer beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public Long getSalesBonus() {
        return salesBonus;
    }

    public void setSalesBonus(Long salesBonus) {
        this.salesBonus = salesBonus;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsSend() {
        return isSend;
    }

    public void setIsSend(Boolean isSend) {
        this.isSend = isSend;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", salesBonusId=").append(salesBonusId);
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", quantity=").append(quantity);
        sb.append(", beneficiaryId=").append(beneficiaryId);
        sb.append(", salesBonus=").append(salesBonus);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", isSend=").append(isSend);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}