package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UserWechat implements Serializable {
    private Integer userWechatId;

    private Integer userId;

    private String unionid;

    private String appId;

    private String openId;

    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Integer getUserWechatId() {
        return userWechatId;
    }

    public void setUserWechatId(Integer userWechatId) {
        this.userWechatId = userWechatId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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
        sb.append(", userWechatId=").append(userWechatId);
        sb.append(", userId=").append(userId);
        sb.append(", unionid=").append(unionid);
        sb.append(", appId=").append(appId);
        sb.append(", openId=").append(openId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}