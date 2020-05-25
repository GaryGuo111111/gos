package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GosAutoAssembleGoods implements Serializable {
    private Integer gosAutoAssembleGoodsId;

    private Integer userId;

    private Integer purchaseTimes;

    private Integer sort;

    private Integer goodsId;

    private Integer goodsSkuId;

    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Integer getGosAutoAssembleGoodsId() {
        return gosAutoAssembleGoodsId;
    }

    public void setGosAutoAssembleGoodsId(Integer gosAutoAssembleGoodsId) {
        this.gosAutoAssembleGoodsId = gosAutoAssembleGoodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPurchaseTimes() {
        return purchaseTimes;
    }

    public void setPurchaseTimes(Integer purchaseTimes) {
        this.purchaseTimes = purchaseTimes;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Integer goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
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
        sb.append(", gosAutoAssembleGoodsId=").append(gosAutoAssembleGoodsId);
        sb.append(", userId=").append(userId);
        sb.append(", purchaseTimes=").append(purchaseTimes);
        sb.append(", sort=").append(sort);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSkuId=").append(goodsSkuId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}