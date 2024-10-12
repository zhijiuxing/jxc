package com.xxx.pojo;

import java.util.Date;
//员工
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;//0女 1男
    private Date birth;

    private Department department;


    public Employee() {
    }

    /**
     *
     * @param id
     * @param lastName 员工姓名
     * @param email 邮箱
     * @param gender 性别（0女1男）
     * @param birth 入职时间
     * @param department 部门类
     */
    public Employee(Integer id, String lastName, String email, Integer gender, Date birth, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birth = birth;
        this.department = department;
    }

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                ", department=" + department +
                '}';
    }
}
