package kr.co.farmstory2.controller.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonObject;

import kr.co.farmstory2.service.UserService;
/*

@WebServlet("/user/authEmail.do")
public class AuthEmailController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private UserService service = UserService.getInstanced();
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String type = req.getParameter("type");
		String uid = req.getParameter("uid");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		int result = 0;
		int status = 0;
		
		if(type.equals("REGISTER")) {
			// 회원가입 이메일 인증
			result = service.selectCountEmail(email);
			status = service.sendCodeByEmail(email);
		}else if(type.equals("FIND_ID")){
			// 아이디 찾기 이메일 인증
			result = service.selectCountNameAndEmail(name, email);
			
			if(result == 1) {
				status = service.sendCodeByEmail(email);
			}
		}else if(type.equals("FIND_PASS")) {
			// 비밀번호 찾기 이메일 인증
			result = service.selectCountUidAndEmail(uid, email);
			
			if(result == 1) {
				status = service.sendCodeByEmail(email);
			}
		}else if(type.equals("MODIFY")) {
			// 유저 정보 이메일 수정시 중복 체크
			result = service.selectCountEmail(email);
			// 유저 정보 이메일 수정시 이메일 인증
			if(result == 0) {
				status = service.sendCodeByEmail(email);
			}
		}
		
		JsonObject json = new JsonObject();
		json.addProperty("result", result);
		json.addProperty("status", status);

		PrintWriter writer = resp.getWriter();
		writer.print(json.toString());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code = req.getParameter("code");
		logger.info("code : " + code);
		
		int result = service.confirmCodeByEmail(code);		
		
		JsonObject json = new JsonObject();
		json.addProperty("result", result);

		PrintWriter writer = resp.getWriter();
		writer.print(json.toString());
		
	}
}*/
