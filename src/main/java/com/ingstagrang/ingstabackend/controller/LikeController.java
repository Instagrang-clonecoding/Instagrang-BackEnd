package com.ingstagrang.ingstabackend.controller;

import com.ingstagrang.ingstabackend.security.UserDetailsImpl;
import com.ingstagrang.ingstabackend.service.PostLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class LikeController {

    private final PostLikeService postLikeService;

    //게시글 좋아요
    @PostMapping("/api/likes/{postId}")
    public void addLike(
            @PathVariable Long postId,
            @AuthenticationPrincipal UserDetailsImpl userDetails) {

       postLikeService.addLike(postId, userDetails.getUser());
    }

}
