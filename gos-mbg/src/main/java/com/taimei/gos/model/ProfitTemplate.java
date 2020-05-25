package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ProfitTemplate implements Serializable {
    private Integer profitTemplateId;

    private String name;

    private Integer profitType;

    private Integer l0;

    private Integer l1;

    private Integer l2;

    private Integer l3;

    private Integer l33;

    private static final long serialVersionUID = 1L;

    public Integer getProfitTemplateId() {
        return profitTemplateId;
    }

    public void setProfitTemplateId(Integer profitTemplateId) {
        this.profitTemplateId = profitTemplateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProfitType() {
        return profitType;
    }

    public void setProfitType(Integer profitType) {
        this.profitType = profitType;
    }

    public Integer getL0() {
        return l0;
    }

    public void setL0(Integer l0) {
        this.l0 = l0;
    }

    public Integer getL1() {
        return l1;
    }

    public void setL1(Integer l1) {
        this.l1 = l1;
    }

    public Integer getL2() {
        return l2;
    }

    public void setL2(Integer l2) {
        this.l2 = l2;
    }

    public Integer getL3() {
        return l3;
    }

    public void setL3(Integer l3) {
        this.l3 = l3;
    }

    public Integer getL33() {
        return l33;
    }

    public void setL33(Integer l33) {
        this.l33 = l33;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", profitTemplateId=").append(profitTemplateId);
        sb.append(", name=").append(name);
        sb.append(", profitType=").append(profitType);
        sb.append(", l0=").append(l0);
        sb.append(", l1=").append(l1);
        sb.append(", l2=").append(l2);
        sb.append(", l3=").append(l3);
        sb.append(", l33=").append(l33);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}