package com.dzu.mapper;

import com.dzu.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> findAll();
    User findUserById(int id);

    List<User> getUserLimit(Map<String,Integer> map);
}
