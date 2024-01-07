package com.example.demo.controller;

import com.example.demo.domain.Member;
//import com.example.demo.dto.MemberDeleteRequestDTO;
import com.example.demo.dto.MemberModifyRequestDTO;
import com.example.demo.dto.MembercreateRequestDTO;
import com.example.demo.service.MemberService;
import jdk.dynalink.beans.MissingMemberHandlerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    //@Autowired // 컨테이너에 있는 빈을 올라가면서 넣어줌, 필드주입
    private final MemberService memberService; // 이렇게 해도 주입됨, 생성자 주입(더 안정적이라 선호됨)

    @GetMapping
    public List<Member> findMembers(){
        return memberService.findAll();
//        MemberService memberService = new MemberService(); 빈 없을때
    }

    @PostMapping
    public void createMember(@RequestBody MembercreateRequestDTO membercreateRequestDTO){
        memberService.createMember(membercreateRequestDTO);
    }


    @PutMapping
    public void modifyMember(@RequestBody MemberModifyRequestDTO memberModifyRequestDTO){
        memberService.modifyMember(memberModifyRequestDTO);
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Long memberId){

        memberService.deleteMember(memberId);

    }
    // /members
    // GET -> 해당 리소스를 가져오는 것
    // POST -> create
    // PUT -> 업데이트
    // DELETE -> 삭제
}
