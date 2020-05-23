package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GoodsCategoryAttribute implements Serializable {
    private Integer goodsCategoryId;

    private Integer goodsAttributeKeyId;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Integer goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public Integer getGoodsAttributeKeyId() {
        return goodsAttributeKeyId;
    }

    public void setGoodsAttributeKeyId(Integer goodsAttributeKeyId) {
        this.goodsAttributeKeyId = goodsAttributeKeyId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsCategoryId=").append(goodsCategoryId);
        sb.append(", goodsAttributeKeyId=").append(goodsAttributeKeyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}