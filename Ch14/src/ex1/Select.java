package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// JDBC 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 생성 객체
			Statement stmt = conn.createStatement();
			
			// SQL 생성
			String sql = "SELECT * FROM `user2`";
			ResultSet rs = 	stmt.executeQuery(sql);
			
			// 결과 출력
			while(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.printf("%s,%s,%s,%d\n", uid, name, hp, age);
			}
			
			// 종료
			rs.close();
			conn.close();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Select 성공 ...");
	}
}
