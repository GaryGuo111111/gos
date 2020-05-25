package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Supplier implements Serializable {
    private Integer supplierId;

    private String name;

    private Byte isBrands;

    private String telphone;

    private String address;

    private String contacts;

    private String bankName;

    private String account;

    private String realName;

    private Integer businessLicense;

    private Integer createTime;

    private Integer lastAdminId;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getIsBrands() {
        return isBrands;
    }

    public void setIsBrands(Byte isBrands) {
        this.isBrands = isBrands;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(Integer businessLicense) {
        this.businessLicense = businessLicense;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", supplierId=").append(supplierId);
        sb.append(", name=").append(name);
        sb.append(", isBrands=").append(isBrands);
        sb.append(", telphone=").append(telphone);
        sb.append(", address=").append(address);
        sb.append(", contacts=").append(contacts);
        sb.append(", bankName=").append(bankName);
        sb.append(", account=").append(account);
        sb.append(", realName=").append(realName);
        sb.append(", businessLicense=").append(businessLicense);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastAdminId=").append(lastAdminId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}