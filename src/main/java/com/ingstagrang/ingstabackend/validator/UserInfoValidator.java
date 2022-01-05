package com.ingstagrang.ingstabackend.validator;

import com.ingstagrang.ingstabackend.dto.SignupDto;

import java.util.regex.Pattern;

public class UserInfoValidator {
    public static void validateUserInfoInput(SignupDto.RequestDto requestDto) {
        String patternEmail = "^(.+)@(.+)$";
        String patternPassword = "(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^\\w\\s]).{8,50}$";

        String nickname = requestDto.getNickname();
        String password = requestDto.getPassword();
        String email = requestDto.getEmail();

        // 닉네임 형식 확인
        if(nickname == null || nickname.length() < 4 || nickname.length() > 15) {
            throw new IllegalArgumentException("테스트");
        }

        // 비밀번호 형식 확인
        if(password == null || !Pattern.matches(patternPassword,password)){
            throw new IllegalArgumentException("특수문자 영어 숫자 포함, 최소 8자 이상이어야 합니다.");
        }

        // email 형식 검사
        if (email == null || !Pattern.matches(patternEmail, email)){
            throw new IllegalArgumentException("이메일 형식이 아닙니다.");
        }
    }
}
