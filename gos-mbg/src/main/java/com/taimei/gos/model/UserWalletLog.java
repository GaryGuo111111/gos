package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UserWalletLog implements Serializable {
    private Integer walletLogId;

    private Integer userId;

    private Long beforeAmount;

    private Long amount;

    private Long afterAmount;

    private String field;

    private String remark;

    private Integer typeAliasId;

    private Integer type;

    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Integer getWalletLogId() {
        return walletLogId;
    }

    public void setWalletLogId(Integer walletLogId) {
        this.walletLogId = walletLogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getBeforeAmount() {
        return beforeAmount;
    }

    public void setBeforeAmount(Long beforeAmount) {
        this.beforeAmount = beforeAmount;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getAfterAmount() {
        return afterAmount;
    }

    public void setAfterAmount(Long afterAmount) {
        this.afterAmount = afterAmount;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTypeAliasId() {
        return typeAliasId;
    }

    public void setTypeAliasId(Integer typeAliasId) {
        this.typeAliasId = typeAliasId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        sb.append(", walletLogId=").append(walletLogId);
        sb.append(", userId=").append(userId);
        sb.append(", beforeAmount=").append(beforeAmount);
        sb.append(", amount=").append(amount);
        sb.append(", afterAmount=").append(afterAmount);
        sb.append(", field=").append(field);
        sb.append(", remark=").append(remark);
        sb.append(", typeAliasId=").append(typeAliasId);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}