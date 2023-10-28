package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Post extends BaseTimeDomain{

    private String title;
    private String contents;

}
