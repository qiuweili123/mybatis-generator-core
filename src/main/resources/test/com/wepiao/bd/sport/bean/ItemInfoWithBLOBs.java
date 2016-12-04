/* github.com/orange1438 */
package com.wepiao.bd.sport.bean;

import java.io.Serializable;

public class ItemInfoWithBLOBs extends ItemInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String images;

    private String description;

    private String ticketAreaImages;

    private String videos;

    private String itemImages;

    private String itemIntro;

    private String shopGuide;

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTicketAreaImages() {
        return ticketAreaImages;
    }

    public void setTicketAreaImages(String ticketAreaImages) {
        this.ticketAreaImages = ticketAreaImages == null ? null : ticketAreaImages.trim();
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos == null ? null : videos.trim();
    }

    public String getItemImages() {
        return itemImages;
    }

    public void setItemImages(String itemImages) {
        this.itemImages = itemImages == null ? null : itemImages.trim();
    }

    public String getItemIntro() {
        return itemIntro;
    }

    public void setItemIntro(String itemIntro) {
        this.itemIntro = itemIntro == null ? null : itemIntro.trim();
    }

    public String getShopGuide() {
        return shopGuide;
    }

    public void setShopGuide(String shopGuide) {
        this.shopGuide = shopGuide == null ? null : shopGuide.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", images=").append(images);
        sb.append(", description=").append(description);
        sb.append(", ticketAreaImages=").append(ticketAreaImages);
        sb.append(", videos=").append(videos);
        sb.append(", itemImages=").append(itemImages);
        sb.append(", itemIntro=").append(itemIntro);
        sb.append(", shopGuide=").append(shopGuide);
        sb.append("]");
        return sb.toString();
    }
}