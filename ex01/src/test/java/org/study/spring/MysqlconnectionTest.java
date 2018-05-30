package org.study.spring;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MysqlconnectionTest {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://192.168.0.211:3066/book_ex?useSSL=no&characterEncoding=utf8";
	private static final String USER = "hyeri";
	private static final String PASS = "bha11530";
	
	@Test
	public void testConnection() throws Exception {
//		향상된 try catch
		Class.forName(DRIVER);
//		자동으로 close를 해준다.
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
			System.out.println(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
