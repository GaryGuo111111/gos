package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class RulesGoodsBuyLevelPriceDifferencesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RulesGoodsBuyLevelPriceDifferencesExample() {
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

        public Criteria andLevelPriceIdIsNull() {
            addCriterion("level_price_id is null");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdIsNotNull() {
            addCriterion("level_price_id is not null");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdEqualTo(Integer value) {
            addCriterion("level_price_id =", value, "levelPriceId");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdNotEqualTo(Integer value) {
            addCriterion("level_price_id <>", value, "levelPriceId");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdGreaterThan(Integer value) {
            addCriterion("level_price_id >", value, "levelPriceId");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_price_id >=", value, "levelPriceId");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdLessThan(Integer value) {
            addCriterion("level_price_id <", value, "levelPriceId");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdLessThanOrEqualTo(Integer value) {
            addCriterion("level_price_id <=", value, "levelPriceId");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdIn(List<Integer> values) {
            addCriterion("level_price_id in", values, "levelPriceId");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdNotIn(List<Integer> values) {
            addCriterion("level_price_id not in", values, "levelPriceId");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdBetween(Integer value1, Integer value2) {
            addCriterion("level_price_id between", value1, value2, "levelPriceId");
            return (Criteria) this;
        }

        public Criteria andLevelPriceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("level_price_id not between", value1, value2, "levelPriceId");
            return (Criteria) this;
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

        public Criteria andUserPriceIsNull() {
            addCriterion("user_price is null");
            return (Criteria) this;
        }

        public Criteria andUserPriceIsNotNull() {
            addCriterion("user_price is not null");
            return (Criteria) this;
        }

        public Criteria andUserPriceEqualTo(Long value) {
            addCriterion("user_price =", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceNotEqualTo(Long value) {
            addCriterion("user_price <>", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceGreaterThan(Long value) {
            addCriterion("user_price >", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("user_price >=", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceLessThan(Long value) {
            addCriterion("user_price <", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceLessThanOrEqualTo(Long value) {
            addCriterion("user_price <=", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceIn(List<Long> values) {
            addCriterion("user_price in", values, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceNotIn(List<Long> values) {
            addCriterion("user_price not in", values, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceBetween(Long value1, Long value2) {
            addCriterion("user_price between", value1, value2, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceNotBetween(Long value1, Long value2) {
            addCriterion("user_price not between", value1, value2, "userPrice");
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