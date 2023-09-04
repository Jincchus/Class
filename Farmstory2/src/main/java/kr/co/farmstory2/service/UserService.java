package kr.co.farmstory2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.farmstory2.dao.UserDAO;
import kr.co.farmstory2.dto.UserDTO;

public class UserService {
	private static UserService instance = new UserService();
	public static UserService getInstanced() {
		return instance;
	}
	private UserService(){}

	private UserDAO dao = UserDAO.getInstance();
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public void insertUser(UserDTO dto) {
		dao.insertUser(dto);
	}
	public int selectCountUid(String uid) {
		return dao.selectCountUid(uid);
	}
	public int selectCountNick(String nick) {
		return dao.selectCountNick(nick);
	}
	public int selectCountHp(String hp) {
		return dao.selectCountHp(hp);
	}
	public UserDTO selectUser(String uid, String pass) {
		return dao.selectUser(uid,pass);
	}
	public List<UserDTO> selectUsers() {
		return null;
	}
	public void updateUser(UserDTO dto) {}
	public void deleteUser(String uid) {}
	
}
