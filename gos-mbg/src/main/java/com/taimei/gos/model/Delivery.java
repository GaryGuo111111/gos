package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Delivery implements Serializable {
    private Integer deliveryId;

    private Integer orderId;

    private Integer supplierId;

    private Integer sysExpressId;

    private String expressNo;

    private Long expressPrice;

    private Byte isSend;

    private Integer sendTime;

    private static final long serialVersionUID = 1L;

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getSysExpressId() {
        return sysExpressId;
    }

    public void setSysExpressId(Integer sysExpressId) {
        this.sysExpressId = sysExpressId;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public Long getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(Long expressPrice) {
        this.expressPrice = expressPrice;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deliveryId=").append(deliveryId);
        sb.append(", orderId=").append(orderId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", sysExpressId=").append(sysExpressId);
        sb.append(", expressNo=").append(expressNo);
        sb.append(", expressPrice=").append(expressPrice);
        sb.append(", isSend=").append(isSend);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}