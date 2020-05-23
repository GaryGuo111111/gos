package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ShopContract implements Serializable {
    private Integer shopContractId;

    private Integer shopId;

    private Integer userId;

    private String realName;

    private String telphone;

    private String idNumber;

    private String idAddress;

    private Integer idAtt0;

    private Integer idAtt1;

    private Integer handIdAtt;

    private Integer signatureAtt;

    private Integer createTime;

    private Integer status;

    private String contractNo;

    private Integer auditAdminId;

    private Integer auditTime;

    private String auditRemark;

    private static final long serialVersionUID = 1L;

    public Integer getShopContractId() {
        return shopContractId;
    }

    public void setShopContractId(Integer shopContractId) {
        this.shopContractId = shopContractId;
    }

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(String idAddress) {
        this.idAddress = idAddress;
    }

    public Integer getIdAtt0() {
        return idAtt0;
    }

    public void setIdAtt0(Integer idAtt0) {
        this.idAtt0 = idAtt0;
    }

    public Integer getIdAtt1() {
        return idAtt1;
    }

    public void setIdAtt1(Integer idAtt1) {
        this.idAtt1 = idAtt1;
    }

    public Integer getHandIdAtt() {
        return handIdAtt;
    }

    public void setHandIdAtt(Integer handIdAtt) {
        this.handIdAtt = handIdAtt;
    }

    public Integer getSignatureAtt() {
        return signatureAtt;
    }

    public void setSignatureAtt(Integer signatureAtt) {
        this.signatureAtt = signatureAtt;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Integer getAuditAdminId() {
        return auditAdminId;
    }

    public void setAuditAdminId(Integer auditAdminId) {
        this.auditAdminId = auditAdminId;
    }

    public Integer getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Integer auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopContractId=").append(shopContractId);
        sb.append(", shopId=").append(shopId);
        sb.append(", userId=").append(userId);
        sb.append(", realName=").append(realName);
        sb.append(", telphone=").append(telphone);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", idAddress=").append(idAddress);
        sb.append(", idAtt0=").append(idAtt0);
        sb.append(", idAtt1=").append(idAtt1);
        sb.append(", handIdAtt=").append(handIdAtt);
        sb.append(", signatureAtt=").append(signatureAtt);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", contractNo=").append(contractNo);
        sb.append(", auditAdminId=").append(auditAdminId);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", auditRemark=").append(auditRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}