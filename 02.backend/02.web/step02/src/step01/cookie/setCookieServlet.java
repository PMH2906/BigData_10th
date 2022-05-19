package step01.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setCookie")
public class setCookieServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버가 클라이언트한테 응답 메세지를 보낼 데이터에 대한 부가정보(문서의 타입, 문자셋 지정)
		response.setContentType("text/html;charset=UTF-8");
		
		// 쿠키 객체 설정
		Cookie cookie1 = new Cookie("id","guest");
		
		// 쿠기: 클라이언트 측의 브라우저에 저장. 클라이언트 측에 보내기 위해 응답 객체에 쿠키를 저장
		// 쿠키로 상태 정보(로그인 중인지 등)를 설정할 수 있음
		response.addCookie(cookie1);// 응답 정보(response message)에 쿠키도 동봉
		
		Cookie cookie2 = new Cookie("nickName","Spiderman");
		//쿠기키간 설정. 초 단위
		cookie2.setMaxAge(60 *60 *3);
		response.addCookie(cookie2);
		
		PrintWriter out = response.getWriter();
		out.print("서버에서 생성한 쿠키가 클라이언트로 전송되었음");
		
		// 자원 해제
		out.close();
		
	}

}
