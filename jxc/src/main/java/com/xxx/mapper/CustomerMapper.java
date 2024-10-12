package com.xxx.mapper;

import com.xxx.pojo.Commodity;
import com.xxx.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CustomerMapper {
    /**
     * 查询所有客户
     * @return
     */
    List<Customer> CustomerSelect();
}
