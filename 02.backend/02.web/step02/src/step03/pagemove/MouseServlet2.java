package step03.pagemove;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mouseResult")
public class MouseServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// 포워딩으로 여기로 보내진 servlet의 인코딩 정보를 담아옴
		request.getCharacterEncoding();
		
		// (Mouse) : 상위타입에서 하위 타입으로 변경 시 
		Mouse mouse = (Mouse)request.getAttribute("mouse"); // mouse키값의 값을 가져옴
		
		out.printf("<h4> 이름 : %s </h4>", mouse.getName());
		out.printf("<h4> 국적 : %s </h4>", mouse.getCountry());
		out.printf("<h4> 주소 : %s </h4>", mouse.getAddress());
		
		out.close();
	}

}
