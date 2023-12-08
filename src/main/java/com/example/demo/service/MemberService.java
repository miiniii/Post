package com.example.demo.service;

import com.example.demo.domain.Member;
//import com.example.demo.dto.MemberDeleteRequestDTO;
import com.example.demo.dto.MemberModifyRequestDTO;
import com.example.demo.dto.MembercreateRequestDTO;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

//    @Autowired //DI 의존성 주입
//    private MemberRepository memberRepository;

    private final MemberRepository memberRepository;

    public List<Member> findAll() {
        List<Member> members = memberRepository.findAll();
//        members.get(0).getName();
//        members.get(0).setName();
        return members;
    }


    public void createMember(MembercreateRequestDTO membercreateRequestDTO) {
        membercreateRequestDTO.setCreatedBy(membercreateRequestDTO.getLoginId());
        membercreateRequestDTO.setUpdatedBy(membercreateRequestDTO.getLoginId());
        memberRepository.createMember(membercreateRequestDTO);
    }



    public void modifyMember(MemberModifyRequestDTO memberModifyRequestDTO) {
        memberRepository.modifyMember(memberModifyRequestDTO);
    }

    public void deleteMember(Long memberId){
        memberRepository.deleteMember(memberId); // 가지고 가는 값이여서 타입지정 필요X
    }

    public Member findByIdAndPassword(String loginId, String password) {

        Member loginInfo = memberRepository.findIdAndPassword(loginId, password);

        if (loginInfo == null) {
            throw new RuntimeException("회원 정보가 존재하지 않습니다.");
        }

        return loginInfo;


    }
}

