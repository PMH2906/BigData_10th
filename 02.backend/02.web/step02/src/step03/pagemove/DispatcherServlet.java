package step03.pagemove;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h3>DistpatcherServlet수행결과</h3>");
		
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/page2");
		
		// 실제 이동 수행
		// request, response의 정보를 담아서 page2로 이동되는 것!
		rd.forward(request, response);
		
		out.close();
	}

}
