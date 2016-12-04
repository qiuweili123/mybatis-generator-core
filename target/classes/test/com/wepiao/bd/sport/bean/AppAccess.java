/* github.com/orange1438 */
package com.wepiao.bd.sport.bean;

import java.io.Serializable;

public class AppAccess implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private Boolean isWepiao;

    private Long validateStartTime;

    private Long validateEndTime;

    private String businessId;

    private Integer orderSourcce;

    private String publicKey;

    private String apiGroupId;

    private Integer created;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIsWepiao() {
        return isWepiao;
    }

    public void setIsWepiao(Boolean isWepiao) {
        this.isWepiao = isWepiao;
    }

    public Long getValidateStartTime() {
        return validateStartTime;
    }

    public void setValidateStartTime(Long validateStartTime) {
        this.validateStartTime = validateStartTime;
    }

    public Long getValidateEndTime() {
        return validateEndTime;
    }

    public void setValidateEndTime(Long validateEndTime) {
        this.validateEndTime = validateEndTime;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Integer getOrderSourcce() {
        return orderSourcce;
    }

    public void setOrderSourcce(Integer orderSourcce) {
        this.orderSourcce = orderSourcce;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey == null ? null : publicKey.trim();
    }

    public String getApiGroupId() {
        return apiGroupId;
    }

    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId == null ? null : apiGroupId.trim();
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", isWepiao=").append(isWepiao);
        sb.append(", validateStartTime=").append(validateStartTime);
        sb.append(", validateEndTime=").append(validateEndTime);
        sb.append(", businessId=").append(businessId);
        sb.append(", orderSourcce=").append(orderSourcce);
        sb.append(", publicKey=").append(publicKey);
        sb.append(", apiGroupId=").append(apiGroupId);
        sb.append(", created=").append(created);
        sb.append("]");
        return sb.toString();
    }
}