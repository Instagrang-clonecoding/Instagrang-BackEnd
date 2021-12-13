package com.ingstagrang.ingstabackend.dto;

import lombok.Getter;

@Getter
public class PostLikeDto {
    private Long userId;

    public PostLikeDto(Long id) {
        this.userId = id;
    }
}
