package com.taimei.gos.model;

import java.util.ArrayList;
import java.util.List;

public class ShopContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopContractExample() {
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

        public Criteria andShopContractIdIsNull() {
            addCriterion("shop_contract_id is null");
            return (Criteria) this;
        }

        public Criteria andShopContractIdIsNotNull() {
            addCriterion("shop_contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopContractIdEqualTo(Integer value) {
            addCriterion("shop_contract_id =", value, "shopContractId");
            return (Criteria) this;
        }

        public Criteria andShopContractIdNotEqualTo(Integer value) {
            addCriterion("shop_contract_id <>", value, "shopContractId");
            return (Criteria) this;
        }

        public Criteria andShopContractIdGreaterThan(Integer value) {
            addCriterion("shop_contract_id >", value, "shopContractId");
            return (Criteria) this;
        }

        public Criteria andShopContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_contract_id >=", value, "shopContractId");
            return (Criteria) this;
        }

        public Criteria andShopContractIdLessThan(Integer value) {
            addCriterion("shop_contract_id <", value, "shopContractId");
            return (Criteria) this;
        }

        public Criteria andShopContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_contract_id <=", value, "shopContractId");
            return (Criteria) this;
        }

        public Criteria andShopContractIdIn(List<Integer> values) {
            addCriterion("shop_contract_id in", values, "shopContractId");
            return (Criteria) this;
        }

        public Criteria andShopContractIdNotIn(List<Integer> values) {
            addCriterion("shop_contract_id not in", values, "shopContractId");
            return (Criteria) this;
        }

        public Criteria andShopContractIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_contract_id between", value1, value2, "shopContractId");
            return (Criteria) this;
        }

        public Criteria andShopContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_contract_id not between", value1, value2, "shopContractId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
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

        public Criteria andTelphoneIsNull() {
            addCriterion("telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("telphone not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdAddressIsNull() {
            addCriterion("id_address is null");
            return (Criteria) this;
        }

        public Criteria andIdAddressIsNotNull() {
            addCriterion("id_address is not null");
            return (Criteria) this;
        }

        public Criteria andIdAddressEqualTo(String value) {
            addCriterion("id_address =", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotEqualTo(String value) {
            addCriterion("id_address <>", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressGreaterThan(String value) {
            addCriterion("id_address >", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressGreaterThanOrEqualTo(String value) {
            addCriterion("id_address >=", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressLessThan(String value) {
            addCriterion("id_address <", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressLessThanOrEqualTo(String value) {
            addCriterion("id_address <=", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressLike(String value) {
            addCriterion("id_address like", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotLike(String value) {
            addCriterion("id_address not like", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressIn(List<String> values) {
            addCriterion("id_address in", values, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotIn(List<String> values) {
            addCriterion("id_address not in", values, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressBetween(String value1, String value2) {
            addCriterion("id_address between", value1, value2, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotBetween(String value1, String value2) {
            addCriterion("id_address not between", value1, value2, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAtt0IsNull() {
            addCriterion("id_att0 is null");
            return (Criteria) this;
        }

        public Criteria andIdAtt0IsNotNull() {
            addCriterion("id_att0 is not null");
            return (Criteria) this;
        }

        public Criteria andIdAtt0EqualTo(Integer value) {
            addCriterion("id_att0 =", value, "idAtt0");
            return (Criteria) this;
        }

        public Criteria andIdAtt0NotEqualTo(Integer value) {
            addCriterion("id_att0 <>", value, "idAtt0");
            return (Criteria) this;
        }

        public Criteria andIdAtt0GreaterThan(Integer value) {
            addCriterion("id_att0 >", value, "idAtt0");
            return (Criteria) this;
        }

        public Criteria andIdAtt0GreaterThanOrEqualTo(Integer value) {
            addCriterion("id_att0 >=", value, "idAtt0");
            return (Criteria) this;
        }

        public Criteria andIdAtt0LessThan(Integer value) {
            addCriterion("id_att0 <", value, "idAtt0");
            return (Criteria) this;
        }

        public Criteria andIdAtt0LessThanOrEqualTo(Integer value) {
            addCriterion("id_att0 <=", value, "idAtt0");
            return (Criteria) this;
        }

        public Criteria andIdAtt0In(List<Integer> values) {
            addCriterion("id_att0 in", values, "idAtt0");
            return (Criteria) this;
        }

        public Criteria andIdAtt0NotIn(List<Integer> values) {
            addCriterion("id_att0 not in", values, "idAtt0");
            return (Criteria) this;
        }

        public Criteria andIdAtt0Between(Integer value1, Integer value2) {
            addCriterion("id_att0 between", value1, value2, "idAtt0");
            return (Criteria) this;
        }

        public Criteria andIdAtt0NotBetween(Integer value1, Integer value2) {
            addCriterion("id_att0 not between", value1, value2, "idAtt0");
            return (Criteria) this;
        }

        public Criteria andIdAtt1IsNull() {
            addCriterion("id_att1 is null");
            return (Criteria) this;
        }

        public Criteria andIdAtt1IsNotNull() {
            addCriterion("id_att1 is not null");
            return (Criteria) this;
        }

        public Criteria andIdAtt1EqualTo(Integer value) {
            addCriterion("id_att1 =", value, "idAtt1");
            return (Criteria) this;
        }

        public Criteria andIdAtt1NotEqualTo(Integer value) {
            addCriterion("id_att1 <>", value, "idAtt1");
            return (Criteria) this;
        }

        public Criteria andIdAtt1GreaterThan(Integer value) {
            addCriterion("id_att1 >", value, "idAtt1");
            return (Criteria) this;
        }

        public Criteria andIdAtt1GreaterThanOrEqualTo(Integer value) {
            addCriterion("id_att1 >=", value, "idAtt1");
            return (Criteria) this;
        }

        public Criteria andIdAtt1LessThan(Integer value) {
            addCriterion("id_att1 <", value, "idAtt1");
            return (Criteria) this;
        }

        public Criteria andIdAtt1LessThanOrEqualTo(Integer value) {
            addCriterion("id_att1 <=", value, "idAtt1");
            return (Criteria) this;
        }

        public Criteria andIdAtt1In(List<Integer> values) {
            addCriterion("id_att1 in", values, "idAtt1");
            return (Criteria) this;
        }

        public Criteria andIdAtt1NotIn(List<Integer> values) {
            addCriterion("id_att1 not in", values, "idAtt1");
            return (Criteria) this;
        }

        public Criteria andIdAtt1Between(Integer value1, Integer value2) {
            addCriterion("id_att1 between", value1, value2, "idAtt1");
            return (Criteria) this;
        }

        public Criteria andIdAtt1NotBetween(Integer value1, Integer value2) {
            addCriterion("id_att1 not between", value1, value2, "idAtt1");
            return (Criteria) this;
        }

        public Criteria andHandIdAttIsNull() {
            addCriterion("hand_id_att is null");
            return (Criteria) this;
        }

        public Criteria andHandIdAttIsNotNull() {
            addCriterion("hand_id_att is not null");
            return (Criteria) this;
        }

        public Criteria andHandIdAttEqualTo(Integer value) {
            addCriterion("hand_id_att =", value, "handIdAtt");
            return (Criteria) this;
        }

        public Criteria andHandIdAttNotEqualTo(Integer value) {
            addCriterion("hand_id_att <>", value, "handIdAtt");
            return (Criteria) this;
        }

        public Criteria andHandIdAttGreaterThan(Integer value) {
            addCriterion("hand_id_att >", value, "handIdAtt");
            return (Criteria) this;
        }

        public Criteria andHandIdAttGreaterThanOrEqualTo(Integer value) {
            addCriterion("hand_id_att >=", value, "handIdAtt");
            return (Criteria) this;
        }

        public Criteria andHandIdAttLessThan(Integer value) {
            addCriterion("hand_id_att <", value, "handIdAtt");
            return (Criteria) this;
        }

        public Criteria andHandIdAttLessThanOrEqualTo(Integer value) {
            addCriterion("hand_id_att <=", value, "handIdAtt");
            return (Criteria) this;
        }

        public Criteria andHandIdAttIn(List<Integer> values) {
            addCriterion("hand_id_att in", values, "handIdAtt");
            return (Criteria) this;
        }

        public Criteria andHandIdAttNotIn(List<Integer> values) {
            addCriterion("hand_id_att not in", values, "handIdAtt");
            return (Criteria) this;
        }

        public Criteria andHandIdAttBetween(Integer value1, Integer value2) {
            addCriterion("hand_id_att between", value1, value2, "handIdAtt");
            return (Criteria) this;
        }

        public Criteria andHandIdAttNotBetween(Integer value1, Integer value2) {
            addCriterion("hand_id_att not between", value1, value2, "handIdAtt");
            return (Criteria) this;
        }

        public Criteria andSignatureAttIsNull() {
            addCriterion("signature_att is null");
            return (Criteria) this;
        }

        public Criteria andSignatureAttIsNotNull() {
            addCriterion("signature_att is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureAttEqualTo(Integer value) {
            addCriterion("signature_att =", value, "signatureAtt");
            return (Criteria) this;
        }

        public Criteria andSignatureAttNotEqualTo(Integer value) {
            addCriterion("signature_att <>", value, "signatureAtt");
            return (Criteria) this;
        }

        public Criteria andSignatureAttGreaterThan(Integer value) {
            addCriterion("signature_att >", value, "signatureAtt");
            return (Criteria) this;
        }

        public Criteria andSignatureAttGreaterThanOrEqualTo(Integer value) {
            addCriterion("signature_att >=", value, "signatureAtt");
            return (Criteria) this;
        }

        public Criteria andSignatureAttLessThan(Integer value) {
            addCriterion("signature_att <", value, "signatureAtt");
            return (Criteria) this;
        }

        public Criteria andSignatureAttLessThanOrEqualTo(Integer value) {
            addCriterion("signature_att <=", value, "signatureAtt");
            return (Criteria) this;
        }

        public Criteria andSignatureAttIn(List<Integer> values) {
            addCriterion("signature_att in", values, "signatureAtt");
            return (Criteria) this;
        }

        public Criteria andSignatureAttNotIn(List<Integer> values) {
            addCriterion("signature_att not in", values, "signatureAtt");
            return (Criteria) this;
        }

        public Criteria andSignatureAttBetween(Integer value1, Integer value2) {
            addCriterion("signature_att between", value1, value2, "signatureAtt");
            return (Criteria) this;
        }

        public Criteria andSignatureAttNotBetween(Integer value1, Integer value2) {
            addCriterion("signature_att not between", value1, value2, "signatureAtt");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("contract_no is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_no =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_no <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_no >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_no <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_no <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_no like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_no not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_no in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_no not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_no between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_no not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdIsNull() {
            addCriterion("audit_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdIsNotNull() {
            addCriterion("audit_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdEqualTo(Integer value) {
            addCriterion("audit_admin_id =", value, "auditAdminId");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdNotEqualTo(Integer value) {
            addCriterion("audit_admin_id <>", value, "auditAdminId");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdGreaterThan(Integer value) {
            addCriterion("audit_admin_id >", value, "auditAdminId");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_admin_id >=", value, "auditAdminId");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdLessThan(Integer value) {
            addCriterion("audit_admin_id <", value, "auditAdminId");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_admin_id <=", value, "auditAdminId");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdIn(List<Integer> values) {
            addCriterion("audit_admin_id in", values, "auditAdminId");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdNotIn(List<Integer> values) {
            addCriterion("audit_admin_id not in", values, "auditAdminId");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_admin_id between", value1, value2, "auditAdminId");
            return (Criteria) this;
        }

        public Criteria andAuditAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_admin_id not between", value1, value2, "auditAdminId");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Integer value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Integer value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Integer value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Integer value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Integer value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Integer> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Integer> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Integer value1, Integer value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("audit_remark not between", value1, value2, "auditRemark");
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