package com.example.demo.service;

import com.example.demo.domain.Post;
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
}
