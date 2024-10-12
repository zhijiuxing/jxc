package com.xxx.service;

import com.xxx.mapper.OrdersMapper;
import com.xxx.pojo.Orders;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersMapper orderMapper;

    @Override
    public List<Orders> SelectOrder() {
        return orderMapper.SelectOrder();
    }

    @Override
    public Integer FrontXDayMoney(Date start, Date end) {
        return orderMapper.FrontXDayMoney(start,end);
    }
}
