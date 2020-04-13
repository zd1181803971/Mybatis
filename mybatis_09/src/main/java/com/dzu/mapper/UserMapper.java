package com.dzu.mapper;

import com.dzu.pojo.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {

    User queryUsers(@Param("id") int id);

    int updateUser(User user);
}
