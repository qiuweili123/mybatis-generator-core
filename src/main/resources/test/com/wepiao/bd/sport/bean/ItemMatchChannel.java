/* github.com/orange1438 */
package com.wepiao.bd.sport.bean;

import java.io.Serializable;

public class ItemMatchChannel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String onlineId;

    private String appAccessId;

    private String itemId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOnlineId() {
        return onlineId;
    }

    public void setOnlineId(String onlineId) {
        this.onlineId = onlineId == null ? null : onlineId.trim();
    }

    public String getAppAccessId() {
        return appAccessId;
    }

    public void setAppAccessId(String appAccessId) {
        this.appAccessId = appAccessId == null ? null : appAccessId.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", onlineId=").append(onlineId);
        sb.append(", appAccessId=").append(appAccessId);
        sb.append(", itemId=").append(itemId);
        sb.append("]");
        return sb.toString();
    }
}