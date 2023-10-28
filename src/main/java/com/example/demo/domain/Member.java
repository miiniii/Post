package com.example.demo.domain;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Member extends BaseTimeDomain {

    private String name;
    private String address;

}
