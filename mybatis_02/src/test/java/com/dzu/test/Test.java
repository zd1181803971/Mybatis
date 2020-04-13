package com.dzu.test;

import com.dzu.mapper.UserMapper;
import com.dzu.pojo.User;
import com.dzu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class Test {

    @org.junit.Test
    public void testFindAll() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper userMapper = session.getMapper( UserMapper.class);
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
