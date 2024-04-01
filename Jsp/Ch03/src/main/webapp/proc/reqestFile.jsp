<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>reqestFile</title>
	</head>
	<body>
		<h3>reqestFile</h3>
		<%
			// 해당 페이지를 다운로드로 응답
			response.setHeader("Content-Type", "application/octet-stream");
		%>
		
	</body>
</html>