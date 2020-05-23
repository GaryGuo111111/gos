package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GoodsAttributeKey implements Serializable {
    private Integer goodsAttributeKeyId;

    private Integer pid;

    private String name;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsAttributeKeyId() {
        return goodsAttributeKeyId;
    }

    public void setGoodsAttributeKeyId(Integer goodsAttributeKeyId) {
        this.goodsAttributeKeyId = goodsAttributeKeyId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
        sb.append(", goodsAttributeKeyId=").append(goodsAttributeKeyId);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}