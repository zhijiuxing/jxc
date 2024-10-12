package com.xxx.service;

import com.xxx.pojo.Department;
import com.xxx.pojo.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    List<Department> QueryAllDepartment();

    Department QuerySingleDepartment(Map<String,Object> map);
}
