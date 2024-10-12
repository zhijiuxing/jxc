package com.xxx.mapper;

import com.xxx.pojo.Administrators;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AdministratorsMappper {
    /**
     * 查询姓名密码
     * @param name
     * @param password
     * @return
     */
    public Administrators Sign_in(@Param("name") String name,
                           @Param("password") String password);
}
