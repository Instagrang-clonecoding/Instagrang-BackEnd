package com.ingstagrang.ingstabackend.controller;

import com.ingstagrang.ingstabackend.dto.PostDto;
import com.ingstagrang.ingstabackend.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class HomeController {
    private final HomeService homeService;

    //모든 포스트 불러오기
    @GetMapping("/")
    public ResponseEntity<List<PostDto.PostResponseDto>> mainPageLoad(){
        return ResponseEntity.ok().body(homeService.getPosts());
    }

}
