package com.ingstagrang.ingstabackend.controller;


import com.ingstagrang.ingstabackend.dto.CommentDto;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.security.UserDetailsImpl;
import com.ingstagrang.ingstabackend.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/api/comments/{postId}")
    public ResponseEntity<CommentDto.CommentDtoResponseDto> saveComment(@PathVariable Long postId, @RequestBody CommentDto.CommentDtoRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails){
        User user = userDetails.getUser();
        return ResponseEntity.ok().body(commentService.serviceCommentSave(postId,requestDto,user));
    }

    @DeleteMapping("/api/comments/{commentId}")
    public void deleteComment(@PathVariable Long commentId){
        commentService.serviceCommentDelete(commentId);
    }
}
