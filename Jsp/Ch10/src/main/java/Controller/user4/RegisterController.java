package Controller.user4;

import java.io.IOException;
import java.rmi.server.UID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.User4DTO;
import service.User4Service;

@WebServlet("/user4/register.do")
public class RegisterController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private User4Service service = new User4Service();
	
	@Override
	public void init() throws ServletException {
		logger.info("RegisterController init()...1");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("RegisterController doGet()...1");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/user4/register.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("RegisterController doPost()...1");
		
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String addr = req.getParameter("addr");
		
		User4DTO dto = new User4DTO();
		dto.setName(name);
		dto.setGender(gender);
		dto.setAge(age);
		dto.setAddr(addr);
		
		service.insertUser4(dto);
		resp.sendRedirect("/Ch10/user4/list.do");
		
	}
	
}
