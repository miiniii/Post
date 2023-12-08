package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.dto.LoginRequestDTO;
import com.example.demo.service.MemberService;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String goToAboutView() {
        return "/login";
    }

    @PostMapping ("/login")
    public String login(LoginRequestDTO loginRequestDTO, HttpServletRequest request) {

        String loginId = loginRequestDTO.getLoginId();
        String password = loginRequestDTO.getPassword();


        // 우리 DB에 이 아이디에 패스워드가 존재하는지 확인
        Member loginInfo = memberService.findByIdAndPassword(loginId, password);




        // 로그인이 완료돼서 세션에 로그인 정보를 저장
        HttpSession session = request.getSession();
        session.setAttribute("loginId", loginRequestDTO.getLoginId());
        session.setMaxInactiveInterval(1800); // 세션 30분 유지

        return "index";
    }


}
