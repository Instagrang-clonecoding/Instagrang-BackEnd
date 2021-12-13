package com.ingstagrang.ingstabackend.controller;

import com.ingstagrang.ingstabackend.dto.PostDto;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.security.UserDetailsImpl;
import com.ingstagrang.ingstabackend.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;


    // 포스트 작성
    @PostMapping("/api/posts")
    public void createPost(@RequestBody PostDto.PostRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails){
        User user = userDetails.getUser();
        postService.createPost(requestDto, user);
    }

    // 포스트 수정
    @PutMapping("/api/posts/{postId}")
    public void updatePost(@PathVariable Long postId, @RequestBody PostDto.PostRequestDto requestDto){
        postService.updatePost(postId, requestDto);
    }

    // 포스트 삭제
    @DeleteMapping("/api/posts/{postId}")
    public void deletePost(@PathVariable Long postId){
        postService.deletePost(postId);
    }
}
