package com.ingstagrang.ingstabackend.entity;

import com.ingstagrang.ingstabackend.dto.PostDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Getter
public class Post extends Timestamped {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User user;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String image;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    List<Comment> commentList = new ArrayList<>();

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    List<PostLike> postLikeList = new ArrayList<>();

    public Post(PostDto.PostRequestDto requestDto, User user){
        this.user = user;
        this.content = requestDto.getContent();
        this.image = requestDto.getImage();
    }

    public Post(String path, String content, User user) {
        this.image = path;
        this.content = content;
        this.user = user;
    }

    public void update(String path, String content){
        this.image = path;
        this.content = content;
    }
}
