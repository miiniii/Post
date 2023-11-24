package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class PostModifyRequestDTO {

    private Long postId;
    private String title;
    private String contents;
}
