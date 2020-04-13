package com.dzu.test;

import com.dzu.mapper.BlogMapper;
import com.dzu.pojo.Blog;
import com.dzu.utils.IDUtils;
import com.dzu.utils.MybatisUtils;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Test {
    @org.junit.Test
    public void testAdd() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("zd");
        blog.setCreateTime(new Date());
        blog.setViews(123);
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("zd");
        blog.setCreateTime(new Date());
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("spring如此简单");
        blog.setAuthor("zd");
        blog.setCreateTime(new Date());
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("mvc如此简单");
        blog.setAuthor("zd");
        blog.setCreateTime(new Date());
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("java如此简单");
        blog.setAuthor("zd");
        blog.setCreateTime(new Date());
        mapper.addBook(blog);

        sqlSession.commit();
        sqlSession.close();
    }


    @org.junit.Test
    public void queryBlogIFTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
//        map.put("author","fxf");
        map.put("title","Mybatis");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }


    @org.junit.Test
    public void queryBlogChooseTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("author","fxf");
       // map.put("title","Mybatis");
     //   map.put("views",123);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @org.junit.Test
    public void updateBlogTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("author","fxf");
        map.put("title","Mybatis");
        map.put("id","2");

        mapper.updateBlog(map);

        sqlSession.close();
    }

    @org.junit.Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        map.put("mid",list);

        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        Cache

        sqlSession.close();
    }
}
