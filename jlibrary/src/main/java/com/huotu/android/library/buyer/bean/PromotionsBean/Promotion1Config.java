package com.huotu.android.library.buyer.bean.PromotionsBean;

import com.huotu.android.library.buyer.bean.BaseConfig;

import java.util.List;

/**
 * Created by jinxiangdong on 2016/1/29.
 */
public class Promotion1Config extends BaseConfig {
    private List<PromotionBean> coupns;

    public List<PromotionBean> getCoupns() {
        return coupns;
    }

    public void setCoupns(List<PromotionBean> coupns) {
        this.coupns = coupns;
    }
}
