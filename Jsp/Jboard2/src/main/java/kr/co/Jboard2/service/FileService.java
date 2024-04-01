package kr.co.Jboard2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.Jboard2.dao.FileDAO;
import kr.co.Jboard2.db.DBHelper;
import kr.co.Jboard2.dto.FileDTO;

public enum FileService{
	
	INSTANCE;
	
	private FileDAO dao = new FileDAO();
	
	public void insertFile(FileDTO dto) {
		dao.insertFile(dto);
	}
	
	public FileDTO selectFile(String fno) {
		return dao.selectFile(fno);
	}
	
	public List<FileDTO> selectFiles() {
		return dao.selectFiles();
	}
	
	public void updateFile(FileDTO dto) {
		dao.updateFile(dto);
	}
	
	public int deleteFile(String ano) {
		return dao.deleteFile(ano);
	}
	
}
