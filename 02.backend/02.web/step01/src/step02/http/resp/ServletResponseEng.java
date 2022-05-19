package step02.http.resp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test3")
public class ServletResponseEng extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버가 응답할 내용 작성(자바에서 특정 경로 서버에 값을 보냄.)
		PrintWriter out = response.getWriter();
		
		//<html> </html> 생랼
		
		// 문자열은 서버에서 html로 인식함. 따라서  body 부분에 Hello가 쓰여짐
		out.print("<body>Hello</body>");
		out.close();

	}

}
