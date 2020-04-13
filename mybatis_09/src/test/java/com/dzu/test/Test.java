package com.dzu.test;

import com.dzu.mapper.UserMapper;
import com.dzu.pojo.User;
import com.dzu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;


public class Test {
    @org.junit.Test
    public void  test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUsers(1);
        System.out.println(user);
        sqlSession.close();

        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUsers(1);
        System.out.println(user2);
        sqlSession.close();

        System.out.println(user==user2);

    }
}
