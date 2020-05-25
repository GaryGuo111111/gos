package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class OrderGoodsRefund implements Serializable {
    private Integer orderGoodsId;

    private String description;

    private String refundOrderNo;

    private Byte isRefundPrice;

    private Long price;

    private Byte isUserSend;

    private Integer userSendTime;

    private Integer sysExpressId;

    private String expressNo;

    private Byte status;

    private Integer responseTime;

    private Byte isRefundGoods;

    private Byte isExchangeGoods;

    private Integer refundAdminId;

    private String toCustomerRemark;

    private String remark;

    private String pictureList;

    private static final long serialVersionUID = 1L;

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public Byte getIsRefundPrice() {
        return isRefundPrice;
    }

    public void setIsRefundPrice(Byte isRefundPrice) {
        this.isRefundPrice = isRefundPrice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Byte getIsUserSend() {
        return isUserSend;
    }

    public void setIsUserSend(Byte isUserSend) {
        this.isUserSend = isUserSend;
    }

    public Integer getUserSendTime() {
        return userSendTime;
    }

    public void setUserSendTime(Integer userSendTime) {
        this.userSendTime = userSendTime;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    public Byte getIsRefundGoods() {
        return isRefundGoods;
    }

    public void setIsRefundGoods(Byte isRefundGoods) {
        this.isRefundGoods = isRefundGoods;
    }

    public Byte getIsExchangeGoods() {
        return isExchangeGoods;
    }

    public void setIsExchangeGoods(Byte isExchangeGoods) {
        this.isExchangeGoods = isExchangeGoods;
    }

    public Integer getRefundAdminId() {
        return refundAdminId;
    }

    public void setRefundAdminId(Integer refundAdminId) {
        this.refundAdminId = refundAdminId;
    }

    public String getToCustomerRemark() {
        return toCustomerRemark;
    }

    public void setToCustomerRemark(String toCustomerRemark) {
        this.toCustomerRemark = toCustomerRemark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPictureList() {
        return pictureList;
    }

    public void setPictureList(String pictureList) {
        this.pictureList = pictureList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", description=").append(description);
        sb.append(", refundOrderNo=").append(refundOrderNo);
        sb.append(", isRefundPrice=").append(isRefundPrice);
        sb.append(", price=").append(price);
        sb.append(", isUserSend=").append(isUserSend);
        sb.append(", userSendTime=").append(userSendTime);
        sb.append(", sysExpressId=").append(sysExpressId);
        sb.append(", expressNo=").append(expressNo);
        sb.append(", status=").append(status);
        sb.append(", responseTime=").append(responseTime);
        sb.append(", isRefundGoods=").append(isRefundGoods);
        sb.append(", isExchangeGoods=").append(isExchangeGoods);
        sb.append(", refundAdminId=").append(refundAdminId);
        sb.append(", toCustomerRemark=").append(toCustomerRemark);
        sb.append(", remark=").append(remark);
        sb.append(", pictureList=").append(pictureList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}