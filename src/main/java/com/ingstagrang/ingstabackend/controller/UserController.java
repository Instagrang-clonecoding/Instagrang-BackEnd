package com.ingstagrang.ingstabackend.controller;


import com.ingstagrang.ingstabackend.dto.SignupDto;
import com.ingstagrang.ingstabackend.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @ApiOperation("회원가입")
    @PostMapping("/user/signup")
    public void userSignUp(@RequestBody SignupDto.RequestDto requestDto){
        userService.serviceUserSignUp(requestDto);
    }

}
