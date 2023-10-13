package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MemberModifyRequestDTO {
    private Long memberId;
    private String name;
    private String address;
    private LocalDateTime updateDate;
    private String updatedBy;

}
