package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Shop implements Serializable {
    private Integer shopId;

    private Integer userId;

    private Integer parentId;

    private Integer supplierId;

    private Integer profitExTime;

    private String shopName;

    private String mobile;

    private String realName;

    private Byte shopLevel;

    private String remark;

    private Integer createTime;

    private Boolean isDelete;

    private Integer deleteTime;

    private Boolean isClose;

    private Integer closeTime;

    private Integer createAdminId;

    private Integer closeAdminId;

    private Integer deleteAdminId;

    private Integer contractStatus;

    private Integer createPayAttId;

    private Integer ppQrcodeId;

    private static final long serialVersionUID = 1L;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getProfitExTime() {
        return profitExTime;
    }

    public void setProfitExTime(Integer profitExTime) {
        this.profitExTime = profitExTime;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Byte getShopLevel() {
        return shopLevel;
    }

    public void setShopLevel(Byte shopLevel) {
        this.shopLevel = shopLevel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Boolean getIsClose() {
        return isClose;
    }

    public void setIsClose(Boolean isClose) {
        this.isClose = isClose;
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getCreateAdminId() {
        return createAdminId;
    }

    public void setCreateAdminId(Integer createAdminId) {
        this.createAdminId = createAdminId;
    }

    public Integer getCloseAdminId() {
        return closeAdminId;
    }

    public void setCloseAdminId(Integer closeAdminId) {
        this.closeAdminId = closeAdminId;
    }

    public Integer getDeleteAdminId() {
        return deleteAdminId;
    }

    public void setDeleteAdminId(Integer deleteAdminId) {
        this.deleteAdminId = deleteAdminId;
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Integer getCreatePayAttId() {
        return createPayAttId;
    }

    public void setCreatePayAttId(Integer createPayAttId) {
        this.createPayAttId = createPayAttId;
    }

    public Integer getPpQrcodeId() {
        return ppQrcodeId;
    }

    public void setPpQrcodeId(Integer ppQrcodeId) {
        this.ppQrcodeId = ppQrcodeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopId=").append(shopId);
        sb.append(", userId=").append(userId);
        sb.append(", parentId=").append(parentId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", profitExTime=").append(profitExTime);
        sb.append(", shopName=").append(shopName);
        sb.append(", mobile=").append(mobile);
        sb.append(", realName=").append(realName);
        sb.append(", shopLevel=").append(shopLevel);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", isClose=").append(isClose);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", createAdminId=").append(createAdminId);
        sb.append(", closeAdminId=").append(closeAdminId);
        sb.append(", deleteAdminId=").append(deleteAdminId);
        sb.append(", contractStatus=").append(contractStatus);
        sb.append(", createPayAttId=").append(createPayAttId);
        sb.append(", ppQrcodeId=").append(ppQrcodeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}