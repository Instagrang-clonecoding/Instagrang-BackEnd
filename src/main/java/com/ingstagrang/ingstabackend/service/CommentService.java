package com.ingstagrang.ingstabackend.service;

import com.ingstagrang.ingstabackend.dto.CommentDto;
import com.ingstagrang.ingstabackend.entity.Comment;
import com.ingstagrang.ingstabackend.entity.Post;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.repository.CommentRepository;
import com.ingstagrang.ingstabackend.repository.PostRepository;
import com.ingstagrang.ingstabackend.timeconversion.TimeConversion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    @Transactional
    public CommentDto.CommentDtoResponseDto serviceCommentSave(Long postId,CommentDto.CommentDtoRequestDto requestDto, User user){
        //해당되는 포스트를 찾아서
        Post post = postRepository.findById(postId).orElseThrow(
                ()-> new IllegalArgumentException("해당되는 포스트 없음.")
        );
        // Comment 생성
        Comment comment = new Comment(requestDto,user,post);
        //Comment 저장
        commentRepository.save(comment);

        return CommentDto.CommentDtoResponseDto.builder()
                .commentId(comment.getId())
                .nickname(comment.getUser().getNickname())
                .content(comment.getContent())
                .createdAt(TimeConversion.timeConversion(comment.getCreateAt()))
                .build();
    }

    public void serviceCommentDelete(Long commentId) {
        commentRepository.deleteById(commentId);
    }
}
