package com.ingstagrang.ingstabackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class CommentDto {

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CommentDtoRequestDto{
        private String content;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    public static class CommentDtoResponseDto{
        private Long commentId;
        private String content;
    }
}