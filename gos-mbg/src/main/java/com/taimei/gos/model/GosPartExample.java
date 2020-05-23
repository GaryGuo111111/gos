package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class GosPartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GosPartExample() {
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

        public Criteria andGosPartIdIsNull() {
            addCriterion("gos_part_id is null");
            return (Criteria) this;
        }

        public Criteria andGosPartIdIsNotNull() {
            addCriterion("gos_part_id is not null");
            return (Criteria) this;
        }

        public Criteria andGosPartIdEqualTo(Integer value) {
            addCriterion("gos_part_id =", value, "gosPartId");
            return (Criteria) this;
        }

        public Criteria andGosPartIdNotEqualTo(Integer value) {
            addCriterion("gos_part_id <>", value, "gosPartId");
            return (Criteria) this;
        }

        public Criteria andGosPartIdGreaterThan(Integer value) {
            addCriterion("gos_part_id >", value, "gosPartId");
            return (Criteria) this;
        }

        public Criteria andGosPartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gos_part_id >=", value, "gosPartId");
            return (Criteria) this;
        }

        public Criteria andGosPartIdLessThan(Integer value) {
            addCriterion("gos_part_id <", value, "gosPartId");
            return (Criteria) this;
        }

        public Criteria andGosPartIdLessThanOrEqualTo(Integer value) {
            addCriterion("gos_part_id <=", value, "gosPartId");
            return (Criteria) this;
        }

        public Criteria andGosPartIdIn(List<Integer> values) {
            addCriterion("gos_part_id in", values, "gosPartId");
            return (Criteria) this;
        }

        public Criteria andGosPartIdNotIn(List<Integer> values) {
            addCriterion("gos_part_id not in", values, "gosPartId");
            return (Criteria) this;
        }

        public Criteria andGosPartIdBetween(Integer value1, Integer value2) {
            addCriterion("gos_part_id between", value1, value2, "gosPartId");
            return (Criteria) this;
        }

        public Criteria andGosPartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gos_part_id not between", value1, value2, "gosPartId");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdIsNull() {
            addCriterion("gos_assemble_id is null");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdIsNotNull() {
            addCriterion("gos_assemble_id is not null");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdEqualTo(Integer value) {
            addCriterion("gos_assemble_id =", value, "gosAssembleId");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdNotEqualTo(Integer value) {
            addCriterion("gos_assemble_id <>", value, "gosAssembleId");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdGreaterThan(Integer value) {
            addCriterion("gos_assemble_id >", value, "gosAssembleId");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gos_assemble_id >=", value, "gosAssembleId");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdLessThan(Integer value) {
            addCriterion("gos_assemble_id <", value, "gosAssembleId");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdLessThanOrEqualTo(Integer value) {
            addCriterion("gos_assemble_id <=", value, "gosAssembleId");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdIn(List<Integer> values) {
            addCriterion("gos_assemble_id in", values, "gosAssembleId");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdNotIn(List<Integer> values) {
            addCriterion("gos_assemble_id not in", values, "gosAssembleId");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdBetween(Integer value1, Integer value2) {
            addCriterion("gos_assemble_id between", value1, value2, "gosAssembleId");
            return (Criteria) this;
        }

        public Criteria andGosAssembleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gos_assemble_id not between", value1, value2, "gosAssembleId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdIsNull() {
            addCriterion("order_goods_profit_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdIsNotNull() {
            addCriterion("order_goods_profit_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdEqualTo(Integer value) {
            addCriterion("order_goods_profit_id =", value, "orderGoodsProfitId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdNotEqualTo(Integer value) {
            addCriterion("order_goods_profit_id <>", value, "orderGoodsProfitId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdGreaterThan(Integer value) {
            addCriterion("order_goods_profit_id >", value, "orderGoodsProfitId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_goods_profit_id >=", value, "orderGoodsProfitId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdLessThan(Integer value) {
            addCriterion("order_goods_profit_id <", value, "orderGoodsProfitId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_goods_profit_id <=", value, "orderGoodsProfitId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdIn(List<Integer> values) {
            addCriterion("order_goods_profit_id in", values, "orderGoodsProfitId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdNotIn(List<Integer> values) {
            addCriterion("order_goods_profit_id not in", values, "orderGoodsProfitId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_profit_id between", value1, value2, "orderGoodsProfitId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsProfitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_profit_id not between", value1, value2, "orderGoodsProfitId");
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

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andIsDirectIsNull() {
            addCriterion("is_direct is null");
            return (Criteria) this;
        }

        public Criteria andIsDirectIsNotNull() {
            addCriterion("is_direct is not null");
            return (Criteria) this;
        }

        public Criteria andIsDirectEqualTo(Boolean value) {
            addCriterion("is_direct =", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectNotEqualTo(Boolean value) {
            addCriterion("is_direct <>", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectGreaterThan(Boolean value) {
            addCriterion("is_direct >", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_direct >=", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectLessThan(Boolean value) {
            addCriterion("is_direct <", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectLessThanOrEqualTo(Boolean value) {
            addCriterion("is_direct <=", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectIn(List<Boolean> values) {
            addCriterion("is_direct in", values, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectNotIn(List<Boolean> values) {
            addCriterion("is_direct not in", values, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectBetween(Boolean value1, Boolean value2) {
            addCriterion("is_direct between", value1, value2, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_direct not between", value1, value2, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNull() {
            addCriterion("is_finish is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNotNull() {
            addCriterion("is_finish is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishEqualTo(Integer value) {
            addCriterion("is_finish =", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotEqualTo(Integer value) {
            addCriterion("is_finish <>", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThan(Integer value) {
            addCriterion("is_finish >", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_finish >=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThan(Integer value) {
            addCriterion("is_finish <", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThanOrEqualTo(Integer value) {
            addCriterion("is_finish <=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishIn(List<Integer> values) {
            addCriterion("is_finish in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotIn(List<Integer> values) {
            addCriterion("is_finish not in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishBetween(Integer value1, Integer value2) {
            addCriterion("is_finish between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotBetween(Integer value1, Integer value2) {
            addCriterion("is_finish not between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(Long value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(Long value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(Long value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(Long value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(Long value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(Long value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<Long> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<Long> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(Long value1, Long value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(Long value1, Long value2) {
            addCriterion("profit not between", value1, value2, "profit");
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