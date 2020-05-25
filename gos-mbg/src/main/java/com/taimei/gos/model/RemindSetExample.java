package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class RemindSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RemindSetExample() {
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

        public Criteria andRemindSetIdIsNull() {
            addCriterion("remind_set_id is null");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdIsNotNull() {
            addCriterion("remind_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdEqualTo(Integer value) {
            addCriterion("remind_set_id =", value, "remindSetId");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdNotEqualTo(Integer value) {
            addCriterion("remind_set_id <>", value, "remindSetId");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdGreaterThan(Integer value) {
            addCriterion("remind_set_id >", value, "remindSetId");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("remind_set_id >=", value, "remindSetId");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdLessThan(Integer value) {
            addCriterion("remind_set_id <", value, "remindSetId");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdLessThanOrEqualTo(Integer value) {
            addCriterion("remind_set_id <=", value, "remindSetId");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdIn(List<Integer> values) {
            addCriterion("remind_set_id in", values, "remindSetId");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdNotIn(List<Integer> values) {
            addCriterion("remind_set_id not in", values, "remindSetId");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdBetween(Integer value1, Integer value2) {
            addCriterion("remind_set_id between", value1, value2, "remindSetId");
            return (Criteria) this;
        }

        public Criteria andRemindSetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("remind_set_id not between", value1, value2, "remindSetId");
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

        public Criteria andIsRemindIsNull() {
            addCriterion("is_remind is null");
            return (Criteria) this;
        }

        public Criteria andIsRemindIsNotNull() {
            addCriterion("is_remind is not null");
            return (Criteria) this;
        }

        public Criteria andIsRemindEqualTo(Byte value) {
            addCriterion("is_remind =", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindNotEqualTo(Byte value) {
            addCriterion("is_remind <>", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindGreaterThan(Byte value) {
            addCriterion("is_remind >", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_remind >=", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindLessThan(Byte value) {
            addCriterion("is_remind <", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindLessThanOrEqualTo(Byte value) {
            addCriterion("is_remind <=", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindIn(List<Byte> values) {
            addCriterion("is_remind in", values, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindNotIn(List<Byte> values) {
            addCriterion("is_remind not in", values, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindBetween(Byte value1, Byte value2) {
            addCriterion("is_remind between", value1, value2, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindNotBetween(Byte value1, Byte value2) {
            addCriterion("is_remind not between", value1, value2, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIntervalMinIsNull() {
            addCriterion("interval_min is null");
            return (Criteria) this;
        }

        public Criteria andIntervalMinIsNotNull() {
            addCriterion("interval_min is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalMinEqualTo(Integer value) {
            addCriterion("interval_min =", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinNotEqualTo(Integer value) {
            addCriterion("interval_min <>", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinGreaterThan(Integer value) {
            addCriterion("interval_min >", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("interval_min >=", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinLessThan(Integer value) {
            addCriterion("interval_min <", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinLessThanOrEqualTo(Integer value) {
            addCriterion("interval_min <=", value, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinIn(List<Integer> values) {
            addCriterion("interval_min in", values, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinNotIn(List<Integer> values) {
            addCriterion("interval_min not in", values, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinBetween(Integer value1, Integer value2) {
            addCriterion("interval_min between", value1, value2, "intervalMin");
            return (Criteria) this;
        }

        public Criteria andIntervalMinNotBetween(Integer value1, Integer value2) {
            addCriterion("interval_min not between", value1, value2, "intervalMin");
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