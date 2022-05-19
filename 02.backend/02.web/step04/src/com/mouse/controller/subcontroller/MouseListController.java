package com.mouse.controller.subcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mouse.controller.Controller;
import com.mouse.model.Mouse;
import com.mouse.service.MouseService;

// Controller 인터페이스 구현할 구현 클래스
public class MouseListController implements Controller{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("list Controller입니다.");
		
		String url = null;
		
		// Controller -> Service 
		MouseService service = MouseService.getInstance();
		
		try {
			ArrayList<Mouse> mouseList = service.mouseList();
			PrintWriter out = response.getWriter();
			out.print(mouseList.get(0).getId());
			out.print(mouseList.get(0).getName());
			out.print(mouseList.get(0).getCountry());
			out.print(mouseList.get(0).getAddress());
			out.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
