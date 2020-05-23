package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UserWallet implements Serializable {
    private Integer userId;

    private Long balance;

    private Long nonWithdraw;

    private Integer bean;

    private Integer coupon;

    private Long totalProfit;

    private Long withdrawProfit;

    private Long salesBonus;

    private Long orderPerformance;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getNonWithdraw() {
        return nonWithdraw;
    }

    public void setNonWithdraw(Long nonWithdraw) {
        this.nonWithdraw = nonWithdraw;
    }

    public Integer getBean() {
        return bean;
    }

    public void setBean(Integer bean) {
        this.bean = bean;
    }

    public Integer getCoupon() {
        return coupon;
    }

    public void setCoupon(Integer coupon) {
        this.coupon = coupon;
    }

    public Long getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(Long totalProfit) {
        this.totalProfit = totalProfit;
    }

    public Long getWithdrawProfit() {
        return withdrawProfit;
    }

    public void setWithdrawProfit(Long withdrawProfit) {
        this.withdrawProfit = withdrawProfit;
    }

    public Long getSalesBonus() {
        return salesBonus;
    }

    public void setSalesBonus(Long salesBonus) {
        this.salesBonus = salesBonus;
    }

    public Long getOrderPerformance() {
        return orderPerformance;
    }

    public void setOrderPerformance(Long orderPerformance) {
        this.orderPerformance = orderPerformance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", balance=").append(balance);
        sb.append(", nonWithdraw=").append(nonWithdraw);
        sb.append(", bean=").append(bean);
        sb.append(", coupon=").append(coupon);
        sb.append(", totalProfit=").append(totalProfit);
        sb.append(", withdrawProfit=").append(withdrawProfit);
        sb.append(", salesBonus=").append(salesBonus);
        sb.append(", orderPerformance=").append(orderPerformance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}