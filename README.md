# Spring_MVC-1 백엔드 웹 개발 핵심 기술
Inflearn - 스프링 MVC 1편 - 백엔드 웹 개발 핵심 기술
---  

## 0x00. 웹 애플리케이션 이해
- 웹 서버와 웹 애플리케이션 서버
- 서블릿
- 멀티쓰레드

## 0x01. 서블릿
- 프로젝트 생성

```commit``` : [60e54f6](https://github.com/meoldae/Spring_MVC-1/commit/60e54f686a0640e6a2f1191af486b5df990018f2)
- Servlet 실행 ( 요청과 응답 확인 ) 

```commit``` : [c15607b](https://github.com/meoldae/Spring_MVC-1/commit/c15607b1ac09d0c9efc879e815ba3ca55650d00a)
- HttpServletRequest를 통한 Http 메시지 헤더 정보 조회

```commit``` : [97db5e8](https://github.com/meoldae/Spring_MVC-1/commit/97db5e89473c3228ab5bfb7906903a268484a021)
- 여러가지 방식의 QueryParameter 조회

```commit``` : [0b6e348](https://github.com/meoldae/Spring_MVC-1/commit/0b6e348dae68d025947e86641ef5aebf1e824e6f), [dd0da78](https://github.com/meoldae/Spring_MVC-1/commit/dd0da78758ac4c50b5632eabddd5da1132f7f2f4), [26f5d85](https://github.com/meoldae/Spring_MVC-1/commit/26f5d85fd33b9ce21c7686c093232b5528d45c69), [b2af6ad](https://github.com/meoldae/Spring_MVC-1/commit/b2af6ad7033aee62bd0f6864fa2cced981ba25e3)
- HTTP Response 생성 (헤더 및 세팅)

```commit``` : [4938c7f](https://github.com/meoldae/Spring_MVC-1/commit/4938c7fa7435941516153a4c383cd753845b3e99)
- HTTP Response 메시지 (HTML, JSON)

```commit``` : [562af88](https://github.com/meoldae/Spring_MVC-1/commit/562af8855f50149224c2830ea3e6f09e3f8d8bd6), [5789c26](https://github.com/meoldae/Spring_MVC-1/commit/5789c26d71e39919dff0e9da9e987c0cfe1ee768)

## 0x02. 서블릿, JSP 그리고 MVC 패턴
- 회원 도메인 생성

```commit``` : [7701de4](https://github.com/meoldae/Spring_MVC-1/commit/7701de460defe17d39a55a919702e370a02f6abc)
- 서블릿을 통한 동적 페이지 생성

```commit``` : [f806f04](https://github.com/meoldae/Spring_MVC-1/commit/f806f04997d09d2242eb7665a8efc443980c42e8)
- JSP를 통한 동적 페이지 생성 (템플릿 엔진)

```commit``` : [78ee32e](https://github.com/meoldae/Spring_MVC-1/commit/78ee32e4b50cb5edcdea0e5421a71ea75919cbb3)
- 서블릿(Controller)과 JSP(View)에 MVC 패턴 적용

```commit``` : [9c3f505](https://github.com/meoldae/Spring_MVC-1/commit/9c3f505dc62b55e5a2f0f08009e598e59ff35d0d)

## 0x03. MVC 프레임워크 제작
- 프론트 컨트롤러 도입

```commit``` : [0958db7](https://github.com/meoldae/Spring_MVC-1/commit/0958db7d63483b6e1a44880e735d6abe42b4f2cb)
- View 분리 

```commit``` : [b8d339e](https://github.com/meoldae/Spring_MVC-1/commit/b8d339e6fcab048e3ccedd9b12aa9cff2d81cc36)
- Controller에서 Http Message 종속성(의존성) 제거 / 공통 URL 모두 추출

```commit``` : [656cea1](https://github.com/meoldae/Spring_MVC-1/commit/656cea11d4261753f7b4331ae7927c5a8c497469)
- FrontController에서 직접 Model 제공 

```commit``` : [963371d](https://github.com/meoldae/Spring_MVC-1/commit/963371d9ce27b4ff7d2f07fb61ba867f8567881b)
- Adapter Pattern을 통한 유연한 컨트롤러의 사용

```commit``` : [9f694da](https://github.com/meoldae/Spring_MVC-1/commit/9f694da1d9bf8b0c9b2458b8ca6ed0c7f011e2d1), [fdb2e2f](https://github.com/meoldae/Spring_MVC-1/commit/fdb2e2f6ea5615b8c099259693c9a3839ee811ba)

## 0x04. Spring MVC 구조 이해
- 전체 구조 이해

```commit``` : [af4535e](https://github.com/meoldae/Spring_MVC-1/commit/af4535ef0c1c92c3b0fbf89f44b270cf00ff35b6)
- 뷰 리졸버 View Resolver

```commit``` : [ded6324](https://github.com/meoldae/Spring_MVC-1/commit/ded6324c25d843c40118506ab69a54bd97c38e96)
- @Controller와 @RequestMapping을 통한 Controller 통합, 공통 URL 추출

```commit``` : [4f7744e](https://github.com/meoldae/Spring_MVC-1/commit/4f7744e98a4e479d18c166a61b365c01c6822897)
- Spring MVC 실무 방식의 Controller 사용

```commit``` : [ff4d9c5](https://github.com/meoldae/Spring_MVC-1/commit/ff4d9c5d6aa8b27c368423230d9546018532b02c)

## 0x05. Spring MVC 기본 기능
- Logging : Slf4j

```commit``` : [41ba6cf](https://github.com/meoldae/Spring_MVC-1/commit/41ba6cff34ba6656261132fc0130493efe6df3d1)
- @RequestMapping 의 여러 방법 (다중 매핑, 파라미터 매핑, 헤더 매핑 등)

```commit``` : [44b82e5](https://github.com/meoldae/Spring_MVC-1/commit/44b82e579470ced82205c3392d35540fed77ff53)
- API방식의 @RequestMapping 

```commit``` : [076639f](https://github.com/meoldae/Spring_MVC-1/commit/076639fd145014d25af59baf8edc108dce0b6238)
- Http Request Header 조회 

```commit``` : [71e0ee3](https://github.com/meoldae/Spring_MVC-1/commit/71e0ee3b101e783bd1e7a9497ecef653151ba1b8)
- Http Request Parameter 조회 - 쿼리 파라미터와 HTML Form

```commit``` : [8a3e0b7](https://github.com/meoldae/Spring_MVC-1/commit/8a3e0b70bc1bc19bd08331a7c009f0ee412a0986)
- @RequestParam 을 통한 다양한 조회 방법

```commit``` : [974e7d2](https://github.com/meoldae/Spring_MVC-1/commit/974e7d213b1d8fec4e28564db67b7213768efd29)
- @ModelAttribute 를 통해 파라미터를 객체로 바로 읽어오기

```commit``` : [8e8d60e](https://github.com/meoldae/Spring_MVC-1/commit/8e8d60e448482f4eb061406de0f10156292fafb3)
- Http Request Body 읽기 - Plain Text

```commit``` : [7d1c730](https://github.com/meoldae/Spring_MVC-1/commit/7d1c730ad9d9490fe7bc94b76785bcbe2600bc6d)
- Http Request Body 읽기 - JSON (Http Converter 이용)

```commit``` : [dea494c](https://github.com/meoldae/Spring_MVC-1/commit/dea494c98567ca7e2c086a5e66ffefa7e1cb44f7)
- 정적 리소스와 View 템플릿(동적 리소스)

```commit``` : [4074be6](https://github.com/meoldae/Spring_MVC-1/commit/4074be6ba063d775f57fa2638ddc22223ab6cb95)
- Http Response Body ( API 방식 )

```commit``` : [e1b39f7](https://github.com/meoldae/Spring_MVC-1/commit/e1b39f7e14707fa27573cb1afffc32ed72f89d3d)
- Http Message Converter
- Request,Handler,Controller,Response 흐름
