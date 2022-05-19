<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name2 = request.getParameter("name2");
	%>
	
	Hello, <%= name2 %><br/>
	Hello, ${param.name }<br/>
</body>
</html>