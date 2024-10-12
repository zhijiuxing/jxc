package com.xxx.service;

import com.xxx.mapper.AdministratorsMappper;
import com.xxx.pojo.Administrators;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdministratorsServiceImpl implements AdministratorsService {

    @Resource
    private AdministratorsMappper administratorsMappper;
    @Override
    public Administrators Sign_in(String name, String password) {
        return administratorsMappper.Sign_in(name,password);
    }
}
