package com.xxx.pojo;

import java.util.Date;

//订单
public class Orders {
    private int id;
    private String ordernumber;
    private String tradename;
    private int number;
    private String money;
    private Date time;
    private int state;
    private Employee employee;
    private Commodity commodity;
    private Customer customer;

    public Orders() {
    }

    /**
     *
     * @param id
     * @param ordernumber 订单号
     * @param tradename 购买商品
     * @param number 数量
     * @param money 金额
     * @param time 交易时间
     * @param state 交易状态（1成功，0交易中，2失败）
     * @param employee 员工类
     * @param commodity 商品类
     * @param customer 客户类
     */
    public Orders(int id, String ordernumber, String tradename, int number, String money, Date time, int state, Employee employee, Commodity commodity, Customer customer) {
        this.id = id;
        this.ordernumber = ordernumber;
        this.tradename = tradename;
        this.number = number;
        this.money = money;
        this.time = time;
        this.state = state;
        this.employee = employee;
        this.commodity = commodity;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordernumber='" + ordernumber + '\'' +
                ", tradename='" + tradename + '\'' +
                ", number=" + number +
                ", money='" + money + '\'' +
                ", time=" + time +
                ", state=" + state +
                ", employee=" + employee +
                ", commodity=" + commodity +
                ", customer=" + customer +
                '}';
    }
}
