/* github.com/orange1438 */
package com.wepiao.bd.sport.bean;

import java.io.Serializable;

public class ItemScreenings implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String itemId;

    private String titleCn;

    private String titleEn;

    private Long showStartTime;

    private Long showEndTime;

    private Integer checkIn;

    private Integer hasIdnumber;

    private Integer seatType;

    private Integer seatPerson;

    private String remark;

    private String venueChartId;

    private Integer isVisible;

    private Integer editStep;

    private Integer width;

    private Integer height;

    private String hallName;

    private String venueChartTemplate;

    private String voteType;

    private Integer stopBuyType;

    private Integer idMaxNum;

    private Boolean isTariff;

    private String tariffBegin;

    private Integer stepNum;

    private String tariffEnd;

    private Long grabStartTime;

    private Boolean isAnswer;

    private String problemSysid;

    private String problemName;

    private String openTime;

    private String closeTime;

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

    public Long getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(Long showStartTime) {
        this.showStartTime = showStartTime;
    }

    public Long getShowEndTime() {
        return showEndTime;
    }

    public void setShowEndTime(Long showEndTime) {
        this.showEndTime = showEndTime;
    }

    public Integer getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Integer checkIn) {
        this.checkIn = checkIn;
    }

    public Integer getHasIdnumber() {
        return hasIdnumber;
    }

    public void setHasIdnumber(Integer hasIdnumber) {
        this.hasIdnumber = hasIdnumber;
    }

    public Integer getSeatType() {
        return seatType;
    }

    public void setSeatType(Integer seatType) {
        this.seatType = seatType;
    }

    public Integer getSeatPerson() {
        return seatPerson;
    }

    public void setSeatPerson(Integer seatPerson) {
        this.seatPerson = seatPerson;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getVenueChartId() {
        return venueChartId;
    }

    public void setVenueChartId(String venueChartId) {
        this.venueChartId = venueChartId == null ? null : venueChartId.trim();
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    public Integer getEditStep() {
        return editStep;
    }

    public void setEditStep(Integer editStep) {
        this.editStep = editStep;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName == null ? null : hallName.trim();
    }

    public String getVenueChartTemplate() {
        return venueChartTemplate;
    }

    public void setVenueChartTemplate(String venueChartTemplate) {
        this.venueChartTemplate = venueChartTemplate == null ? null : venueChartTemplate.trim();
    }

    public String getVoteType() {
        return voteType;
    }

    public void setVoteType(String voteType) {
        this.voteType = voteType == null ? null : voteType.trim();
    }

    public Integer getStopBuyType() {
        return stopBuyType;
    }

    public void setStopBuyType(Integer stopBuyType) {
        this.stopBuyType = stopBuyType;
    }

    public Integer getIdMaxNum() {
        return idMaxNum;
    }

    public void setIdMaxNum(Integer idMaxNum) {
        this.idMaxNum = idMaxNum;
    }

    public Boolean getIsTariff() {
        return isTariff;
    }

    public void setIsTariff(Boolean isTariff) {
        this.isTariff = isTariff;
    }

    public String getTariffBegin() {
        return tariffBegin;
    }

    public void setTariffBegin(String tariffBegin) {
        this.tariffBegin = tariffBegin == null ? null : tariffBegin.trim();
    }

    public Integer getStepNum() {
        return stepNum;
    }

    public void setStepNum(Integer stepNum) {
        this.stepNum = stepNum;
    }

    public String getTariffEnd() {
        return tariffEnd;
    }

    public void setTariffEnd(String tariffEnd) {
        this.tariffEnd = tariffEnd == null ? null : tariffEnd.trim();
    }

    public Long getGrabStartTime() {
        return grabStartTime;
    }

    public void setGrabStartTime(Long grabStartTime) {
        this.grabStartTime = grabStartTime;
    }

    public Boolean getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(Boolean isAnswer) {
        this.isAnswer = isAnswer;
    }

    public String getProblemSysid() {
        return problemSysid;
    }

    public void setProblemSysid(String problemSysid) {
        this.problemSysid = problemSysid == null ? null : problemSysid.trim();
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName == null ? null : problemName.trim();
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime == null ? null : closeTime.trim();
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
        sb.append(", titleCn=").append(titleCn);
        sb.append(", titleEn=").append(titleEn);
        sb.append(", showStartTime=").append(showStartTime);
        sb.append(", showEndTime=").append(showEndTime);
        sb.append(", checkIn=").append(checkIn);
        sb.append(", hasIdnumber=").append(hasIdnumber);
        sb.append(", seatType=").append(seatType);
        sb.append(", seatPerson=").append(seatPerson);
        sb.append(", remark=").append(remark);
        sb.append(", venueChartId=").append(venueChartId);
        sb.append(", isVisible=").append(isVisible);
        sb.append(", editStep=").append(editStep);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", hallName=").append(hallName);
        sb.append(", venueChartTemplate=").append(venueChartTemplate);
        sb.append(", voteType=").append(voteType);
        sb.append(", stopBuyType=").append(stopBuyType);
        sb.append(", idMaxNum=").append(idMaxNum);
        sb.append(", isTariff=").append(isTariff);
        sb.append(", tariffBegin=").append(tariffBegin);
        sb.append(", stepNum=").append(stepNum);
        sb.append(", tariffEnd=").append(tariffEnd);
        sb.append(", grabStartTime=").append(grabStartTime);
        sb.append(", isAnswer=").append(isAnswer);
        sb.append(", problemSysid=").append(problemSysid);
        sb.append(", problemName=").append(problemName);
        sb.append(", openTime=").append(openTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append("]");
        return sb.toString();
    }
}