package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class BonusPoolSettlementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BonusPoolSettlementExample() {
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

        public Criteria andBonusPoolSettlementIdIsNull() {
            addCriterion("bonus_pool_settlement_id is null");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdIsNotNull() {
            addCriterion("bonus_pool_settlement_id is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdEqualTo(Integer value) {
            addCriterion("bonus_pool_settlement_id =", value, "bonusPoolSettlementId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdNotEqualTo(Integer value) {
            addCriterion("bonus_pool_settlement_id <>", value, "bonusPoolSettlementId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdGreaterThan(Integer value) {
            addCriterion("bonus_pool_settlement_id >", value, "bonusPoolSettlementId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus_pool_settlement_id >=", value, "bonusPoolSettlementId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdLessThan(Integer value) {
            addCriterion("bonus_pool_settlement_id <", value, "bonusPoolSettlementId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdLessThanOrEqualTo(Integer value) {
            addCriterion("bonus_pool_settlement_id <=", value, "bonusPoolSettlementId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdIn(List<Integer> values) {
            addCriterion("bonus_pool_settlement_id in", values, "bonusPoolSettlementId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdNotIn(List<Integer> values) {
            addCriterion("bonus_pool_settlement_id not in", values, "bonusPoolSettlementId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdBetween(Integer value1, Integer value2) {
            addCriterion("bonus_pool_settlement_id between", value1, value2, "bonusPoolSettlementId");
            return (Criteria) this;
        }

        public Criteria andBonusPoolSettlementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus_pool_settlement_id not between", value1, value2, "bonusPoolSettlementId");
            return (Criteria) this;
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

        public Criteria andAssembleAmountIsNull() {
            addCriterion("assemble_amount is null");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountIsNotNull() {
            addCriterion("assemble_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountEqualTo(Integer value) {
            addCriterion("assemble_amount =", value, "assembleAmount");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountNotEqualTo(Integer value) {
            addCriterion("assemble_amount <>", value, "assembleAmount");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountGreaterThan(Integer value) {
            addCriterion("assemble_amount >", value, "assembleAmount");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("assemble_amount >=", value, "assembleAmount");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountLessThan(Integer value) {
            addCriterion("assemble_amount <", value, "assembleAmount");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountLessThanOrEqualTo(Integer value) {
            addCriterion("assemble_amount <=", value, "assembleAmount");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountIn(List<Integer> values) {
            addCriterion("assemble_amount in", values, "assembleAmount");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountNotIn(List<Integer> values) {
            addCriterion("assemble_amount not in", values, "assembleAmount");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountBetween(Integer value1, Integer value2) {
            addCriterion("assemble_amount between", value1, value2, "assembleAmount");
            return (Criteria) this;
        }

        public Criteria andAssembleAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("assemble_amount not between", value1, value2, "assembleAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountIsNull() {
            addCriterion("bonus_amount is null");
            return (Criteria) this;
        }

        public Criteria andBonusAmountIsNotNull() {
            addCriterion("bonus_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBonusAmountEqualTo(Long value) {
            addCriterion("bonus_amount =", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountNotEqualTo(Long value) {
            addCriterion("bonus_amount <>", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountGreaterThan(Long value) {
            addCriterion("bonus_amount >", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("bonus_amount >=", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountLessThan(Long value) {
            addCriterion("bonus_amount <", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountLessThanOrEqualTo(Long value) {
            addCriterion("bonus_amount <=", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountIn(List<Long> values) {
            addCriterion("bonus_amount in", values, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountNotIn(List<Long> values) {
            addCriterion("bonus_amount not in", values, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountBetween(Long value1, Long value2) {
            addCriterion("bonus_amount between", value1, value2, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountNotBetween(Long value1, Long value2) {
            addCriterion("bonus_amount not between", value1, value2, "bonusAmount");
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