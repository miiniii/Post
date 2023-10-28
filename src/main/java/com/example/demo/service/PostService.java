package com.example.demo.service;

import com.example.demo.domain.Post;
import com.example.demo.dto.PostCreateRequestDTO;
import com.example.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> findAll() {
        List<Post> posts = postRepository.findAll();


        return posts;
    }

    public void createPost(PostCreateRequestDTO postcreateRequestDTO) {
        postRepository.createPost(postcreateRequestDTO);
    }
}
