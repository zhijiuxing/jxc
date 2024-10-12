package com.xxx.service;

import com.xxx.pojo.Administrators;
import org.apache.ibatis.annotations.Param;

public interface AdministratorsService {
    public Administrators Sign_in(@Param("name") String name,
                                  @Param("password") String password);
}
