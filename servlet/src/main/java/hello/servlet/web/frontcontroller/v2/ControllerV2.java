package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {

    /**
     * Servlet 과 동일한 모습의 인터페이스 생성, 하지만 반환값이 MyView !
     * @param request
     * @param response
     */
    MyView process(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException;



}
