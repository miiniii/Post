package com.example.demo.service;

import com.example.demo.domain.Post;
import com.example.demo.dto.PostCreateRequestDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostServiceTest {

    @Autowired
    private PostService postService;

    @Test
    void 게시글이_정상적으로_조회되는지_테스트(){
        List<Post> posts = postService.findAll();

        Assertions.assertThat(posts.get(0).getTitle()).isEqualTo("테스트 제목1");
        Assertions.assertThat(posts.get(0).getContents()).isEqualTo("테스트 내용1");
    }

    @Test
    void 게시글이_정상적으로_조회되는지_저장되는지_테스트(){
        PostCreateRequestDTO postcreateRequestDTO = new PostCreateRequestDTO();

        postcreateRequestDTO.setTitle("테스트 제목5");
        postcreateRequestDTO.setContents("테스트 내용5");
//        postcreateRequestDTO.setCreatedBy("테스트 만든 사람5");
//        postcreateRequestDTO.setUpdatedBy("테스트 수정한 사람5");

        postService.createPost(postcreateRequestDTO);

        Assertions.assertThat(postService.findAll().size()).isEqualTo(4);


    }

    @Test
    void 게시글이_정상적으로_조회되는지_수정되는지_테스트(){

    }

    @Test
    void 게시글이_정상적으로_조회되는지_삭제되는지_테스트(){

    }
}
