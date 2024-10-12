package com.xxx.service;

import com.xxx.pojo.Department;
import com.xxx.pojo.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> QueryAll();

    int addEmployee2(Map<String,Object> map);

    int updateEmployee(Map<String,Object> map);

    Employee QuerySingle(int id);

    int deleteEmployee(int id);

    List<Employee> SelectGender(int gender);

    List<Employee> SelectDepartment(int depID);
}
