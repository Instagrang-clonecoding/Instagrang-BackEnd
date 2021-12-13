package com.ingstagrang.ingstabackend.repository;

import com.ingstagrang.ingstabackend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
