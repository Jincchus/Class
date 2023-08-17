package kr.Farmstory1.dao;

import java.util.ArrayList;
import java.util.List;

import kr.Farmstory1.db.DBHelper;
import kr.Farmstory1.db.SQL;
import kr.Farmstory1.dto.ArticleDTO;

public class ArticleDAO extends DBHelper {
	// 기본 CRUD
	public void insertArticle(ArticleDTO dto) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ARTICLE);
			
			psmt.setString(1, dto.getCate());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getContent());
			psmt.setString(4, dto.getWriter());
			psmt.setString(5, dto.getRegip());
			
			psmt.executeUpdate();
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void selectArticle() {
		
	}
	
	public List<ArticleDTO> selectArticles(String cate, int start) {
		List<ArticleDTO> articles = new ArrayList<>();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ARTICLES_JOIN);
			psmt.setString(1, cate);
			psmt.setInt(2, start);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ArticleDTO article = new ArticleDTO();
				
				article.setNo(rs.getInt(1));
				article.setParent(rs.getInt(2));
				article.setComment(rs.getInt(3));
				article.setCate(rs.getString(4));
				article.setTitle(rs.getString(5));
				article.setContent(rs.getString(6));
				article.setFile(rs.getInt(7));
				article.setHit(rs.getInt(8));
				article.setWriter(rs.getString(9));
				article.setRegip(rs.getString(10));
				article.setRdate(rs.getString(11));
				article.setNick(rs.getString(12));
				
				articles.add(article);
			}
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return articles;
	}
	
	public void updateArticle() {
		
	}
	
	public void deleteArticle() {
		
	}
	
	// 게시글 갯수
	public int selectCountTotal(String cate) {
		int total = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_COUNT_TOTAL);
			psmt.setString(1, cate);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt(1);
			}
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	
}
