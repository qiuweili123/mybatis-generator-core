/* github.com/orange1438 */
package com.wepiao.bd.sport.bean;

import java.util.ArrayList;
import java.util.List;

public class ItemScreeningsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemScreeningsCriteria() {
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

        public Criteria andShowStartTimeIsNull() {
            addCriterion("show_start_time is null");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeIsNotNull() {
            addCriterion("show_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeEqualTo(Long value) {
            addCriterion("show_start_time =", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeNotEqualTo(Long value) {
            addCriterion("show_start_time <>", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeGreaterThan(Long value) {
            addCriterion("show_start_time >", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("show_start_time >=", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeLessThan(Long value) {
            addCriterion("show_start_time <", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("show_start_time <=", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeIn(List<Long> values) {
            addCriterion("show_start_time in", values, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeNotIn(List<Long> values) {
            addCriterion("show_start_time not in", values, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeBetween(Long value1, Long value2) {
            addCriterion("show_start_time between", value1, value2, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("show_start_time not between", value1, value2, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeIsNull() {
            addCriterion("show_end_time is null");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeIsNotNull() {
            addCriterion("show_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeEqualTo(Long value) {
            addCriterion("show_end_time =", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeNotEqualTo(Long value) {
            addCriterion("show_end_time <>", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeGreaterThan(Long value) {
            addCriterion("show_end_time >", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("show_end_time >=", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeLessThan(Long value) {
            addCriterion("show_end_time <", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("show_end_time <=", value, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeIn(List<Long> values) {
            addCriterion("show_end_time in", values, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeNotIn(List<Long> values) {
            addCriterion("show_end_time not in", values, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeBetween(Long value1, Long value2) {
            addCriterion("show_end_time between", value1, value2, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andShowEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("show_end_time not between", value1, value2, "showEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInIsNull() {
            addCriterion("check_in is null");
            return (Criteria) this;
        }

        public Criteria andCheckInIsNotNull() {
            addCriterion("check_in is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInEqualTo(Integer value) {
            addCriterion("check_in =", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotEqualTo(Integer value) {
            addCriterion("check_in <>", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInGreaterThan(Integer value) {
            addCriterion("check_in >", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_in >=", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLessThan(Integer value) {
            addCriterion("check_in <", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLessThanOrEqualTo(Integer value) {
            addCriterion("check_in <=", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInIn(List<Integer> values) {
            addCriterion("check_in in", values, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotIn(List<Integer> values) {
            addCriterion("check_in not in", values, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInBetween(Integer value1, Integer value2) {
            addCriterion("check_in between", value1, value2, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotBetween(Integer value1, Integer value2) {
            addCriterion("check_in not between", value1, value2, "checkIn");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberIsNull() {
            addCriterion("has_idnumber is null");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberIsNotNull() {
            addCriterion("has_idnumber is not null");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberEqualTo(Integer value) {
            addCriterion("has_idnumber =", value, "hasIdnumber");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberNotEqualTo(Integer value) {
            addCriterion("has_idnumber <>", value, "hasIdnumber");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberGreaterThan(Integer value) {
            addCriterion("has_idnumber >", value, "hasIdnumber");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_idnumber >=", value, "hasIdnumber");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberLessThan(Integer value) {
            addCriterion("has_idnumber <", value, "hasIdnumber");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberLessThanOrEqualTo(Integer value) {
            addCriterion("has_idnumber <=", value, "hasIdnumber");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberIn(List<Integer> values) {
            addCriterion("has_idnumber in", values, "hasIdnumber");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberNotIn(List<Integer> values) {
            addCriterion("has_idnumber not in", values, "hasIdnumber");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberBetween(Integer value1, Integer value2) {
            addCriterion("has_idnumber between", value1, value2, "hasIdnumber");
            return (Criteria) this;
        }

        public Criteria andHasIdnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("has_idnumber not between", value1, value2, "hasIdnumber");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIsNull() {
            addCriterion("seat_type is null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIsNotNull() {
            addCriterion("seat_type is not null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeEqualTo(Integer value) {
            addCriterion("seat_type =", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotEqualTo(Integer value) {
            addCriterion("seat_type <>", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeGreaterThan(Integer value) {
            addCriterion("seat_type >", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_type >=", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeLessThan(Integer value) {
            addCriterion("seat_type <", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeLessThanOrEqualTo(Integer value) {
            addCriterion("seat_type <=", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIn(List<Integer> values) {
            addCriterion("seat_type in", values, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotIn(List<Integer> values) {
            addCriterion("seat_type not in", values, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeBetween(Integer value1, Integer value2) {
            addCriterion("seat_type between", value1, value2, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_type not between", value1, value2, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatPersonIsNull() {
            addCriterion("seat_person is null");
            return (Criteria) this;
        }

        public Criteria andSeatPersonIsNotNull() {
            addCriterion("seat_person is not null");
            return (Criteria) this;
        }

        public Criteria andSeatPersonEqualTo(Integer value) {
            addCriterion("seat_person =", value, "seatPerson");
            return (Criteria) this;
        }

        public Criteria andSeatPersonNotEqualTo(Integer value) {
            addCriterion("seat_person <>", value, "seatPerson");
            return (Criteria) this;
        }

        public Criteria andSeatPersonGreaterThan(Integer value) {
            addCriterion("seat_person >", value, "seatPerson");
            return (Criteria) this;
        }

        public Criteria andSeatPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_person >=", value, "seatPerson");
            return (Criteria) this;
        }

        public Criteria andSeatPersonLessThan(Integer value) {
            addCriterion("seat_person <", value, "seatPerson");
            return (Criteria) this;
        }

        public Criteria andSeatPersonLessThanOrEqualTo(Integer value) {
            addCriterion("seat_person <=", value, "seatPerson");
            return (Criteria) this;
        }

        public Criteria andSeatPersonIn(List<Integer> values) {
            addCriterion("seat_person in", values, "seatPerson");
            return (Criteria) this;
        }

        public Criteria andSeatPersonNotIn(List<Integer> values) {
            addCriterion("seat_person not in", values, "seatPerson");
            return (Criteria) this;
        }

        public Criteria andSeatPersonBetween(Integer value1, Integer value2) {
            addCriterion("seat_person between", value1, value2, "seatPerson");
            return (Criteria) this;
        }

        public Criteria andSeatPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_person not between", value1, value2, "seatPerson");
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

        public Criteria andVenueChartIdIsNull() {
            addCriterion("venue_chart_id is null");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdIsNotNull() {
            addCriterion("venue_chart_id is not null");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdEqualTo(String value) {
            addCriterion("venue_chart_id =", value, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdNotEqualTo(String value) {
            addCriterion("venue_chart_id <>", value, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdGreaterThan(String value) {
            addCriterion("venue_chart_id >", value, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdGreaterThanOrEqualTo(String value) {
            addCriterion("venue_chart_id >=", value, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdLessThan(String value) {
            addCriterion("venue_chart_id <", value, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdLessThanOrEqualTo(String value) {
            addCriterion("venue_chart_id <=", value, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdLike(String value) {
            addCriterion("venue_chart_id like", value, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdNotLike(String value) {
            addCriterion("venue_chart_id not like", value, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdIn(List<String> values) {
            addCriterion("venue_chart_id in", values, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdNotIn(List<String> values) {
            addCriterion("venue_chart_id not in", values, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdBetween(String value1, String value2) {
            addCriterion("venue_chart_id between", value1, value2, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andVenueChartIdNotBetween(String value1, String value2) {
            addCriterion("venue_chart_id not between", value1, value2, "venueChartId");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIsNull() {
            addCriterion("is_visible is null");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIsNotNull() {
            addCriterion("is_visible is not null");
            return (Criteria) this;
        }

        public Criteria andIsVisibleEqualTo(Integer value) {
            addCriterion("is_visible =", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotEqualTo(Integer value) {
            addCriterion("is_visible <>", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleGreaterThan(Integer value) {
            addCriterion("is_visible >", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_visible >=", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLessThan(Integer value) {
            addCriterion("is_visible <", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLessThanOrEqualTo(Integer value) {
            addCriterion("is_visible <=", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIn(List<Integer> values) {
            addCriterion("is_visible in", values, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotIn(List<Integer> values) {
            addCriterion("is_visible not in", values, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleBetween(Integer value1, Integer value2) {
            addCriterion("is_visible between", value1, value2, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_visible not between", value1, value2, "isVisible");
            return (Criteria) this;
        }

        public Criteria andEditStepIsNull() {
            addCriterion("edit_step is null");
            return (Criteria) this;
        }

        public Criteria andEditStepIsNotNull() {
            addCriterion("edit_step is not null");
            return (Criteria) this;
        }

        public Criteria andEditStepEqualTo(Integer value) {
            addCriterion("edit_step =", value, "editStep");
            return (Criteria) this;
        }

        public Criteria andEditStepNotEqualTo(Integer value) {
            addCriterion("edit_step <>", value, "editStep");
            return (Criteria) this;
        }

        public Criteria andEditStepGreaterThan(Integer value) {
            addCriterion("edit_step >", value, "editStep");
            return (Criteria) this;
        }

        public Criteria andEditStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_step >=", value, "editStep");
            return (Criteria) this;
        }

        public Criteria andEditStepLessThan(Integer value) {
            addCriterion("edit_step <", value, "editStep");
            return (Criteria) this;
        }

        public Criteria andEditStepLessThanOrEqualTo(Integer value) {
            addCriterion("edit_step <=", value, "editStep");
            return (Criteria) this;
        }

        public Criteria andEditStepIn(List<Integer> values) {
            addCriterion("edit_step in", values, "editStep");
            return (Criteria) this;
        }

        public Criteria andEditStepNotIn(List<Integer> values) {
            addCriterion("edit_step not in", values, "editStep");
            return (Criteria) this;
        }

        public Criteria andEditStepBetween(Integer value1, Integer value2) {
            addCriterion("edit_step between", value1, value2, "editStep");
            return (Criteria) this;
        }

        public Criteria andEditStepNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_step not between", value1, value2, "editStep");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHallNameIsNull() {
            addCriterion("hall_name is null");
            return (Criteria) this;
        }

        public Criteria andHallNameIsNotNull() {
            addCriterion("hall_name is not null");
            return (Criteria) this;
        }

        public Criteria andHallNameEqualTo(String value) {
            addCriterion("hall_name =", value, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameNotEqualTo(String value) {
            addCriterion("hall_name <>", value, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameGreaterThan(String value) {
            addCriterion("hall_name >", value, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameGreaterThanOrEqualTo(String value) {
            addCriterion("hall_name >=", value, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameLessThan(String value) {
            addCriterion("hall_name <", value, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameLessThanOrEqualTo(String value) {
            addCriterion("hall_name <=", value, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameLike(String value) {
            addCriterion("hall_name like", value, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameNotLike(String value) {
            addCriterion("hall_name not like", value, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameIn(List<String> values) {
            addCriterion("hall_name in", values, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameNotIn(List<String> values) {
            addCriterion("hall_name not in", values, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameBetween(String value1, String value2) {
            addCriterion("hall_name between", value1, value2, "hallName");
            return (Criteria) this;
        }

        public Criteria andHallNameNotBetween(String value1, String value2) {
            addCriterion("hall_name not between", value1, value2, "hallName");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateIsNull() {
            addCriterion("venue_chart_template is null");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateIsNotNull() {
            addCriterion("venue_chart_template is not null");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateEqualTo(String value) {
            addCriterion("venue_chart_template =", value, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateNotEqualTo(String value) {
            addCriterion("venue_chart_template <>", value, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateGreaterThan(String value) {
            addCriterion("venue_chart_template >", value, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("venue_chart_template >=", value, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateLessThan(String value) {
            addCriterion("venue_chart_template <", value, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateLessThanOrEqualTo(String value) {
            addCriterion("venue_chart_template <=", value, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateLike(String value) {
            addCriterion("venue_chart_template like", value, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateNotLike(String value) {
            addCriterion("venue_chart_template not like", value, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateIn(List<String> values) {
            addCriterion("venue_chart_template in", values, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateNotIn(List<String> values) {
            addCriterion("venue_chart_template not in", values, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateBetween(String value1, String value2) {
            addCriterion("venue_chart_template between", value1, value2, "venueChartTemplate");
            return (Criteria) this;
        }

        public Criteria andVenueChartTemplateNotBetween(String value1, String value2) {
            addCriterion("venue_chart_template not between", value1, value2, "venueChartTemplate");
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

        public Criteria andStopBuyTypeIsNull() {
            addCriterion("stop_buy_type is null");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeIsNotNull() {
            addCriterion("stop_buy_type is not null");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeEqualTo(Integer value) {
            addCriterion("stop_buy_type =", value, "stopBuyType");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeNotEqualTo(Integer value) {
            addCriterion("stop_buy_type <>", value, "stopBuyType");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeGreaterThan(Integer value) {
            addCriterion("stop_buy_type >", value, "stopBuyType");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stop_buy_type >=", value, "stopBuyType");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeLessThan(Integer value) {
            addCriterion("stop_buy_type <", value, "stopBuyType");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("stop_buy_type <=", value, "stopBuyType");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeIn(List<Integer> values) {
            addCriterion("stop_buy_type in", values, "stopBuyType");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeNotIn(List<Integer> values) {
            addCriterion("stop_buy_type not in", values, "stopBuyType");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeBetween(Integer value1, Integer value2) {
            addCriterion("stop_buy_type between", value1, value2, "stopBuyType");
            return (Criteria) this;
        }

        public Criteria andStopBuyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("stop_buy_type not between", value1, value2, "stopBuyType");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumIsNull() {
            addCriterion("id_max_num is null");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumIsNotNull() {
            addCriterion("id_max_num is not null");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumEqualTo(Integer value) {
            addCriterion("id_max_num =", value, "idMaxNum");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumNotEqualTo(Integer value) {
            addCriterion("id_max_num <>", value, "idMaxNum");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumGreaterThan(Integer value) {
            addCriterion("id_max_num >", value, "idMaxNum");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_max_num >=", value, "idMaxNum");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumLessThan(Integer value) {
            addCriterion("id_max_num <", value, "idMaxNum");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumLessThanOrEqualTo(Integer value) {
            addCriterion("id_max_num <=", value, "idMaxNum");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumIn(List<Integer> values) {
            addCriterion("id_max_num in", values, "idMaxNum");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumNotIn(List<Integer> values) {
            addCriterion("id_max_num not in", values, "idMaxNum");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumBetween(Integer value1, Integer value2) {
            addCriterion("id_max_num between", value1, value2, "idMaxNum");
            return (Criteria) this;
        }

        public Criteria andIdMaxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("id_max_num not between", value1, value2, "idMaxNum");
            return (Criteria) this;
        }

        public Criteria andIsTariffIsNull() {
            addCriterion("is_tariff is null");
            return (Criteria) this;
        }

        public Criteria andIsTariffIsNotNull() {
            addCriterion("is_tariff is not null");
            return (Criteria) this;
        }

        public Criteria andIsTariffEqualTo(Boolean value) {
            addCriterion("is_tariff =", value, "isTariff");
            return (Criteria) this;
        }

        public Criteria andIsTariffNotEqualTo(Boolean value) {
            addCriterion("is_tariff <>", value, "isTariff");
            return (Criteria) this;
        }

        public Criteria andIsTariffGreaterThan(Boolean value) {
            addCriterion("is_tariff >", value, "isTariff");
            return (Criteria) this;
        }

        public Criteria andIsTariffGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_tariff >=", value, "isTariff");
            return (Criteria) this;
        }

        public Criteria andIsTariffLessThan(Boolean value) {
            addCriterion("is_tariff <", value, "isTariff");
            return (Criteria) this;
        }

        public Criteria andIsTariffLessThanOrEqualTo(Boolean value) {
            addCriterion("is_tariff <=", value, "isTariff");
            return (Criteria) this;
        }

        public Criteria andIsTariffIn(List<Boolean> values) {
            addCriterion("is_tariff in", values, "isTariff");
            return (Criteria) this;
        }

        public Criteria andIsTariffNotIn(List<Boolean> values) {
            addCriterion("is_tariff not in", values, "isTariff");
            return (Criteria) this;
        }

        public Criteria andIsTariffBetween(Boolean value1, Boolean value2) {
            addCriterion("is_tariff between", value1, value2, "isTariff");
            return (Criteria) this;
        }

        public Criteria andIsTariffNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_tariff not between", value1, value2, "isTariff");
            return (Criteria) this;
        }

        public Criteria andTariffBeginIsNull() {
            addCriterion("tariff_begin is null");
            return (Criteria) this;
        }

        public Criteria andTariffBeginIsNotNull() {
            addCriterion("tariff_begin is not null");
            return (Criteria) this;
        }

        public Criteria andTariffBeginEqualTo(String value) {
            addCriterion("tariff_begin =", value, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginNotEqualTo(String value) {
            addCriterion("tariff_begin <>", value, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginGreaterThan(String value) {
            addCriterion("tariff_begin >", value, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginGreaterThanOrEqualTo(String value) {
            addCriterion("tariff_begin >=", value, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginLessThan(String value) {
            addCriterion("tariff_begin <", value, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginLessThanOrEqualTo(String value) {
            addCriterion("tariff_begin <=", value, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginLike(String value) {
            addCriterion("tariff_begin like", value, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginNotLike(String value) {
            addCriterion("tariff_begin not like", value, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginIn(List<String> values) {
            addCriterion("tariff_begin in", values, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginNotIn(List<String> values) {
            addCriterion("tariff_begin not in", values, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginBetween(String value1, String value2) {
            addCriterion("tariff_begin between", value1, value2, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andTariffBeginNotBetween(String value1, String value2) {
            addCriterion("tariff_begin not between", value1, value2, "tariffBegin");
            return (Criteria) this;
        }

        public Criteria andStepNumIsNull() {
            addCriterion("step_num is null");
            return (Criteria) this;
        }

        public Criteria andStepNumIsNotNull() {
            addCriterion("step_num is not null");
            return (Criteria) this;
        }

        public Criteria andStepNumEqualTo(Integer value) {
            addCriterion("step_num =", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotEqualTo(Integer value) {
            addCriterion("step_num <>", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumGreaterThan(Integer value) {
            addCriterion("step_num >", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_num >=", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumLessThan(Integer value) {
            addCriterion("step_num <", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumLessThanOrEqualTo(Integer value) {
            addCriterion("step_num <=", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumIn(List<Integer> values) {
            addCriterion("step_num in", values, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotIn(List<Integer> values) {
            addCriterion("step_num not in", values, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumBetween(Integer value1, Integer value2) {
            addCriterion("step_num between", value1, value2, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotBetween(Integer value1, Integer value2) {
            addCriterion("step_num not between", value1, value2, "stepNum");
            return (Criteria) this;
        }

        public Criteria andTariffEndIsNull() {
            addCriterion("tariff_end is null");
            return (Criteria) this;
        }

        public Criteria andTariffEndIsNotNull() {
            addCriterion("tariff_end is not null");
            return (Criteria) this;
        }

        public Criteria andTariffEndEqualTo(String value) {
            addCriterion("tariff_end =", value, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndNotEqualTo(String value) {
            addCriterion("tariff_end <>", value, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndGreaterThan(String value) {
            addCriterion("tariff_end >", value, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndGreaterThanOrEqualTo(String value) {
            addCriterion("tariff_end >=", value, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndLessThan(String value) {
            addCriterion("tariff_end <", value, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndLessThanOrEqualTo(String value) {
            addCriterion("tariff_end <=", value, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndLike(String value) {
            addCriterion("tariff_end like", value, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndNotLike(String value) {
            addCriterion("tariff_end not like", value, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndIn(List<String> values) {
            addCriterion("tariff_end in", values, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndNotIn(List<String> values) {
            addCriterion("tariff_end not in", values, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndBetween(String value1, String value2) {
            addCriterion("tariff_end between", value1, value2, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andTariffEndNotBetween(String value1, String value2) {
            addCriterion("tariff_end not between", value1, value2, "tariffEnd");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeIsNull() {
            addCriterion("grab_start_time is null");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeIsNotNull() {
            addCriterion("grab_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeEqualTo(Long value) {
            addCriterion("grab_start_time =", value, "grabStartTime");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeNotEqualTo(Long value) {
            addCriterion("grab_start_time <>", value, "grabStartTime");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeGreaterThan(Long value) {
            addCriterion("grab_start_time >", value, "grabStartTime");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("grab_start_time >=", value, "grabStartTime");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeLessThan(Long value) {
            addCriterion("grab_start_time <", value, "grabStartTime");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("grab_start_time <=", value, "grabStartTime");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeIn(List<Long> values) {
            addCriterion("grab_start_time in", values, "grabStartTime");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeNotIn(List<Long> values) {
            addCriterion("grab_start_time not in", values, "grabStartTime");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeBetween(Long value1, Long value2) {
            addCriterion("grab_start_time between", value1, value2, "grabStartTime");
            return (Criteria) this;
        }

        public Criteria andGrabStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("grab_start_time not between", value1, value2, "grabStartTime");
            return (Criteria) this;
        }

        public Criteria andIsAnswerIsNull() {
            addCriterion("is_answer is null");
            return (Criteria) this;
        }

        public Criteria andIsAnswerIsNotNull() {
            addCriterion("is_answer is not null");
            return (Criteria) this;
        }

        public Criteria andIsAnswerEqualTo(Boolean value) {
            addCriterion("is_answer =", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerNotEqualTo(Boolean value) {
            addCriterion("is_answer <>", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerGreaterThan(Boolean value) {
            addCriterion("is_answer >", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_answer >=", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerLessThan(Boolean value) {
            addCriterion("is_answer <", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerLessThanOrEqualTo(Boolean value) {
            addCriterion("is_answer <=", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerIn(List<Boolean> values) {
            addCriterion("is_answer in", values, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerNotIn(List<Boolean> values) {
            addCriterion("is_answer not in", values, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerBetween(Boolean value1, Boolean value2) {
            addCriterion("is_answer between", value1, value2, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_answer not between", value1, value2, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andProblemSysidIsNull() {
            addCriterion("problem_sysid is null");
            return (Criteria) this;
        }

        public Criteria andProblemSysidIsNotNull() {
            addCriterion("problem_sysid is not null");
            return (Criteria) this;
        }

        public Criteria andProblemSysidEqualTo(String value) {
            addCriterion("problem_sysid =", value, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidNotEqualTo(String value) {
            addCriterion("problem_sysid <>", value, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidGreaterThan(String value) {
            addCriterion("problem_sysid >", value, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidGreaterThanOrEqualTo(String value) {
            addCriterion("problem_sysid >=", value, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidLessThan(String value) {
            addCriterion("problem_sysid <", value, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidLessThanOrEqualTo(String value) {
            addCriterion("problem_sysid <=", value, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidLike(String value) {
            addCriterion("problem_sysid like", value, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidNotLike(String value) {
            addCriterion("problem_sysid not like", value, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidIn(List<String> values) {
            addCriterion("problem_sysid in", values, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidNotIn(List<String> values) {
            addCriterion("problem_sysid not in", values, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidBetween(String value1, String value2) {
            addCriterion("problem_sysid between", value1, value2, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemSysidNotBetween(String value1, String value2) {
            addCriterion("problem_sysid not between", value1, value2, "problemSysid");
            return (Criteria) this;
        }

        public Criteria andProblemNameIsNull() {
            addCriterion("problem_name is null");
            return (Criteria) this;
        }

        public Criteria andProblemNameIsNotNull() {
            addCriterion("problem_name is not null");
            return (Criteria) this;
        }

        public Criteria andProblemNameEqualTo(String value) {
            addCriterion("problem_name =", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameNotEqualTo(String value) {
            addCriterion("problem_name <>", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameGreaterThan(String value) {
            addCriterion("problem_name >", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameGreaterThanOrEqualTo(String value) {
            addCriterion("problem_name >=", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameLessThan(String value) {
            addCriterion("problem_name <", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameLessThanOrEqualTo(String value) {
            addCriterion("problem_name <=", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameLike(String value) {
            addCriterion("problem_name like", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameNotLike(String value) {
            addCriterion("problem_name not like", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameIn(List<String> values) {
            addCriterion("problem_name in", values, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameNotIn(List<String> values) {
            addCriterion("problem_name not in", values, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameBetween(String value1, String value2) {
            addCriterion("problem_name between", value1, value2, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameNotBetween(String value1, String value2) {
            addCriterion("problem_name not between", value1, value2, "problemName");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(String value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(String value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(String value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(String value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(String value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLike(String value) {
            addCriterion("close_time like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotLike(String value) {
            addCriterion("close_time not like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<String> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<String> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(String value1, String value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(String value1, String value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }
    }

    /**
     * item_screenings的映射实体
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