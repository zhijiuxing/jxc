package com.xxx.service;

import com.xxx.pojo.Report;

import java.util.List;

public interface ReportService {
    List<Report> ReportSelect();

    int ReportAdd(Report report);

    List<Report> ReportSelectMonth();

    List<Report> ReportSelectQuarter();

    List<Report> ReportSelectSociology();

    List<Report> ReportSelectActivity();

}
