package com.huotu.android.library.buyer.bean.AdBean;

/**
 * Created by Administrator on 2016/1/20.
 */
public class AdImageBean {
    /**
     *
     */
    private long id;
    /**
     * 图片地址
     */
    private String imageUrl;
    /**
     * 广告图片名称(app端可以忽略)
     */
    private String title;
    /**
     * 链接类型（app端可以忽略）
     */
    private String linkType;
    /**
     * 链接名称（app端可以忽略）
     */
    private String linkName;
    /**
     * 链接地址
     */
    private String linkUrl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
}
