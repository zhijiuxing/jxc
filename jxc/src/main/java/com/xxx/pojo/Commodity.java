package com.xxx.pojo;


import java.util.Date;

//商品类
public class Commodity {
    private int id;
    private String tradename;
    private double price;
    private int sell;
    private Date birth;
    private int stock;

    /**
     *
     * @param id
     * @param tradename 商品名称
     * @param price 价格
     * @param sell 是否上架（0上架，1未上架）
     * @param birth 生产日期
     * @param stock 库存
     */
    public Commodity(int id, String tradename, double price, int sell, Date birth, int stock) {
        this.id = id;
        this.tradename = tradename;
        this.price = price;
        this.sell = sell;
        this.birth = birth;
        this.stock = stock;
    }

    public Commodity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", tradename='" + tradename + '\'' +
                ", price=" + price +
                ", sell=" + sell +
                ", birth=" + birth +
                ", stock=" + stock +
                '}';
    }
}
