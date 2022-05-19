package com.mouse.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	
	//execute 메서드 선언
	// Controller 인터페이스를 구현하는 클래스들은 해당 메서드임.
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
