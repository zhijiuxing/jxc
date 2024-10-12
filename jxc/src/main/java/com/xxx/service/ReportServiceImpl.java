package com.xxx.service;

import com.xxx.mapper.ReportMapper;
import com.xxx.pojo.Report;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Resource
    private ReportMapper reportMapper;

    @Override
    public List<Report> ReportSelect() {
        return reportMapper.ReportSelect();
    }

    @Override
    public int ReportAdd(Report report) {
        return reportMapper.ReportAdd(report);
    }

    @Override
    public List<Report> ReportSelectMonth() {
        return reportMapper.ReportSelectMonth();
    }

    @Override
    public List<Report> ReportSelectQuarter() {
        return reportMapper.ReportSelectQuarter();
    }

    @Override
    public List<Report> ReportSelectSociology() {
        return reportMapper.ReportSelectSociology();
    }

    @Override
    public List<Report> ReportSelectActivity() {
        return reportMapper.ReportSelectActivity();
    }
}
