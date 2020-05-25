package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class ProfitTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfitTemplateExample() {
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

        public Criteria andProfitTypeIsNull() {
            addCriterion("profit_type is null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNotNull() {
            addCriterion("profit_type is not null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeEqualTo(Integer value) {
            addCriterion("profit_type =", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotEqualTo(Integer value) {
            addCriterion("profit_type <>", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThan(Integer value) {
            addCriterion("profit_type >", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("profit_type >=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThan(Integer value) {
            addCriterion("profit_type <", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("profit_type <=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIn(List<Integer> values) {
            addCriterion("profit_type in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotIn(List<Integer> values) {
            addCriterion("profit_type not in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeBetween(Integer value1, Integer value2) {
            addCriterion("profit_type between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("profit_type not between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andL0IsNull() {
            addCriterion("L0 is null");
            return (Criteria) this;
        }

        public Criteria andL0IsNotNull() {
            addCriterion("L0 is not null");
            return (Criteria) this;
        }

        public Criteria andL0EqualTo(Integer value) {
            addCriterion("L0 =", value, "l0");
            return (Criteria) this;
        }

        public Criteria andL0NotEqualTo(Integer value) {
            addCriterion("L0 <>", value, "l0");
            return (Criteria) this;
        }

        public Criteria andL0GreaterThan(Integer value) {
            addCriterion("L0 >", value, "l0");
            return (Criteria) this;
        }

        public Criteria andL0GreaterThanOrEqualTo(Integer value) {
            addCriterion("L0 >=", value, "l0");
            return (Criteria) this;
        }

        public Criteria andL0LessThan(Integer value) {
            addCriterion("L0 <", value, "l0");
            return (Criteria) this;
        }

        public Criteria andL0LessThanOrEqualTo(Integer value) {
            addCriterion("L0 <=", value, "l0");
            return (Criteria) this;
        }

        public Criteria andL0In(List<Integer> values) {
            addCriterion("L0 in", values, "l0");
            return (Criteria) this;
        }

        public Criteria andL0NotIn(List<Integer> values) {
            addCriterion("L0 not in", values, "l0");
            return (Criteria) this;
        }

        public Criteria andL0Between(Integer value1, Integer value2) {
            addCriterion("L0 between", value1, value2, "l0");
            return (Criteria) this;
        }

        public Criteria andL0NotBetween(Integer value1, Integer value2) {
            addCriterion("L0 not between", value1, value2, "l0");
            return (Criteria) this;
        }

        public Criteria andL1IsNull() {
            addCriterion("L1 is null");
            return (Criteria) this;
        }

        public Criteria andL1IsNotNull() {
            addCriterion("L1 is not null");
            return (Criteria) this;
        }

        public Criteria andL1EqualTo(Integer value) {
            addCriterion("L1 =", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1NotEqualTo(Integer value) {
            addCriterion("L1 <>", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1GreaterThan(Integer value) {
            addCriterion("L1 >", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1GreaterThanOrEqualTo(Integer value) {
            addCriterion("L1 >=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1LessThan(Integer value) {
            addCriterion("L1 <", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1LessThanOrEqualTo(Integer value) {
            addCriterion("L1 <=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1In(List<Integer> values) {
            addCriterion("L1 in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andL1NotIn(List<Integer> values) {
            addCriterion("L1 not in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andL1Between(Integer value1, Integer value2) {
            addCriterion("L1 between", value1, value2, "l1");
            return (Criteria) this;
        }

        public Criteria andL1NotBetween(Integer value1, Integer value2) {
            addCriterion("L1 not between", value1, value2, "l1");
            return (Criteria) this;
        }

        public Criteria andL2IsNull() {
            addCriterion("L2 is null");
            return (Criteria) this;
        }

        public Criteria andL2IsNotNull() {
            addCriterion("L2 is not null");
            return (Criteria) this;
        }

        public Criteria andL2EqualTo(Integer value) {
            addCriterion("L2 =", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2NotEqualTo(Integer value) {
            addCriterion("L2 <>", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2GreaterThan(Integer value) {
            addCriterion("L2 >", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2GreaterThanOrEqualTo(Integer value) {
            addCriterion("L2 >=", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2LessThan(Integer value) {
            addCriterion("L2 <", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2LessThanOrEqualTo(Integer value) {
            addCriterion("L2 <=", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2In(List<Integer> values) {
            addCriterion("L2 in", values, "l2");
            return (Criteria) this;
        }

        public Criteria andL2NotIn(List<Integer> values) {
            addCriterion("L2 not in", values, "l2");
            return (Criteria) this;
        }

        public Criteria andL2Between(Integer value1, Integer value2) {
            addCriterion("L2 between", value1, value2, "l2");
            return (Criteria) this;
        }

        public Criteria andL2NotBetween(Integer value1, Integer value2) {
            addCriterion("L2 not between", value1, value2, "l2");
            return (Criteria) this;
        }

        public Criteria andL3IsNull() {
            addCriterion("L3 is null");
            return (Criteria) this;
        }

        public Criteria andL3IsNotNull() {
            addCriterion("L3 is not null");
            return (Criteria) this;
        }

        public Criteria andL3EqualTo(Integer value) {
            addCriterion("L3 =", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3NotEqualTo(Integer value) {
            addCriterion("L3 <>", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3GreaterThan(Integer value) {
            addCriterion("L3 >", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3GreaterThanOrEqualTo(Integer value) {
            addCriterion("L3 >=", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3LessThan(Integer value) {
            addCriterion("L3 <", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3LessThanOrEqualTo(Integer value) {
            addCriterion("L3 <=", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3In(List<Integer> values) {
            addCriterion("L3 in", values, "l3");
            return (Criteria) this;
        }

        public Criteria andL3NotIn(List<Integer> values) {
            addCriterion("L3 not in", values, "l3");
            return (Criteria) this;
        }

        public Criteria andL3Between(Integer value1, Integer value2) {
            addCriterion("L3 between", value1, value2, "l3");
            return (Criteria) this;
        }

        public Criteria andL3NotBetween(Integer value1, Integer value2) {
            addCriterion("L3 not between", value1, value2, "l3");
            return (Criteria) this;
        }

        public Criteria andL33IsNull() {
            addCriterion("L3_3 is null");
            return (Criteria) this;
        }

        public Criteria andL33IsNotNull() {
            addCriterion("L3_3 is not null");
            return (Criteria) this;
        }

        public Criteria andL33EqualTo(Integer value) {
            addCriterion("L3_3 =", value, "l33");
            return (Criteria) this;
        }

        public Criteria andL33NotEqualTo(Integer value) {
            addCriterion("L3_3 <>", value, "l33");
            return (Criteria) this;
        }

        public Criteria andL33GreaterThan(Integer value) {
            addCriterion("L3_3 >", value, "l33");
            return (Criteria) this;
        }

        public Criteria andL33GreaterThanOrEqualTo(Integer value) {
            addCriterion("L3_3 >=", value, "l33");
            return (Criteria) this;
        }

        public Criteria andL33LessThan(Integer value) {
            addCriterion("L3_3 <", value, "l33");
            return (Criteria) this;
        }

        public Criteria andL33LessThanOrEqualTo(Integer value) {
            addCriterion("L3_3 <=", value, "l33");
            return (Criteria) this;
        }

        public Criteria andL33In(List<Integer> values) {
            addCriterion("L3_3 in", values, "l33");
            return (Criteria) this;
        }

        public Criteria andL33NotIn(List<Integer> values) {
            addCriterion("L3_3 not in", values, "l33");
            return (Criteria) this;
        }

        public Criteria andL33Between(Integer value1, Integer value2) {
            addCriterion("L3_3 between", value1, value2, "l33");
            return (Criteria) this;
        }

        public Criteria andL33NotBetween(Integer value1, Integer value2) {
            addCriterion("L3_3 not between", value1, value2, "l33");
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