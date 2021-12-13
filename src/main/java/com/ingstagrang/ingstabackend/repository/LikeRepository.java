package com.ingstagrang.ingstabackend.repository;

import com.ingstagrang.ingstabackend.entity.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<PostLike, Long> {
}
