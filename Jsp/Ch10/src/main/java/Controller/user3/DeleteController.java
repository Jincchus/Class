package Controller.user3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.User3DTO;
import service.User3Service;

@WebServlet("/user3/delete.do")
public class DeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private User3Service service = new User3Service();
	
	@Override
	public void init() throws ServletException {
		logger.info("DeleteController init()...1");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("DeleteController doGet()...1");
		String uid = req.getParameter("uid");
		
		service.deleteUser3(uid);
		
		resp.sendRedirect("/Ch10/user3/list.do");

		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("DeleteController doPost()...1");
		
	}
	
}
