package com.ingstagrang.ingstabackend.controller;

import com.ingstagrang.ingstabackend.dto.CommentDto;
import com.ingstagrang.ingstabackend.dto.PostDto;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.security.UserDetailsImpl;
import com.ingstagrang.ingstabackend.service.PostService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;


    @ApiOperation("포스트 작성")
    @PostMapping("/api/posts")
    public void createPost(@RequestBody PostDto.PostRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails){
        User user = userDetails.getUser();
        postService.createPost(requestDto, user);
    }

    @ApiOperation("포스트 작성")
    @PostMapping("/api/imagetest")
    public void testImage(@RequestParam("image") MultipartFile image,
                          @RequestParam("content") String content,
                          @AuthenticationPrincipal UserDetailsImpl userDetails) throws IOException {
        User user = userDetails.getUser();
        postService.imageTest(image, content, user);
    }

    @ApiOperation("포스트 수정")
    @PutMapping("/api/posts/{postId}")
    public void updatePost(@PathVariable Long postId, @RequestBody PostDto.PostRequestDto requestDto){
        postService.updatePost(postId, requestDto);
    }

    @ApiOperation("포스트 삭제")
    @DeleteMapping("/api/posts/{postId}")
    public void deletePost(@PathVariable Long postId){
        postService.deletePost(postId);
    }

    @PostMapping("/api/comments/{postId}")
    public void test(@PathVariable Long postId, @RequestBody CommentDto.CommentRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails){
        System.out.println("되네?");
    }
}
