package com.pwb.dao;

import com.pwb.domain.LibUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //此注解代表这是一个持久层
public interface LibUserDao {
    @Select("select * from libusers")
    public List<LibUser> findAll();
    @Insert("insert into libusers (userName,password,role) value(#{userName},#{password},'vip0')")
    public void saveAccount(LibUser libusers);
}
