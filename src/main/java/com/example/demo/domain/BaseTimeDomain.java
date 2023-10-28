package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseTimeDomain {
    private LocalDateTime createDate; // yyymmdd ssMMnn 초까지 다 나옴
    private LocalDateTime updateDate;
    private String createdBy;
    private String updatedBy;
}
