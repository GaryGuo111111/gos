package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ShippingTemplatesRules implements Serializable {
    private Integer shippingTemplatesRulesId;

    private Integer shippingTemplatesId;

    private String code;

    private Byte isSend;

    private Long price;

    private Integer createTime;

    private Byte isDelete;

    private Integer deleteTime;

    private static final long serialVersionUID = 1L;

    public Integer getShippingTemplatesRulesId() {
        return shippingTemplatesRulesId;
    }

    public void setShippingTemplatesRulesId(Integer shippingTemplatesRulesId) {
        this.shippingTemplatesRulesId = shippingTemplatesRulesId;
    }

    public Integer getShippingTemplatesId() {
        return shippingTemplatesId;
    }

    public void setShippingTemplatesId(Integer shippingTemplatesId) {
        this.shippingTemplatesId = shippingTemplatesId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Byte getIsSend() {
        return isSend;
    }

    public void setIsSend(Byte isSend) {
        this.isSend = isSend;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shippingTemplatesRulesId=").append(shippingTemplatesRulesId);
        sb.append(", shippingTemplatesId=").append(shippingTemplatesId);
        sb.append(", code=").append(code);
        sb.append(", isSend=").append(isSend);
        sb.append(", price=").append(price);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}