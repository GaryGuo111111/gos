package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Goods implements Serializable {
    private Integer goodsId;

    private Integer goodsCategoryId;

    private Integer profitTemplateId;

    private Integer supplierId;

    private Byte hasRelevance;

    private Byte isOnlyRelevance;

    private String brand;

    private Integer profitId;

    private Integer payment;

    private Integer uiModuleAreaId;

    private Integer specialType;

    private String name;

    private Integer weight;

    private String introduction;

    private Long marketPrice;

    private Long discountPrice;

    private Long costPrice;

    private Byte isSelf;

    private Integer showTime;

    private Integer beginTime;

    private Integer endTime;

    private Byte isMaxBuy;

    private Integer sales;

    private Integer salesVirtual;

    private Integer sort;

    private Integer stock;

    private Integer upBuyLevel;

    private Integer createTime;

    private Byte isDelete;

    private Integer deleteTime;

    private String goodsAttributes;

    private String content;

    private String pics;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Integer goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public Integer getProfitTemplateId() {
        return profitTemplateId;
    }

    public void setProfitTemplateId(Integer profitTemplateId) {
        this.profitTemplateId = profitTemplateId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Byte getHasRelevance() {
        return hasRelevance;
    }

    public void setHasRelevance(Byte hasRelevance) {
        this.hasRelevance = hasRelevance;
    }

    public Byte getIsOnlyRelevance() {
        return isOnlyRelevance;
    }

    public void setIsOnlyRelevance(Byte isOnlyRelevance) {
        this.isOnlyRelevance = isOnlyRelevance;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getProfitId() {
        return profitId;
    }

    public void setProfitId(Integer profitId) {
        this.profitId = profitId;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getUiModuleAreaId() {
        return uiModuleAreaId;
    }

    public void setUiModuleAreaId(Integer uiModuleAreaId) {
        this.uiModuleAreaId = uiModuleAreaId;
    }

    public Integer getSpecialType() {
        return specialType;
    }

    public void setSpecialType(Integer specialType) {
        this.specialType = specialType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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

    public Byte getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Byte isSelf) {
        this.isSelf = isSelf;
    }

    public Integer getShowTime() {
        return showTime;
    }

    public void setShowTime(Integer showTime) {
        this.showTime = showTime;
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Byte getIsMaxBuy() {
        return isMaxBuy;
    }

    public void setIsMaxBuy(Byte isMaxBuy) {
        this.isMaxBuy = isMaxBuy;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getSalesVirtual() {
        return salesVirtual;
    }

    public void setSalesVirtual(Integer salesVirtual) {
        this.salesVirtual = salesVirtual;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getUpBuyLevel() {
        return upBuyLevel;
    }

    public void setUpBuyLevel(Integer upBuyLevel) {
        this.upBuyLevel = upBuyLevel;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getGoodsAttributes() {
        return goodsAttributes;
    }

    public void setGoodsAttributes(String goodsAttributes) {
        this.goodsAttributes = goodsAttributes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCategoryId=").append(goodsCategoryId);
        sb.append(", profitTemplateId=").append(profitTemplateId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", hasRelevance=").append(hasRelevance);
        sb.append(", isOnlyRelevance=").append(isOnlyRelevance);
        sb.append(", brand=").append(brand);
        sb.append(", profitId=").append(profitId);
        sb.append(", payment=").append(payment);
        sb.append(", uiModuleAreaId=").append(uiModuleAreaId);
        sb.append(", specialType=").append(specialType);
        sb.append(", name=").append(name);
        sb.append(", weight=").append(weight);
        sb.append(", introduction=").append(introduction);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", isSelf=").append(isSelf);
        sb.append(", showTime=").append(showTime);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", isMaxBuy=").append(isMaxBuy);
        sb.append(", sales=").append(sales);
        sb.append(", salesVirtual=").append(salesVirtual);
        sb.append(", sort=").append(sort);
        sb.append(", stock=").append(stock);
        sb.append(", upBuyLevel=").append(upBuyLevel);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", goodsAttributes=").append(goodsAttributes);
        sb.append(", content=").append(content);
        sb.append(", pics=").append(pics);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}