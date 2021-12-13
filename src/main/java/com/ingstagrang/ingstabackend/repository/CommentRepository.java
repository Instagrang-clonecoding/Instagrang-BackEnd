package com.ingstagrang.ingstabackend.repository;

import com.ingstagrang.ingstabackend.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
