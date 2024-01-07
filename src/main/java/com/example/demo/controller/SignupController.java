package com.example.demo.controller;

import com.example.demo.dto.MembercreateRequestDTO;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/signUp")
public class SignupController {

    private final MemberService memberService;

    @GetMapping
    public String goToAboutView() {

        return "/signUp";
    }

    @PostMapping
    public String createMember(@Valid MembercreateRequestDTO membercreateRequestDTO, Model model) {
        memberService.createMember(membercreateRequestDTO);

        return "/index";
    }


}
