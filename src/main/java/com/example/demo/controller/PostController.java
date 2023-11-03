package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.dto.PostCreateRequestDTO;
import com.example.demo.dto.PostModifyRequestDTO;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/post")
    public String goToPostView() {
        return "/post";
    }

    @PostMapping("/post")
    public String createPost(PostCreateRequestDTO postCreateRequestDTO, Model model) {
        postService.createPost(postCreateRequestDTO);

        List<Post> posts = postService.findAll();

        model.addAttribute("posts",posts);

        return "/index";
    }

    @GetMapping("/modifyPost/{postId}")
    public String goToModifyPostView(@PathVariable Long postId, Model model){

        Post post = postService.findById(postId);
        model.addAttribute("post", post);

        return "/modifyPost";
    }

}
