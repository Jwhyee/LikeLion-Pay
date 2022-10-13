## 음원 구매 사이트

## Spring Doc - Swagger
> 주로 `REST API`를 구축 했을 때, 프론트 개발자에게 보여주기 위해 사용한다.<br>
> 기본적으로 모두에게 보여지기 때문에 아이디, 비밀번호를 지정해주는 것이 좋다.

### 의존성 추가
```java
implementation 'org.springdoc:springdoc-openapi-ui:1.6.11'
```

### Config 설정
- Security
```java
.authorizeRequests(
        authorizeRequests -> authorizeRequests
                .antMatchers("/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html").permitAll()
)
```
> `Swagger`에서 확인을 해야하기 때문에 관련된 URL은 `permitAll`을 해준다.<br>
> 단, 실제 서비스를 운영할 시에는 보안을 걸어주는 것이 좋다.

- Spring Doc
```java
@Bean
public OpenAPI springShopOpenAPI() {
    return new OpenAPI()
            .info(new Info().title("SpringShop API")
                    .description("Spring shop sample application")
                    .version("v0.0.1")
                    .license(new License().name("Apache 2.0").url("http://springdoc.org")))
            .externalDocs(new ExternalDocumentation()
                    .description("SpringShop Wiki Documentation")
                    .url("https://springshop.wiki.github.org/docs"));
}
```
> `Swagger`에 작성해놓을 설명과 정보를 작성한다.