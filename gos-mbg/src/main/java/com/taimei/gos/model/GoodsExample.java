package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdIsNull() {
            addCriterion("goods_category_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdIsNotNull() {
            addCriterion("goods_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdEqualTo(Integer value) {
            addCriterion("goods_category_id =", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdNotEqualTo(Integer value) {
            addCriterion("goods_category_id <>", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdGreaterThan(Integer value) {
            addCriterion("goods_category_id >", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_category_id >=", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdLessThan(Integer value) {
            addCriterion("goods_category_id <", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_category_id <=", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdIn(List<Integer> values) {
            addCriterion("goods_category_id in", values, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdNotIn(List<Integer> values) {
            addCriterion("goods_category_id not in", values, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_category_id between", value1, value2, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_category_id not between", value1, value2, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdIsNull() {
            addCriterion("profit_template_id is null");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdIsNotNull() {
            addCriterion("profit_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdEqualTo(Integer value) {
            addCriterion("profit_template_id =", value, "profitTemplateId");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdNotEqualTo(Integer value) {
            addCriterion("profit_template_id <>", value, "profitTemplateId");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdGreaterThan(Integer value) {
            addCriterion("profit_template_id >", value, "profitTemplateId");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("profit_template_id >=", value, "profitTemplateId");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdLessThan(Integer value) {
            addCriterion("profit_template_id <", value, "profitTemplateId");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("profit_template_id <=", value, "profitTemplateId");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdIn(List<Integer> values) {
            addCriterion("profit_template_id in", values, "profitTemplateId");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdNotIn(List<Integer> values) {
            addCriterion("profit_template_id not in", values, "profitTemplateId");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("profit_template_id between", value1, value2, "profitTemplateId");
            return (Criteria) this;
        }

        public Criteria andProfitTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("profit_template_id not between", value1, value2, "profitTemplateId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceIsNull() {
            addCriterion("has_relevance is null");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceIsNotNull() {
            addCriterion("has_relevance is not null");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceEqualTo(Byte value) {
            addCriterion("has_relevance =", value, "hasRelevance");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceNotEqualTo(Byte value) {
            addCriterion("has_relevance <>", value, "hasRelevance");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceGreaterThan(Byte value) {
            addCriterion("has_relevance >", value, "hasRelevance");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceGreaterThanOrEqualTo(Byte value) {
            addCriterion("has_relevance >=", value, "hasRelevance");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceLessThan(Byte value) {
            addCriterion("has_relevance <", value, "hasRelevance");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceLessThanOrEqualTo(Byte value) {
            addCriterion("has_relevance <=", value, "hasRelevance");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceIn(List<Byte> values) {
            addCriterion("has_relevance in", values, "hasRelevance");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceNotIn(List<Byte> values) {
            addCriterion("has_relevance not in", values, "hasRelevance");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceBetween(Byte value1, Byte value2) {
            addCriterion("has_relevance between", value1, value2, "hasRelevance");
            return (Criteria) this;
        }

        public Criteria andHasRelevanceNotBetween(Byte value1, Byte value2) {
            addCriterion("has_relevance not between", value1, value2, "hasRelevance");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceIsNull() {
            addCriterion("is_only_relevance is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceIsNotNull() {
            addCriterion("is_only_relevance is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceEqualTo(Byte value) {
            addCriterion("is_only_relevance =", value, "isOnlyRelevance");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceNotEqualTo(Byte value) {
            addCriterion("is_only_relevance <>", value, "isOnlyRelevance");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceGreaterThan(Byte value) {
            addCriterion("is_only_relevance >", value, "isOnlyRelevance");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_only_relevance >=", value, "isOnlyRelevance");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceLessThan(Byte value) {
            addCriterion("is_only_relevance <", value, "isOnlyRelevance");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceLessThanOrEqualTo(Byte value) {
            addCriterion("is_only_relevance <=", value, "isOnlyRelevance");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceIn(List<Byte> values) {
            addCriterion("is_only_relevance in", values, "isOnlyRelevance");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceNotIn(List<Byte> values) {
            addCriterion("is_only_relevance not in", values, "isOnlyRelevance");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceBetween(Byte value1, Byte value2) {
            addCriterion("is_only_relevance between", value1, value2, "isOnlyRelevance");
            return (Criteria) this;
        }

        public Criteria andIsOnlyRelevanceNotBetween(Byte value1, Byte value2) {
            addCriterion("is_only_relevance not between", value1, value2, "isOnlyRelevance");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andProfitIdIsNull() {
            addCriterion("profit_id is null");
            return (Criteria) this;
        }

        public Criteria andProfitIdIsNotNull() {
            addCriterion("profit_id is not null");
            return (Criteria) this;
        }

        public Criteria andProfitIdEqualTo(Integer value) {
            addCriterion("profit_id =", value, "profitId");
            return (Criteria) this;
        }

        public Criteria andProfitIdNotEqualTo(Integer value) {
            addCriterion("profit_id <>", value, "profitId");
            return (Criteria) this;
        }

        public Criteria andProfitIdGreaterThan(Integer value) {
            addCriterion("profit_id >", value, "profitId");
            return (Criteria) this;
        }

        public Criteria andProfitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("profit_id >=", value, "profitId");
            return (Criteria) this;
        }

        public Criteria andProfitIdLessThan(Integer value) {
            addCriterion("profit_id <", value, "profitId");
            return (Criteria) this;
        }

        public Criteria andProfitIdLessThanOrEqualTo(Integer value) {
            addCriterion("profit_id <=", value, "profitId");
            return (Criteria) this;
        }

        public Criteria andProfitIdIn(List<Integer> values) {
            addCriterion("profit_id in", values, "profitId");
            return (Criteria) this;
        }

        public Criteria andProfitIdNotIn(List<Integer> values) {
            addCriterion("profit_id not in", values, "profitId");
            return (Criteria) this;
        }

        public Criteria andProfitIdBetween(Integer value1, Integer value2) {
            addCriterion("profit_id between", value1, value2, "profitId");
            return (Criteria) this;
        }

        public Criteria andProfitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("profit_id not between", value1, value2, "profitId");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Integer value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Integer value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Integer value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Integer value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Integer> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Integer> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Integer value1, Integer value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdIsNull() {
            addCriterion("ui_module_area_id is null");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdIsNotNull() {
            addCriterion("ui_module_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdEqualTo(Integer value) {
            addCriterion("ui_module_area_id =", value, "uiModuleAreaId");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdNotEqualTo(Integer value) {
            addCriterion("ui_module_area_id <>", value, "uiModuleAreaId");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdGreaterThan(Integer value) {
            addCriterion("ui_module_area_id >", value, "uiModuleAreaId");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ui_module_area_id >=", value, "uiModuleAreaId");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdLessThan(Integer value) {
            addCriterion("ui_module_area_id <", value, "uiModuleAreaId");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("ui_module_area_id <=", value, "uiModuleAreaId");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdIn(List<Integer> values) {
            addCriterion("ui_module_area_id in", values, "uiModuleAreaId");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdNotIn(List<Integer> values) {
            addCriterion("ui_module_area_id not in", values, "uiModuleAreaId");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("ui_module_area_id between", value1, value2, "uiModuleAreaId");
            return (Criteria) this;
        }

        public Criteria andUiModuleAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ui_module_area_id not between", value1, value2, "uiModuleAreaId");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeIsNull() {
            addCriterion("special_type is null");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeIsNotNull() {
            addCriterion("special_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeEqualTo(Integer value) {
            addCriterion("special_type =", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeNotEqualTo(Integer value) {
            addCriterion("special_type <>", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeGreaterThan(Integer value) {
            addCriterion("special_type >", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_type >=", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeLessThan(Integer value) {
            addCriterion("special_type <", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeLessThanOrEqualTo(Integer value) {
            addCriterion("special_type <=", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeIn(List<Integer> values) {
            addCriterion("special_type in", values, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeNotIn(List<Integer> values) {
            addCriterion("special_type not in", values, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeBetween(Integer value1, Integer value2) {
            addCriterion("special_type between", value1, value2, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("special_type not between", value1, value2, "specialType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Long value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Long value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Long value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Long value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Long value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Long> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Long> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Long value1, Long value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Long value1, Long value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(Long value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(Long value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(Long value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(Long value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(Long value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<Long> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<Long> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(Long value1, Long value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(Long value1, Long value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Long value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Long value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Long value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Long value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Long value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Long> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Long> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Long value1, Long value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Long value1, Long value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andIsSelfIsNull() {
            addCriterion("is_self is null");
            return (Criteria) this;
        }

        public Criteria andIsSelfIsNotNull() {
            addCriterion("is_self is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelfEqualTo(Byte value) {
            addCriterion("is_self =", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotEqualTo(Byte value) {
            addCriterion("is_self <>", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfGreaterThan(Byte value) {
            addCriterion("is_self >", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_self >=", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfLessThan(Byte value) {
            addCriterion("is_self <", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfLessThanOrEqualTo(Byte value) {
            addCriterion("is_self <=", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfIn(List<Byte> values) {
            addCriterion("is_self in", values, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotIn(List<Byte> values) {
            addCriterion("is_self not in", values, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfBetween(Byte value1, Byte value2) {
            addCriterion("is_self between", value1, value2, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotBetween(Byte value1, Byte value2) {
            addCriterion("is_self not between", value1, value2, "isSelf");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNull() {
            addCriterion("show_time is null");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNotNull() {
            addCriterion("show_time is not null");
            return (Criteria) this;
        }

        public Criteria andShowTimeEqualTo(Integer value) {
            addCriterion("show_time =", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotEqualTo(Integer value) {
            addCriterion("show_time <>", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThan(Integer value) {
            addCriterion("show_time >", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_time >=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThan(Integer value) {
            addCriterion("show_time <", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThanOrEqualTo(Integer value) {
            addCriterion("show_time <=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeIn(List<Integer> values) {
            addCriterion("show_time in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotIn(List<Integer> values) {
            addCriterion("show_time not in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeBetween(Integer value1, Integer value2) {
            addCriterion("show_time between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("show_time not between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Integer value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Integer value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Integer value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Integer value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Integer> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Integer> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Integer value1, Integer value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Integer value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Integer value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Integer> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyIsNull() {
            addCriterion("is_max_buy is null");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyIsNotNull() {
            addCriterion("is_max_buy is not null");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyEqualTo(Byte value) {
            addCriterion("is_max_buy =", value, "isMaxBuy");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyNotEqualTo(Byte value) {
            addCriterion("is_max_buy <>", value, "isMaxBuy");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyGreaterThan(Byte value) {
            addCriterion("is_max_buy >", value, "isMaxBuy");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_max_buy >=", value, "isMaxBuy");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyLessThan(Byte value) {
            addCriterion("is_max_buy <", value, "isMaxBuy");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyLessThanOrEqualTo(Byte value) {
            addCriterion("is_max_buy <=", value, "isMaxBuy");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyIn(List<Byte> values) {
            addCriterion("is_max_buy in", values, "isMaxBuy");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyNotIn(List<Byte> values) {
            addCriterion("is_max_buy not in", values, "isMaxBuy");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyBetween(Byte value1, Byte value2) {
            addCriterion("is_max_buy between", value1, value2, "isMaxBuy");
            return (Criteria) this;
        }

        public Criteria andIsMaxBuyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_max_buy not between", value1, value2, "isMaxBuy");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualIsNull() {
            addCriterion("sales_virtual is null");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualIsNotNull() {
            addCriterion("sales_virtual is not null");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualEqualTo(Integer value) {
            addCriterion("sales_virtual =", value, "salesVirtual");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualNotEqualTo(Integer value) {
            addCriterion("sales_virtual <>", value, "salesVirtual");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualGreaterThan(Integer value) {
            addCriterion("sales_virtual >", value, "salesVirtual");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_virtual >=", value, "salesVirtual");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualLessThan(Integer value) {
            addCriterion("sales_virtual <", value, "salesVirtual");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualLessThanOrEqualTo(Integer value) {
            addCriterion("sales_virtual <=", value, "salesVirtual");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualIn(List<Integer> values) {
            addCriterion("sales_virtual in", values, "salesVirtual");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualNotIn(List<Integer> values) {
            addCriterion("sales_virtual not in", values, "salesVirtual");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualBetween(Integer value1, Integer value2) {
            addCriterion("sales_virtual between", value1, value2, "salesVirtual");
            return (Criteria) this;
        }

        public Criteria andSalesVirtualNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_virtual not between", value1, value2, "salesVirtual");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelIsNull() {
            addCriterion("up_buy_level is null");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelIsNotNull() {
            addCriterion("up_buy_level is not null");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelEqualTo(Integer value) {
            addCriterion("up_buy_level =", value, "upBuyLevel");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelNotEqualTo(Integer value) {
            addCriterion("up_buy_level <>", value, "upBuyLevel");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelGreaterThan(Integer value) {
            addCriterion("up_buy_level >", value, "upBuyLevel");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_buy_level >=", value, "upBuyLevel");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelLessThan(Integer value) {
            addCriterion("up_buy_level <", value, "upBuyLevel");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelLessThanOrEqualTo(Integer value) {
            addCriterion("up_buy_level <=", value, "upBuyLevel");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelIn(List<Integer> values) {
            addCriterion("up_buy_level in", values, "upBuyLevel");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelNotIn(List<Integer> values) {
            addCriterion("up_buy_level not in", values, "upBuyLevel");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelBetween(Integer value1, Integer value2) {
            addCriterion("up_buy_level between", value1, value2, "upBuyLevel");
            return (Criteria) this;
        }

        public Criteria andUpBuyLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("up_buy_level not between", value1, value2, "upBuyLevel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Integer value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Integer value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Integer value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Integer value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Integer value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Integer> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Integer> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Integer value1, Integer value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}