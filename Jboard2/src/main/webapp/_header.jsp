<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시글</title>
    <link rel="stylesheet" href="./css/style.css"/>    
</head>
<body>
    <div id="wrapper">
        <header>
            <h3>Board System v2.0</h3>
            <p>
                <span><a href="/Jboard2/user/myInfo.do">${sessUser.nick}</a></span>님 반갑습니다.
                <a href="/Jboard2/user/logout.do">[로그아웃]</a>
            </p>
        </header>