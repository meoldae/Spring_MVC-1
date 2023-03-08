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
