/* github.com/orange1438 */
package com.wepiao.bd.sport.bean;

import java.util.ArrayList;
import java.util.List;

public class AppAccessCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppAccessCriteria() {
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

        public Criteria andIsWepiaoIsNull() {
            addCriterion("is_wepiao is null");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoIsNotNull() {
            addCriterion("is_wepiao is not null");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoEqualTo(Boolean value) {
            addCriterion("is_wepiao =", value, "isWepiao");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoNotEqualTo(Boolean value) {
            addCriterion("is_wepiao <>", value, "isWepiao");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoGreaterThan(Boolean value) {
            addCriterion("is_wepiao >", value, "isWepiao");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_wepiao >=", value, "isWepiao");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoLessThan(Boolean value) {
            addCriterion("is_wepiao <", value, "isWepiao");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoLessThanOrEqualTo(Boolean value) {
            addCriterion("is_wepiao <=", value, "isWepiao");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoIn(List<Boolean> values) {
            addCriterion("is_wepiao in", values, "isWepiao");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoNotIn(List<Boolean> values) {
            addCriterion("is_wepiao not in", values, "isWepiao");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoBetween(Boolean value1, Boolean value2) {
            addCriterion("is_wepiao between", value1, value2, "isWepiao");
            return (Criteria) this;
        }

        public Criteria andIsWepiaoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_wepiao not between", value1, value2, "isWepiao");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeIsNull() {
            addCriterion("validate_start_time is null");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeIsNotNull() {
            addCriterion("validate_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeEqualTo(Long value) {
            addCriterion("validate_start_time =", value, "validateStartTime");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeNotEqualTo(Long value) {
            addCriterion("validate_start_time <>", value, "validateStartTime");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeGreaterThan(Long value) {
            addCriterion("validate_start_time >", value, "validateStartTime");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("validate_start_time >=", value, "validateStartTime");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeLessThan(Long value) {
            addCriterion("validate_start_time <", value, "validateStartTime");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("validate_start_time <=", value, "validateStartTime");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeIn(List<Long> values) {
            addCriterion("validate_start_time in", values, "validateStartTime");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeNotIn(List<Long> values) {
            addCriterion("validate_start_time not in", values, "validateStartTime");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeBetween(Long value1, Long value2) {
            addCriterion("validate_start_time between", value1, value2, "validateStartTime");
            return (Criteria) this;
        }

        public Criteria andValidateStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("validate_start_time not between", value1, value2, "validateStartTime");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeIsNull() {
            addCriterion("validate_end_time is null");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeIsNotNull() {
            addCriterion("validate_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeEqualTo(Long value) {
            addCriterion("validate_end_time =", value, "validateEndTime");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeNotEqualTo(Long value) {
            addCriterion("validate_end_time <>", value, "validateEndTime");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeGreaterThan(Long value) {
            addCriterion("validate_end_time >", value, "validateEndTime");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("validate_end_time >=", value, "validateEndTime");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeLessThan(Long value) {
            addCriterion("validate_end_time <", value, "validateEndTime");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("validate_end_time <=", value, "validateEndTime");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeIn(List<Long> values) {
            addCriterion("validate_end_time in", values, "validateEndTime");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeNotIn(List<Long> values) {
            addCriterion("validate_end_time not in", values, "validateEndTime");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeBetween(Long value1, Long value2) {
            addCriterion("validate_end_time between", value1, value2, "validateEndTime");
            return (Criteria) this;
        }

        public Criteria andValidateEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("validate_end_time not between", value1, value2, "validateEndTime");
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

        public Criteria andOrderSourcceIsNull() {
            addCriterion("order_sourcce is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceIsNotNull() {
            addCriterion("order_sourcce is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceEqualTo(Integer value) {
            addCriterion("order_sourcce =", value, "orderSourcce");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceNotEqualTo(Integer value) {
            addCriterion("order_sourcce <>", value, "orderSourcce");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceGreaterThan(Integer value) {
            addCriterion("order_sourcce >", value, "orderSourcce");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_sourcce >=", value, "orderSourcce");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceLessThan(Integer value) {
            addCriterion("order_sourcce <", value, "orderSourcce");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceLessThanOrEqualTo(Integer value) {
            addCriterion("order_sourcce <=", value, "orderSourcce");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceIn(List<Integer> values) {
            addCriterion("order_sourcce in", values, "orderSourcce");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceNotIn(List<Integer> values) {
            addCriterion("order_sourcce not in", values, "orderSourcce");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceBetween(Integer value1, Integer value2) {
            addCriterion("order_sourcce between", value1, value2, "orderSourcce");
            return (Criteria) this;
        }

        public Criteria andOrderSourcceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_sourcce not between", value1, value2, "orderSourcce");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNull() {
            addCriterion("public_key is null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNotNull() {
            addCriterion("public_key is not null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyEqualTo(String value) {
            addCriterion("public_key =", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotEqualTo(String value) {
            addCriterion("public_key <>", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThan(String value) {
            addCriterion("public_key >", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("public_key >=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThan(String value) {
            addCriterion("public_key <", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("public_key <=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLike(String value) {
            addCriterion("public_key like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotLike(String value) {
            addCriterion("public_key not like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIn(List<String> values) {
            addCriterion("public_key in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotIn(List<String> values) {
            addCriterion("public_key not in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyBetween(String value1, String value2) {
            addCriterion("public_key between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotBetween(String value1, String value2) {
            addCriterion("public_key not between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdIsNull() {
            addCriterion("api_group_id is null");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdIsNotNull() {
            addCriterion("api_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdEqualTo(String value) {
            addCriterion("api_group_id =", value, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdNotEqualTo(String value) {
            addCriterion("api_group_id <>", value, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdGreaterThan(String value) {
            addCriterion("api_group_id >", value, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("api_group_id >=", value, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdLessThan(String value) {
            addCriterion("api_group_id <", value, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdLessThanOrEqualTo(String value) {
            addCriterion("api_group_id <=", value, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdLike(String value) {
            addCriterion("api_group_id like", value, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdNotLike(String value) {
            addCriterion("api_group_id not like", value, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdIn(List<String> values) {
            addCriterion("api_group_id in", values, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdNotIn(List<String> values) {
            addCriterion("api_group_id not in", values, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdBetween(String value1, String value2) {
            addCriterion("api_group_id between", value1, value2, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andApiGroupIdNotBetween(String value1, String value2) {
            addCriterion("api_group_id not between", value1, value2, "apiGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Integer value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Integer value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Integer value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Integer value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Integer> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Integer> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Integer value1, Integer value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }
    }

    /**
     * app_access的映射实体
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