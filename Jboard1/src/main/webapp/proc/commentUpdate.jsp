<%@page import="kr.co.jboard1.dto.ArticleDTO"%>
<%@page import="kr.co.jboard1.dao.ArticleDAO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String no = request.getParameter("no");
	String parent = request.getParameter("parent");
	String content = request.getParameter("content");
	
	ArticleDTO dto = new ArticleDTO();
	dto.setNo(no);
	dto.setParent(parent);
	dto.setContent(content);
	
	ArticleDAO dao = new ArticleDAO();
	dao.updateComment(dto);
	
	response.sendRedirect("/Jboard/view.jsp?no=?"+parent);
%>