/* github.com/orange1438 */
package com.wepiao.bd.sport.bean;

import java.util.ArrayList;
import java.util.List;

public class ItemPubonCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemPubonCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("item_id like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("item_id not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(String value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(String value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(String value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(String value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLike(String value) {
            addCriterion("business_id like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotLike(String value) {
            addCriterion("business_id not like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<String> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<String> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(String value1, String value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(String value1, String value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesIsNull() {
            addCriterion("agency_fees is null");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesIsNotNull() {
            addCriterion("agency_fees is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesEqualTo(Float value) {
            addCriterion("agency_fees =", value, "agencyFees");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesNotEqualTo(Float value) {
            addCriterion("agency_fees <>", value, "agencyFees");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesGreaterThan(Float value) {
            addCriterion("agency_fees >", value, "agencyFees");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesGreaterThanOrEqualTo(Float value) {
            addCriterion("agency_fees >=", value, "agencyFees");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesLessThan(Float value) {
            addCriterion("agency_fees <", value, "agencyFees");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesLessThanOrEqualTo(Float value) {
            addCriterion("agency_fees <=", value, "agencyFees");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesIn(List<Float> values) {
            addCriterion("agency_fees in", values, "agencyFees");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesNotIn(List<Float> values) {
            addCriterion("agency_fees not in", values, "agencyFees");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesBetween(Float value1, Float value2) {
            addCriterion("agency_fees between", value1, value2, "agencyFees");
            return (Criteria) this;
        }

        public Criteria andAgencyFeesNotBetween(Float value1, Float value2) {
            addCriterion("agency_fees not between", value1, value2, "agencyFees");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumIsNull() {
            addCriterion("order_buy_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumIsNotNull() {
            addCriterion("order_buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumEqualTo(Integer value) {
            addCriterion("order_buy_num =", value, "orderBuyNum");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumNotEqualTo(Integer value) {
            addCriterion("order_buy_num <>", value, "orderBuyNum");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumGreaterThan(Integer value) {
            addCriterion("order_buy_num >", value, "orderBuyNum");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_buy_num >=", value, "orderBuyNum");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumLessThan(Integer value) {
            addCriterion("order_buy_num <", value, "orderBuyNum");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_buy_num <=", value, "orderBuyNum");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumIn(List<Integer> values) {
            addCriterion("order_buy_num in", values, "orderBuyNum");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumNotIn(List<Integer> values) {
            addCriterion("order_buy_num not in", values, "orderBuyNum");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("order_buy_num between", value1, value2, "orderBuyNum");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_buy_num not between", value1, value2, "orderBuyNum");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumIsNull() {
            addCriterion("user_buy_num is null");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumIsNotNull() {
            addCriterion("user_buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumEqualTo(Integer value) {
            addCriterion("user_buy_num =", value, "userBuyNum");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumNotEqualTo(Integer value) {
            addCriterion("user_buy_num <>", value, "userBuyNum");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumGreaterThan(Integer value) {
            addCriterion("user_buy_num >", value, "userBuyNum");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_buy_num >=", value, "userBuyNum");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumLessThan(Integer value) {
            addCriterion("user_buy_num <", value, "userBuyNum");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("user_buy_num <=", value, "userBuyNum");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumIn(List<Integer> values) {
            addCriterion("user_buy_num in", values, "userBuyNum");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumNotIn(List<Integer> values) {
            addCriterion("user_buy_num not in", values, "userBuyNum");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("user_buy_num between", value1, value2, "userBuyNum");
            return (Criteria) this;
        }

        public Criteria andUserBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_buy_num not between", value1, value2, "userBuyNum");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeIsNull() {
            addCriterion("buy_priority_type is null");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeIsNotNull() {
            addCriterion("buy_priority_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeEqualTo(Integer value) {
            addCriterion("buy_priority_type =", value, "buyPriorityType");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeNotEqualTo(Integer value) {
            addCriterion("buy_priority_type <>", value, "buyPriorityType");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeGreaterThan(Integer value) {
            addCriterion("buy_priority_type >", value, "buyPriorityType");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_priority_type >=", value, "buyPriorityType");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeLessThan(Integer value) {
            addCriterion("buy_priority_type <", value, "buyPriorityType");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("buy_priority_type <=", value, "buyPriorityType");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeIn(List<Integer> values) {
            addCriterion("buy_priority_type in", values, "buyPriorityType");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeNotIn(List<Integer> values) {
            addCriterion("buy_priority_type not in", values, "buyPriorityType");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeBetween(Integer value1, Integer value2) {
            addCriterion("buy_priority_type between", value1, value2, "buyPriorityType");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_priority_type not between", value1, value2, "buyPriorityType");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamIsNull() {
            addCriterion("buy_priority_param is null");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamIsNotNull() {
            addCriterion("buy_priority_param is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamEqualTo(String value) {
            addCriterion("buy_priority_param =", value, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamNotEqualTo(String value) {
            addCriterion("buy_priority_param <>", value, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamGreaterThan(String value) {
            addCriterion("buy_priority_param >", value, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamGreaterThanOrEqualTo(String value) {
            addCriterion("buy_priority_param >=", value, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamLessThan(String value) {
            addCriterion("buy_priority_param <", value, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamLessThanOrEqualTo(String value) {
            addCriterion("buy_priority_param <=", value, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamLike(String value) {
            addCriterion("buy_priority_param like", value, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamNotLike(String value) {
            addCriterion("buy_priority_param not like", value, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamIn(List<String> values) {
            addCriterion("buy_priority_param in", values, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamNotIn(List<String> values) {
            addCriterion("buy_priority_param not in", values, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamBetween(String value1, String value2) {
            addCriterion("buy_priority_param between", value1, value2, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andBuyPriorityParamNotBetween(String value1, String value2) {
            addCriterion("buy_priority_param not between", value1, value2, "buyPriorityParam");
            return (Criteria) this;
        }

        public Criteria andSortByIsNull() {
            addCriterion("sort_by is null");
            return (Criteria) this;
        }

        public Criteria andSortByIsNotNull() {
            addCriterion("sort_by is not null");
            return (Criteria) this;
        }

        public Criteria andSortByEqualTo(Integer value) {
            addCriterion("sort_by =", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByNotEqualTo(Integer value) {
            addCriterion("sort_by <>", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByGreaterThan(Integer value) {
            addCriterion("sort_by >", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_by >=", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByLessThan(Integer value) {
            addCriterion("sort_by <", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByLessThanOrEqualTo(Integer value) {
            addCriterion("sort_by <=", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByIn(List<Integer> values) {
            addCriterion("sort_by in", values, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByNotIn(List<Integer> values) {
            addCriterion("sort_by not in", values, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByBetween(Integer value1, Integer value2) {
            addCriterion("sort_by between", value1, value2, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_by not between", value1, value2, "sortBy");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andPubonTimeIsNull() {
            addCriterion("pubon_time is null");
            return (Criteria) this;
        }

        public Criteria andPubonTimeIsNotNull() {
            addCriterion("pubon_time is not null");
            return (Criteria) this;
        }

        public Criteria andPubonTimeEqualTo(Long value) {
            addCriterion("pubon_time =", value, "pubonTime");
            return (Criteria) this;
        }

        public Criteria andPubonTimeNotEqualTo(Long value) {
            addCriterion("pubon_time <>", value, "pubonTime");
            return (Criteria) this;
        }

        public Criteria andPubonTimeGreaterThan(Long value) {
            addCriterion("pubon_time >", value, "pubonTime");
            return (Criteria) this;
        }

        public Criteria andPubonTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("pubon_time >=", value, "pubonTime");
            return (Criteria) this;
        }

        public Criteria andPubonTimeLessThan(Long value) {
            addCriterion("pubon_time <", value, "pubonTime");
            return (Criteria) this;
        }

        public Criteria andPubonTimeLessThanOrEqualTo(Long value) {
            addCriterion("pubon_time <=", value, "pubonTime");
            return (Criteria) this;
        }

        public Criteria andPubonTimeIn(List<Long> values) {
            addCriterion("pubon_time in", values, "pubonTime");
            return (Criteria) this;
        }

        public Criteria andPubonTimeNotIn(List<Long> values) {
            addCriterion("pubon_time not in", values, "pubonTime");
            return (Criteria) this;
        }

        public Criteria andPubonTimeBetween(Long value1, Long value2) {
            addCriterion("pubon_time between", value1, value2, "pubonTime");
            return (Criteria) this;
        }

        public Criteria andPubonTimeNotBetween(Long value1, Long value2) {
            addCriterion("pubon_time not between", value1, value2, "pubonTime");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumIsNull() {
            addCriterion("show_buy_num is null");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumIsNotNull() {
            addCriterion("show_buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumEqualTo(Integer value) {
            addCriterion("show_buy_num =", value, "showBuyNum");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumNotEqualTo(Integer value) {
            addCriterion("show_buy_num <>", value, "showBuyNum");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumGreaterThan(Integer value) {
            addCriterion("show_buy_num >", value, "showBuyNum");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_buy_num >=", value, "showBuyNum");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumLessThan(Integer value) {
            addCriterion("show_buy_num <", value, "showBuyNum");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("show_buy_num <=", value, "showBuyNum");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumIn(List<Integer> values) {
            addCriterion("show_buy_num in", values, "showBuyNum");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumNotIn(List<Integer> values) {
            addCriterion("show_buy_num not in", values, "showBuyNum");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("show_buy_num between", value1, value2, "showBuyNum");
            return (Criteria) this;
        }

        public Criteria andShowBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("show_buy_num not between", value1, value2, "showBuyNum");
            return (Criteria) this;
        }
    }

    /**
     * item_pubon的映射实体
     */
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