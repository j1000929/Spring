package org.study.spring;

import java.sql.DriverManager;

import org.junit.*;
import java.sql.Connection;

public class MysqlConnectionTest {
	
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://192.168.0.212:3306/book_ex?useSSL=no&characterEncoding=utf8";
	private static final String USER = "book_tester";
	private static final String PW = "Password1!";
	@Test
	public void testConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection conn = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//testConnection
}
