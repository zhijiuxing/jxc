package com.xxx.service;

import com.xxx.mapper.DepartmentMapper;
import com.xxx.mapper.EmployeeMapper;
import com.xxx.pojo.Department;
import com.xxx.pojo.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> QueryAll() {
        return employeeMapper.QueryAll();
    }

    @Override
    public int addEmployee2(Map<String, Object> map) {
        return employeeMapper.addEmployee2(map);
    }

    @Override
    public int updateEmployee(Map<String, Object> map) {
        return employeeMapper.updateEmployee(map);
    }

    @Override
    public Employee QuerySingle(int id) {
        return employeeMapper.QuerySingle(id);
    }

    @Override
    public int deleteEmployee(int id) {
        return employeeMapper.deleteEmployee(id);
    }

    @Override
    public List<Employee> SelectGender(int gender) {
        return employeeMapper.SelectGender(gender);
    }

    @Override
    public List<Employee> SelectDepartment(int depID) {
        return employeeMapper.SelectDepartment(depID);
    }


}
