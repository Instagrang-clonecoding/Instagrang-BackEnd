package com.ingstagrang.ingstabackend.repository;

import com.ingstagrang.ingstabackend.entity.Post;
import com.ingstagrang.ingstabackend.entity.PostLike;
import com.ingstagrang.ingstabackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<PostLike, Long> {
    Optional<PostLike> findByPostAndUser(Post post, User user);

    void deleteByPostAndUser(Post post, User user);
}
