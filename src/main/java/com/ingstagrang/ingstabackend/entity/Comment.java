package com.ingstagrang.ingstabackend.entity;

import com.ingstagrang.ingstabackend.dto.CommentDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Comment extends Timestamped{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Post post;

    @Column(nullable = false)
    private String content;

    public Comment(CommentDto.CommentDtoRequestDto requestDto, User user, Post post){
        this.user = user;
        this.post = post;
        this.content = requestDto.getContent();
    }
}
