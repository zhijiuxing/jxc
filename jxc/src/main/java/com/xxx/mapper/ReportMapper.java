package com.xxx.mapper;

import com.xxx.pojo.Report;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ReportMapper {
    /**
     * 查询所有报告
     * @return
     */
    List<Report> ReportSelect();
    /**
     * 添加报告
     * @return
     */
    int ReportAdd(Report report);
    /**
     * 查询当月报告
     * @return
     */
    List<Report> ReportSelectMonth();
    /**
     * 查询上季度报告
     * @return
     */
    List<Report> ReportSelectQuarter();
    /**
     * 查询社会参与
     * @return
     */
    List<Report> ReportSelectSociology();
    /**
     * 查询活动报告
     * @return
     */
    List<Report> ReportSelectActivity();
}
