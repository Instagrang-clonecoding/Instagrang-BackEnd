package com.ingstagrang.ingstabackend.repository;

import com.ingstagrang.ingstabackend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByCreateAtDesc();
}
