package com.xxx.controller;

import com.xxx.pojo.Commodity;
import com.xxx.pojo.Customer;
import com.xxx.pojo.Orders;
import com.xxx.service.CommodityService;
import com.xxx.service.CustomerService;
import com.xxx.service.OrdersService;
import com.xxx.utlis.CurrentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrdersService orderService;
    @Autowired
    private CommodityService commodityService;
    @Autowired
    private CustomerService customerService;

    /**
     * 回显订单界面
     * @param model 下拉列表
     * @return
     */
    @RequestMapping("/orders")
    public String orders(Model model){
        List<Orders> orders = orderService.SelectOrder();
        model.addAttribute("orders",orders);
        List<Commodity> commodities = commodityService.SelectCommodity();
        model.addAttribute("commodities",commodities);
        List<Customer> customers = customerService.CustomerSelect();
        model.addAttribute("customers",customers);
        System.err.println("orders");
        return "emp/orders";
    }
    /**
     *  折线图数据
     * @param model
     * @return
     */
    @RequestMapping("/main.html")
    public String csss(Model model)  {
        Integer[] SevenMoney=new Integer[7];
        CurrentTime currentTime = new CurrentTime();
        //现在时间
        Date NowTime = currentTime.Time();
        //本周一
        Date ThisMonday = currentTime.Time(NowTime);
        //本周营业额

        if (orderService.FrontXDayMoney(ThisMonday, NowTime)==null){
            SevenMoney[0]=0;
        }else {
            SevenMoney[0] = orderService.FrontXDayMoney(ThisMonday, NowTime);
        }

        //  上周日，     传入本周一
        Date lastSunday = currentTime.LastSunday(ThisMonday);
        //   上周一 ，    传入本周一·
        Date lastMonday = currentTime.LastMonday(ThisMonday);
        //上周营业额
        if (orderService.FrontXDayMoney(lastMonday, lastSunday)==null){
            SevenMoney[1]=0;
        }else {
            SevenMoney[1] = orderService.FrontXDayMoney(lastMonday, lastSunday);
        }

        Date Monday2 = currentTime.FrontX(lastMonday, 7);
        Date Sunday2 = currentTime.FrontX(lastSunday, 7);
        //SevenMoney[2]= orderService.FrontXDayMoney(Monday2,Sunday2);
        if (orderService.FrontXDayMoney(Monday2, Sunday2)==null){
            SevenMoney[2]=0;
        }else {
            SevenMoney[2] = orderService.FrontXDayMoney(Monday2, Sunday2);
        }

        Date Monday3 = currentTime.FrontX(Monday2, 7);
        Date Sunday3 = currentTime.FrontX(Sunday2, 7);
        //SevenMoney[3]= orderService.FrontXDayMoney(Monday3,Sunday3);

        if (orderService.FrontXDayMoney(Monday3, Sunday3)==null){
            SevenMoney[3]=0;
        }else {
            SevenMoney[3] = orderService.FrontXDayMoney(Monday3, Sunday3);
        }

        Date Monday4 = currentTime.FrontX(Monday3, 7);
        Date Sunday4 = currentTime.FrontX(Sunday3, 7);
        //SevenMoney[4]= orderService.FrontXDayMoney(Monday4,Sunday4);
        if (orderService.FrontXDayMoney(Monday4, Sunday4)==null){
            SevenMoney[4]=0;
        }else {
            SevenMoney[4] = orderService.FrontXDayMoney(Monday4, Sunday4);
        }

        Date Monday5 = currentTime.FrontX(Monday4, 7);
        Date Sunday5 = currentTime.FrontX(Sunday4, 7);
        //SevenMoney[5]= orderService.FrontXDayMoney(Monday5,Sunday5);
        if (orderService.FrontXDayMoney(Monday5, Sunday5)==null){
            SevenMoney[5]=0;
        }else {
            SevenMoney[5] = orderService.FrontXDayMoney(Monday5, Sunday5);
        }

        Date Monday6 = currentTime.FrontX(Monday5, 7);
        Date Sunday6 = currentTime.FrontX(Sunday5, 7);
        //SevenMoney[6]= orderService.FrontXDayMoney(Monday6,Sunday6);
        if (orderService.FrontXDayMoney(Monday6, Sunday6)==null){
            SevenMoney[6]=0;
        }else {
            SevenMoney[6] = orderService.FrontXDayMoney(Monday6, Sunday6);
        }

//        for (int i=0;i<=6;i++){
//            System.out.println(SevenMoney[i]);
//        }
        model.addAttribute("SevenMoney",SevenMoney);



        //14个时间段   倒叙
        String TimeSlot[]=new String[14];
        TimeSlot[0] = currentTime.MonthDay(NowTime);
        TimeSlot[1] = currentTime.MonthDay(ThisMonday);
        TimeSlot[2] = currentTime.MonthDay(lastSunday);
        TimeSlot[3] = currentTime.MonthDay(lastMonday);
        TimeSlot[4] = currentTime.MonthDay(Sunday2);
        TimeSlot[5] = currentTime.MonthDay(Monday2);
        TimeSlot[6] = currentTime.MonthDay(Sunday3);
        TimeSlot[7] = currentTime.MonthDay(Monday3);
        TimeSlot[8] = currentTime.MonthDay(Sunday4);
        TimeSlot[9] = currentTime.MonthDay(Monday4);
        TimeSlot[10] = currentTime.MonthDay(Sunday5);
        TimeSlot[11] = currentTime.MonthDay(Monday5);
        TimeSlot[12] = currentTime.MonthDay(Sunday6);
        TimeSlot[13] = currentTime.MonthDay(Monday6);
        model.addAttribute("TimeSlot",TimeSlot);
        return "dashboard";
    }


}
