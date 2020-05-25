package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GoodsShippingTemplates implements Serializable {
    private Integer goodsId;

    private Integer shippingTemplatesId;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getShippingTemplatesId() {
        return shippingTemplatesId;
    }

    public void setShippingTemplatesId(Integer shippingTemplatesId) {
        this.shippingTemplatesId = shippingTemplatesId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", shippingTemplatesId=").append(shippingTemplatesId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}