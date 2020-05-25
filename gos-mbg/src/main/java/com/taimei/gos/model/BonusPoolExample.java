package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class BonusPoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BonusPoolExample() {
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

        public Criteria andBonusPoolIdIsNull() {
            addCriterion("bonus_pool_id is null");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdIsNotNull() {
            addCriterion("bonus_pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdEqualTo(Integer value) {
            addCriterion("bonus_pool_id =", value, "bonusPoolId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdNotEqualTo(Integer value) {
            addCriterion("bonus_pool_id <>", value, "bonusPoolId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdGreaterThan(Integer value) {
            addCriterion("bonus_pool_id >", value, "bonusPoolId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus_pool_id >=", value, "bonusPoolId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdLessThan(Integer value) {
            addCriterion("bonus_pool_id <", value, "bonusPoolId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("bonus_pool_id <=", value, "bonusPoolId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdIn(List<Integer> values) {
            addCriterion("bonus_pool_id in", values, "bonusPoolId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdNotIn(List<Integer> values) {
            addCriterion("bonus_pool_id not in", values, "bonusPoolId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdBetween(Integer value1, Integer value2) {
            addCriterion("bonus_pool_id between", value1, value2, "bonusPoolId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus_pool_id not between", value1, value2, "bonusPoolId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountIsNull() {
            addCriterion("bonus_pool_amount is null");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountIsNotNull() {
            addCriterion("bonus_pool_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountEqualTo(Long value) {
            addCriterion("bonus_pool_amount =", value, "bonusPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountNotEqualTo(Long value) {
            addCriterion("bonus_pool_amount <>", value, "bonusPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountGreaterThan(Long value) {
            addCriterion("bonus_pool_amount >", value, "bonusPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("bonus_pool_amount >=", value, "bonusPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountLessThan(Long value) {
            addCriterion("bonus_pool_amount <", value, "bonusPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountLessThanOrEqualTo(Long value) {
            addCriterion("bonus_pool_amount <=", value, "bonusPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountIn(List<Long> values) {
            addCriterion("bonus_pool_amount in", values, "bonusPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountNotIn(List<Long> values) {
            addCriterion("bonus_pool_amount not in", values, "bonusPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountBetween(Long value1, Long value2) {
            addCriterion("bonus_pool_amount between", value1, value2, "bonusPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBonusPoolAmountNotBetween(Long value1, Long value2) {
            addCriterion("bonus_pool_amount not between", value1, value2, "bonusPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeIsNull() {
            addCriterion("bonus_pool_start_time is null");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeIsNotNull() {
            addCriterion("bonus_pool_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeEqualTo(Long value) {
            addCriterion("bonus_pool_start_time =", value, "bonusPoolStartTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeNotEqualTo(Long value) {
            addCriterion("bonus_pool_start_time <>", value, "bonusPoolStartTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeGreaterThan(Long value) {
            addCriterion("bonus_pool_start_time >", value, "bonusPoolStartTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("bonus_pool_start_time >=", value, "bonusPoolStartTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeLessThan(Long value) {
            addCriterion("bonus_pool_start_time <", value, "bonusPoolStartTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("bonus_pool_start_time <=", value, "bonusPoolStartTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeIn(List<Long> values) {
            addCriterion("bonus_pool_start_time in", values, "bonusPoolStartTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeNotIn(List<Long> values) {
            addCriterion("bonus_pool_start_time not in", values, "bonusPoolStartTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeBetween(Long value1, Long value2) {
            addCriterion("bonus_pool_start_time between", value1, value2, "bonusPoolStartTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("bonus_pool_start_time not between", value1, value2, "bonusPoolStartTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeIsNull() {
            addCriterion("bonus_pool_end_time is null");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeIsNotNull() {
            addCriterion("bonus_pool_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeEqualTo(Long value) {
            addCriterion("bonus_pool_end_time =", value, "bonusPoolEndTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeNotEqualTo(Long value) {
            addCriterion("bonus_pool_end_time <>", value, "bonusPoolEndTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeGreaterThan(Long value) {
            addCriterion("bonus_pool_end_time >", value, "bonusPoolEndTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("bonus_pool_end_time >=", value, "bonusPoolEndTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeLessThan(Long value) {
            addCriterion("bonus_pool_end_time <", value, "bonusPoolEndTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("bonus_pool_end_time <=", value, "bonusPoolEndTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeIn(List<Long> values) {
            addCriterion("bonus_pool_end_time in", values, "bonusPoolEndTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeNotIn(List<Long> values) {
            addCriterion("bonus_pool_end_time not in", values, "bonusPoolEndTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeBetween(Long value1, Long value2) {
            addCriterion("bonus_pool_end_time between", value1, value2, "bonusPoolEndTime");
            return (Criteria) this;
        }

        public Criteria andBonusPoolEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("bonus_pool_end_time not between", value1, value2, "bonusPoolEndTime");
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