package com.example.demo.controller;

import com.example.demo.dto.LoginRequestDTO;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final PostService postService;

    @GetMapping("/login")
    public String goToAboutView() {
        return "/login";
    }

    @PostMapping ("/login")
    public String login(@RequestBody LoginRequestDTO loginRequestDTO) {

        // 아이디랑 비번 가지고 넘어와서 로그인 로직 만들기
//        postService.login(loginRequestDTO);
        System.out.println(loginRequestDTO.getLoginId());
        System.out.println(loginRequestDTO.getPassword());
        System.out.println("로그인 요청");



        return "";
    }


}
