package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post extends BaseTimeDomain{

    private Long id;
    private String title;
    private String contents;
    private Integer likeCnt;

}
