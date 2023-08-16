<%@page import="kr.Farmstory1.dto.UserDTO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	UserDTO sessUser = (UserDTO) session.getAttribute("sessUser");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>팜스토리::메인</title>
<link rel="stylesheet" href="/Farmstory1/css/style.css">
<link rel="stylesheet" href="/Farmstory1/user/css/style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>

</head>
<body>
	<div id="container">
		<header>
			<a href="/Farmstory1" class="logo"><img src="/Farmstory1/images/logo.png" alt="로고"></a>
			<p>
				<a href="/Farmstory1/index.jsp">HOME |</a>
				
				<% if(sessUser == null){ %>
				<a href="/Farmstory1/user/login.jsp">로그인 |</a>
				<a href="/Farmstory1/user/terms.jsp">회원가입 |</a>
				<%}else{ %>
				<a href="/Farmstory1/user/logout.jsp">로그아웃 |</a>
					<%if(!sessUser.getRole().equals("USER")) { %>
					<a href="/Farmstory1/admin/">관리자 |</a>
					<% } %>
				<% } %> 
				<a href="#">고객센터</a>
			</p>
			<img src="/Farmstory1/images/head_txt_img.png" alt="3만원이상 무료배송/팜카드 10%적립">

			<ul class="gnb">
				<li><a href="/Farmstory1/introduction/hello.jsp">팜스토리소개</a></li>
				<li><a href="/Farmstory1/market/list.jsp">장보기<img src="/Farmstory1/images/head_menu_badge.png"
						class="badge" alt="30%"></a></li>
				<li><a href="/Farmstory1/croptalk/story.jsp">농작물이야기</a></li>
				<li><a href="/Farmstory1/event/event.jsp">이벤트</a></li>
				<li><a href="/Farmstory1/community/notice.jsp">커뮤니티</a></li>
			</ul>
		</header>