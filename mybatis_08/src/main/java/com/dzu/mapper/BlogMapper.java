package com.dzu.mapper;

import com.dzu.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入数据
    int addBook(Blog blog);

    //IF,where查询
    List<Blog> queryBlogIf(Map map);

    //Choose,when,otherwise查询
    List<Blog> queryBlogChoose(Map map);

    //set更新
    int updateBlog(Map map);

    //Foreach查询
    List<Blog> queryBlogForeach(Map map);
}
