package com.ingstagrang.ingstabackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class PostDto {
    @Setter
    @Getter
    @AllArgsConstructor
    public static class PostRequestDto{
        private String content;
        private String image;
    }
}
