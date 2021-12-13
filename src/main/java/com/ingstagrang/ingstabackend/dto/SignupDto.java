package com.ingstagrang.ingstabackend.dto;

import lombok.Builder;
import lombok.Getter;

public class SignupDto {

    @Getter
    @Builder
    public static class RequestDto{
        private String email;
        private String nickname;
        private String password;
    }

}
