package kr.co.farmstory2.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kr.co.farmstory2.dao.ArticleDAO;
import kr.co.farmstory2.dto.ArticleDTO;
import kr.co.farmstory2.dto.FileDTO;

public enum ArticleService {
	
	INSTANCE;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private ArticleDAO dao = new ArticleDAO();
	
	public int insertArticle(ArticleDTO dto) {
		return dao.insertArticle(dto);
	}
	public ArticleDTO selectArticle(String no) {
		return dao.selectArticle(no);
	}
	public List<ArticleDTO> selectArticles(String cate ,int start) {
		
		return dao.selectArticles(cate, start);
	}
	
	public void updateArticle(ArticleDTO dto) {
		dao.updateArticle(dto);
	}
	public void deleteArticle(String no) {
		dao.deleteArticle(no);
	}
	
	/* 댓글 */
	public int insertComment(ArticleDTO dto) {
		return dao.insertComment(dto);
	}
	public List<ArticleDTO> selectComments(String parent) {
		return dao.selectComments(parent);
	}
	public int deleteComment(String no) {
		return dao.deleteComment(no);
	}
	
	/* 파일 */
	// 파일 업로드 경로
	public String getFilePath(HttpServletRequest req) {
		ServletContext ctx = req.getServletContext();
		String path = ctx.getRealPath("/upload");
		
		return path;
	}
	// 파일명 수정
	public String renameToFile(HttpServletRequest req, String oriName) {
		String path = getFilePath(req);
		
		int i = oriName.lastIndexOf(".");
		String ext = oriName.substring(i);
		
		String uuid = UUID.randomUUID().toString();
		String newName = uuid + ext;
		
		File f1 = new File(path+"/"+oriName);
		File f2 = new File(path+"/"+newName);
		
		// 파일명 수정
		f1.renameTo(f2);
		
		return newName;
	}
	// 파일 업로드
	public MultipartRequest uploadFile(HttpServletRequest req) {
		// 파일 경로 구하기
		String path = getFilePath(req);
		
		// 최대 업로드 파일 크기
		int maxSize = 1024 * 1024 * 10 ;
		
		// 파일 업로드 및 Multipart 객체 생성
		MultipartRequest mr = null;
		
		try {
			mr = new MultipartRequest(req, path, maxSize, "UTF-8", new DefaultFileRenamePolicy());
		} catch (Exception e) {
			logger.error("uploadFile() error : " + e.getMessage());
		}
		return mr;
	}
	// 파일 다운로드
	public void downloadFile(HttpServletRequest req, HttpServletResponse resp, FileDTO dto) throws IOException {
		// response 파일 다운로드 헤더 수정
		resp.setContentType("application/octet-stream");
		resp.setHeader("Content-Disposition", "attachment; filename="+URLEncoder.encode(dto.getOriName(), "utf-8"));
		resp.setHeader("Content-Transfer-Encoding", "binary");
		resp.setHeader("Pragma", "no-cache");
		resp.setHeader("Cache-Control", "private");
		
		// response 파일 스트림 작업
		String path = getFilePath(req);
		logger.debug("path" + path);
		File file = new File(path+"/"+dto.getNewName());
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());		
		
		while(true){
			int data = bis.read();
			if(data == -1){
				break;
			}
			bos.write(data);
		}
		
		bos.close();
		bis.close();
	}
	
	/* 페이징 */
	// 전체 게시물 갯수 조회
	public int selectCountTotal(String cate) {
		return dao.selectCountTotal(cate);
	}
	// 현재 페이지 번호
	public int getCurrentPage(String pg) {
		int currentPage = 1;
		if(pg != null) {
			currentPage = Integer.parseInt(pg);
		}
		logger.debug("currentPage : "+currentPage);
		return currentPage;
	}
	// 마지막 페이지 번호
	public int getLastPageNum(int total) {
		int lastPageNum = 0;
		
		if(total % 10 == 0) {
			lastPageNum = total / 10;
		}else {
			lastPageNum = total / 10 + 1;
		}
		
		logger.debug("lastPageNum : " + lastPageNum);
		return lastPageNum;
	}
	// 페이지 그룹 번호
	public int[] getPageGroupNum(int currentPage, int lastPageNum) {
		int currentPageGroup = (int)Math.ceil(currentPage / 10.0);
		int pageGroupStart = (currentPageGroup - 1) * 10 +1;
		int pageGroupEnd = currentPageGroup * 10;
		
		logger.debug("currentPageGroup : " + currentPageGroup);
		logger.debug("pageGroupStart : " + pageGroupStart);
		logger.debug("pageGroupEnd : " + pageGroupEnd);
		
		if(pageGroupEnd > lastPageNum) {
			pageGroupEnd = lastPageNum;
			logger.debug("pageGroupEnd : " + pageGroupEnd);
		}
		
		int[] result = {pageGroupStart, pageGroupEnd};
		
		return result;
	}
	// 페이지 시작번호
	public int getPageStartNum(int total, int currentPage) {
		int start = (currentPage - 1) * 10;
		logger.debug("start : " + start);
		return total - start;
	}
	
	// Limit 시작번호
	public int getStartNum(int currentPage) {
		return (currentPage - 1) * 10;
	}
			
}
