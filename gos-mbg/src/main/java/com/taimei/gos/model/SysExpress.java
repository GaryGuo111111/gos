package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SysExpress implements Serializable {
    private Integer sysExpressId;

    private String code;

    private String name;

    private Byte typeApi;

    private static final long serialVersionUID = 1L;

    public Integer getSysExpressId() {
        return sysExpressId;
    }

    public void setSysExpressId(Integer sysExpressId) {
        this.sysExpressId = sysExpressId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getTypeApi() {
        return typeApi;
    }

    public void setTypeApi(Byte typeApi) {
        this.typeApi = typeApi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysExpressId=").append(sysExpressId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", typeApi=").append(typeApi);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}