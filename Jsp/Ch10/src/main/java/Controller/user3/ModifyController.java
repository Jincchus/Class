package Controller.user3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.User3DTO;
import service.User3Service;

@WebServlet("/user3/modify.do")
public class ModifyController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	private User3Service service = new User3Service();
	
	@Override
	public void init() throws ServletException {
		logger.info("ModifyController init()...1");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("ModifyController doGet()...1");
		String uid = req.getParameter("uid");
		
		User3DTO user3 = service.selectUser3(uid);
		
		req.setAttribute("user3", user3);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/user3/modify.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("ModifyController doPost()...1");
		
		String uid = req.getParameter("uid");
		String name = req.getParameter("name");
		String hp = req.getParameter("hp");
		String age = req.getParameter("age");
		
		User3DTO dto = new User3DTO();
		dto.setUid(uid);
		dto.setName(name);
		dto.setHp(hp);
		dto.setAge(age);
		
		logger.info("ModifyController doPost()...2 : " + dto);
		service.updateUser3(dto);
		
		resp.sendRedirect("/Ch10/user3/list.do");
		
	}
	
}
