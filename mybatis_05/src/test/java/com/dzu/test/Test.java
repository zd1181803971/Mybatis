package com.dzu.test;


import com.dzu.mapper.UserMapper;
import com.dzu.pojo.User;
import com.dzu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class Test {
    @org.junit.Test
    public void test() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }
}
