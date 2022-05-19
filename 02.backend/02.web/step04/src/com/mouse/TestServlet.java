package com.mouse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static final String DB_URL = "jdbc:mysql://localhost:3307/";
	static final String DATABASE_NAME = "testdb";
	static final String USER = "root";
	static final String PASSWORD = "1234";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		Connection conn;
		try {
			conn = DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
			System.out.println("conn" + conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
