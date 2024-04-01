package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// JDBC 드라이버 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "UPDATE `User2` SET `hp` = '010-2016-6323' WHERE `name` = '신이수' ";
			stmt.executeUpdate(sql);
			
			// 연결 종료
			conn.close();
			stmt.close();	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 성공 ...");
	}
}
