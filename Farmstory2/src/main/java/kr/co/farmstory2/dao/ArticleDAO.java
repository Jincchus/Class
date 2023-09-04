package kr.co.farmstory2.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.farmstory2.db.DBHelper;
import kr.co.farmstory2.dto.ArticleDTO;

public class ArticleDAO extends DBHelper{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public void insertUser(ArticleDTO dto) {}
	public ArticleDTO selectUser(int no) {
		return null;
	}
	public List<ArticleDTO> selectUsers() {
		return null;
	}
	public void updateUser(ArticleDTO dto) {}
	public void deleteUser(int no) {}
	
}
