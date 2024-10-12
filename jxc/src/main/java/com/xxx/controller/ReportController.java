package com.xxx.controller;

import com.xxx.pojo.Employee;
import com.xxx.pojo.Orders;
import com.xxx.pojo.Report;
import com.xxx.service.ReportService;
import com.xxx.service.ReportServiceImpl;
import com.xxx.utlis.CurrentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ReportController {
    @Autowired
    private ReportService reportService;
    @Autowired
    private CurrentTime currentTime;
    /**
     * @return 跳转报告页面
     */
    @RequestMapping("/AllReports")
    public String AllReport(Model model){
        List<Report> reports = reportService.ReportSelect();
        model.addAttribute("rep",reports);
        return "txt/AllReports";
    }

    /**
     * 报告分析
     * @param report 获得表单数据
     * @return 添加回显
     */
    @RequestMapping("/txt")
    public String addEmp(Report report){
        report.setReporttime(currentTime.Time());
        int i = reportService.ReportAdd(report);
        return "redirect:/AllReports";
    }

    /**
     * @return 查询当月报告并跳转当月报告并回显
     */
    @RequestMapping("/month")
    public String AllReportMonth(Model model){
        List<Report> reports = reportService.ReportSelectMonth();
        model.addAttribute("rep",reports);
        return "txt/month";
    }

    /**
     *
     * @return 查询上季度报告并跳转上季度报告并回显
     */
    @RequestMapping("/quarter")
    public String AllReportQuarter(Model model){
        List<Report> reports = reportService.ReportSelectQuarter();
        model.addAttribute("rep",reports);
        return "txt/quarter";
    }

    /**
     * @return 跳转社会参与
     */
    @RequestMapping("/Sociology")
    public String AllReportSociology(Model model){
        List<Report> reports = reportService.ReportSelectSociology();
        model.addAttribute("rep",reports);
        return "txt/Sociology";
    }

    /**
     *
     * @return 跳转活动报告
     */
    @RequestMapping("/activity")
    public String AllReportActivity(Model model){
        List<Report> reports = reportService.ReportSelectActivity();
        model.addAttribute("rep",reports);
        return "txt/activity";
    }

}
