package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class RulesGoodsBuyLevelPriceDifferences implements Serializable {
    private Integer levelPriceId;

    private Integer goodsId;

    private Integer buyLevelId;

    private Long userPrice;

    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Integer getLevelPriceId() {
        return levelPriceId;
    }

    public void setLevelPriceId(Integer levelPriceId) {
        this.levelPriceId = levelPriceId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getBuyLevelId() {
        return buyLevelId;
    }

    public void setBuyLevelId(Integer buyLevelId) {
        this.buyLevelId = buyLevelId;
    }

    public Long getUserPrice() {
        return userPrice;
    }

    public void setUserPrice(Long userPrice) {
        this.userPrice = userPrice;
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
        sb.append(", levelPriceId=").append(levelPriceId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", buyLevelId=").append(buyLevelId);
        sb.append(", userPrice=").append(userPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}