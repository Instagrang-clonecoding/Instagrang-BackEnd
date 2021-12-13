package com.ingstagrang.ingstabackend.service;

import com.ingstagrang.ingstabackend.dto.CommentDto;
import com.ingstagrang.ingstabackend.entity.Comment;
import com.ingstagrang.ingstabackend.entity.Post;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.repository.CommentRepository;
import com.ingstagrang.ingstabackend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public void serviceCommentSave(Long postId,CommentDto.CommentDtoRequestDto requestDto, User user){
        //해당되는 포스트를 찾아서
        Post post = postRepository.findById(postId).orElseThrow(
                ()-> new IllegalArgumentException("해당되는 포스트 없음.")
        );
        // Comment 생성
        Comment comment = new Comment(requestDto,user,post);
        //Comment 저장
        commentRepository.save(comment);

    }

    public void serviceCommentDelete(Long commentId) {
        commentRepository.deleteById(commentId);
    }
}
