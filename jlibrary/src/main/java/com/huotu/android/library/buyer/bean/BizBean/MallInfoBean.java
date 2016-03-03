package com.huotu.android.library.buyer.bean.BizBean;

/**
 * 商城基本信息
 * Created by Administrator on 2016/2/24.
 */
public class MallInfoBean {
    /**
     * 商城名称
     */
    private String mallName;
    /**
     * 商城logo
     */
    private String logo;
    /**
     * 分享描述信息
     */
    private String shareDesc;
    /**
     * 首页地址url
     */
    private String indexUrl;
    /**
     * 全部商品数量
     */
    private int goodNum;
    /**
     * 上新商品数量
     */
    private int newGoodNum;

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    public String getIndexUrl() {
        return indexUrl;
    }

    public void setIndexUrl(String indexUrl) {
        this.indexUrl = indexUrl;
    }

    public int getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(int goodNum) {
        this.goodNum = goodNum;
    }

    public int getNewGoodNum() {
        return newGoodNum;
    }

    public void setNewGoodNum(int newGoodNum) {
        this.newGoodNum = newGoodNum;
    }
}
