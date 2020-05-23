package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class User implements Serializable {
    private Integer userId;

    private Integer parentId;

    private Integer supplierId;

    private String mobile;

    private String password;

    private String nickname;

    private String avatar;

    private String realName;

    private Integer belongShopId;

    private Integer buyLevelId;

    private Integer saleLevelId;

    private Integer specialType;

    private Integer profitExTime;

    private Boolean isDelete;

    private Integer deleteTime;

    private Boolean isFreeze;

    private Integer createTime;

    private Integer ppId;

    private Integer nGoldId;

    private Integer nDiamondId;

    private Long selfSale;

    private Long totalSale;

    private String p20Ids;

    private static final long serialVersionUID = 1L;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getBelongShopId() {
        return belongShopId;
    }

    public void setBelongShopId(Integer belongShopId) {
        this.belongShopId = belongShopId;
    }

    public Integer getBuyLevelId() {
        return buyLevelId;
    }

    public void setBuyLevelId(Integer buyLevelId) {
        this.buyLevelId = buyLevelId;
    }

    public Integer getSaleLevelId() {
        return saleLevelId;
    }

    public void setSaleLevelId(Integer saleLevelId) {
        this.saleLevelId = saleLevelId;
    }

    public Integer getSpecialType() {
        return specialType;
    }

    public void setSpecialType(Integer specialType) {
        this.specialType = specialType;
    }

    public Integer getProfitExTime() {
        return profitExTime;
    }

    public void setProfitExTime(Integer profitExTime) {
        this.profitExTime = profitExTime;
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

    public Boolean getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(Boolean isFreeze) {
        this.isFreeze = isFreeze;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getPpId() {
        return ppId;
    }

    public void setPpId(Integer ppId) {
        this.ppId = ppId;
    }

    public Integer getnGoldId() {
        return nGoldId;
    }

    public void setnGoldId(Integer nGoldId) {
        this.nGoldId = nGoldId;
    }

    public Integer getnDiamondId() {
        return nDiamondId;
    }

    public void setnDiamondId(Integer nDiamondId) {
        this.nDiamondId = nDiamondId;
    }

    public Long getSelfSale() {
        return selfSale;
    }

    public void setSelfSale(Long selfSale) {
        this.selfSale = selfSale;
    }

    public Long getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(Long totalSale) {
        this.totalSale = totalSale;
    }

    public String getP20Ids() {
        return p20Ids;
    }

    public void setP20Ids(String p20Ids) {
        this.p20Ids = p20Ids;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", parentId=").append(parentId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", mobile=").append(mobile);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", avatar=").append(avatar);
        sb.append(", realName=").append(realName);
        sb.append(", belongShopId=").append(belongShopId);
        sb.append(", buyLevelId=").append(buyLevelId);
        sb.append(", saleLevelId=").append(saleLevelId);
        sb.append(", specialType=").append(specialType);
        sb.append(", profitExTime=").append(profitExTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", isFreeze=").append(isFreeze);
        sb.append(", createTime=").append(createTime);
        sb.append(", ppId=").append(ppId);
        sb.append(", nGoldId=").append(nGoldId);
        sb.append(", nDiamondId=").append(nDiamondId);
        sb.append(", selfSale=").append(selfSale);
        sb.append(", totalSale=").append(totalSale);
        sb.append(", p20Ids=").append(p20Ids);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}