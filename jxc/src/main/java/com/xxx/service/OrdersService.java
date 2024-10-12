package com.xxx.service;

import com.xxx.pojo.Orders;

import java.util.Date;
import java.util.List;

public interface OrdersService {
    List<Orders> SelectOrder();

    Integer FrontXDayMoney(Date start, Date end);
}
