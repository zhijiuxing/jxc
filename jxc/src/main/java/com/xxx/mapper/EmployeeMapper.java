package com.xxx.mapper;

import com.xxx.pojo.Department;
import com.xxx.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface EmployeeMapper {
    /**
     * 查询所有员工
     * @return
     */
    List<Employee> QueryAll();
    /**
     * 添加员工
     * @return
     */
    int addEmployee2(Map<String,Object> map);
    /**
     * 修改员工
     * @return
     */
    int updateEmployee(Map<String,Object> map);
    /**
     * 根据id查询员工
     * @return
     */
    Employee QuerySingle(int id);
    /**
     * 根据id删除员工
     * @return
     */
    int deleteEmployee(int id);

    /**
     * 按性别查询查询
     * @param gender
     * @return
     */
    List<Employee> SelectGender(int gender);
    /**
     * 按部门id查询查询
     * @param depID
     * @return
     */
    List<Employee> SelectDepartment(int depID);
}
