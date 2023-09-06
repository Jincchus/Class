package kr.co.farmstory2.controller.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oreilly.servlet.MultipartRequest;

import kr.co.farmstory2.dto.ArticleDTO;
import kr.co.farmstory2.dto.FileDTO;
import kr.co.farmstory2.service.ArticleService;
import kr.co.farmstory2.service.FileService;

@WebServlet("/board/write.do")
public class WriteController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private ArticleService aService = ArticleService.INSTANCE;
	private FileService fService = FileService.INSTANCE;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String group = req.getParameter("group");
		String cate = req.getParameter("cate");
		
		logger.debug("group : " + group);
		logger.debug("cate : " + cate);
		
		req.setAttribute("group", group);
		req.setAttribute("cate", cate);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/board/write.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String path = aService.getFilePath(req, "/upload");
		MultipartRequest mr = aService.uploadFile(req, path);
		
		logger.debug("mr : " + mr);
		
		// 폼 데이터 수신
		String group   = mr.getParameter("group");
		String cate   = mr.getParameter("cate");
		String title   = mr.getParameter("title");
		String content = mr.getParameter("content");
		String writer  = mr.getParameter("writer");
		String oriName = mr.getOriginalFileName("file");
		String regip = req.getRemoteAddr();
		
		ArticleDTO dto = new ArticleDTO();

		logger.debug(dto.toString());
		
		dto.setCate(cate);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setWriter(writer);
		dto.setFile(oriName);
		dto.setRegip(regip);

		int no = aService.insertArticle(dto);
		
		// 파일명 수정 및 파일 Insert
		if(oriName != null) {
			String newName = aService.renameToFile(req, path ,oriName);
			
			// 파일 테이블 Insert
			FileDTO fileDto = new FileDTO();
			fileDto.setAno(no);
			fileDto.setOriName(oriName);
			fileDto.setNewName(newName);
			
			
			
			fService.insertFile(fileDto);
		}
		
		resp.sendRedirect("/Farmstory2/board/list.do?group=" + group + "&cate=" + cate);
		
	}
}
