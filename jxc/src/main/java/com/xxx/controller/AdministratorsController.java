package com.xxx.controller;


import com.xxx.pojo.Administrators;
import com.xxx.service.AdministratorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdministratorsController {
    @Autowired
    private AdministratorsService administratorsService;

    /**
     * 登录
     * @param name 用户名
     * @param password 密码
     * @param model 回显登录状态
     * @param session 保存用户状态
     * @return
     */
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String name,
                      @RequestParam("password") String password,
                      Model model,
                      HttpSession session){

        Administrators administrators = administratorsService.Sign_in(name, password);

        if (administrators!=null){
            session.setAttribute("loginUser",name);

            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","用户或者密码错误");
            return "index";

        }

    }

    /**
     * 注销用户
     * @param session 清除session
     * @return
     */
   @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/main.html";
    }
}
