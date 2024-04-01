<%@page import="kr.co.jboard1.dao.UserDAO"%>
<%@page import="com.google.gson.JsonObject"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="application/json;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	String uid = request.getParameter("uid");
	String nick = request.getParameter("nick");
	String hp = request.getParameter("hp");
	String email = request.getParameter("email");

	// DB 조회
	int resultUid = UserDAO.getInstance().selectCountUid(uid);
	int resultNick = UserDAO.getInstance().selectCountNick(nick);
	int resultHp = UserDAO.getInstance().selectCountHp(hp);
	int resultEmail = UserDAO.getInstance().selectCountEmail(email);

	// Json 생성
	JsonObject json = new JsonObject();
	json.addProperty("resultUid", resultUid);
	json.addProperty("resultNick", resultNick);
	json.addProperty("resultHp", resultHp);
	json.addProperty("resultEmail", resultEmail);
	
	// Json 출력
	String jsonData = json.toString();
	out.print(jsonData);
	
%>