package dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import db.DBHelper;
import db.SQL;
import dto.User3DTO;

public class User3DAO extends DBHelper{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public void insertUser3(User3DTO dto) {
		logger.info("User3DAO insertUser3...1");
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER3);
			psmt.setString(1, dto.getUid());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setInt(4, dto.getAge());
			psmt.executeUpdate();
			
			close();
			
			logger.info("User3DAO insertUser3...2");
		} catch (Exception e) {
			logger.error("User3DAO insertUser3 error : " + e.getMessage());
		}
	}
	
	public User3DTO selectUser3(String uid) {
		logger.info("User3DAO selectUser3...1");
		User3DTO dto = new User3DTO();
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER3);
			psmt.setString(1, uid);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto.setUid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setHp(rs.getString(3));
				dto.setAge(rs.getInt(4));
			}
			
			close();
			logger.info("User3DAO selectUser3...2");
		} catch (Exception e) {
			logger.error("User3DAO selectUser3 error : " + e.getMessage());
		}
		return dto;
		
	}
	
	public List<User3DTO> selectUser3s() {
		logger.info("User3DAO selectUser3s...1");
		List<User3DTO> user3s = new ArrayList<>();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_USER3S);
			
			while(rs.next()) {
				User3DTO dto = new User3DTO();
				dto.setUid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setHp(rs.getString(3));
				dto.setAge(rs.getInt(4));
				
				user3s.add(dto);
			}

			close();
			logger.info("User3DAO selectUser3s...2");
			
		} catch (Exception e) {
			logger.error("User3DAO selectUser3s error : " + e.getMessage());
		}
		return null;
	}
	
	public void updateUser3(User3DTO dto) {
		logger.info("User3DAO updateUser3...1");
		conn = getConnection();
		psmt = conn.prepareStatement(SQL.UPDATE_USER3);
		psmt.executeUpdate();
		
		try {
			
		} catch (Exception e) {
			logger.error("User3DAO updateUser3 error : " + e.getMessage());
		}
	}
	
	public void deleteUser3(String uid) {
		logger.info("User3DAO deleteUser3...1");
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER3);
			
		} catch (Exception e) {
			logger.error("User3DAO deleteUser3 error : " + e.getMessage());
		}
	}
}
