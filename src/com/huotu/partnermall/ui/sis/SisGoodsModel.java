package com.huotu.partnermall.ui.sis;

/**
 * Created by Administrator on 2015/11/16.
 */
public class SisGoodsModel {

    private java.lang.Integer id;//商品ID
    private java.lang.String imgUrl;//商品图片
    private java.lang.String name;//商品名称
    private double price;//销售价
    private java.lang.Integer stock;//库存量
    private double profit;

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
