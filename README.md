<h3 align="center"><b>📰 항해99 7주차 10팀 인스타그램 클론 코딩📰</b></h3>

<h4 align="center">📆 2021.12.13 ~ 2021.12.17</h4>
<br>

---

<h3><b>🎫 프로젝트 소개 🎫</b></h3>
인스타그램을 클론 코딩한 잉스타그랭입니다!

<h3><b>📣 팀 블로그 📣</b></h3>
https://www.notion.so/10-Home-ffb072e101d34e2884ca081ded79a2ab

<br><br>

<h3><b>🎞 프로젝트 시연영상 🎞</b></h3>

<br>

---

<br>
<h3 align="center"><b>🛠 Tech Stack 🛠</b></h3>
<p align="center">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/Springboot-47?style=for-the-badge&logo=Springboot&logoColor=white"/>
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
<img src="https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=white">
<img src="https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=Swagger&logoColor=white">
<img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">
<img src="https://img.shields.io/badge/Amazon_AWS-FF9900?style=for-the-badge&logo=amazonaws&logoColor=white">
<img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=notion&logoColor=white">

<br><br>
<h3 align="center"><b>📂 Project Directory Structure 📁</b></h3>
<pre>
<code>
/com.seongend.sout
  └──/config
     ├── /SwaggerConfig.java
     └── /WebConfig.java
  └──/controller
     ├── /CommentController.java
     ├── /HomeController.java
     ├── /PostController.java
     └── /UserController.java
  └──/dto
     ├── /CommentDto.java
     ├── /PostDto.java
     ├── /PostLikeDto.java
     └── /SignupDto.java
  └──/entity
     ├── /Comment.java
     ├── /Post.java
     ├── /PostLike.java
     ├── /Timestamped.java
     └── /User.java
  └──/repository
     ├── /CommentRepository.java
     ├── /LikeRepository.java
     ├── /PostRepository.java
     └── /UserRepository.java
  └──/security
     └── /filter
         ├── /FormLoginFilter.java
         └── /JwtAuthFilter.java
     └── /jwt
         ├── /HeaderTokenExtractor.java
         ├── /JwtDecoder.java
         ├── /JwtPreProcessingToken.java
         └── /JwtTokenUtils.java
     └── /provider
         ├── /FormLoginAuthProvider.java
         └── /JWTAuthProvider.java
     ├── /FilterSkipMatcher.java
     ├── /FormLoginSuccessHandler.java
     ├── /UserDetailsImpl.java
     ├── /UserDetailsServiceImpl.java
     └── /WebSecurityConfig.java
  └──/service
     ├── /CommentService.java
     ├── /HomeService.java
     ├── /PostLikeService.java
     ├── /PostService.java
     └── /UserService.java
  └──/timeconversion
     └── /TimeConversion.java
  └──/validator
     └── /UserInfoValidator.java
  └──/IngstabackendApplication.java
</code>
</pre>
<br>

---

<h3 align="center"><b>📢 Entity Relationship Diagram 📢</b></h3>
<p align="center"><img src="https://user-images.githubusercontent.com/57797592/146493892-c5a5b374-42f1-4790-9def-15eecdab6f74.png" /></p>

<br>
<h3 align="center"><b>🏷 API Table 🏷</b></h3>
<p align="center"><img src="https://user-images.githubusercontent.com/57797592/146494412-9767ca19-cdc3-443b-ba31-c28c36754fa3.png" /></p>
<p align="center"><img src="https://user-images.githubusercontent.com/57797592/146494493-ca6cb9f9-b9b9-4e8b-a1e6-ea0425858d0d.png" /></p>

---

<h3 align="center"><b>👨🏻‍🤝‍👨🏻 Members 👨🏻‍🤝‍👨🏻</b></h3>
<br>
<table align="center">
    <tr>
        <td align="center">
        <a href="https://diddl.tistory.com/"><img src="https://img.shields.io/badge/양성은-000AFF?style=뱃지모양&logo=로고&logoColor=white"/></a>
        </td>
        <td align="center">
        <a href="https://velog.io/@jybin96"><img src="https://img.shields.io/badge/정영빈-2DDC88?style=뱃지모양&logo=로고&logoColor=black"/></a>
        </td>
        <td align="center">
        <a href="https://joorani.tistory.com/"><img src="https://img.shields.io/badge/김주란-D77EE9?style=뱃지모양&logo=로고&logoColor=white"/></a>
        </td>
    </tr>
    <tr>
        <th width="25%" align="center">:spider_web: BACK-END
        </th>
        <th width="25%" align="center">:spider_web: BACK-END
        </th>
        <th width="25%" align="center">:spider_web: BACK-END 
        </th>
    </tr>
</table>
<br>

---

<h3 align="center"><b>✏ Trouble Shooting ✏</b></h3>
<br>
<details>
    <summary>
       <b>Entity 명이 SQL 쿼리 명령문과 이름이 같으면 발생하는 문제</b>
    </summary>
    <br><b>게시글 좋아요 기능의 엔티티명을 Like로 했더니 SQL문의 명령문 LIKE와 겹쳐서 발생한 문제</b>
    <p align="center"><img src="https://user-images.githubusercontent.com/57797592/146494746-68e17dad-a355-426f-bbff-62db5741a4bc.png" /></p>
    <br>해결 : 엔티티 명을 Like -> PostLike로 변경
</details>

<details>
    <summary>
        <b>JSON형식과 메소드를 잘 맞춰서 보냈으나 Bad Request라고 뜨는 문제</b>
    </summary>

```
Error Msg : although at least one Creator exists): cannot deserialize from Object value
```

<p align="center"><img src="https://user-images.githubusercontent.com/57797592/146495410-d30a715b-36c4-42f3-bce5-d9327c054b8d.png" /></p>
발생 이유 : 단일 생성자에 대한 근본적인 모호성 때문에 Spring이 Object를 생성할 때 반드시 빈 생성자를 선언해줘야 한다고 한다. 
<br><br><b>해결 : Dto에 빈 생성자 생성</b>

```java    
    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor // 빈 생성자 추가
    public static class CommentDtoRequestDto{
        private String content;
    }
```

</details>

<details>
    <summary>
       <b>전체 게시글 조회 시 DTO를 불러오지 못하는 문제</b>
    </summary>
    <br><b>dto에 @Getter를 붙여주지 않아 발생한 문제</b>
    <p align="center"><img src="https://user-images.githubusercontent.com/57797592/146495190-81d7652c-cf84-4981-bf59-65acc090dc35.png" /></p>
    <br><br>해결 : 엔티티 명을 Like -> PostLike로 변경

```java 
@Getter //붙여줌
public class PostLikeDto {
    private Long userId;

    public PostLikeDto(Long id) {
        this.userId = id;
    }
}
```

</details>

<details>
    <summary>
        <b>이미지 크기 제한 문제</b>
    </summary>
<br>문제 발생 원인 : 기본 이미지 크기 제한이 1MB로 되어 있어 특정 이미지는 올라가지 않는 문제 발생
<p align="center"><img src="https://user-images.githubusercontent.com/57797592/146495578-fc9702d8-7758-4fa1-9328-c435eb109235.png" /></p>
<br><br><b>해결 : application.properties에 이미지 크기 설정 추가</b>

```java
   spring.servlet.multipart.maxFileSize=10MB
   spring.servlet.multipart.maxRequestSize=10MB
```

</details>
