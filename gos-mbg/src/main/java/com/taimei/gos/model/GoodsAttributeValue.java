package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GoodsAttributeValue implements Serializable {
    private Integer goodsAttributeValueId;

    private Integer goodsAttributeKeyId;

    private String name;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsAttributeValueId() {
        return goodsAttributeValueId;
    }

    public void setGoodsAttributeValueId(Integer goodsAttributeValueId) {
        this.goodsAttributeValueId = goodsAttributeValueId;
    }

    public Integer getGoodsAttributeKeyId() {
        return goodsAttributeKeyId;
    }

    public void setGoodsAttributeKeyId(Integer goodsAttributeKeyId) {
        this.goodsAttributeKeyId = goodsAttributeKeyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsAttributeValueId=").append(goodsAttributeValueId);
        sb.append(", goodsAttributeKeyId=").append(goodsAttributeKeyId);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}