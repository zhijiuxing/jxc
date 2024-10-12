package com.xxx.controller;

import com.xxx.pojo.Commodity;
import com.xxx.pojo.Department;
import com.xxx.pojo.Employee;
import com.xxx.service.CommodityService;
import javafx.scene.web.WebHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    private Integer YesOrNo=2;
    /**
     * 跳转商品管理界
     * 并显示所有商品
     * @param model
     * @return
     */
    @RequestMapping("/commodity")
    public String orders(Model model){
        if (YesOrNo==0){
            List<Commodity> commodities = commodityService.shelvesY();
            model.addAttribute("cod",commodities);
            return "emp/commodity";
        }else if (YesOrNo==1){
            List<Commodity> commodities = commodityService.shelvesN();
            model.addAttribute("cod",commodities);
            return "emp/commodity";
        }else {
            List<Commodity> commodities = commodityService.SelectCommodity();
            model.addAttribute("cod",commodities);
            return "emp/commodity";
        }
    }
    /**
     * 跳转添加界面
     * @return
     */
    @GetMapping("/addCommodity")
    public String toAddCommodity(){
        return "emp/addCommodity";
    }

    /**
     * 实现用户添加
     *
     * 判断是否添加成功未完成！！！！
     * @param commodity 传入商品
     * @return
     */
    @PostMapping("/addCommodity")
    public String addCommodity(Commodity commodity){
        int i = commodityService.addCommodity(commodity);
        return "redirect:/commodity";
    }

    /**
     * 传入id跳转修改界面
     * 根据id查询数据，回显数据
     * @param id 传如id
     * @param model 查询回显
     * @return
     */
    @GetMapping("/update/{id}")
    public String toUpdateCommodity(@PathVariable("id")Integer id, Model model){
        Commodity commodity = commodityService.SelectCommodityId(id);
        model.addAttribute("commodity",commodity);
        return "emp/updateCommodity";
    }

    /**
     * 修改数据
     * @param commodity
     * @return
     */
    @PostMapping("/updateCommodity")
    public String updateCommodity(Commodity commodity){
        int i = commodityService.updateCommodity(commodity);
        return "redirect:/commodity";

    }


    /**
     * 根据id删除
     * 未判断是否删除
     * @param id
     * @return
     */
    @GetMapping("/deleteCommodity/{id}")
    public String deleteEmp(@PathVariable("id")Integer id){
        int i = commodityService.deleteCommodityId(id);

        return "redirect:/commodity";
    }

    /**
     *
     * @param model 筛选上架
     * @return
     */
    @GetMapping("/shelvesY")
    public String shelvesY(Model model){
        YesOrNo=0;
        return "redirect:/commodity";
    }
    /**
     *
     * @param model 筛选未上架
     * @return
     */
    @GetMapping("/shelvesN")
    public String shelvesN(Model model){
        YesOrNo=1;
        return "redirect:/commodity";
    }
    /**
     *
     * @param model 查询所有
     * @return
     */
    @GetMapping("/shelvesYN")
    public String shelvesYN(Model model){
        YesOrNo=2;
        return "redirect:/commodity";
    }
}
