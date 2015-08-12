<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Hello Page</h2>
显示中文

<br><br>

<% request.setCharacterEncoding("UTF-8");%>
<%= request.getParameter("username") %>

<br><br>


<%
	String val = request.getParameter("username");
	String username = new String(val.getBytes("UTF-8"),"UTF-8");
	out.println(username);

%>

</body>
</html>