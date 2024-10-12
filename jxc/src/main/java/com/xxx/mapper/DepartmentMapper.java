package com.xxx.mapper;

import com.xxx.pojo.Department;
import com.xxx.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface DepartmentMapper {
    /**
     * 查询部门所有信息
     * @return
     */
    List<Department> QueryAllDepartment();

    /**
     * 未使用
     * @param map
     * @return
     */
    Department QuerySingleDepartment(Map<String,Object> map);


}
