package com.xxx.pojo;

import java.util.Date;

public class Report {
    private int id;
    private String name;
    private  String txt;
    private Date reporttime;
    private int classification;
    private Employee employee;

    public Report() {
    }

    /**
     *
     * @param id
     * @param name 报告名
     * @param txt 内容
     * @param reporttime 时间
     * @param classification 类型 (1 社会参与 2 活动 3 其他)
     * @param employee 员工类
     */
    public Report(int id, String name, String txt, Date reporttime, int classification, Employee employee) {
        this.id = id;
        this.name = name;
        this.txt = txt;
        this.reporttime = reporttime;
        this.classification = classification;
        this.employee = employee;
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

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", txt='" + txt + '\'' +
                ", reporttime=" + reporttime +
                ", classification=" + classification +
                ", employee=" + employee +
                '}';
    }
}
