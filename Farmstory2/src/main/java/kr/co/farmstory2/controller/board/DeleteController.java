package kr.co.farmstory2.controller.board;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.farmstory2.dto.FileDTO;
import kr.co.farmstory2.service.ArticleService;
import kr.co.farmstory2.service.FileService;

@WebServlet("/board/delete.do")
public class DeleteController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private ArticleService aService = ArticleService.INSTANCE;
	private FileService fService = FileService.INSTANCE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 데이터 수신
		String no = req.getParameter("no");
		String group = req.getParameter("group");
		String cate = req.getParameter("cate");
		FileDTO dto = new FileDTO();
		
		// 파일 삭제 (DB)
		int result = fService.deleteFile(no);
		
		// 글 + 댓글 삭제
		aService.deleteArticle(no);
		
		// 파일 삭제(Directory)
		if(result > 0) {
			String path = aService.getFilePath(req);
			File file = new File(path+"/"+dto.getNewName());
			if(file.exists()) {
				file.delete();
			}
			
			logger.debug(""+file);
		}
		
		
		// 리다이렉트		
		resp.sendRedirect("/Farmstory2/board/list.do?group=" + group + "&cate=" + cate);
	}

}
