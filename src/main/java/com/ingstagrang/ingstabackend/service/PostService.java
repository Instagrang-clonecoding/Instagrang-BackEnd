package com.ingstagrang.ingstabackend.service;


import com.ingstagrang.ingstabackend.dto.PostDto;
import com.ingstagrang.ingstabackend.entity.Post;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public void createPost(PostDto.PostRequestDto requestDto, User user) {
        Post newPost = new Post(requestDto, user);
        postRepository.save(newPost);
    }

    @Transactional
    public void updatePost(Long postId, PostDto.PostRequestDto requestDto) {
        Post updatePost = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 포스트입니다."));

        updatePost.update(requestDto);
    }

    @Transactional
    public void deletePost(Long postId) {
        postRepository.deleteById(postId);
    }
}
