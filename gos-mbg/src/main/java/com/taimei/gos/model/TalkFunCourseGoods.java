package com.taimei.gos.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TalkFunCourseGoods implements Serializable {
    private Integer talkFunCourseGoodsId;

    private Integer talkFunCourseId;

    private Integer goodsId;

    private static final long serialVersionUID = 1L;

    public Integer getTalkFunCourseGoodsId() {
        return talkFunCourseGoodsId;
    }

    public void setTalkFunCourseGoodsId(Integer talkFunCourseGoodsId) {
        this.talkFunCourseGoodsId = talkFunCourseGoodsId;
    }

    public Integer getTalkFunCourseId() {
        return talkFunCourseId;
    }

    public void setTalkFunCourseId(Integer talkFunCourseId) {
        this.talkFunCourseId = talkFunCourseId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", talkFunCourseGoodsId=").append(talkFunCourseGoodsId);
        sb.append(", talkFunCourseId=").append(talkFunCourseId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}