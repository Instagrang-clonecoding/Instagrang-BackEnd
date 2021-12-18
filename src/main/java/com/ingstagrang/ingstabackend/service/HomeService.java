package com.ingstagrang.ingstabackend.service;

import com.ingstagrang.ingstabackend.dto.CommentDto;
import com.ingstagrang.ingstabackend.dto.PostDto;
import com.ingstagrang.ingstabackend.dto.PostLikeDto;
import com.ingstagrang.ingstabackend.entity.Comment;
import com.ingstagrang.ingstabackend.entity.Post;
import com.ingstagrang.ingstabackend.entity.PostLike;
import com.ingstagrang.ingstabackend.repository.CommentRepository;
import com.ingstagrang.ingstabackend.repository.PostRepository;
import com.ingstagrang.ingstabackend.timeconversion.TimeConversion;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class HomeService {

    private final PostRepository postRepository;

    @Transactional
    public List<PostDto.PostResponseDto> getPosts() {

        List<PostDto.PostResponseDto> postResponseDtos = new ArrayList<>();
        List<Post> posts = postRepository.findAllByOrderByCreateAtDesc();

        for (Post post : posts) {
            List<CommentDto.CommentDtoResponseDto> commentList = makeCommentDtoList(post);
            List<PostLikeDto> postLikeList = makeLikeDtoList(post);

            PostDto.PostResponseDto postResponseDto = PostDto.PostResponseDto.builder()
                    .postId(post.getId())
                    .userId(post.getUser().getId())
                    .nickname(post.getUser().getNickname())
                    .content(post.getContent())
                    .image(post.getImage())
                    .createdAt(TimeConversion.timeConversion(post.getCreateAt()))
                    .commentList(commentList)
                    .likeList(postLikeList)
                    .build();

            postResponseDtos.add(postResponseDto);
        }
        return postResponseDtos;
    }
    //commentList 생성
    private List<CommentDto.CommentDtoResponseDto> makeCommentDtoList(Post post) {

        List<Comment> comments = post.getCommentList();
        List<CommentDto.CommentDtoResponseDto> commentResponseDtos = new ArrayList<>();

        for (Comment comment : comments) {
            CommentDto.CommentDtoResponseDto commentResponseDto =
                    CommentDto.CommentDtoResponseDto.builder()
                            .commentId(comment.getId())
                            .userId(comment.getUser().getId())
                            .nickname(comment.getUser().getNickname())
                            .content(comment.getContent())
                            .createdAt(TimeConversion.timeConversion(comment.getCreateAt()))
                            .build();

            commentResponseDtos.add(commentResponseDto);
        }

        return commentResponseDtos;
    }
        //likeList생성
        private List<PostLikeDto> makeLikeDtoList (Post post) {

        List<PostLike> postLikes = post.getPostLikeList();
            List<PostLikeDto> postLikeDtos = new ArrayList<>();

            for (PostLike postLike : postLikes) {
                PostLikeDto postLikeDto = new PostLikeDto(postLike.getUser().getId());
                postLikeDtos.add(postLikeDto);
            }

            return postLikeDtos;
        }
}
