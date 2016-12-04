/* github.com/orange1438 */
package com.wepiao.bd.sport.bean;

import java.util.ArrayList;
import java.util.List;

public class ItemInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemInfoCriteria() {
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

        public Criteria andTitleCnIsNull() {
            addCriterion("title_cn is null");
            return (Criteria) this;
        }

        public Criteria andTitleCnIsNotNull() {
            addCriterion("title_cn is not null");
            return (Criteria) this;
        }

        public Criteria andTitleCnEqualTo(String value) {
            addCriterion("title_cn =", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotEqualTo(String value) {
            addCriterion("title_cn <>", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnGreaterThan(String value) {
            addCriterion("title_cn >", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnGreaterThanOrEqualTo(String value) {
            addCriterion("title_cn >=", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnLessThan(String value) {
            addCriterion("title_cn <", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnLessThanOrEqualTo(String value) {
            addCriterion("title_cn <=", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnLike(String value) {
            addCriterion("title_cn like", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotLike(String value) {
            addCriterion("title_cn not like", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnIn(List<String> values) {
            addCriterion("title_cn in", values, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotIn(List<String> values) {
            addCriterion("title_cn not in", values, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnBetween(String value1, String value2) {
            addCriterion("title_cn between", value1, value2, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotBetween(String value1, String value2) {
            addCriterion("title_cn not between", value1, value2, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleEnIsNull() {
            addCriterion("title_en is null");
            return (Criteria) this;
        }

        public Criteria andTitleEnIsNotNull() {
            addCriterion("title_en is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEnEqualTo(String value) {
            addCriterion("title_en =", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotEqualTo(String value) {
            addCriterion("title_en <>", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnGreaterThan(String value) {
            addCriterion("title_en >", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("title_en >=", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLessThan(String value) {
            addCriterion("title_en <", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLessThanOrEqualTo(String value) {
            addCriterion("title_en <=", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLike(String value) {
            addCriterion("title_en like", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotLike(String value) {
            addCriterion("title_en not like", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnIn(List<String> values) {
            addCriterion("title_en in", values, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotIn(List<String> values) {
            addCriterion("title_en not in", values, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnBetween(String value1, String value2) {
            addCriterion("title_en between", value1, value2, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotBetween(String value1, String value2) {
            addCriterion("title_en not between", value1, value2, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("type_id like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("type_id not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypePidIsNull() {
            addCriterion("type_pid is null");
            return (Criteria) this;
        }

        public Criteria andTypePidIsNotNull() {
            addCriterion("type_pid is not null");
            return (Criteria) this;
        }

        public Criteria andTypePidEqualTo(String value) {
            addCriterion("type_pid =", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidNotEqualTo(String value) {
            addCriterion("type_pid <>", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidGreaterThan(String value) {
            addCriterion("type_pid >", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidGreaterThanOrEqualTo(String value) {
            addCriterion("type_pid >=", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidLessThan(String value) {
            addCriterion("type_pid <", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidLessThanOrEqualTo(String value) {
            addCriterion("type_pid <=", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidLike(String value) {
            addCriterion("type_pid like", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidNotLike(String value) {
            addCriterion("type_pid not like", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidIn(List<String> values) {
            addCriterion("type_pid in", values, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidNotIn(List<String> values) {
            addCriterion("type_pid not in", values, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidBetween(String value1, String value2) {
            addCriterion("type_pid between", value1, value2, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidNotBetween(String value1, String value2) {
            addCriterion("type_pid not between", value1, value2, "typePid");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNull() {
            addCriterion("show_time is null");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNotNull() {
            addCriterion("show_time is not null");
            return (Criteria) this;
        }

        public Criteria andShowTimeEqualTo(String value) {
            addCriterion("show_time =", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotEqualTo(String value) {
            addCriterion("show_time <>", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThan(String value) {
            addCriterion("show_time >", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThanOrEqualTo(String value) {
            addCriterion("show_time >=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThan(String value) {
            addCriterion("show_time <", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThanOrEqualTo(String value) {
            addCriterion("show_time <=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLike(String value) {
            addCriterion("show_time like", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotLike(String value) {
            addCriterion("show_time not like", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeIn(List<String> values) {
            addCriterion("show_time in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotIn(List<String> values) {
            addCriterion("show_time not in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeBetween(String value1, String value2) {
            addCriterion("show_time between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotBetween(String value1, String value2) {
            addCriterion("show_time not between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthIsNull() {
            addCriterion("screening_length is null");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthIsNotNull() {
            addCriterion("screening_length is not null");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthEqualTo(Integer value) {
            addCriterion("screening_length =", value, "screeningLength");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthNotEqualTo(Integer value) {
            addCriterion("screening_length <>", value, "screeningLength");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthGreaterThan(Integer value) {
            addCriterion("screening_length >", value, "screeningLength");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("screening_length >=", value, "screeningLength");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthLessThan(Integer value) {
            addCriterion("screening_length <", value, "screeningLength");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthLessThanOrEqualTo(Integer value) {
            addCriterion("screening_length <=", value, "screeningLength");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthIn(List<Integer> values) {
            addCriterion("screening_length in", values, "screeningLength");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthNotIn(List<Integer> values) {
            addCriterion("screening_length not in", values, "screeningLength");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthBetween(Integer value1, Integer value2) {
            addCriterion("screening_length between", value1, value2, "screeningLength");
            return (Criteria) this;
        }

        public Criteria andScreeningLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("screening_length not between", value1, value2, "screeningLength");
            return (Criteria) this;
        }

        public Criteria andVenueIdIsNull() {
            addCriterion("venue_id is null");
            return (Criteria) this;
        }

        public Criteria andVenueIdIsNotNull() {
            addCriterion("venue_id is not null");
            return (Criteria) this;
        }

        public Criteria andVenueIdEqualTo(String value) {
            addCriterion("venue_id =", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdNotEqualTo(String value) {
            addCriterion("venue_id <>", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdGreaterThan(String value) {
            addCriterion("venue_id >", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdGreaterThanOrEqualTo(String value) {
            addCriterion("venue_id >=", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdLessThan(String value) {
            addCriterion("venue_id <", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdLessThanOrEqualTo(String value) {
            addCriterion("venue_id <=", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdLike(String value) {
            addCriterion("venue_id like", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdNotLike(String value) {
            addCriterion("venue_id not like", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdIn(List<String> values) {
            addCriterion("venue_id in", values, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdNotIn(List<String> values) {
            addCriterion("venue_id not in", values, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdBetween(String value1, String value2) {
            addCriterion("venue_id between", value1, value2, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdNotBetween(String value1, String value2) {
            addCriterion("venue_id not between", value1, value2, "venueId");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIsNull() {
            addCriterion("price_range is null");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIsNotNull() {
            addCriterion("price_range is not null");
            return (Criteria) this;
        }

        public Criteria andPriceRangeEqualTo(String value) {
            addCriterion("price_range =", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotEqualTo(String value) {
            addCriterion("price_range <>", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeGreaterThan(String value) {
            addCriterion("price_range >", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeGreaterThanOrEqualTo(String value) {
            addCriterion("price_range >=", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLessThan(String value) {
            addCriterion("price_range <", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLessThanOrEqualTo(String value) {
            addCriterion("price_range <=", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLike(String value) {
            addCriterion("price_range like", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotLike(String value) {
            addCriterion("price_range not like", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIn(List<String> values) {
            addCriterion("price_range in", values, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotIn(List<String> values) {
            addCriterion("price_range not in", values, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeBetween(String value1, String value2) {
            addCriterion("price_range between", value1, value2, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotBetween(String value1, String value2) {
            addCriterion("price_range not between", value1, value2, "priceRange");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andVoteTypeIsNull() {
            addCriterion("vote_type is null");
            return (Criteria) this;
        }

        public Criteria andVoteTypeIsNotNull() {
            addCriterion("vote_type is not null");
            return (Criteria) this;
        }

        public Criteria andVoteTypeEqualTo(String value) {
            addCriterion("vote_type =", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeNotEqualTo(String value) {
            addCriterion("vote_type <>", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeGreaterThan(String value) {
            addCriterion("vote_type >", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vote_type >=", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeLessThan(String value) {
            addCriterion("vote_type <", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeLessThanOrEqualTo(String value) {
            addCriterion("vote_type <=", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeLike(String value) {
            addCriterion("vote_type like", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeNotLike(String value) {
            addCriterion("vote_type not like", value, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeIn(List<String> values) {
            addCriterion("vote_type in", values, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeNotIn(List<String> values) {
            addCriterion("vote_type not in", values, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeBetween(String value1, String value2) {
            addCriterion("vote_type between", value1, value2, "voteType");
            return (Criteria) this;
        }

        public Criteria andVoteTypeNotBetween(String value1, String value2) {
            addCriterion("vote_type not between", value1, value2, "voteType");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidIsNull() {
            addCriterion("xiao_bian_said is null");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidIsNotNull() {
            addCriterion("xiao_bian_said is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidEqualTo(String value) {
            addCriterion("xiao_bian_said =", value, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidNotEqualTo(String value) {
            addCriterion("xiao_bian_said <>", value, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidGreaterThan(String value) {
            addCriterion("xiao_bian_said >", value, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidGreaterThanOrEqualTo(String value) {
            addCriterion("xiao_bian_said >=", value, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidLessThan(String value) {
            addCriterion("xiao_bian_said <", value, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidLessThanOrEqualTo(String value) {
            addCriterion("xiao_bian_said <=", value, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidLike(String value) {
            addCriterion("xiao_bian_said like", value, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidNotLike(String value) {
            addCriterion("xiao_bian_said not like", value, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidIn(List<String> values) {
            addCriterion("xiao_bian_said in", values, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidNotIn(List<String> values) {
            addCriterion("xiao_bian_said not in", values, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidBetween(String value1, String value2) {
            addCriterion("xiao_bian_said between", value1, value2, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andXiaoBianSaidNotBetween(String value1, String value2) {
            addCriterion("xiao_bian_said not between", value1, value2, "xiaoBianSaid");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdIsNull() {
            addCriterion("host_business_id is null");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdIsNotNull() {
            addCriterion("host_business_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdEqualTo(String value) {
            addCriterion("host_business_id =", value, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdNotEqualTo(String value) {
            addCriterion("host_business_id <>", value, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdGreaterThan(String value) {
            addCriterion("host_business_id >", value, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("host_business_id >=", value, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdLessThan(String value) {
            addCriterion("host_business_id <", value, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("host_business_id <=", value, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdLike(String value) {
            addCriterion("host_business_id like", value, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdNotLike(String value) {
            addCriterion("host_business_id not like", value, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdIn(List<String> values) {
            addCriterion("host_business_id in", values, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdNotIn(List<String> values) {
            addCriterion("host_business_id not in", values, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdBetween(String value1, String value2) {
            addCriterion("host_business_id between", value1, value2, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andHostBusinessIdNotBetween(String value1, String value2) {
            addCriterion("host_business_id not between", value1, value2, "hostBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemSrcIsNull() {
            addCriterion("item_src is null");
            return (Criteria) this;
        }

        public Criteria andItemSrcIsNotNull() {
            addCriterion("item_src is not null");
            return (Criteria) this;
        }

        public Criteria andItemSrcEqualTo(String value) {
            addCriterion("item_src =", value, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcNotEqualTo(String value) {
            addCriterion("item_src <>", value, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcGreaterThan(String value) {
            addCriterion("item_src >", value, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcGreaterThanOrEqualTo(String value) {
            addCriterion("item_src >=", value, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcLessThan(String value) {
            addCriterion("item_src <", value, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcLessThanOrEqualTo(String value) {
            addCriterion("item_src <=", value, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcLike(String value) {
            addCriterion("item_src like", value, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcNotLike(String value) {
            addCriterion("item_src not like", value, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcIn(List<String> values) {
            addCriterion("item_src in", values, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcNotIn(List<String> values) {
            addCriterion("item_src not in", values, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcBetween(String value1, String value2) {
            addCriterion("item_src between", value1, value2, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andItemSrcNotBetween(String value1, String value2) {
            addCriterion("item_src not between", value1, value2, "itemSrc");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportIsNull() {
            addCriterion("is_shout_support is null");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportIsNotNull() {
            addCriterion("is_shout_support is not null");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportEqualTo(Byte value) {
            addCriterion("is_shout_support =", value, "isShoutSupport");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportNotEqualTo(Byte value) {
            addCriterion("is_shout_support <>", value, "isShoutSupport");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportGreaterThan(Byte value) {
            addCriterion("is_shout_support >", value, "isShoutSupport");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_shout_support >=", value, "isShoutSupport");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportLessThan(Byte value) {
            addCriterion("is_shout_support <", value, "isShoutSupport");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportLessThanOrEqualTo(Byte value) {
            addCriterion("is_shout_support <=", value, "isShoutSupport");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportIn(List<Byte> values) {
            addCriterion("is_shout_support in", values, "isShoutSupport");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportNotIn(List<Byte> values) {
            addCriterion("is_shout_support not in", values, "isShoutSupport");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportBetween(Byte value1, Byte value2) {
            addCriterion("is_shout_support between", value1, value2, "isShoutSupport");
            return (Criteria) this;
        }

        public Criteria andIsShoutSupportNotBetween(Byte value1, Byte value2) {
            addCriterion("is_shout_support not between", value1, value2, "isShoutSupport");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowIsNull() {
            addCriterion("detail_button_show is null");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowIsNotNull() {
            addCriterion("detail_button_show is not null");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowEqualTo(String value) {
            addCriterion("detail_button_show =", value, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowNotEqualTo(String value) {
            addCriterion("detail_button_show <>", value, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowGreaterThan(String value) {
            addCriterion("detail_button_show >", value, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowGreaterThanOrEqualTo(String value) {
            addCriterion("detail_button_show >=", value, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowLessThan(String value) {
            addCriterion("detail_button_show <", value, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowLessThanOrEqualTo(String value) {
            addCriterion("detail_button_show <=", value, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowLike(String value) {
            addCriterion("detail_button_show like", value, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowNotLike(String value) {
            addCriterion("detail_button_show not like", value, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowIn(List<String> values) {
            addCriterion("detail_button_show in", values, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowNotIn(List<String> values) {
            addCriterion("detail_button_show not in", values, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowBetween(String value1, String value2) {
            addCriterion("detail_button_show between", value1, value2, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andDetailButtonShowNotBetween(String value1, String value2) {
            addCriterion("detail_button_show not between", value1, value2, "detailButtonShow");
            return (Criteria) this;
        }

        public Criteria andActuatorIsNull() {
            addCriterion("actuator is null");
            return (Criteria) this;
        }

        public Criteria andActuatorIsNotNull() {
            addCriterion("actuator is not null");
            return (Criteria) this;
        }

        public Criteria andActuatorEqualTo(String value) {
            addCriterion("actuator =", value, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorNotEqualTo(String value) {
            addCriterion("actuator <>", value, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorGreaterThan(String value) {
            addCriterion("actuator >", value, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorGreaterThanOrEqualTo(String value) {
            addCriterion("actuator >=", value, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorLessThan(String value) {
            addCriterion("actuator <", value, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorLessThanOrEqualTo(String value) {
            addCriterion("actuator <=", value, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorLike(String value) {
            addCriterion("actuator like", value, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorNotLike(String value) {
            addCriterion("actuator not like", value, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorIn(List<String> values) {
            addCriterion("actuator in", values, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorNotIn(List<String> values) {
            addCriterion("actuator not in", values, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorBetween(String value1, String value2) {
            addCriterion("actuator between", value1, value2, "actuator");
            return (Criteria) this;
        }

        public Criteria andActuatorNotBetween(String value1, String value2) {
            addCriterion("actuator not between", value1, value2, "actuator");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIsNull() {
            addCriterion("price_max is null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIsNotNull() {
            addCriterion("price_max is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxEqualTo(String value) {
            addCriterion("price_max =", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotEqualTo(String value) {
            addCriterion("price_max <>", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxGreaterThan(String value) {
            addCriterion("price_max >", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxGreaterThanOrEqualTo(String value) {
            addCriterion("price_max >=", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxLessThan(String value) {
            addCriterion("price_max <", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxLessThanOrEqualTo(String value) {
            addCriterion("price_max <=", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxLike(String value) {
            addCriterion("price_max like", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotLike(String value) {
            addCriterion("price_max not like", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIn(List<String> values) {
            addCriterion("price_max in", values, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotIn(List<String> values) {
            addCriterion("price_max not in", values, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBetween(String value1, String value2) {
            addCriterion("price_max between", value1, value2, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotBetween(String value1, String value2) {
            addCriterion("price_max not between", value1, value2, "priceMax");
            return (Criteria) this;
        }

        public Criteria andSupportContentIsNull() {
            addCriterion("support_content is null");
            return (Criteria) this;
        }

        public Criteria andSupportContentIsNotNull() {
            addCriterion("support_content is not null");
            return (Criteria) this;
        }

        public Criteria andSupportContentEqualTo(String value) {
            addCriterion("support_content =", value, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentNotEqualTo(String value) {
            addCriterion("support_content <>", value, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentGreaterThan(String value) {
            addCriterion("support_content >", value, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentGreaterThanOrEqualTo(String value) {
            addCriterion("support_content >=", value, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentLessThan(String value) {
            addCriterion("support_content <", value, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentLessThanOrEqualTo(String value) {
            addCriterion("support_content <=", value, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentLike(String value) {
            addCriterion("support_content like", value, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentNotLike(String value) {
            addCriterion("support_content not like", value, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentIn(List<String> values) {
            addCriterion("support_content in", values, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentNotIn(List<String> values) {
            addCriterion("support_content not in", values, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentBetween(String value1, String value2) {
            addCriterion("support_content between", value1, value2, "supportContent");
            return (Criteria) this;
        }

        public Criteria andSupportContentNotBetween(String value1, String value2) {
            addCriterion("support_content not between", value1, value2, "supportContent");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatIsNull() {
            addCriterion("is_select_seat is null");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatIsNotNull() {
            addCriterion("is_select_seat is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatEqualTo(Integer value) {
            addCriterion("is_select_seat =", value, "isSelectSeat");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatNotEqualTo(Integer value) {
            addCriterion("is_select_seat <>", value, "isSelectSeat");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatGreaterThan(Integer value) {
            addCriterion("is_select_seat >", value, "isSelectSeat");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_select_seat >=", value, "isSelectSeat");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatLessThan(Integer value) {
            addCriterion("is_select_seat <", value, "isSelectSeat");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatLessThanOrEqualTo(Integer value) {
            addCriterion("is_select_seat <=", value, "isSelectSeat");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatIn(List<Integer> values) {
            addCriterion("is_select_seat in", values, "isSelectSeat");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatNotIn(List<Integer> values) {
            addCriterion("is_select_seat not in", values, "isSelectSeat");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatBetween(Integer value1, Integer value2) {
            addCriterion("is_select_seat between", value1, value2, "isSelectSeat");
            return (Criteria) this;
        }

        public Criteria andIsSelectSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("is_select_seat not between", value1, value2, "isSelectSeat");
            return (Criteria) this;
        }
    }

    /**
     * item_info的映射实体
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