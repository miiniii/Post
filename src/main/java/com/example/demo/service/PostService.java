package com.example.demo.service;

import com.example.demo.domain.Post;
import com.example.demo.dto.LoginRequestDTO;
import com.example.demo.dto.PostCreateRequestDTO;
import com.example.demo.dto.PostModifyRequestDTO;
import com.example.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();

    }

    public void createPost(PostCreateRequestDTO postcreateRequestDTO) {
        postRepository.createPost(postcreateRequestDTO);
    }

    public void modifyPost(PostModifyRequestDTO postModifyRequestDTO) {
         postRepository.modifyPost(postModifyRequestDTO);
    }

    public void deletePost(Long postId) {
        postRepository.deletePost(postId);

    }

    public Post findById(Long postId) {
      return postRepository.findById(postId);
    }

    public synchronized int addLikeCnt(Long postId) {
        // 기존값 가져오기
        int likeCnt = postRepository.findById(postId).getLikeCnt();

        // 동시성 문제(정말 동시에 두 명이상이 좋아요를 눌렀을때)
        likeCnt++;

        // db에 저장
        postRepository.addLikeCnt(postId, likeCnt);

        return likeCnt;
    }

    public void login(LoginRequestDTO loginRequestDTO) {
//        postRepository.login()
    }
}
