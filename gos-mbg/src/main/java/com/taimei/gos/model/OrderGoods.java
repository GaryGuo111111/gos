package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class OrderGoods implements Serializable {
    private Integer orderGoodsId;

    private Integer orderId;

    private Integer goodsId;

    private Integer deliveryId;

    private Integer supplierId;

    private Integer goodsSkuId;

    private Integer quantity;

    private Long userPrice;

    private Long expressPrice;

    private Byte shippingType;

    private Byte isSend;

    private Integer sendTime;

    private Boolean isConfirm;

    private Integer confirmTime;

    private Boolean isRefund;

    private Long refundPrice;

    private Integer refundTime;

    private Boolean isProfit;

    private Integer profitTime;

    private Boolean isFinish;

    private Integer finishTime;

    private Boolean isDelete;

    private Integer deleteTime;

    private static final long serialVersionUID = 1L;

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Integer goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getUserPrice() {
        return userPrice;
    }

    public void setUserPrice(Long userPrice) {
        this.userPrice = userPrice;
    }

    public Long getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(Long expressPrice) {
        this.expressPrice = expressPrice;
    }

    public Byte getShippingType() {
        return shippingType;
    }

    public void setShippingType(Byte shippingType) {
        this.shippingType = shippingType;
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

    public Boolean getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(Boolean isConfirm) {
        this.isConfirm = isConfirm;
    }

    public Integer getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Integer confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Boolean getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(Boolean isRefund) {
        this.isRefund = isRefund;
    }

    public Long getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(Long refundPrice) {
        this.refundPrice = refundPrice;
    }

    public Integer getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Integer refundTime) {
        this.refundTime = refundTime;
    }

    public Boolean getIsProfit() {
        return isProfit;
    }

    public void setIsProfit(Boolean isProfit) {
        this.isProfit = isProfit;
    }

    public Integer getProfitTime() {
        return profitTime;
    }

    public void setProfitTime(Integer profitTime) {
        this.profitTime = profitTime;
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
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", deliveryId=").append(deliveryId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", goodsSkuId=").append(goodsSkuId);
        sb.append(", quantity=").append(quantity);
        sb.append(", userPrice=").append(userPrice);
        sb.append(", expressPrice=").append(expressPrice);
        sb.append(", shippingType=").append(shippingType);
        sb.append(", isSend=").append(isSend);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", isConfirm=").append(isConfirm);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", isRefund=").append(isRefund);
        sb.append(", refundPrice=").append(refundPrice);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", isProfit=").append(isProfit);
        sb.append(", profitTime=").append(profitTime);
        sb.append(", isFinish=").append(isFinish);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}