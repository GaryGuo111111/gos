package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class UserWalletExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserWalletExample() {
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

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Long value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Long value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Long value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Long value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Long value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Long> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Long> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Long value1, Long value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Long value1, Long value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawIsNull() {
            addCriterion("non_withdraw is null");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawIsNotNull() {
            addCriterion("non_withdraw is not null");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawEqualTo(Long value) {
            addCriterion("non_withdraw =", value, "nonWithdraw");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawNotEqualTo(Long value) {
            addCriterion("non_withdraw <>", value, "nonWithdraw");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawGreaterThan(Long value) {
            addCriterion("non_withdraw >", value, "nonWithdraw");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawGreaterThanOrEqualTo(Long value) {
            addCriterion("non_withdraw >=", value, "nonWithdraw");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawLessThan(Long value) {
            addCriterion("non_withdraw <", value, "nonWithdraw");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawLessThanOrEqualTo(Long value) {
            addCriterion("non_withdraw <=", value, "nonWithdraw");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawIn(List<Long> values) {
            addCriterion("non_withdraw in", values, "nonWithdraw");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawNotIn(List<Long> values) {
            addCriterion("non_withdraw not in", values, "nonWithdraw");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawBetween(Long value1, Long value2) {
            addCriterion("non_withdraw between", value1, value2, "nonWithdraw");
            return (Criteria) this;
        }

        public Criteria andNonWithdrawNotBetween(Long value1, Long value2) {
            addCriterion("non_withdraw not between", value1, value2, "nonWithdraw");
            return (Criteria) this;
        }

        public Criteria andBeanIsNull() {
            addCriterion("bean is null");
            return (Criteria) this;
        }

        public Criteria andBeanIsNotNull() {
            addCriterion("bean is not null");
            return (Criteria) this;
        }

        public Criteria andBeanEqualTo(Integer value) {
            addCriterion("bean =", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanNotEqualTo(Integer value) {
            addCriterion("bean <>", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanGreaterThan(Integer value) {
            addCriterion("bean >", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanGreaterThanOrEqualTo(Integer value) {
            addCriterion("bean >=", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanLessThan(Integer value) {
            addCriterion("bean <", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanLessThanOrEqualTo(Integer value) {
            addCriterion("bean <=", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanIn(List<Integer> values) {
            addCriterion("bean in", values, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanNotIn(List<Integer> values) {
            addCriterion("bean not in", values, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanBetween(Integer value1, Integer value2) {
            addCriterion("bean between", value1, value2, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanNotBetween(Integer value1, Integer value2) {
            addCriterion("bean not between", value1, value2, "bean");
            return (Criteria) this;
        }

        public Criteria andCouponIsNull() {
            addCriterion("coupon is null");
            return (Criteria) this;
        }

        public Criteria andCouponIsNotNull() {
            addCriterion("coupon is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEqualTo(Integer value) {
            addCriterion("coupon =", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotEqualTo(Integer value) {
            addCriterion("coupon <>", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThan(Integer value) {
            addCriterion("coupon >", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon >=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThan(Integer value) {
            addCriterion("coupon <", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThanOrEqualTo(Integer value) {
            addCriterion("coupon <=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponIn(List<Integer> values) {
            addCriterion("coupon in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotIn(List<Integer> values) {
            addCriterion("coupon not in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponBetween(Integer value1, Integer value2) {
            addCriterion("coupon between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon not between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNull() {
            addCriterion("total_profit is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNotNull() {
            addCriterion("total_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitEqualTo(Long value) {
            addCriterion("total_profit =", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotEqualTo(Long value) {
            addCriterion("total_profit <>", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThan(Long value) {
            addCriterion("total_profit >", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThanOrEqualTo(Long value) {
            addCriterion("total_profit >=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThan(Long value) {
            addCriterion("total_profit <", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThanOrEqualTo(Long value) {
            addCriterion("total_profit <=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIn(List<Long> values) {
            addCriterion("total_profit in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotIn(List<Long> values) {
            addCriterion("total_profit not in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBetween(Long value1, Long value2) {
            addCriterion("total_profit between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotBetween(Long value1, Long value2) {
            addCriterion("total_profit not between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitIsNull() {
            addCriterion("withdraw_profit is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitIsNotNull() {
            addCriterion("withdraw_profit is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitEqualTo(Long value) {
            addCriterion("withdraw_profit =", value, "withdrawProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitNotEqualTo(Long value) {
            addCriterion("withdraw_profit <>", value, "withdrawProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitGreaterThan(Long value) {
            addCriterion("withdraw_profit >", value, "withdrawProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitGreaterThanOrEqualTo(Long value) {
            addCriterion("withdraw_profit >=", value, "withdrawProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitLessThan(Long value) {
            addCriterion("withdraw_profit <", value, "withdrawProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitLessThanOrEqualTo(Long value) {
            addCriterion("withdraw_profit <=", value, "withdrawProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitIn(List<Long> values) {
            addCriterion("withdraw_profit in", values, "withdrawProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitNotIn(List<Long> values) {
            addCriterion("withdraw_profit not in", values, "withdrawProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitBetween(Long value1, Long value2) {
            addCriterion("withdraw_profit between", value1, value2, "withdrawProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawProfitNotBetween(Long value1, Long value2) {
            addCriterion("withdraw_profit not between", value1, value2, "withdrawProfit");
            return (Criteria) this;
        }

        public Criteria andSalesBonusIsNull() {
            addCriterion("sales_bonus is null");
            return (Criteria) this;
        }

        public Criteria andSalesBonusIsNotNull() {
            addCriterion("sales_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andSalesBonusEqualTo(Long value) {
            addCriterion("sales_bonus =", value, "salesBonus");
            return (Criteria) this;
        }

        public Criteria andSalesBonusNotEqualTo(Long value) {
            addCriterion("sales_bonus <>", value, "salesBonus");
            return (Criteria) this;
        }

        public Criteria andSalesBonusGreaterThan(Long value) {
            addCriterion("sales_bonus >", value, "salesBonus");
            return (Criteria) this;
        }

        public Criteria andSalesBonusGreaterThanOrEqualTo(Long value) {
            addCriterion("sales_bonus >=", value, "salesBonus");
            return (Criteria) this;
        }

        public Criteria andSalesBonusLessThan(Long value) {
            addCriterion("sales_bonus <", value, "salesBonus");
            return (Criteria) this;
        }

        public Criteria andSalesBonusLessThanOrEqualTo(Long value) {
            addCriterion("sales_bonus <=", value, "salesBonus");
            return (Criteria) this;
        }

        public Criteria andSalesBonusIn(List<Long> values) {
            addCriterion("sales_bonus in", values, "salesBonus");
            return (Criteria) this;
        }

        public Criteria andSalesBonusNotIn(List<Long> values) {
            addCriterion("sales_bonus not in", values, "salesBonus");
            return (Criteria) this;
        }

        public Criteria andSalesBonusBetween(Long value1, Long value2) {
            addCriterion("sales_bonus between", value1, value2, "salesBonus");
            return (Criteria) this;
        }

        public Criteria andSalesBonusNotBetween(Long value1, Long value2) {
            addCriterion("sales_bonus not between", value1, value2, "salesBonus");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceIsNull() {
            addCriterion("order_performance is null");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceIsNotNull() {
            addCriterion("order_performance is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceEqualTo(Long value) {
            addCriterion("order_performance =", value, "orderPerformance");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceNotEqualTo(Long value) {
            addCriterion("order_performance <>", value, "orderPerformance");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceGreaterThan(Long value) {
            addCriterion("order_performance >", value, "orderPerformance");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceGreaterThanOrEqualTo(Long value) {
            addCriterion("order_performance >=", value, "orderPerformance");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceLessThan(Long value) {
            addCriterion("order_performance <", value, "orderPerformance");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceLessThanOrEqualTo(Long value) {
            addCriterion("order_performance <=", value, "orderPerformance");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceIn(List<Long> values) {
            addCriterion("order_performance in", values, "orderPerformance");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceNotIn(List<Long> values) {
            addCriterion("order_performance not in", values, "orderPerformance");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceBetween(Long value1, Long value2) {
            addCriterion("order_performance between", value1, value2, "orderPerformance");
            return (Criteria) this;
        }

        public Criteria andOrderPerformanceNotBetween(Long value1, Long value2) {
            addCriterion("order_performance not between", value1, value2, "orderPerformance");
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