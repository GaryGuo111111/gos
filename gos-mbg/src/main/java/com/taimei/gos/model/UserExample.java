package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdIsNull() {
            addCriterion("belong_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdIsNotNull() {
            addCriterion("belong_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdEqualTo(Integer value) {
            addCriterion("belong_shop_id =", value, "belongShopId");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdNotEqualTo(Integer value) {
            addCriterion("belong_shop_id <>", value, "belongShopId");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdGreaterThan(Integer value) {
            addCriterion("belong_shop_id >", value, "belongShopId");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("belong_shop_id >=", value, "belongShopId");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdLessThan(Integer value) {
            addCriterion("belong_shop_id <", value, "belongShopId");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("belong_shop_id <=", value, "belongShopId");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdIn(List<Integer> values) {
            addCriterion("belong_shop_id in", values, "belongShopId");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdNotIn(List<Integer> values) {
            addCriterion("belong_shop_id not in", values, "belongShopId");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdBetween(Integer value1, Integer value2) {
            addCriterion("belong_shop_id between", value1, value2, "belongShopId");
            return (Criteria) this;
        }

        public Criteria andBelongShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("belong_shop_id not between", value1, value2, "belongShopId");
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

        public Criteria andSaleLevelIdIsNull() {
            addCriterion("sale_level_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdIsNotNull() {
            addCriterion("sale_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdEqualTo(Integer value) {
            addCriterion("sale_level_id =", value, "saleLevelId");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdNotEqualTo(Integer value) {
            addCriterion("sale_level_id <>", value, "saleLevelId");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdGreaterThan(Integer value) {
            addCriterion("sale_level_id >", value, "saleLevelId");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_level_id >=", value, "saleLevelId");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdLessThan(Integer value) {
            addCriterion("sale_level_id <", value, "saleLevelId");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_level_id <=", value, "saleLevelId");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdIn(List<Integer> values) {
            addCriterion("sale_level_id in", values, "saleLevelId");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdNotIn(List<Integer> values) {
            addCriterion("sale_level_id not in", values, "saleLevelId");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_level_id between", value1, value2, "saleLevelId");
            return (Criteria) this;
        }

        public Criteria andSaleLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_level_id not between", value1, value2, "saleLevelId");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeIsNull() {
            addCriterion("special_type is null");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeIsNotNull() {
            addCriterion("special_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeEqualTo(Integer value) {
            addCriterion("special_type =", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeNotEqualTo(Integer value) {
            addCriterion("special_type <>", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeGreaterThan(Integer value) {
            addCriterion("special_type >", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_type >=", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeLessThan(Integer value) {
            addCriterion("special_type <", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeLessThanOrEqualTo(Integer value) {
            addCriterion("special_type <=", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeIn(List<Integer> values) {
            addCriterion("special_type in", values, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeNotIn(List<Integer> values) {
            addCriterion("special_type not in", values, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeBetween(Integer value1, Integer value2) {
            addCriterion("special_type between", value1, value2, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("special_type not between", value1, value2, "specialType");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeIsNull() {
            addCriterion("profit_ex_time is null");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeIsNotNull() {
            addCriterion("profit_ex_time is not null");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeEqualTo(Integer value) {
            addCriterion("profit_ex_time =", value, "profitExTime");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeNotEqualTo(Integer value) {
            addCriterion("profit_ex_time <>", value, "profitExTime");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeGreaterThan(Integer value) {
            addCriterion("profit_ex_time >", value, "profitExTime");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("profit_ex_time >=", value, "profitExTime");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeLessThan(Integer value) {
            addCriterion("profit_ex_time <", value, "profitExTime");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeLessThanOrEqualTo(Integer value) {
            addCriterion("profit_ex_time <=", value, "profitExTime");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeIn(List<Integer> values) {
            addCriterion("profit_ex_time in", values, "profitExTime");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeNotIn(List<Integer> values) {
            addCriterion("profit_ex_time not in", values, "profitExTime");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeBetween(Integer value1, Integer value2) {
            addCriterion("profit_ex_time between", value1, value2, "profitExTime");
            return (Criteria) this;
        }

        public Criteria andProfitExTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("profit_ex_time not between", value1, value2, "profitExTime");
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

        public Criteria andIsFreezeIsNull() {
            addCriterion("is_freeze is null");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIsNotNull() {
            addCriterion("is_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreezeEqualTo(Byte value) {
            addCriterion("is_freeze =", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotEqualTo(Byte value) {
            addCriterion("is_freeze <>", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeGreaterThan(Byte value) {
            addCriterion("is_freeze >", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_freeze >=", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeLessThan(Byte value) {
            addCriterion("is_freeze <", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeLessThanOrEqualTo(Byte value) {
            addCriterion("is_freeze <=", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIn(List<Byte> values) {
            addCriterion("is_freeze in", values, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotIn(List<Byte> values) {
            addCriterion("is_freeze not in", values, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeBetween(Byte value1, Byte value2) {
            addCriterion("is_freeze between", value1, value2, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotBetween(Byte value1, Byte value2) {
            addCriterion("is_freeze not between", value1, value2, "isFreeze");
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

        public Criteria andPpIdIsNull() {
            addCriterion("pp_id is null");
            return (Criteria) this;
        }

        public Criteria andPpIdIsNotNull() {
            addCriterion("pp_id is not null");
            return (Criteria) this;
        }

        public Criteria andPpIdEqualTo(Integer value) {
            addCriterion("pp_id =", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotEqualTo(Integer value) {
            addCriterion("pp_id <>", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdGreaterThan(Integer value) {
            addCriterion("pp_id >", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pp_id >=", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdLessThan(Integer value) {
            addCriterion("pp_id <", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdLessThanOrEqualTo(Integer value) {
            addCriterion("pp_id <=", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdIn(List<Integer> values) {
            addCriterion("pp_id in", values, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotIn(List<Integer> values) {
            addCriterion("pp_id not in", values, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdBetween(Integer value1, Integer value2) {
            addCriterion("pp_id between", value1, value2, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pp_id not between", value1, value2, "ppId");
            return (Criteria) this;
        }

        public Criteria andNGoldIdIsNull() {
            addCriterion("n_gold_id is null");
            return (Criteria) this;
        }

        public Criteria andNGoldIdIsNotNull() {
            addCriterion("n_gold_id is not null");
            return (Criteria) this;
        }

        public Criteria andNGoldIdEqualTo(Integer value) {
            addCriterion("n_gold_id =", value, "nGoldId");
            return (Criteria) this;
        }

        public Criteria andNGoldIdNotEqualTo(Integer value) {
            addCriterion("n_gold_id <>", value, "nGoldId");
            return (Criteria) this;
        }

        public Criteria andNGoldIdGreaterThan(Integer value) {
            addCriterion("n_gold_id >", value, "nGoldId");
            return (Criteria) this;
        }

        public Criteria andNGoldIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_gold_id >=", value, "nGoldId");
            return (Criteria) this;
        }

        public Criteria andNGoldIdLessThan(Integer value) {
            addCriterion("n_gold_id <", value, "nGoldId");
            return (Criteria) this;
        }

        public Criteria andNGoldIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_gold_id <=", value, "nGoldId");
            return (Criteria) this;
        }

        public Criteria andNGoldIdIn(List<Integer> values) {
            addCriterion("n_gold_id in", values, "nGoldId");
            return (Criteria) this;
        }

        public Criteria andNGoldIdNotIn(List<Integer> values) {
            addCriterion("n_gold_id not in", values, "nGoldId");
            return (Criteria) this;
        }

        public Criteria andNGoldIdBetween(Integer value1, Integer value2) {
            addCriterion("n_gold_id between", value1, value2, "nGoldId");
            return (Criteria) this;
        }

        public Criteria andNGoldIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_gold_id not between", value1, value2, "nGoldId");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdIsNull() {
            addCriterion("n_diamond_id is null");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdIsNotNull() {
            addCriterion("n_diamond_id is not null");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdEqualTo(Integer value) {
            addCriterion("n_diamond_id =", value, "nDiamondId");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdNotEqualTo(Integer value) {
            addCriterion("n_diamond_id <>", value, "nDiamondId");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdGreaterThan(Integer value) {
            addCriterion("n_diamond_id >", value, "nDiamondId");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_diamond_id >=", value, "nDiamondId");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdLessThan(Integer value) {
            addCriterion("n_diamond_id <", value, "nDiamondId");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_diamond_id <=", value, "nDiamondId");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdIn(List<Integer> values) {
            addCriterion("n_diamond_id in", values, "nDiamondId");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdNotIn(List<Integer> values) {
            addCriterion("n_diamond_id not in", values, "nDiamondId");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdBetween(Integer value1, Integer value2) {
            addCriterion("n_diamond_id between", value1, value2, "nDiamondId");
            return (Criteria) this;
        }

        public Criteria andNDiamondIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_diamond_id not between", value1, value2, "nDiamondId");
            return (Criteria) this;
        }

        public Criteria andSelfSaleIsNull() {
            addCriterion("self_sale is null");
            return (Criteria) this;
        }

        public Criteria andSelfSaleIsNotNull() {
            addCriterion("self_sale is not null");
            return (Criteria) this;
        }

        public Criteria andSelfSaleEqualTo(Long value) {
            addCriterion("self_sale =", value, "selfSale");
            return (Criteria) this;
        }

        public Criteria andSelfSaleNotEqualTo(Long value) {
            addCriterion("self_sale <>", value, "selfSale");
            return (Criteria) this;
        }

        public Criteria andSelfSaleGreaterThan(Long value) {
            addCriterion("self_sale >", value, "selfSale");
            return (Criteria) this;
        }

        public Criteria andSelfSaleGreaterThanOrEqualTo(Long value) {
            addCriterion("self_sale >=", value, "selfSale");
            return (Criteria) this;
        }

        public Criteria andSelfSaleLessThan(Long value) {
            addCriterion("self_sale <", value, "selfSale");
            return (Criteria) this;
        }

        public Criteria andSelfSaleLessThanOrEqualTo(Long value) {
            addCriterion("self_sale <=", value, "selfSale");
            return (Criteria) this;
        }

        public Criteria andSelfSaleIn(List<Long> values) {
            addCriterion("self_sale in", values, "selfSale");
            return (Criteria) this;
        }

        public Criteria andSelfSaleNotIn(List<Long> values) {
            addCriterion("self_sale not in", values, "selfSale");
            return (Criteria) this;
        }

        public Criteria andSelfSaleBetween(Long value1, Long value2) {
            addCriterion("self_sale between", value1, value2, "selfSale");
            return (Criteria) this;
        }

        public Criteria andSelfSaleNotBetween(Long value1, Long value2) {
            addCriterion("self_sale not between", value1, value2, "selfSale");
            return (Criteria) this;
        }

        public Criteria andTotalSaleIsNull() {
            addCriterion("total_sale is null");
            return (Criteria) this;
        }

        public Criteria andTotalSaleIsNotNull() {
            addCriterion("total_sale is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSaleEqualTo(Long value) {
            addCriterion("total_sale =", value, "totalSale");
            return (Criteria) this;
        }

        public Criteria andTotalSaleNotEqualTo(Long value) {
            addCriterion("total_sale <>", value, "totalSale");
            return (Criteria) this;
        }

        public Criteria andTotalSaleGreaterThan(Long value) {
            addCriterion("total_sale >", value, "totalSale");
            return (Criteria) this;
        }

        public Criteria andTotalSaleGreaterThanOrEqualTo(Long value) {
            addCriterion("total_sale >=", value, "totalSale");
            return (Criteria) this;
        }

        public Criteria andTotalSaleLessThan(Long value) {
            addCriterion("total_sale <", value, "totalSale");
            return (Criteria) this;
        }

        public Criteria andTotalSaleLessThanOrEqualTo(Long value) {
            addCriterion("total_sale <=", value, "totalSale");
            return (Criteria) this;
        }

        public Criteria andTotalSaleIn(List<Long> values) {
            addCriterion("total_sale in", values, "totalSale");
            return (Criteria) this;
        }

        public Criteria andTotalSaleNotIn(List<Long> values) {
            addCriterion("total_sale not in", values, "totalSale");
            return (Criteria) this;
        }

        public Criteria andTotalSaleBetween(Long value1, Long value2) {
            addCriterion("total_sale between", value1, value2, "totalSale");
            return (Criteria) this;
        }

        public Criteria andTotalSaleNotBetween(Long value1, Long value2) {
            addCriterion("total_sale not between", value1, value2, "totalSale");
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