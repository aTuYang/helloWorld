package com.sm.example.dao;

import org.apache.ibatis.annotations.Param;

import com.sm.example.dto.BlogDetail;
import com.sm.example.entity.Blog;



public interface BlogDao {
    
    Blog selectBlog(@Param("id") long id, @Param("name") String name);
    
    BlogDetail selectBlogDetail(long id);
    
    int insertBlog(Blog blog);
    
    int updateBlog(Blog blog);
    
    int deleteBlog(long id);
}
