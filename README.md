<h3 align="center"><b>π° ν­ν΄99 7μ£Όμ°¨ 10ν μΈμ€νκ·Έλ¨ ν΄λ‘  μ½λ©π°</b></h3>

<h4 align="center">π 2021.12.13 ~ 2021.12.17</h4>
<br>

---

<h3><b>π« νλ‘μ νΈ μκ° π«</b></h3>
μΈμ€νκ·Έλ¨μ ν΄λ‘  μ½λ©ν μμ€νκ·Έλ­μλλ€!

<h3><b>π£ ν λΈλ‘κ·Έ π£</b></h3>
https://www.notion.so/10-Home-ffb072e101d34e2884ca081ded79a2ab

<br><br>

<h3><b>π νλ‘μ νΈ μμ°μμ π</b></h3>

<br>

---

<br>
<h3 align="center"><b>π  Tech Stack π </b></h3>
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
<h3 align="center"><b>π Project Directory Structure π</b></h3>
<pre>
<code>
/com.seongend.sout
  βββ/config
     βββ /SwaggerConfig.java
     βββ /WebConfig.java
  βββ/controller
     βββ /CommentController.java
     βββ /HomeController.java
     βββ /PostController.java
     βββ /UserController.java
  βββ/dto
     βββ /CommentDto.java
     βββ /PostDto.java
     βββ /PostLikeDto.java
     βββ /SignupDto.java
  βββ/entity
     βββ /Comment.java
     βββ /Post.java
     βββ /PostLike.java
     βββ /Timestamped.java
     βββ /User.java
  βββ/repository
     βββ /CommentRepository.java
     βββ /LikeRepository.java
     βββ /PostRepository.java
     βββ /UserRepository.java
  βββ/security
     βββ /filter
         βββ /FormLoginFilter.java
         βββ /JwtAuthFilter.java
     βββ /jwt
         βββ /HeaderTokenExtractor.java
         βββ /JwtDecoder.java
         βββ /JwtPreProcessingToken.java
         βββ /JwtTokenUtils.java
     βββ /provider
         βββ /FormLoginAuthProvider.java
         βββ /JWTAuthProvider.java
     βββ /FilterSkipMatcher.java
     βββ /FormLoginSuccessHandler.java
     βββ /UserDetailsImpl.java
     βββ /UserDetailsServiceImpl.java
     βββ /WebSecurityConfig.java
  βββ/service
     βββ /CommentService.java
     βββ /HomeService.java
     βββ /PostLikeService.java
     βββ /PostService.java
     βββ /UserService.java
  βββ/timeconversion
     βββ /TimeConversion.java
  βββ/validator
     βββ /UserInfoValidator.java
  βββ/IngstabackendApplication.java
</code>
</pre>
<br>

---

<h3 align="center"><b>π’ Entity Relationship Diagram π’</b></h3>
<p align="center"><img src="https://user-images.githubusercontent.com/57797592/146493892-c5a5b374-42f1-4790-9def-15eecdab6f74.png" /></p>

<br>
<h3 align="center"><b>π· API Table π·</b></h3>
<p align="center"><img src="https://user-images.githubusercontent.com/57797592/146494412-9767ca19-cdc3-443b-ba31-c28c36754fa3.png" /></p>
<p align="center"><img src="https://user-images.githubusercontent.com/57797592/146494493-ca6cb9f9-b9b9-4e8b-a1e6-ea0425858d0d.png" /></p>

---

<h3 align="center"><b>π¨π»βπ€βπ¨π» Members π¨π»βπ€βπ¨π»</b></h3>
<br>
<table align="center">
    <tr>
        <td align="center">
        <a href="https://diddl.tistory.com/"><img src="https://img.shields.io/badge/μμ±μ-000AFF?style=λ±μ§λͺ¨μ&logo=λ‘κ³ &logoColor=white"/></a>
        </td>
        <td align="center">
        <a href="https://velog.io/@jybin96"><img src="https://img.shields.io/badge/μ μλΉ-2DDC88?style=λ±μ§λͺ¨μ&logo=λ‘κ³ &logoColor=black"/></a>
        </td>
        <td align="center">
        <a href="https://joorani.tistory.com/"><img src="https://img.shields.io/badge/κΉμ£Όλ-D77EE9?style=λ±μ§λͺ¨μ&logo=λ‘κ³ &logoColor=white"/></a>
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

