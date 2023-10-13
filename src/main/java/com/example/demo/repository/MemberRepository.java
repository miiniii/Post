package com.example.demo.repository;

import com.example.demo.domain.Member;
//import com.example.demo.dto.MemberDeleteRequestDTO;
import com.example.demo.dto.MemberModifyRequestDTO;
import com.example.demo.dto.MembercreateRequestDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberRepository {

    @Select("SELECT * FROM MEMBER")
    List<Member> findAll(); //Member로 된 애들 findall


    @Insert("INSERT INTO MEMBER(name, address, createdDate, updatedDate, createdBy, updatedBy)" +
    "VALUES(#{name}, #{address}, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, #{createdBy},#{updatedBy})")
    void createMember(MembercreateRequestDTO membercreateRequestDTO);


    @Update("UPDATE MEMBER SET name = #{name}, address = #{address}, updatedDate = CURRENT_TIMESTAMP, updatedBy = #{updatedBy}" +
            "WHERE id = #{memberId}")
    void modifyMember(MemberModifyRequestDTO memberModifyRequestDTO);

    @Delete("DELETE FROM MEMBER WHERE id = #{memberId}")
    void deleteMember(Long memberId);
}
