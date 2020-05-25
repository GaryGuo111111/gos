package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GoodsSku implements Serializable {
    private Integer goodsSkuId;

    private Integer goodsId;

    private Integer profitTemplateId;

    private String code;

    private String skuName;

    private String attributeValues;

    private Long marketPrice;

    private Long discountPrice;

    private Long costPrice;

    private Integer sales;

    private Integer stock;

    private String pics;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Integer goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getProfitTemplateId() {
        return profitTemplateId;
    }

    public void setProfitTemplateId(Integer profitTemplateId) {
        this.profitTemplateId = profitTemplateId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(String attributeValues) {
        this.attributeValues = attributeValues;
    }

    public Long getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Long discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsSkuId=").append(goodsSkuId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", profitTemplateId=").append(profitTemplateId);
        sb.append(", code=").append(code);
        sb.append(", skuName=").append(skuName);
        sb.append(", attributeValues=").append(attributeValues);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", sales=").append(sales);
        sb.append(", stock=").append(stock);
        sb.append(", pics=").append(pics);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}