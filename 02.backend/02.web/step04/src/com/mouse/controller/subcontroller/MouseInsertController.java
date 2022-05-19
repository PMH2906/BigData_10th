package com.mouse.controller.subcontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mouse.controller.Controller;

public class MouseInsertController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("insert Controller 입니다");

	}

}
