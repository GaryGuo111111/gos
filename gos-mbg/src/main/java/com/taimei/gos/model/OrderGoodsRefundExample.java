package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class OrderGoodsRefundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderGoodsRefundExample() {
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

        public Criteria andOrderGoodsIdIsNull() {
            addCriterion("order_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIsNotNull() {
            addCriterion("order_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdEqualTo(Integer value) {
            addCriterion("order_goods_id =", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotEqualTo(Integer value) {
            addCriterion("order_goods_id <>", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThan(Integer value) {
            addCriterion("order_goods_id >", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_goods_id >=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThan(Integer value) {
            addCriterion("order_goods_id <", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_goods_id <=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIn(List<Integer> values) {
            addCriterion("order_goods_id in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotIn(List<Integer> values) {
            addCriterion("order_goods_id not in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_id between", value1, value2, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_id not between", value1, value2, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoIsNull() {
            addCriterion("refund_order_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoIsNotNull() {
            addCriterion("refund_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoEqualTo(String value) {
            addCriterion("refund_order_no =", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotEqualTo(String value) {
            addCriterion("refund_order_no <>", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoGreaterThan(String value) {
            addCriterion("refund_order_no >", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_order_no >=", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoLessThan(String value) {
            addCriterion("refund_order_no <", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoLessThanOrEqualTo(String value) {
            addCriterion("refund_order_no <=", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoLike(String value) {
            addCriterion("refund_order_no like", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotLike(String value) {
            addCriterion("refund_order_no not like", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoIn(List<String> values) {
            addCriterion("refund_order_no in", values, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotIn(List<String> values) {
            addCriterion("refund_order_no not in", values, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoBetween(String value1, String value2) {
            addCriterion("refund_order_no between", value1, value2, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotBetween(String value1, String value2) {
            addCriterion("refund_order_no not between", value1, value2, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceIsNull() {
            addCriterion("is_refund_price is null");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceIsNotNull() {
            addCriterion("is_refund_price is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceEqualTo(Boolean value) {
            addCriterion("is_refund_price =", value, "isRefundPrice");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceNotEqualTo(Boolean value) {
            addCriterion("is_refund_price <>", value, "isRefundPrice");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceGreaterThan(Boolean value) {
            addCriterion("is_refund_price >", value, "isRefundPrice");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_refund_price >=", value, "isRefundPrice");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceLessThan(Boolean value) {
            addCriterion("is_refund_price <", value, "isRefundPrice");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceLessThanOrEqualTo(Boolean value) {
            addCriterion("is_refund_price <=", value, "isRefundPrice");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceIn(List<Boolean> values) {
            addCriterion("is_refund_price in", values, "isRefundPrice");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceNotIn(List<Boolean> values) {
            addCriterion("is_refund_price not in", values, "isRefundPrice");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceBetween(Boolean value1, Boolean value2) {
            addCriterion("is_refund_price between", value1, value2, "isRefundPrice");
            return (Criteria) this;
        }

        public Criteria andIsRefundPriceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_refund_price not between", value1, value2, "isRefundPrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIsUserSendIsNull() {
            addCriterion("is_user_send is null");
            return (Criteria) this;
        }

        public Criteria andIsUserSendIsNotNull() {
            addCriterion("is_user_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsUserSendEqualTo(Boolean value) {
            addCriterion("is_user_send =", value, "isUserSend");
            return (Criteria) this;
        }

        public Criteria andIsUserSendNotEqualTo(Boolean value) {
            addCriterion("is_user_send <>", value, "isUserSend");
            return (Criteria) this;
        }

        public Criteria andIsUserSendGreaterThan(Boolean value) {
            addCriterion("is_user_send >", value, "isUserSend");
            return (Criteria) this;
        }

        public Criteria andIsUserSendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_user_send >=", value, "isUserSend");
            return (Criteria) this;
        }

        public Criteria andIsUserSendLessThan(Boolean value) {
            addCriterion("is_user_send <", value, "isUserSend");
            return (Criteria) this;
        }

        public Criteria andIsUserSendLessThanOrEqualTo(Boolean value) {
            addCriterion("is_user_send <=", value, "isUserSend");
            return (Criteria) this;
        }

        public Criteria andIsUserSendIn(List<Boolean> values) {
            addCriterion("is_user_send in", values, "isUserSend");
            return (Criteria) this;
        }

        public Criteria andIsUserSendNotIn(List<Boolean> values) {
            addCriterion("is_user_send not in", values, "isUserSend");
            return (Criteria) this;
        }

        public Criteria andIsUserSendBetween(Boolean value1, Boolean value2) {
            addCriterion("is_user_send between", value1, value2, "isUserSend");
            return (Criteria) this;
        }

        public Criteria andIsUserSendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_user_send not between", value1, value2, "isUserSend");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeIsNull() {
            addCriterion("user_send_time is null");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeIsNotNull() {
            addCriterion("user_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeEqualTo(Integer value) {
            addCriterion("user_send_time =", value, "userSendTime");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeNotEqualTo(Integer value) {
            addCriterion("user_send_time <>", value, "userSendTime");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeGreaterThan(Integer value) {
            addCriterion("user_send_time >", value, "userSendTime");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_send_time >=", value, "userSendTime");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeLessThan(Integer value) {
            addCriterion("user_send_time <", value, "userSendTime");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeLessThanOrEqualTo(Integer value) {
            addCriterion("user_send_time <=", value, "userSendTime");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeIn(List<Integer> values) {
            addCriterion("user_send_time in", values, "userSendTime");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeNotIn(List<Integer> values) {
            addCriterion("user_send_time not in", values, "userSendTime");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeBetween(Integer value1, Integer value2) {
            addCriterion("user_send_time between", value1, value2, "userSendTime");
            return (Criteria) this;
        }

        public Criteria andUserSendTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_send_time not between", value1, value2, "userSendTime");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdIsNull() {
            addCriterion("sys_express_id is null");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdIsNotNull() {
            addCriterion("sys_express_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdEqualTo(Integer value) {
            addCriterion("sys_express_id =", value, "sysExpressId");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdNotEqualTo(Integer value) {
            addCriterion("sys_express_id <>", value, "sysExpressId");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdGreaterThan(Integer value) {
            addCriterion("sys_express_id >", value, "sysExpressId");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_express_id >=", value, "sysExpressId");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdLessThan(Integer value) {
            addCriterion("sys_express_id <", value, "sysExpressId");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_express_id <=", value, "sysExpressId");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdIn(List<Integer> values) {
            addCriterion("sys_express_id in", values, "sysExpressId");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdNotIn(List<Integer> values) {
            addCriterion("sys_express_id not in", values, "sysExpressId");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_express_id between", value1, value2, "sysExpressId");
            return (Criteria) this;
        }

        public Criteria andSysExpressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_express_id not between", value1, value2, "sysExpressId");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNull() {
            addCriterion("express_no is null");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNotNull() {
            addCriterion("express_no is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNoEqualTo(String value) {
            addCriterion("express_no =", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotEqualTo(String value) {
            addCriterion("express_no <>", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThan(String value) {
            addCriterion("express_no >", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThanOrEqualTo(String value) {
            addCriterion("express_no >=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThan(String value) {
            addCriterion("express_no <", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThanOrEqualTo(String value) {
            addCriterion("express_no <=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLike(String value) {
            addCriterion("express_no like", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotLike(String value) {
            addCriterion("express_no not like", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoIn(List<String> values) {
            addCriterion("express_no in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotIn(List<String> values) {
            addCriterion("express_no not in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoBetween(String value1, String value2) {
            addCriterion("express_no between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotBetween(String value1, String value2) {
            addCriterion("express_no not between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIsNull() {
            addCriterion("response_time is null");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIsNotNull() {
            addCriterion("response_time is not null");
            return (Criteria) this;
        }

        public Criteria andResponseTimeEqualTo(Integer value) {
            addCriterion("response_time =", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotEqualTo(Integer value) {
            addCriterion("response_time <>", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeGreaterThan(Integer value) {
            addCriterion("response_time >", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("response_time >=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLessThan(Integer value) {
            addCriterion("response_time <", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("response_time <=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIn(List<Integer> values) {
            addCriterion("response_time in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotIn(List<Integer> values) {
            addCriterion("response_time not in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeBetween(Integer value1, Integer value2) {
            addCriterion("response_time between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("response_time not between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsIsNull() {
            addCriterion("is_refund_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsIsNotNull() {
            addCriterion("is_refund_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsEqualTo(Boolean value) {
            addCriterion("is_refund_goods =", value, "isRefundGoods");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsNotEqualTo(Boolean value) {
            addCriterion("is_refund_goods <>", value, "isRefundGoods");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsGreaterThan(Boolean value) {
            addCriterion("is_refund_goods >", value, "isRefundGoods");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_refund_goods >=", value, "isRefundGoods");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsLessThan(Boolean value) {
            addCriterion("is_refund_goods <", value, "isRefundGoods");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsLessThanOrEqualTo(Boolean value) {
            addCriterion("is_refund_goods <=", value, "isRefundGoods");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsIn(List<Boolean> values) {
            addCriterion("is_refund_goods in", values, "isRefundGoods");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsNotIn(List<Boolean> values) {
            addCriterion("is_refund_goods not in", values, "isRefundGoods");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsBetween(Boolean value1, Boolean value2) {
            addCriterion("is_refund_goods between", value1, value2, "isRefundGoods");
            return (Criteria) this;
        }

        public Criteria andIsRefundGoodsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_refund_goods not between", value1, value2, "isRefundGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsIsNull() {
            addCriterion("is_exchange_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsIsNotNull() {
            addCriterion("is_exchange_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsEqualTo(Boolean value) {
            addCriterion("is_exchange_goods =", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsNotEqualTo(Boolean value) {
            addCriterion("is_exchange_goods <>", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsGreaterThan(Boolean value) {
            addCriterion("is_exchange_goods >", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_exchange_goods >=", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsLessThan(Boolean value) {
            addCriterion("is_exchange_goods <", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsLessThanOrEqualTo(Boolean value) {
            addCriterion("is_exchange_goods <=", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsIn(List<Boolean> values) {
            addCriterion("is_exchange_goods in", values, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsNotIn(List<Boolean> values) {
            addCriterion("is_exchange_goods not in", values, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsBetween(Boolean value1, Boolean value2) {
            addCriterion("is_exchange_goods between", value1, value2, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_exchange_goods not between", value1, value2, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdIsNull() {
            addCriterion("refund_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdIsNotNull() {
            addCriterion("refund_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdEqualTo(Integer value) {
            addCriterion("refund_admin_id =", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdNotEqualTo(Integer value) {
            addCriterion("refund_admin_id <>", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdGreaterThan(Integer value) {
            addCriterion("refund_admin_id >", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_admin_id >=", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdLessThan(Integer value) {
            addCriterion("refund_admin_id <", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_admin_id <=", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdIn(List<Integer> values) {
            addCriterion("refund_admin_id in", values, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdNotIn(List<Integer> values) {
            addCriterion("refund_admin_id not in", values, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_admin_id between", value1, value2, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_admin_id not between", value1, value2, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkIsNull() {
            addCriterion("to_customer_remark is null");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkIsNotNull() {
            addCriterion("to_customer_remark is not null");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkEqualTo(String value) {
            addCriterion("to_customer_remark =", value, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkNotEqualTo(String value) {
            addCriterion("to_customer_remark <>", value, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkGreaterThan(String value) {
            addCriterion("to_customer_remark >", value, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("to_customer_remark >=", value, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkLessThan(String value) {
            addCriterion("to_customer_remark <", value, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkLessThanOrEqualTo(String value) {
            addCriterion("to_customer_remark <=", value, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkLike(String value) {
            addCriterion("to_customer_remark like", value, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkNotLike(String value) {
            addCriterion("to_customer_remark not like", value, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkIn(List<String> values) {
            addCriterion("to_customer_remark in", values, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkNotIn(List<String> values) {
            addCriterion("to_customer_remark not in", values, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkBetween(String value1, String value2) {
            addCriterion("to_customer_remark between", value1, value2, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andToCustomerRemarkNotBetween(String value1, String value2) {
            addCriterion("to_customer_remark not between", value1, value2, "toCustomerRemark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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