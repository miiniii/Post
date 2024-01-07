package com.example.demo.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member extends BaseTimeDomain {

    private String name;
    private String address;

}
