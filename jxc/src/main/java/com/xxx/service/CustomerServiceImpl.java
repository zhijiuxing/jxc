package com.xxx.service;

import com.xxx.mapper.CustomerMapper;
import com.xxx.pojo.Customer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Resource
    private CustomerMapper customerMapper;
    @Override
    public List<Customer> CustomerSelect() {
        return customerMapper.CustomerSelect();
    }
}
