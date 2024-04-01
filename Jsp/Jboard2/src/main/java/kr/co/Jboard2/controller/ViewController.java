package kr.co.Jboard2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.Jboard2.dto.ArticleDTO;
import kr.co.Jboard2.dto.UserDTO;
import kr.co.Jboard2.service.ArticleService;

@WebServlet("/view.do")
public class ViewController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private ArticleService service = ArticleService.INSTANCE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 현재 세션 가져오기

		String no = req.getParameter("no");
		
		// 글 조회
		ArticleDTO article = service.selectArticle(no);
		
		// 댓글 조회
		List<ArticleDTO> comments = service.selectComments(no);
		logger.debug(no);
		
		// VIEW 공유 참조
		req.setAttribute("no", no);
		req.setAttribute("comments", comments);
		req.setAttribute("article", article);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view.jsp");
		dispatcher.forward(req, resp);
	}

}
