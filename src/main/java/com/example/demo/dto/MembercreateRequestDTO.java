package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class MembercreateRequestDTO {

    private String name;
    private String address;
    private LocalDateTime createDate; // yyymmdd ssMMnn 초까지 다 나옴
    private LocalDateTime updateDate;
    private String createdBy;
    private String updatedBy;
}
