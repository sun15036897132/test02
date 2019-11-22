package com.huidian.demo.mapper;

import com.huidian.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from testgit where uusername=#{param1} and upassword=#{param2}")
    User login(String uusername, String upassword);
}
