package com.xxx.controller;


import com.xxx.pojo.Department;
import com.xxx.pojo.Employee;
import com.xxx.service.CommodityService;
import com.xxx.service.DepartmentService;
import com.xxx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class EmployeeController {
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询所有，以表格展示
     * @param model 回显数据，下拉列表
     * @return
     */
    @RequestMapping("/emps")
    public String list(Model model){
        List<Employee> employees = employeeService.QueryAll();
        model.addAttribute("emls",employees);
        List<Department> departments = departmentService.QueryAllDepartment();
        model.addAttribute("departments",departments);
        return "emp/list";

    }

    /**
     *
     * @param model add界面部门回显
     * @return
     */
    @GetMapping("/emp")
    public String toAddpags(Model model){
        List<Department> departments = departmentService.QueryAllDepartment();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    /**
     * 实现用户添加
     * @param employee 员工
     * @return
     */
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        Map<String,Object> map=new HashMap<>();
        map.put("id",employee.getId());
        map.put("lastName",employee.getLastName());
        map.put("email",employee.getEmail());
        map.put("gender",employee.getGender());
        map.put("birth",employee.getBirth());
        map.put("department_id",employee.getDepartment().getId());
        employeeService.addEmployee2(map);
        return "redirect:/emps";
    }

    /**
     * 跳转修改界面
     * 根据id显示要修改的数据
     * @param id
     * @param model 回显需要修改的默认数据
     * @return
     */
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id")Integer id,Model model){
        Employee employee = employeeService.QuerySingle(id);
        model.addAttribute("emp",employee);
        List<Department> departments = departmentService.QueryAllDepartment();
        model.addAttribute("departments",departments);
        return "emp/update";
    }

    /**
     *
     * @param employee 修改员工数据
     * @return
     */
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        Map<String,Object> map=new HashMap<>();

        map.put("lastName",employee.getLastName());
        map.put("email",employee.getEmail());
        map.put("gender",employee.getGender());
        map.put("birth",employee.getBirth());
        map.put("department_id",employee.getDepartment().getId());
        map.put("id",employee.getId());
        int i = employeeService.updateEmployee(map);
//        System.err.println(i);
        return "redirect:/emps";
    }

    /**
     * 根据id删除
     * @param id 员工id
     * @return
     */
    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id")Integer id){
//        employeeDao.delete(id);
        employeeService.deleteEmployee(id);
        return "redirect:/emps";
    }


}
