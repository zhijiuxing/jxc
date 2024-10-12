package com.xxx.pojo;
//客户
public class Customer {
    private int id;
    private String name;
    private int age;
    private String telephone;
    private String email;
    private int frequency;

    public Customer() {
    }

    /**
     *
     * @param id
     * @param name 姓名
     * @param age 年龄
     * @param telephone 电话
     * @param email 邮箱
     * @param frequency 交易次数
     */
    public Customer(int id, String name, int age, String telephone, String email, int frequency) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
