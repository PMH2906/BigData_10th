package step01.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class readCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		// 서버에서 클라이언트에게 요청
		Cookie[] cookies = request.getCookies();
		
		for (Cookie cookie : cookies) {
			out.printf("%s : %s",cookie.getName(), cookie.getValue()+"<br/>");
		}
		// 자원해제
		out.close();
	}
}
