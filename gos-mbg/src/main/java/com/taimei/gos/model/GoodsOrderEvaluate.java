package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GoodsOrderEvaluate implements Serializable {
    private Integer goodsOrderEvaluateId;

    private Integer orderGoodsId;

    private Integer orderId;

    private Integer goodsId;

    private Integer userId;

    private Byte isAnonymous;

    private Byte scores;

    private Integer createTime;

    private Byte isShow;

    private Integer adminId;

    private String data;

    private String pictureList;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsOrderEvaluateId() {
        return goodsOrderEvaluateId;
    }

    public void setGoodsOrderEvaluateId(Integer goodsOrderEvaluateId) {
        this.goodsOrderEvaluateId = goodsOrderEvaluateId;
    }

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Byte isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Byte getScores() {
        return scores;
    }

    public void setScores(Byte scores) {
        this.scores = scores;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
        sb.append(", goodsOrderEvaluateId=").append(goodsOrderEvaluateId);
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", userId=").append(userId);
        sb.append(", isAnonymous=").append(isAnonymous);
        sb.append(", scores=").append(scores);
        sb.append(", createTime=").append(createTime);
        sb.append(", isShow=").append(isShow);
        sb.append(", adminId=").append(adminId);
        sb.append(", data=").append(data);
        sb.append(", pictureList=").append(pictureList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}