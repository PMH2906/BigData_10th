package step03.pagemove;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/otherSite")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// radio tag에 입력된 값 받기
		String site = request.getParameter("site");
		
		// 그 값이 naver면 naver.com로 이동, google이면 google.com으로 이동
		if(site.equals("naver")) {
			// naver.com 이동
//			response.getWriter().print("naver 페이지입니다");
			
			//naver.com 으로 요청 재지정
			response.sendRedirect("http://www.naver.com");
		}else if(site.equals("google")) {
			// google.com 이동
			response.sendRedirect("http://www.google.com");
		}
		
	}

}
