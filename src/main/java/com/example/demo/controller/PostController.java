package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.dto.PostCreateRequestDTO;
import com.example.demo.dto.PostModifyRequestDTO;
import com.example.demo.repository.PostRepository;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public String createPost(@Valid PostCreateRequestDTO postCreateRequestDTO, Model model) {
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

    @PutMapping("/modifyPost")
    @ResponseBody
    public void modifyPost(@RequestBody @Valid PostModifyRequestDTO postModifyRequestDTO){
        postService.modifyPost(postModifyRequestDTO);
    }

    @ResponseBody
    @DeleteMapping("/post/{postId}")
    public void deletePost(@PathVariable Long postId){
        postService.deletePost(postId);
    }

    @PutMapping("/post/addLikeCnt/{postId}")
    @ResponseBody
    public int addLikeCntPost(@PathVariable Long postId) {
        return postService.addLikeCnt(postId);

    }
}
