package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    /*
    서블릿이 호출되면, 이 Service 메소드가 호출됨
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        // Query Parameter 를 쉽게 읽을 수 있음
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        // Content Type ( 헤더에 들어감 )
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        // Body
        response.getWriter().write("Hello " + username);

    }
}
