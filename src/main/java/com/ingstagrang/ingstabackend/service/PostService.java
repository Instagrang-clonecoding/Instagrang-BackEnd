package com.ingstagrang.ingstabackend.service;


import com.ingstagrang.ingstabackend.dto.CommentDto;
import com.ingstagrang.ingstabackend.dto.PostDto;
import com.ingstagrang.ingstabackend.dto.PostLikeDto;
import com.ingstagrang.ingstabackend.entity.Comment;
import com.ingstagrang.ingstabackend.entity.Post;
import com.ingstagrang.ingstabackend.entity.PostLike;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.repository.PostRepository;
import com.ingstagrang.ingstabackend.timeconversion.TimeConversion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public PostDto.PostResponseDto createPost(MultipartFile image, String content, User user) throws IOException {
        String path = getImagePath(image); // 이미지 저장, path 가져오기

        Post newPost = new Post(path, content, user);
        newPost = postRepository.save(newPost);

        return setPostResponseDto(newPost);
    }

    @Transactional
    public PostDto.PostResponseDto updatePost(Long postId, MultipartFile image, String content, User user) throws IOException {
        Post updatePost = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 포스트입니다."));

        if(user.getId() != updatePost.getUser().getId()){
            throw new IllegalArgumentException("본인 인증이 되지 않아 게시물을 수정할 수 없습니다!");
        }

        String path = getImagePath(image); // 이미지 저장, path 가져오기

        updatePost.update(path, content);

        PostDto.PostResponseDto responseDto = setPostResponseDto(updatePost);
        setCommentResponseDto(updatePost.getCommentList(), responseDto);
        setLikeResponseDto(updatePost.getPostLikeList(), responseDto);

        return responseDto;
    }


    @Transactional
    public void deletePost(Long postId, User user) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 포스트입니다."));

        if(user.getId() != post.getUser().getId()){
            throw new IllegalArgumentException("본인 인증이 되지 않아 게시물을 수정할 수 없습니다!");
        }

        postRepository.deleteById(postId);
    }


    // 이미지 서버 저장 -> 저장 경로 반환 함수
    public String getImagePath(MultipartFile image) throws IOException {
        String path = "/images/";
        // String saveLocation = "C:/Users/Yang/Pictures/image/"; // Local 컴퓨터

        String saveLocation = "/home/ubuntu/images/"; // AWS
//          String saveLocation = "/Users/jeong-yeongbin/Desktop/project/image/";
        // 같은 이름의 이미지 파일을 방지하고자 램덤함 UUID를 생성해서 파일이름앞에 붙힌다.
        UUID uuid = UUID.randomUUID();
        String originFileName = image.getOriginalFilename();

        originFileName = originFileName.replace(" .", ".");

        String fileName = uuid + "_" + originFileName;

        image.transferTo(new File(saveLocation + fileName));

        path += fileName;
        path = path.replace(" .", ".");

        return path;
    }

    // PostResponseDto 생성
    public PostDto.PostResponseDto setPostResponseDto(Post post) {
        List<CommentDto.CommentDtoResponseDto> commentResponseDtos = new ArrayList<>();
        List<PostLikeDto> postLikeDtos = new ArrayList<>();

        return PostDto.PostResponseDto.builder()
                .postId(post.getId())
                .userId(post.getUser().getId())
                .nickname(post.getUser().getNickname())
                .content(post.getContent())
                .image(post.getImage())
                .createdAt(TimeConversion.timeConversion(post.getCreateAt()))
                .commentList(commentResponseDtos)
                .likeList(postLikeDtos)
                .build();
    }


    // CommentResponseDto 생성
    private void setCommentResponseDto(List<Comment> commentList, PostDto.PostResponseDto responseDto) {
        for (Comment comment : commentList) {

            CommentDto.CommentDtoResponseDto commentResponseDto =
                    new CommentDto.CommentDtoResponseDto(
                            comment.getId(),
                            comment.getUser().getId(),
                            comment.getUser().getNickname(),
                            comment.getContent(),
                            TimeConversion.timeConversion(comment.getCreateAt())
                    );

            responseDto.getCommentList().add(commentResponseDto);
        }
    }

    // LikeResponseDto 생성
    private void setLikeResponseDto(List<PostLike> postLikeList, PostDto.PostResponseDto responseDto) {
        for (PostLike postLike : postLikeList) {
            PostLikeDto postLikeDto = new PostLikeDto(postLike.getUser().getId());
            responseDto.getLikeList().add(postLikeDto);
        }
    }
}
