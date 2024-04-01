<%@page import="kr.Farmstory1.dao.ArticleDAO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	String group = request.getParameter("group");
	String cate = request.getParameter("cate");
	String no = request.getParameter("no");
	String parent = request.getParameter("parent");
	
	ArticleDAO dao = new ArticleDAO();
	dao.deleteComment(no);
	
	// 댓글 카운트 minus
	dao.deleteArticleForComment(parent);
	
	response.sendRedirect("/Farmstory1/board/view.jsp?group="+group+ "&cate="+cate+"&no="+parent);
	
%>
