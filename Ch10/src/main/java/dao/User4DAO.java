package dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import db.DBHelper;
import db.SQL;
import dto.User4DTO;

public class User4DAO extends DBHelper{
	public Logger logger = LoggerFactory.getLogger(getClass());

	public void insertUser4(User4DTO dto) {
		try {
			logger.info("User4DAO insertUser4...1");
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER4);
			psmt.setInt(1, dto.getSeq());
			psmt.setString(2, dto.getName());
			psmt.setInt(3, dto.getGender());
			psmt.setInt(4, dto.getAge());
			psmt.setString(5, dto.getAddr());
			psmt.executeUpdate();
			
			close();
			logger.info("User4DAO insertUser4...2");
			
		} catch (Exception e) {
			logger.error("User4DAO insertUser4s error : " + e.getMessage());
		}
	}
	public User4DTO selectUser4(String seq) {

		return null;
	}
	public List<User4DTO> selectUser4s() {
		List<User4DTO> user4s = new ArrayList<>();
		try {
			logger.info("User4DAO selectUser4s...1");
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_USER4S);
			
			while (rs.next()) {
				User4DTO dto = new User4DTO();
				dto.setSeq(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setGender(rs.getInt(3));
				dto.setAge(rs.getInt(4));
				dto.setAddr(rs.getString(5));
				
				user4s.add(dto);
			}
			
			close();
			logger.info("User4DAO selectUser4s...2");
		} catch (Exception e) {
			logger.error("User4DAO selectUser4s error : " + e.getMessage());
		}
		return user4s;
	}
	public void updateUser4(User4DTO dto) {}
	public void deleteUser4(String seq) {}

}
