package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class SpecificRemindSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecificRemindSetExample() {
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

        public Criteria andSpecificRemindSetIdIsNull() {
            addCriterion("specific_remind_set_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdIsNotNull() {
            addCriterion("specific_remind_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdEqualTo(Integer value) {
            addCriterion("specific_remind_set_id =", value, "specificRemindSetId");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdNotEqualTo(Integer value) {
            addCriterion("specific_remind_set_id <>", value, "specificRemindSetId");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdGreaterThan(Integer value) {
            addCriterion("specific_remind_set_id >", value, "specificRemindSetId");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("specific_remind_set_id >=", value, "specificRemindSetId");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdLessThan(Integer value) {
            addCriterion("specific_remind_set_id <", value, "specificRemindSetId");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdLessThanOrEqualTo(Integer value) {
            addCriterion("specific_remind_set_id <=", value, "specificRemindSetId");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdIn(List<Integer> values) {
            addCriterion("specific_remind_set_id in", values, "specificRemindSetId");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdNotIn(List<Integer> values) {
            addCriterion("specific_remind_set_id not in", values, "specificRemindSetId");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdBetween(Integer value1, Integer value2) {
            addCriterion("specific_remind_set_id between", value1, value2, "specificRemindSetId");
            return (Criteria) this;
        }

        public Criteria andSpecificRemindSetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("specific_remind_set_id not between", value1, value2, "specificRemindSetId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(String value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(String value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(String value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(String value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(String value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(String value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLike(String value) {
            addCriterion("bid like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotLike(String value) {
            addCriterion("bid not like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<String> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<String> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(String value1, String value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(String value1, String value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andRemindTypeIsNull() {
            addCriterion("remind_type is null");
            return (Criteria) this;
        }

        public Criteria andRemindTypeIsNotNull() {
            addCriterion("remind_type is not null");
            return (Criteria) this;
        }

        public Criteria andRemindTypeEqualTo(Long value) {
            addCriterion("remind_type =", value, "remindType");
            return (Criteria) this;
        }

        public Criteria andRemindTypeNotEqualTo(Long value) {
            addCriterion("remind_type <>", value, "remindType");
            return (Criteria) this;
        }

        public Criteria andRemindTypeGreaterThan(Long value) {
            addCriterion("remind_type >", value, "remindType");
            return (Criteria) this;
        }

        public Criteria andRemindTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("remind_type >=", value, "remindType");
            return (Criteria) this;
        }

        public Criteria andRemindTypeLessThan(Long value) {
            addCriterion("remind_type <", value, "remindType");
            return (Criteria) this;
        }

        public Criteria andRemindTypeLessThanOrEqualTo(Long value) {
            addCriterion("remind_type <=", value, "remindType");
            return (Criteria) this;
        }

        public Criteria andRemindTypeIn(List<Long> values) {
            addCriterion("remind_type in", values, "remindType");
            return (Criteria) this;
        }

        public Criteria andRemindTypeNotIn(List<Long> values) {
            addCriterion("remind_type not in", values, "remindType");
            return (Criteria) this;
        }

        public Criteria andRemindTypeBetween(Long value1, Long value2) {
            addCriterion("remind_type between", value1, value2, "remindType");
            return (Criteria) this;
        }

        public Criteria andRemindTypeNotBetween(Long value1, Long value2) {
            addCriterion("remind_type not between", value1, value2, "remindType");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeIsNull() {
            addCriterion("last_remind_time is null");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeIsNotNull() {
            addCriterion("last_remind_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeEqualTo(Integer value) {
            addCriterion("last_remind_time =", value, "lastRemindTime");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeNotEqualTo(Integer value) {
            addCriterion("last_remind_time <>", value, "lastRemindTime");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeGreaterThan(Integer value) {
            addCriterion("last_remind_time >", value, "lastRemindTime");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_remind_time >=", value, "lastRemindTime");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeLessThan(Integer value) {
            addCriterion("last_remind_time <", value, "lastRemindTime");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_remind_time <=", value, "lastRemindTime");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeIn(List<Integer> values) {
            addCriterion("last_remind_time in", values, "lastRemindTime");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeNotIn(List<Integer> values) {
            addCriterion("last_remind_time not in", values, "lastRemindTime");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_remind_time between", value1, value2, "lastRemindTime");
            return (Criteria) this;
        }

        public Criteria andLastRemindTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_remind_time not between", value1, value2, "lastRemindTime");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesIsNull() {
            addCriterion("trigger_rules is null");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesIsNotNull() {
            addCriterion("trigger_rules is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesEqualTo(String value) {
            addCriterion("trigger_rules =", value, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesNotEqualTo(String value) {
            addCriterion("trigger_rules <>", value, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesGreaterThan(String value) {
            addCriterion("trigger_rules >", value, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesGreaterThanOrEqualTo(String value) {
            addCriterion("trigger_rules >=", value, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesLessThan(String value) {
            addCriterion("trigger_rules <", value, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesLessThanOrEqualTo(String value) {
            addCriterion("trigger_rules <=", value, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesLike(String value) {
            addCriterion("trigger_rules like", value, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesNotLike(String value) {
            addCriterion("trigger_rules not like", value, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesIn(List<String> values) {
            addCriterion("trigger_rules in", values, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesNotIn(List<String> values) {
            addCriterion("trigger_rules not in", values, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesBetween(String value1, String value2) {
            addCriterion("trigger_rules between", value1, value2, "triggerRules");
            return (Criteria) this;
        }

        public Criteria andTriggerRulesNotBetween(String value1, String value2) {
            addCriterion("trigger_rules not between", value1, value2, "triggerRules");
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