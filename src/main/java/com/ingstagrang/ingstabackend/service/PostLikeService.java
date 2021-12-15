package com.ingstagrang.ingstabackend.service;

import com.ingstagrang.ingstabackend.entity.Post;
import com.ingstagrang.ingstabackend.entity.PostLike;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.repository.LikeRepository;
import com.ingstagrang.ingstabackend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostLikeService {

    private final LikeRepository likeRepository;
    private final PostRepository postRepository;

    @Transactional
    public void addLike(Long postId, User user) {
        Post post = postRepository.findById(postId).orElseThrow(() ->
                new IllegalArgumentException("존재하지 않는 포스트입니다."));
        System.out.println(user.getId());
       PostLike findPostLike = likeRepository.findByPostAndUser(post, user).orElse(null);

        //존재하면 삭제, 존재하지 않으면 추가
        if (findPostLike == null) {
            likeRepository.save(new PostLike(post, user));
        } else {
            likeRepository.delete(findPostLike);
        }
    }
}

