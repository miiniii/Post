package com.example.demo.repository;

import com.example.demo.domain.Post;
import com.example.demo.dto.PostCreateRequestDTO;
import com.example.demo.dto.PostModifyRequestDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostRepository {

    @Insert("INSERT INTO POST(title, contents, createdDate, updatedDate, createdBy, updatedBy)" +
            "VALUES(#{title}, #{contents}, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin','admin')")
    void createPost(PostCreateRequestDTO postCreateRequestDTO);


    @Select("SELECT id, title, contents, likeCnt, createdDate, updatedDate, createdBy, updatedBy FROM POST")
    List<Post> findAll();

    @Update("UPDATE POST SET title = #{title}, contents = #{contents}, updatedDate = CURRENT_TIMESTAMP, updatedBy = 'admin'" +
            "WHERE id = #{postId}")
    void modifyPost(PostModifyRequestDTO postModifyRequestDTO);

    @Delete("DELETE FROM POST WHERE id = #{postId}")
    void deletePost(Long postId);

    @Select("SELECT id, title, contents, likeCnt, createdDate, updatedDate, createdBy, updatedBy FROM POST WHERE id = #{postId}")
    Post findById(Long postId);

    @Update("UPDATE POST SET updatedDate = CURRENT_TIMESTAMP, likeCnt = #{likeCnt} WHERE id = #{postId}")
    void addLikeCnt(Long postId, Integer likeCnt);
}
