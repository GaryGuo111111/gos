package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class RulesUserLevelLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RulesUserLevelLogExample() {
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

        public Criteria andUpLevelLogIdIsNull() {
            addCriterion("up_level_log_id is null");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdIsNotNull() {
            addCriterion("up_level_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdEqualTo(Integer value) {
            addCriterion("up_level_log_id =", value, "upLevelLogId");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdNotEqualTo(Integer value) {
            addCriterion("up_level_log_id <>", value, "upLevelLogId");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdGreaterThan(Integer value) {
            addCriterion("up_level_log_id >", value, "upLevelLogId");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_level_log_id >=", value, "upLevelLogId");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdLessThan(Integer value) {
            addCriterion("up_level_log_id <", value, "upLevelLogId");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("up_level_log_id <=", value, "upLevelLogId");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdIn(List<Integer> values) {
            addCriterion("up_level_log_id in", values, "upLevelLogId");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdNotIn(List<Integer> values) {
            addCriterion("up_level_log_id not in", values, "upLevelLogId");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdBetween(Integer value1, Integer value2) {
            addCriterion("up_level_log_id between", value1, value2, "upLevelLogId");
            return (Criteria) this;
        }

        public Criteria andUpLevelLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("up_level_log_id not between", value1, value2, "upLevelLogId");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelIsNull() {
            addCriterion("before_level is null");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelIsNotNull() {
            addCriterion("before_level is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelEqualTo(Integer value) {
            addCriterion("before_level =", value, "beforeLevel");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelNotEqualTo(Integer value) {
            addCriterion("before_level <>", value, "beforeLevel");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelGreaterThan(Integer value) {
            addCriterion("before_level >", value, "beforeLevel");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("before_level >=", value, "beforeLevel");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelLessThan(Integer value) {
            addCriterion("before_level <", value, "beforeLevel");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("before_level <=", value, "beforeLevel");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelIn(List<Integer> values) {
            addCriterion("before_level in", values, "beforeLevel");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelNotIn(List<Integer> values) {
            addCriterion("before_level not in", values, "beforeLevel");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelBetween(Integer value1, Integer value2) {
            addCriterion("before_level between", value1, value2, "beforeLevel");
            return (Criteria) this;
        }

        public Criteria andBeforeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("before_level not between", value1, value2, "beforeLevel");
            return (Criteria) this;
        }

        public Criteria andAfterLevelIsNull() {
            addCriterion("after_level is null");
            return (Criteria) this;
        }

        public Criteria andAfterLevelIsNotNull() {
            addCriterion("after_level is not null");
            return (Criteria) this;
        }

        public Criteria andAfterLevelEqualTo(Integer value) {
            addCriterion("after_level =", value, "afterLevel");
            return (Criteria) this;
        }

        public Criteria andAfterLevelNotEqualTo(Integer value) {
            addCriterion("after_level <>", value, "afterLevel");
            return (Criteria) this;
        }

        public Criteria andAfterLevelGreaterThan(Integer value) {
            addCriterion("after_level >", value, "afterLevel");
            return (Criteria) this;
        }

        public Criteria andAfterLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("after_level >=", value, "afterLevel");
            return (Criteria) this;
        }

        public Criteria andAfterLevelLessThan(Integer value) {
            addCriterion("after_level <", value, "afterLevel");
            return (Criteria) this;
        }

        public Criteria andAfterLevelLessThanOrEqualTo(Integer value) {
            addCriterion("after_level <=", value, "afterLevel");
            return (Criteria) this;
        }

        public Criteria andAfterLevelIn(List<Integer> values) {
            addCriterion("after_level in", values, "afterLevel");
            return (Criteria) this;
        }

        public Criteria andAfterLevelNotIn(List<Integer> values) {
            addCriterion("after_level not in", values, "afterLevel");
            return (Criteria) this;
        }

        public Criteria andAfterLevelBetween(Integer value1, Integer value2) {
            addCriterion("after_level between", value1, value2, "afterLevel");
            return (Criteria) this;
        }

        public Criteria andAfterLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("after_level not between", value1, value2, "afterLevel");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIsNull() {
            addCriterion("level_type is null");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIsNotNull() {
            addCriterion("level_type is not null");
            return (Criteria) this;
        }

        public Criteria andLevelTypeEqualTo(Byte value) {
            addCriterion("level_type =", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotEqualTo(Byte value) {
            addCriterion("level_type <>", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeGreaterThan(Byte value) {
            addCriterion("level_type >", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("level_type >=", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLessThan(Byte value) {
            addCriterion("level_type <", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLessThanOrEqualTo(Byte value) {
            addCriterion("level_type <=", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIn(List<Byte> values) {
            addCriterion("level_type in", values, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotIn(List<Byte> values) {
            addCriterion("level_type not in", values, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeBetween(Byte value1, Byte value2) {
            addCriterion("level_type between", value1, value2, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("level_type not between", value1, value2, "levelType");
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