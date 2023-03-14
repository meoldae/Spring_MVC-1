package hello.springmvc.basic.request;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Slf4j
@Controller
public class RequestParamController {

    @RequestMapping("/request-param-v1")
    public void requestParamV1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        log.info("username = {}, age = {}", username, age);

        response.getWriter().write("ok");
    }

    @ResponseBody
    @RequestMapping("/request-param-v2")
    public String requestParamV2(@RequestParam("username") String username, @RequestParam("age") int age) throws IOException {
        log.info("username = {}, age = {}", username, age);

        // ResponseBody 에 "ok"를 넣어서 반환 == RestController
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-v3")
    public String requestParamV3(@RequestParam String username, @RequestParam int age) throws IOException {
        log.info("username = {}, age = {}", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-v4")
    public String requestParamV4(String username, int age) throws IOException {
        // Parameter 이름과 일치하면 @RequestParam 주석마저도 생략할 수 있다.
        // 객체가 아니라 String, int, Integer 등이어야 한다.. 객체면 안됨!
        log.info("username = {}, age = {}", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-required")
    public String requestParamRequired(@RequestParam(required = true) String username,
                                 @RequestParam(required = false) Integer age){
        // @RequestParam 의 required 속성이 true 이면 반드시 전달받아야 한다. (default)
        // false 이면 전달받지 않아도 된다.
        // 기본형에는 null 이 들어갈 수 없으므로 Wrapper 클래스나 default Value 로 받아야 한다.
        // 주의할 점 !  null != ""  username= 로 전달되면 null 이 아니라 빈 문자열로 통과한다.
        log.info("username = {}, age = {}", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-default")
    public String requestParamDefault(@RequestParam(defaultValue = "Guest") String username,
                                 @RequestParam(defaultValue = "-1") int age){
        // defaultValue 가 있으면 required 가 필요 없다. 어차피 default Value 가 들어가기 때문
        // 주의할 점은 null 이 아니라 빈 문자에도 Default 값을 채워 준다.
        log.info("username = {}, age = {}", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-map")
    public String requestParamMap(@RequestParam Map<String, Object> paramMap){
        log.info("username = {}, age = {}", paramMap.get("username"), paramMap.get("age"));
        return "ok";
    }
}