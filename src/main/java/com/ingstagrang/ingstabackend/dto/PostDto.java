package com.ingstagrang.ingstabackend.dto;

import lombok.*;

import java.util.List;

public class PostDto {
    @Setter
    @Getter
    @AllArgsConstructor
    public static class PostRequestDto{
        private String content;
        private String image;
    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class PostResponseDto{
        private Long postId;
        private Long userId;
        private String nickname;
        private String content;
        private String image;
        private String createdAt;
        private List<CommentDto.CommentResponseDto> commentList;
        private List<PostLikeDto> likeList;
    }
}
