package com.huotu.android.library.buyer.bean.FooterBean;

import com.huotu.android.library.buyer.bean.BaseConfig;

import java.util.List;

/**
 * 底部导航组件
 * Created by jinxiangdong on 2016/1/22.
 */
public class FooterOneConfig extends BaseConfig {
    private String backgroundColor;
    private String fontColor;
    private List<FooterImageBean> Rows;
    private int leftMargion;
    private int rightMargion;
    private int topMargion;
    private int bottomMargion;


    public int getLeftMargion() {
        return leftMargion;
    }

    public void setLeftMargion(int leftMargion) {
        this.leftMargion = leftMargion;
    }

    public int getRightMargion() {
        return rightMargion;
    }

    public void setRightMargion(int rightMargion) {
        this.rightMargion = rightMargion;
    }

    public int getTopMargion() {
        return topMargion;
    }

    public void setTopMargion(int topMargion) {
        this.topMargion = topMargion;
    }

    public int getBottomMargion() {
        return bottomMargion;
    }

    public void setBottomMargion(int bottomMargion) {
        this.bottomMargion = bottomMargion;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public List<FooterImageBean> getRows() {
        return Rows;
    }

    public void setRows(List<FooterImageBean> rows) {
        Rows = rows;
    }
}
