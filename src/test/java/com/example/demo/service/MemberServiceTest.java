package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.dto.MemberModifyRequestDTO;
import com.example.demo.dto.MembercreateRequestDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    @Transactional
    void 사용자_데이터가_정상적으로_조회되는지_확인_테스트() {

        Member member = memberService.findAll().get(0);

        Assertions.assertThat(member.getName()).isEqualTo("아이유");
        Assertions.assertThat(member.getCreatedBy()).isEqualTo("admin");
        Assertions.assertThat(member.getUpdatedBy()).isEqualTo("admin");
    }

    @Test
    @Transactional
    void 사용자가_정상적으로_추가되는지_확인한다() {
        MembercreateRequestDTO membercreateRequestDTO = new MembercreateRequestDTO();
        membercreateRequestDTO.setLoginId("테스트 아이디");
        membercreateRequestDTO.setPassword("테스트 비밀번호");
        membercreateRequestDTO.setName("테스트 이름");
        membercreateRequestDTO.setEmail("test@test.com");
        membercreateRequestDTO.setPhoneNumber("010-2138-2328");
        membercreateRequestDTO.setCreatedBy("테스트 만든 사람3");
        membercreateRequestDTO.setUpdatedBy("테스트 수정한 사람4");

        memberService.createMember(membercreateRequestDTO);

        Assertions.assertThat(memberService.findAll().size()).isEqualTo(4);

    }

    @Test
    @Transactional
    void 사용자가_정상적으로_수정되는지_확인한다() {
        MemberModifyRequestDTO memberModifyRequestDTO = new MemberModifyRequestDTO();

        memberModifyRequestDTO.setMemberId(2L);
        memberModifyRequestDTO.setName("테스트 이름88");
        memberModifyRequestDTO.setAddress("테스트 주소88");
        memberModifyRequestDTO.setUpdatedBy("테스트 수정한 사람88");

        memberService.modifyMember(memberModifyRequestDTO);

        Assertions.assertThat(memberService.findAll().get(1).getName()).isEqualTo("테스트 이름88");
        Assertions.assertThat(memberService.findAll().get(1).getAddress()).isEqualTo("테스트 주소88");
        Assertions.assertThat(memberService.findAll().get(1).getUpdatedBy()).isEqualTo("테스트 수정한 사람88");

    }

    @Test
    @Transactional
    void 사용자가_정상적으로_삭제되는지_확인한다() {

        memberService.deleteMember(2L);

        Assertions.assertThat(memberService.findAll().size()).isEqualTo(2);

    }

}