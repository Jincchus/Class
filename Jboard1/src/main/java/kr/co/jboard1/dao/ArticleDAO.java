package kr.co.jboard1.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.co.jboard1.db.DBHelper;
import kr.co.jboard1.db.SQL;
import kr.co.jboard1.vo.ArticleVO;

public class ArticleDAO extends DBHelper{
	
	// 기본 CRUD
	public void insertAticle(ArticleVO vo) {
		try{

			// 데이터베이스 처리
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ARTICLE);
			
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getContent());
			psmt.setString(3, vo.getWriter());
			psmt.setString(4, vo.getRegip());
			
			psmt.executeUpdate();
			
			close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public ArticleVO selectAticle(int no) {
		return null;
	}
	
	public List<ArticleVO> selectAticles(int start) {
		
		List<ArticleVO> articles = new ArrayList<>();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ARTICLES_JOIN);
			psmt.setInt(1,  start);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ArticleVO article = new ArticleVO();
				
				article.setNo(rs.getInt(1));
				article.setParetn(rs.getInt(2));
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
	} // selectAticles 끝
	
	public void updateAticle(ArticleVO vo) {
		
	}
	
	public void deleteAticle(int no) {
		
	}
	
	// 게시물 갯수 조회 메서드
	public int selectCountTotal() {
		int total = 0;
		try {
			conn = getConnection();
			
			psmt = conn.prepareStatement(SQL.SELECT_COUNT_TOTAL);
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
