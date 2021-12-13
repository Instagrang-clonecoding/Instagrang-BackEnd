package com.ingstagrang.ingstabackend.entity;

import com.ingstagrang.ingstabackend.dto.SignupDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    // 사용자 Email == 사용자 ID
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;

    public User(SignupDto.RequestDto requestDto, String enPassword){
        this.username = requestDto.getEmail();
        this.nickname = requestDto.getNickname();
        this.password = enPassword;
    }
}
