package com.example.demo.repository;

import com.example.demo.domain.Member;
//import com.example.demo.dto.MemberDeleteRequestDTO;
import com.example.demo.dto.MemberModifyRequestDTO;
import com.example.demo.dto.MembercreateRequestDTO;
import org.apache.ibatis.annotations.*;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface MemberRepository {

    @Select("SELECT id, longinId, password, name, email, phoneNumber, createdDate, updatedDate, createdBy, updatedBy FROM MEMBER")
    List<Member> findAll();


    @Insert("INSERT INTO MEMBER(loginId, password, name, email, phoneNumber, createdDate, updatedDate, createdBy, updatedBy)" +
    "VALUES(#{loginId}, #{password}, #{name}, #{email}, #{phoneNumber}, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, #{createdBy},#{updatedBy})")
    void createMember(MembercreateRequestDTO membercreateRequestDTO);


    @Update("UPDATE MEMBER SET name = #{name}, address = #{address}, updatedDate = CURRENT_TIMESTAMP, updatedBy = #{updatedBy}" +
            "WHERE id = #{memberId}")
    void modifyMember(MemberModifyRequestDTO memberModifyRequestDTO);

    @Delete("DELETE FROM MEMBER WHERE id = #{memberId}")
    void deleteMember(Long memberId);

    @Select("SELECT id, longinId, password, name, email, phoneNumber, createdDate, updatedDate, createdBy, updatedBy FROM MEMBER WHERE loginId = #{loginId} AND password = #{password}")
    Member findIdAndPassword(String loginId, String password);
}