<h3 align="center"><b>β Trouble Shooting β</b></h3>
<br>
<details>
    <summary>
       <b>Entity λͺμ΄ SQL μΏΌλ¦¬ λͺλ Ήλ¬Έκ³Ό μ΄λ¦μ΄ κ°μΌλ©΄ λ°μνλ λ¬Έμ </b>
    </summary>
    <br><b>κ²μκΈ μ’μμ κΈ°λ₯μ μν°ν°λͺμ Likeλ‘ νλλ SQLλ¬Έμ λͺλ Ήλ¬Έ LIKEμ κ²Ήμ³μ λ°μν λ¬Έμ </b>
    <p align="center"><img src="https://user-images.githubusercontent.com/57797592/146494746-68e17dad-a355-426f-bbff-62db5741a4bc.png" /></p>
    <br>ν΄κ²° : μν°ν° λͺμ Like -> PostLikeλ‘ λ³κ²½
</details>

<details>
    <summary>
        <b>JSONνμκ³Ό λ©μλλ₯Ό μ λ§μΆ°μ λ³΄λμΌλ Bad RequestλΌκ³  λ¨λ λ¬Έμ </b>
    </summary>

```
Error Msg : although at least one Creator exists): cannot deserialize from Object value
```

<p align="center"><img src="https://user-images.githubusercontent.com/57797592/146495410-d30a715b-36c4-42f3-bce5-d9327c054b8d.png" /></p>
λ°μ μ΄μ  : λ¨μΌ μμ±μμ λν κ·Όλ³Έμ μΈ λͺ¨νΈμ± λλ¬Έμ Springμ΄ Objectλ₯Ό μμ±ν  λ λ°λμ λΉ μμ±μλ₯Ό μ μΈν΄μ€μΌ νλ€κ³  νλ€. 
<br><br><b>ν΄κ²° : Dtoμ λΉ μμ±μ μμ±</b>

```java    
    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor // λΉ μμ±μ μΆκ°
    public static class CommentDtoRequestDto{
        private String content;
    }
```

</details>

<details>
    <summary>
       <b>μ μ²΄ κ²μκΈ μ‘°ν μ DTOλ₯Ό λΆλ¬μ€μ§ λͺ»νλ λ¬Έμ </b>
    </summary>
    <br><b>dtoμ @Getterλ₯Ό λΆμ¬μ£Όμ§ μμ λ°μν λ¬Έμ </b>
    <p align="center"><img src="https://user-images.githubusercontent.com/57797592/146495190-81d7652c-cf84-4981-bf59-65acc090dc35.png" /></p>
    <br><br>ν΄κ²° : μν°ν° λͺμ Like -> PostLikeλ‘ λ³κ²½

```java 
@Getter //λΆμ¬μ€
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
        <b>μ΄λ―Έμ§ ν¬κΈ° μ ν λ¬Έμ </b>
    </summary>
<br>λ¬Έμ  λ°μ μμΈ : κΈ°λ³Έ μ΄λ―Έμ§ ν¬κΈ° μ νμ΄ 1MBλ‘ λμ΄ μμ΄ νΉμ  μ΄λ―Έμ§λ μ¬λΌκ°μ§ μλ λ¬Έμ  λ°μ
<p align="center"><img src="https://user-images.githubusercontent.com/57797592/146495578-fc9702d8-7758-4fa1-9328-c435eb109235.png" /></p>
<br><br><b>ν΄κ²° : application.propertiesμ μ΄λ―Έμ§ ν¬κΈ° μ€μ  μΆκ°</b>

```java
   spring.servlet.multipart.maxFileSize=10MB
   spring.servlet.multipart.maxRequestSize=10MB
```

</details>
