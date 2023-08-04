package kr.co.jboard1.dao;

import kr.co.jboard1.db.DBHelper;
import kr.co.jboard1.db.SQL;
import kr.co.jboard1.vo.TermsVO;
import kr.co.jboard1.vo.UserVO;

public class UserDAO extends DBHelper {
	
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO(){}
	
	public void insertUser (UserVO  vo) {
		
		try{
			conn = getConnection();

			psmt = conn.prepareStatement(SQL.INSERT_USER);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getPass());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getNick());
			psmt.setString(5, vo.getEmail());
			psmt.setString(6, vo.getHp());
			psmt.setString(7, vo.getZip());
			psmt.setString(8, vo.getAddr1());
			psmt.setString(9, vo.getAddr2());
			psmt.setString(10,vo.getAddr2());
			psmt.executeUpdate();
			
			close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public UserVO selectUser (String uid, String pass) {
		
		UserVO user = null;
		
		try{
			conn = getConnection();
			
			psmt = conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, uid);
			psmt.setString(2, pass);
			
			rs = psmt.executeQuery();
			
			if(rs.next()){
				user = new UserVO();
				
				user.setUid(rs.getString(1));
				user.setPass(rs.getString(2));
				user.setName(rs.getString(3));
				user.setNick(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setHp(rs.getString(6));
				user.setRole(rs.getString(7));
				user.setZip(rs.getString(8));
				user.setAddr1(rs.getString(9));
				user.setAddr2(rs.getString(10));
				user.setRegip(rs.getString(11));
				user.setRegDate(rs.getString(12));
				user.setLeaveDate(rs.getString(13));
			}
			
			close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return user;
	}

	public int selectCountUid(String uid) {
		int result = 0;
		try{
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_COUNT_UID);
			psmt.setString(1, uid);
			rs = psmt.executeQuery();
			
			if(rs.next()){
				result = rs.getInt(1);
			}
			close();

		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public int selectCountNick(String nick) {
		int result = 0;
		try{
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_COUNT_NICK);
			psmt.setString(1, nick);
			rs = psmt.executeQuery();
			
			if(rs.next()){
				result = rs.getInt(1);
			}

			close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public int selectCountEmail(String email) {

		int result = 0;
		try{
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_COUNT_EMAIL);
			psmt.setString(1, email);
			rs = psmt.executeQuery();
			
			if(rs.next()){
				result = rs.getInt(1);
			}
			
			close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public int selectCountHp(String hp) {

		int result = 0;
		try{
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_COUNT_HP);
			psmt.setString(1, hp);
			rs = psmt.executeQuery();
			
			if(rs.next()){
				result = rs.getInt(1);
			}

			close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public TermsVO selectTerms() {
		TermsVO vo = new TermsVO();
		try{
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_TERMS);
			
			if(rs.next()){
				vo.setTerms(rs.getString(1));
				vo.setPrivacy(rs.getString(2));
			}
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}

		return vo;
	}
	
	
	public void selectUsers() {}
	public void updateUser () {}
	public void deleteUser () {}

}
