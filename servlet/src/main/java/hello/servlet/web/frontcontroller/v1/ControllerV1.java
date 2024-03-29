package hello.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {

    /**
     * Servlet 과 동일한 모습의 인터페이스 생성
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    void process(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException;



}
