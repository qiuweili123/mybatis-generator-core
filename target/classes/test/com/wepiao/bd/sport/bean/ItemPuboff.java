/* github.com/orange1438 */
package com.wepiao.bd.sport.bean;

import java.io.Serializable;

public class ItemPuboff implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String itemId;

    private String businessId;

    private Float agencyFees;

    private Integer orderBuyNum;

    private Integer userBuyNum;

    private Integer buyPriorityType;

    private String buyPriorityParam;

    private Integer sortBy;

    private String tag;

    private Long pubonTime;

    private Integer showBuyNum;

    private Long puboffTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Float getAgencyFees() {
        return agencyFees;
    }

    public void setAgencyFees(Float agencyFees) {
        this.agencyFees = agencyFees;
    }

    public Integer getOrderBuyNum() {
        return orderBuyNum;
    }

    public void setOrderBuyNum(Integer orderBuyNum) {
        this.orderBuyNum = orderBuyNum;
    }

    public Integer getUserBuyNum() {
        return userBuyNum;
    }

    public void setUserBuyNum(Integer userBuyNum) {
        this.userBuyNum = userBuyNum;
    }

    public Integer getBuyPriorityType() {
        return buyPriorityType;
    }

    public void setBuyPriorityType(Integer buyPriorityType) {
        this.buyPriorityType = buyPriorityType;
    }

    public String getBuyPriorityParam() {
        return buyPriorityParam;
    }

    public void setBuyPriorityParam(String buyPriorityParam) {
        this.buyPriorityParam = buyPriorityParam == null ? null : buyPriorityParam.trim();
    }

    public Integer getSortBy() {
        return sortBy;
    }

    public void setSortBy(Integer sortBy) {
        this.sortBy = sortBy;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Long getPubonTime() {
        return pubonTime;
    }

    public void setPubonTime(Long pubonTime) {
        this.pubonTime = pubonTime;
    }

    public Integer getShowBuyNum() {
        return showBuyNum;
    }

    public void setShowBuyNum(Integer showBuyNum) {
        this.showBuyNum = showBuyNum;
    }

    public Long getPuboffTime() {
        return puboffTime;
    }

    public void setPuboffTime(Long puboffTime) {
        this.puboffTime = puboffTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", itemId=").append(itemId);
        sb.append(", businessId=").append(businessId);
        sb.append(", agencyFees=").append(agencyFees);
        sb.append(", orderBuyNum=").append(orderBuyNum);
        sb.append(", userBuyNum=").append(userBuyNum);
        sb.append(", buyPriorityType=").append(buyPriorityType);
        sb.append(", buyPriorityParam=").append(buyPriorityParam);
        sb.append(", sortBy=").append(sortBy);
        sb.append(", tag=").append(tag);
        sb.append(", pubonTime=").append(pubonTime);
        sb.append(", showBuyNum=").append(showBuyNum);
        sb.append(", puboffTime=").append(puboffTime);
        sb.append("]");
        return sb.toString();
    }
}