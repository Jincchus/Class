package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// jdbc 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 데이터베이스 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "INSERT INTO `user2` VALUE ('A105','박삼순',NULL,5)";
			stmt.executeUpdate(sql);
			
			// 실행 종료
			conn.close();
			stmt.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("INSERT 성공...");
	}
}
