package com.xxx.service;

import com.xxx.mapper.AdministratorsMappper;
import com.xxx.mapper.DepartmentMapper;
import com.xxx.pojo.Department;
import com.xxx.pojo.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> QueryAllDepartment() {
        return departmentMapper.QueryAllDepartment();
    }

    @Override
    public Department QuerySingleDepartment(Map<String, Object> map) {
        return departmentMapper.QuerySingleDepartment(map);
    }


}
