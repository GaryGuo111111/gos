package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class RemindContentTemplate implements Serializable {
    private Long remindType;

    private String content;

    private Integer showType;

    private String description;

    private static final long serialVersionUID = 1L;

    public Long getRemindType() {
        return remindType;
    }

    public void setRemindType(Long remindType) {
        this.remindType = remindType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", remindType=").append(remindType);
        sb.append(", content=").append(content);
        sb.append(", showType=").append(showType);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}