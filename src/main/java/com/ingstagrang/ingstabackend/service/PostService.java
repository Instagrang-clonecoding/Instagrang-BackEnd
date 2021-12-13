package com.ingstagrang.ingstabackend.service;


import com.ingstagrang.ingstabackend.dto.PostDto;
import com.ingstagrang.ingstabackend.entity.Post;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public void createPost(MultipartFile image, String content, User user) throws IOException {
        String path = getImagePath(image); // 이미지 저장, path 가져오기
        Post newPost = new Post(path, content, user);
        postRepository.save(newPost);
    }

    @Transactional
    public void updatePost(Long postId, PostDto.PostRequestDto requestDto) {
        Post updatePost = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 포스트입니다."));

        updatePost.update(requestDto);
    }

    @Transactional
    public void deletePost(Long postId) {
        postRepository.deleteById(postId);
    }


    public String getImagePath(MultipartFile image) throws IOException {
        String path = "/image/";
        String saveLocation = "C:/Users/Yang/Pictures/image/";

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
}
