package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostModifyRequestDTO {
    private Long postId;
    private String title;
    private String contents;
}
