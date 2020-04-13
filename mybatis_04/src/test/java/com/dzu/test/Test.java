package com.dzu.test;

import com.dzu.mapper.UserMapper;
import com.dzu.pojo.User;
import com.dzu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Test {

    static Logger logger = Logger.getLogger(Test.class);


    @org.junit.Test
    public void limitTest() throws IOException {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",1);
        List<User> users = mapper.getUserLimit(map);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();


    }
    @org.junit.Test
    public void testFindAll() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper userMapper = session.getMapper( UserMapper.class);
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

    @org.junit.Test
    public void testFindById() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper userMapper = session.getMapper( UserMapper.class);
        User user= userMapper.findUserById(1);
        System.out.println(user);
        session.close();

    }

    @org.junit.Test
    public void log4jTest(){
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
    }
}
