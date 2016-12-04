/* github.com/orange1438 */
package com.wepiao.bd.sport.bean;

import java.io.Serializable;

public class ItemInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String businessId;

    private String titleCn;

    private String titleEn;

    private String typeId;

    private String typePid;

    private String showTime;

    private Integer screeningLength;

    private String venueId;

    private String priceRange;

    private String source;

    private Integer status;

    private String remark;

    private Long createTime;

    private String cityId;

    private String voteType;

    private String xiaoBianSaid;

    private String hostBusinessId;

    private String itemSrc;

    private Byte isShoutSupport;

    private String detailButtonShow;

    private String actuator;

    private String priceMax;

    private String supportContent;

    private Integer isSelectSeat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getTitleCn() {
        return titleCn;
    }

    public void setTitleCn(String titleCn) {
        this.titleCn = titleCn == null ? null : titleCn.trim();
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn == null ? null : titleEn.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getTypePid() {
        return typePid;
    }

    public void setTypePid(String typePid) {
        this.typePid = typePid == null ? null : typePid.trim();
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime == null ? null : showTime.trim();
    }

    public Integer getScreeningLength() {
        return screeningLength;
    }

    public void setScreeningLength(Integer screeningLength) {
        this.screeningLength = screeningLength;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId == null ? null : venueId.trim();
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange == null ? null : priceRange.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getVoteType() {
        return voteType;
    }

    public void setVoteType(String voteType) {
        this.voteType = voteType == null ? null : voteType.trim();
    }

    public String getXiaoBianSaid() {
        return xiaoBianSaid;
    }

    public void setXiaoBianSaid(String xiaoBianSaid) {
        this.xiaoBianSaid = xiaoBianSaid == null ? null : xiaoBianSaid.trim();
    }

    public String getHostBusinessId() {
        return hostBusinessId;
    }

    public void setHostBusinessId(String hostBusinessId) {
        this.hostBusinessId = hostBusinessId == null ? null : hostBusinessId.trim();
    }

    public String getItemSrc() {
        return itemSrc;
    }

    public void setItemSrc(String itemSrc) {
        this.itemSrc = itemSrc == null ? null : itemSrc.trim();
    }

    public Byte getIsShoutSupport() {
        return isShoutSupport;
    }

    public void setIsShoutSupport(Byte isShoutSupport) {
        this.isShoutSupport = isShoutSupport;
    }

    public String getDetailButtonShow() {
        return detailButtonShow;
    }

    public void setDetailButtonShow(String detailButtonShow) {
        this.detailButtonShow = detailButtonShow == null ? null : detailButtonShow.trim();
    }

    public String getActuator() {
        return actuator;
    }

    public void setActuator(String actuator) {
        this.actuator = actuator == null ? null : actuator.trim();
    }

    public String getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(String priceMax) {
        this.priceMax = priceMax == null ? null : priceMax.trim();
    }

    public String getSupportContent() {
        return supportContent;
    }

    public void setSupportContent(String supportContent) {
        this.supportContent = supportContent == null ? null : supportContent.trim();
    }

    public Integer getIsSelectSeat() {
        return isSelectSeat;
    }

    public void setIsSelectSeat(Integer isSelectSeat) {
        this.isSelectSeat = isSelectSeat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", businessId=").append(businessId);
        sb.append(", titleCn=").append(titleCn);
        sb.append(", titleEn=").append(titleEn);
        sb.append(", typeId=").append(typeId);
        sb.append(", typePid=").append(typePid);
        sb.append(", showTime=").append(showTime);
        sb.append(", screeningLength=").append(screeningLength);
        sb.append(", venueId=").append(venueId);
        sb.append(", priceRange=").append(priceRange);
        sb.append(", source=").append(source);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", cityId=").append(cityId);
        sb.append(", voteType=").append(voteType);
        sb.append(", xiaoBianSaid=").append(xiaoBianSaid);
        sb.append(", hostBusinessId=").append(hostBusinessId);
        sb.append(", itemSrc=").append(itemSrc);
        sb.append(", isShoutSupport=").append(isShoutSupport);
        sb.append(", detailButtonShow=").append(detailButtonShow);
        sb.append(", actuator=").append(actuator);
        sb.append(", priceMax=").append(priceMax);
        sb.append(", supportContent=").append(supportContent);
        sb.append(", isSelectSeat=").append(isSelectSeat);
        sb.append("]");
        return sb.toString();
    }
}