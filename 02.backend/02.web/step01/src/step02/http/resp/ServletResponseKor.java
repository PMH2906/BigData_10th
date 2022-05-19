package step02.http.resp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test4")
public class ServletResponseKor extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 서버가 클라이언트 전송 과정에 명시해야 할것
		// 1. 보내는 데이터의 타입
		// 2. 문자셋 정보
		// 별도로 명시 안하면 기본으로 세팅됨
				
		// 클라이언트가 한글로 decoding 할 수 있도록 문자셋 정보를 보냄
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();

		out.print("<body>�ȳ�?<body>");
		out.close();
	}

}
