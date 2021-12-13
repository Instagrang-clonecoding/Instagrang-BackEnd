package com.ingstagrang.ingstabackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class CommentDto {
    @Setter
    @Getter
    @AllArgsConstructor
    public static class CommentRequestDto{
        private String content;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    public static class CommentResponseDto{
        private Long userId;
        private String content;
    }
}