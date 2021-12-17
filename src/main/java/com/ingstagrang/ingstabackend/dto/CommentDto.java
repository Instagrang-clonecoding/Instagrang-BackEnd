package com.ingstagrang.ingstabackend.dto;

import lombok.*;

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
    @Builder
    public static class CommentDtoResponseDto{
        private Long commentId;
        private Long userId;
        private String nickname;
        private String content;
        private String createdAt;
    }
}