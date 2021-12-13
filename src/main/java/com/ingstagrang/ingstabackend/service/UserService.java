package com.ingstagrang.ingstabackend.service;


import com.ingstagrang.ingstabackend.dto.SignupDto;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.repository.UserRepository;
import com.ingstagrang.ingstabackend.validator.UserInfoValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void serviceUserSignUp(SignupDto.RequestDto requestDto){
        //유효성 검사
        UserInfoValidator.validateUserInfoInput(requestDto);

        //아이디 중복 검사
        String username = requestDto.getEmail();
        Optional<User> userFound = userRepository.findByUsername(username);
        System.out.println(userFound);
        if (userFound.isPresent()) {
            throw new IllegalArgumentException("중복된 사용자 ID 가 존재합니다.");
        }

        //비밀번호 암호화
        String enPassword = passwordEncoder.encode(requestDto.getPassword());
        User user = new User(requestDto,enPassword);

        userRepository.save(user);

    }
}
