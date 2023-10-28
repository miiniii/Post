package com.example.demo.repository;

import com.example.demo.domain.Post;
import com.example.demo.dto.PostCreateRequestDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostRepository {

    @Insert("INSERT INTO POST(title, contents, createdDate, updatedDate, createdBy, updatedBy)" +
            "VALUES(#{title}, #{contents}, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin','admin')")
    void createPost(PostCreateRequestDTO postCreateRequestDTO);


    @Select("SELECT * FROM POST")
    List<Post> findAll();
}
