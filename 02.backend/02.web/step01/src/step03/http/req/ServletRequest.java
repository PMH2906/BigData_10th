package step03.http.req;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test5")
public class ServletRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// UTF-8 로 문자셋, text/html 로 문자 타입 설정
		response.setContentType("text/html;charset = UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("Server port : "+ request.getServerPort()+ "<br/>");
		
		// 자바가 서버에 요청하는 것. 즉 각각의 정보를 요청(Requset)해서 클라이언트에 out.print에 다시 보내줌(response)
		out.print("Request URI : " + request.getRequestURI() + "<br/>");
		out.print("Request URL : " + request.getRequestURL() + "<br/>");
		out.print("Context Path : " + request.getContextPath() + "<br/>");
		out.print("Request Protocol : " + request.getProtocol() + "<br/>");
		out.print("Request Method : " + request.getMethod() + "<br/>");
		out.print("Query String : " + request.getQueryString() + "<br/>");
		out.close();
	}

}
