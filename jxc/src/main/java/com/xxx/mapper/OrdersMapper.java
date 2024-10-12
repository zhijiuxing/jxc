package com.xxx.mapper;

import com.xxx.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface OrdersMapper {
     /**
      * 所有订单查询
      * @return
      */
     List<Orders> SelectOrder();

     /**
      * 查询前X天营业额
      * @param start 查询起始时间
      * @param end 终止时间
      * @return
      */
     Integer FrontXDayMoney(Date start,Date end);
}
