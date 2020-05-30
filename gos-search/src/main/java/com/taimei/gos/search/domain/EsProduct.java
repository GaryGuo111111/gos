package com.taimei.gos.search.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * 搜索中的商品信息
 * Created by macro on 2018/6/19.
 */
@Document(indexName = "test", shards = 1,replicas = 0)
@Data
public class EsProduct implements Serializable {
    private static final long serialVersionUID = -1L;
    @Id
    private Integer goodsId;
    @Field(type=FieldType.Auto)
    private Integer goodsCategoryId;
    @Field(type = FieldType.Keyword)
    private String brand;
    @Field(type=FieldType.Auto)
    private Integer profitId;
    private Integer UIModuleAreaId;
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String name;
    @Field(type=FieldType.Auto)
    private Integer sort;
    @Field(type=FieldType.Auto)
    private String pics;
    @Field(type=FieldType.Auto)
    private long marketPrice;
    @Field(type=FieldType.Auto)
    private long discountPrice;
    @Field(type=FieldType.Auto)
    private Integer stock;
    @Field(type=FieldType.Auto)
    private Integer showTime;
    @Field(type=FieldType.Auto)
    private Integer endTime;
    @Field(type=FieldType.Auto)
    private Integer introduction;

}
