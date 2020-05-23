package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AdminActionLog implements Serializable {
    private Integer actionLogId;

    private Integer adminId;

    private String name;

    private String action;

    private Integer createTime;

    private String actionIp;

    private String actionData;

    private static final long serialVersionUID = 1L;

    public Integer getActionLogId() {
        return actionLogId;
    }

    public void setActionLogId(Integer actionLogId) {
        this.actionLogId = actionLogId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getActionIp() {
        return actionIp;
    }

    public void setActionIp(String actionIp) {
        this.actionIp = actionIp;
    }

    public String getActionData() {
        return actionData;
    }

    public void setActionData(String actionData) {
        this.actionData = actionData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", actionLogId=").append(actionLogId);
        sb.append(", adminId=").append(adminId);
        sb.append(", name=").append(name);
        sb.append(", action=").append(action);
        sb.append(", createTime=").append(createTime);
        sb.append(", actionIp=").append(actionIp);
        sb.append(", actionData=").append(actionData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}