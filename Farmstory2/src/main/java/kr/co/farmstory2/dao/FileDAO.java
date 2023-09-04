package kr.co.farmstory2.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.farmstory2.db.DBHelper;
import kr.co.farmstory2.dto.FileDTO;

public class FileDAO extends DBHelper {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public void insertUser(FileDTO dto) {}
	public FileDTO selectUser(int fno) {
		return null;
	}
	public List<FileDTO> selectUsers() {
		return null;
	}
	public void updateUser(FileDTO dto) {}
	public void deleteUser(int fno) {}
	

}
