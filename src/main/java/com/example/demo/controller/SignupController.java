package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.domain.Post;
import com.example.demo.dto.MembercreateRequestDTO;
import com.example.demo.dto.PostCreateRequestDTO;
import com.example.demo.service.MemberService;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class SignupController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/signUp")
    public String goToAboutView() {

        return "/signUp";
    }

    @PostMapping("/signUp")
    public String createMember(@Valid MembercreateRequestDTO membercreateRequestDTO, Model model) {
        memberService.createMember(membercreateRequestDTO);

        return "/index";
    }


}
