package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Orders implements Serializable {
    private Integer orderId;

    private String orderNo;

    private Integer userId;

    private Integer buyLevelId;

    private Integer referrerId;

    private Integer createTime;

    private Long marketPriceSum;

    private Long userPriceSum;

    private Long expressPrice;

    private Long payPrice;

    private Byte payType;

    private Boolean isPay;

    private Integer payTime;

    private String payeeId;

    private Boolean isDelete;

    private Integer deleteTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBuyLevelId() {
        return buyLevelId;
    }

    public void setBuyLevelId(Integer buyLevelId) {
        this.buyLevelId = buyLevelId;
    }

    public Integer getReferrerId() {
        return referrerId;
    }

    public void setReferrerId(Integer referrerId) {
        this.referrerId = referrerId;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Long getMarketPriceSum() {
        return marketPriceSum;
    }

    public void setMarketPriceSum(Long marketPriceSum) {
        this.marketPriceSum = marketPriceSum;
    }

    public Long getUserPriceSum() {
        return userPriceSum;
    }

    public void setUserPriceSum(Long userPriceSum) {
        this.userPriceSum = userPriceSum;
    }

    public Long getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(Long expressPrice) {
        this.expressPrice = expressPrice;
    }

    public Long getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Long payPrice) {
        this.payPrice = payPrice;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Boolean getIsPay() {
        return isPay;
    }

    public void setIsPay(Boolean isPay) {
        this.isPay = isPay;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", userId=").append(userId);
        sb.append(", buyLevelId=").append(buyLevelId);
        sb.append(", referrerId=").append(referrerId);
        sb.append(", createTime=").append(createTime);
        sb.append(", marketPriceSum=").append(marketPriceSum);
        sb.append(", userPriceSum=").append(userPriceSum);
        sb.append(", expressPrice=").append(expressPrice);
        sb.append(", payPrice=").append(payPrice);
        sb.append(", payType=").append(payType);
        sb.append(", isPay=").append(isPay);
        sb.append(", payTime=").append(payTime);
        sb.append(", payeeId=").append(payeeId);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}