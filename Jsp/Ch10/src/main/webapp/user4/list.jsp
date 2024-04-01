<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user4::list</title>
	</head>
	<body>
		<h3>User4 목록</h3>
		<a href="/Ch10/">처음으로</a>
		<a href="/Ch10/user4/register.do">User4 등록</a>
		
		<table border="1">
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>성별</th>
				<th>나이</th>
				<th>주소</th>
				<th>관리</th>
			</tr>
			<c:forEach var="user4" items="${requestScope.user4s}">
			<tr>
				<td>${user4.getSeq()}</td>
				<td>${user4.getName()}</td>
				<td>${user4.getGender()}</td>
				<td>${user4.getAge()}</td>
				<td>${user4.getAddr()}</td>
				<td>
					<a href="/Ch10/user4/modify.do?seq=${user4.getSeq() }">수정</a>
					<a href="/Ch10/user4/delete.do?seq=${user4.getSeq() }">삭제</a>
				</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>