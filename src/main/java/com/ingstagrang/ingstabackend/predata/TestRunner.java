package com.ingstagrang.ingstabackend.predata;

import com.ingstagrang.ingstabackend.entity.Post;
import com.ingstagrang.ingstabackend.entity.User;
import com.ingstagrang.ingstabackend.repository.PostRepository;
import com.ingstagrang.ingstabackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 테스트 User 생성
        User testUser1 = new User("xxx@naver.com", "asldfjdk", "diddl1234*");
        testUser1 = userRepository.save(testUser1);

        createPostTestData(testUser1, "/images/a28ef60e-2b5d-4f05-b4f2-a6e33bb63e0d_더 뷰.jpg","content1111");
        createPostTestData(testUser1, "/images/3192ff29-b156-402f-b9e7-813c7d1f6421_WIN_20210907_21_43_23_Pro.jpg","content2222");
        createPostTestData(testUser1, "/images/f8855080-9d05-4898-a516-58fa6d231f10_WIN_20210907_21_43_23_Pro.jpg","content3333");
        createPostTestData(testUser1, "/images/a28ef60e-2b5d-4f05-b4f2-a6e33bb63e0d_더 뷰.jpg","content4444");
    }

    private void createPostTestData(User testUser1, String url, String content) {
        Post newPost = new Post(url, content, testUser1);
        postRepository.save(newPost);
    }
}
