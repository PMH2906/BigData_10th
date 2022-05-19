package com.mouse.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3307/";
	private static final String DATABASE_NAME = "testdb";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	
	public static Connection getConnection() throws SQLException {
		try {
			// Driver 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
		System.out.println("conn" + conn);
		System.out.println("DB 연결 성공");
		return conn;
	}
}
