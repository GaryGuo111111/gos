package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdIsNull() {
            addCriterion("buy_level_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdIsNotNull() {
            addCriterion("buy_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdEqualTo(Integer value) {
            addCriterion("buy_level_id =", value, "buyLevelId");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdNotEqualTo(Integer value) {
            addCriterion("buy_level_id <>", value, "buyLevelId");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdGreaterThan(Integer value) {
            addCriterion("buy_level_id >", value, "buyLevelId");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_level_id >=", value, "buyLevelId");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdLessThan(Integer value) {
            addCriterion("buy_level_id <", value, "buyLevelId");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("buy_level_id <=", value, "buyLevelId");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdIn(List<Integer> values) {
            addCriterion("buy_level_id in", values, "buyLevelId");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdNotIn(List<Integer> values) {
            addCriterion("buy_level_id not in", values, "buyLevelId");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("buy_level_id between", value1, value2, "buyLevelId");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_level_id not between", value1, value2, "buyLevelId");
            return (Criteria) this;
        }

        public Criteria andReferrerIdIsNull() {
            addCriterion("referrer_id is null");
            return (Criteria) this;
        }

        public Criteria andReferrerIdIsNotNull() {
            addCriterion("referrer_id is not null");
            return (Criteria) this;
        }

        public Criteria andReferrerIdEqualTo(Integer value) {
            addCriterion("referrer_id =", value, "referrerId");
            return (Criteria) this;
        }

        public Criteria andReferrerIdNotEqualTo(Integer value) {
            addCriterion("referrer_id <>", value, "referrerId");
            return (Criteria) this;
        }

        public Criteria andReferrerIdGreaterThan(Integer value) {
            addCriterion("referrer_id >", value, "referrerId");
            return (Criteria) this;
        }

        public Criteria andReferrerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("referrer_id >=", value, "referrerId");
            return (Criteria) this;
        }

        public Criteria andReferrerIdLessThan(Integer value) {
            addCriterion("referrer_id <", value, "referrerId");
            return (Criteria) this;
        }

        public Criteria andReferrerIdLessThanOrEqualTo(Integer value) {
            addCriterion("referrer_id <=", value, "referrerId");
            return (Criteria) this;
        }

        public Criteria andReferrerIdIn(List<Integer> values) {
            addCriterion("referrer_id in", values, "referrerId");
            return (Criteria) this;
        }

        public Criteria andReferrerIdNotIn(List<Integer> values) {
            addCriterion("referrer_id not in", values, "referrerId");
            return (Criteria) this;
        }

        public Criteria andReferrerIdBetween(Integer value1, Integer value2) {
            addCriterion("referrer_id between", value1, value2, "referrerId");
            return (Criteria) this;
        }

        public Criteria andReferrerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("referrer_id not between", value1, value2, "referrerId");
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

        public Criteria andMarketPriceSumIsNull() {
            addCriterion("market_price_sum is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumIsNotNull() {
            addCriterion("market_price_sum is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumEqualTo(Long value) {
            addCriterion("market_price_sum =", value, "marketPriceSum");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumNotEqualTo(Long value) {
            addCriterion("market_price_sum <>", value, "marketPriceSum");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumGreaterThan(Long value) {
            addCriterion("market_price_sum >", value, "marketPriceSum");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumGreaterThanOrEqualTo(Long value) {
            addCriterion("market_price_sum >=", value, "marketPriceSum");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumLessThan(Long value) {
            addCriterion("market_price_sum <", value, "marketPriceSum");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumLessThanOrEqualTo(Long value) {
            addCriterion("market_price_sum <=", value, "marketPriceSum");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumIn(List<Long> values) {
            addCriterion("market_price_sum in", values, "marketPriceSum");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumNotIn(List<Long> values) {
            addCriterion("market_price_sum not in", values, "marketPriceSum");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumBetween(Long value1, Long value2) {
            addCriterion("market_price_sum between", value1, value2, "marketPriceSum");
            return (Criteria) this;
        }

        public Criteria andMarketPriceSumNotBetween(Long value1, Long value2) {
            addCriterion("market_price_sum not between", value1, value2, "marketPriceSum");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumIsNull() {
            addCriterion("user_price_sum is null");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumIsNotNull() {
            addCriterion("user_price_sum is not null");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumEqualTo(Long value) {
            addCriterion("user_price_sum =", value, "userPriceSum");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumNotEqualTo(Long value) {
            addCriterion("user_price_sum <>", value, "userPriceSum");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumGreaterThan(Long value) {
            addCriterion("user_price_sum >", value, "userPriceSum");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumGreaterThanOrEqualTo(Long value) {
            addCriterion("user_price_sum >=", value, "userPriceSum");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumLessThan(Long value) {
            addCriterion("user_price_sum <", value, "userPriceSum");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumLessThanOrEqualTo(Long value) {
            addCriterion("user_price_sum <=", value, "userPriceSum");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumIn(List<Long> values) {
            addCriterion("user_price_sum in", values, "userPriceSum");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumNotIn(List<Long> values) {
            addCriterion("user_price_sum not in", values, "userPriceSum");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumBetween(Long value1, Long value2) {
            addCriterion("user_price_sum between", value1, value2, "userPriceSum");
            return (Criteria) this;
        }

        public Criteria andUserPriceSumNotBetween(Long value1, Long value2) {
            addCriterion("user_price_sum not between", value1, value2, "userPriceSum");
            return (Criteria) this;
        }

        public Criteria andExpressPriceIsNull() {
            addCriterion("express_price is null");
            return (Criteria) this;
        }

        public Criteria andExpressPriceIsNotNull() {
            addCriterion("express_price is not null");
            return (Criteria) this;
        }

        public Criteria andExpressPriceEqualTo(Long value) {
            addCriterion("express_price =", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceNotEqualTo(Long value) {
            addCriterion("express_price <>", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceGreaterThan(Long value) {
            addCriterion("express_price >", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("express_price >=", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceLessThan(Long value) {
            addCriterion("express_price <", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceLessThanOrEqualTo(Long value) {
            addCriterion("express_price <=", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceIn(List<Long> values) {
            addCriterion("express_price in", values, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceNotIn(List<Long> values) {
            addCriterion("express_price not in", values, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceBetween(Long value1, Long value2) {
            addCriterion("express_price between", value1, value2, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceNotBetween(Long value1, Long value2) {
            addCriterion("express_price not between", value1, value2, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(Long value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(Long value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(Long value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(Long value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(Long value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<Long> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<Long> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(Long value1, Long value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(Long value1, Long value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Byte value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Byte value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Byte value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Byte value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Byte value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Byte> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Byte> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Byte value1, Byte value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Byte value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Byte value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Byte value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Byte value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Byte value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Byte> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Byte> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Byte value1, Byte value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Byte value1, Byte value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Integer value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Integer value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Integer value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Integer value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Integer> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Integer> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Integer value1, Integer value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayeeIdIsNull() {
            addCriterion("payee_id is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIdIsNotNull() {
            addCriterion("payee_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeIdEqualTo(String value) {
            addCriterion("payee_id =", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNotEqualTo(String value) {
            addCriterion("payee_id <>", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdGreaterThan(String value) {
            addCriterion("payee_id >", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("payee_id >=", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdLessThan(String value) {
            addCriterion("payee_id <", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdLessThanOrEqualTo(String value) {
            addCriterion("payee_id <=", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdLike(String value) {
            addCriterion("payee_id like", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNotLike(String value) {
            addCriterion("payee_id not like", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdIn(List<String> values) {
            addCriterion("payee_id in", values, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNotIn(List<String> values) {
            addCriterion("payee_id not in", values, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdBetween(String value1, String value2) {
            addCriterion("payee_id between", value1, value2, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNotBetween(String value1, String value2) {
            addCriterion("payee_id not between", value1, value2, "payeeId");
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