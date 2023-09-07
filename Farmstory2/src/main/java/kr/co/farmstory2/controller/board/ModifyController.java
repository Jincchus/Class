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

@WebServlet("/board/modify.do")
public class ModifyController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private ArticleService aService = ArticleService.INSTANCE;
	private FileService fService = FileService.INSTANCE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String group = req.getParameter("group");
		String cate = req.getParameter("cate");
		String no = req.getParameter("no");
		
		ArticleDTO article = aService.selectArticle(no);
		
		logger.debug(article.toString());
		
		req.setAttribute("group", group);
		req.setAttribute("cate", cate);
		req.setAttribute("no", no);
		req.setAttribute("article", article);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/board/modify.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String path = aService.getFilePath(req, "/upload");
		logger.debug("path : " + path);
		MultipartRequest mr = aService.uploadFile(req, path);
		
		logger.debug("mr : " + mr);
		
		String group   = mr.getParameter("group");
		String cate	   = mr.getParameter("cate");
		String no	   = mr.getParameter("no");
		String title   = mr.getParameter("title");
		String content = mr.getParameter("content");
		String modName = mr.getOriginalFileName("file"); // 수정할 파일명
		logger.debug("file : " +modName);
		String oriName = mr.getParameter("oriName"); // 기존 업로드 되어 있는 파일명 (modify탭 input으로 파라미터 가져오기)
		logger.debug("orName : " +oriName);
		String fno  = mr.getParameter("oriFno"); // 기존 업로드 되어 있는 파일 번호 (modify탭 input으로 파라미터 가져오기)
		logger.debug("fno : " +fno);
		
		int file = 0;
		
		if(modName != null || oriName != null) {
			file = 1;	// modName, oriName 값이 null이 아닐 경우(파일이 있을경우) file값은 1
		}

		ArticleDTO dto = new ArticleDTO();
		dto.setNo(no);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setFile(file);
		
		logger.debug("dto : " +dto);
		
		aService.updateArticle(dto);
		
		// 업데이트 파일 테이블 insert
		if(modName != null) { // 새로운 파일첨부를 할 때
			logger.debug("modName not null");
			String modsName = aService.renameToFile(req, path, modName);
			logger.debug("modsName"+modsName);
			FileDTO fileDto = new FileDTO();
			fileDto.setOriName(modName);
			fileDto.setNewName(modsName);
			
			logger.debug("ff : "+fileDto.toString());
			if(oriName==null) { // 새로운 파일 첨부시 원래 파일이 없음 그러므로 File insert처리
				fileDto.setAno(no); // insert하기 위해 article 번호 지정
				fService.insertFile(fileDto);
			}else { // 새로운 파일 첨부시 원래 파일이 있어서 update처리
				fileDto.setFno(fno);
				fService.updateFile(fileDto);
			}
		}
		
		resp.sendRedirect("/Farmstory2/board/view.do?group="+group+"&cate="+cate+"&no="+no);
	}

}
