package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysConfig implements Serializable {
    private String k;

    private String remark;

    private Integer lastAdminId;

    private Date updateTime;

    private String v;

    private static final long serialVersionUID = 1L;

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getLastAdminId() {
        return lastAdminId;
    }

    public void setLastAdminId(Integer lastAdminId) {
        this.lastAdminId = lastAdminId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", k=").append(k);
        sb.append(", remark=").append(remark);
        sb.append(", lastAdminId=").append(lastAdminId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", v=").append(v);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}