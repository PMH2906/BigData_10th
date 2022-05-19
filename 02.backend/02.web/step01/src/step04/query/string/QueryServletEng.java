package step04.query.string;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTestEng")
public class QueryServletEng extends HttpServlet {

	// GET은 속도가 빠름. 검색할 때 사용함.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버에서 클라이언트로 응답할 때 참고로 안내할 문자셋, 문서 타입(html) 지정
		response.setContentType("text/html;charset=UTF-8");
		
		// 출력을 위한 PrintWriter 객체 생성
		PrintWriter out = response.getWriter();
		
		out.print("<h1>GET 방식으로 요청되었음</h1>");
		
		// 클라이언트(브라우저)에서 입력한 값 추출(꺼내기)
		String id = request.getParameter("id");
		String password = request.getParameter("pwd");
		String name = request.getParameter("name");

		//checkbox 값 받기. 중복으로 선택이 가능하기 때문에 배열로 받게 됨 
		String[] hobbies = request.getParameterValues("hobby");
		
		String gender = request.getParameter("gender");
		String contry = request.getParameter("country");
		String introduction = request.getParameter("introduction");
		
		// 각 정보 출력
		out.print("ID: "+id+"<br/>");
		out.print("비밀번호: "+password+"<br/>");
		out.print("이름: "+name+"<br/>");
	
		for (String hobby : hobbies) {
			out.print(hobby);
		}
		out.print("<br/>");
		
		out.print("gender :" + gender+"<br/>");
		out.print("contry :" + contry+"<br/>");
		out.print("introduction :" + introduction+"<br/>");
		
		//자원해제
		out.close();
	
	}
	
	// POST는 정보를 가려줌. 즉 회원가입할떄는 post로 보내기
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		// POST 요청에 따른 encoding 타입 지정
		// 서버가 클라이언트부터 받을 때 참고할 인코딩 타입
		request.setCharacterEncoding("UTF-8");
		
		// 서버가 클라이언트에게 참고로 안내할 문서 타입과 encoding을 명시
		// 서버가 클라이언트에게 전달한 정보
		response.setContentType("text/html;charset=UTF-8");
		
		// 출력을 위한 PrintWriter 객체 생성
		PrintWriter out = response.getWriter();
		
		out.print("<h1>POST 방식으로 요청되었음</h1>");
		
		// 클라이언트(브라우저)에서 입력한 값 추출(꺼내기)
		String id = request.getParameter("id");
		String password = request.getParameter("pwd");
		String name = request.getParameter("name");

		// 각 정보 출력
		out.print("ID: " + id + "<br/>");
		out.print("비밀번호: " + password + "<br/>");
		out.print("이름: "+name+"<br/>");
	}

}
