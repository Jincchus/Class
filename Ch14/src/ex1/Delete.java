package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// JDBC 드라이버 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 생성
			String sql = "DELETE FROM `user2` where `name` = '신이수'";
			stmt.executeUpdate(sql);
			
			// 연결 해제
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DELETE 성공...");
	}
}
