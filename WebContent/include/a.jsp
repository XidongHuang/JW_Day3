<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>AAA Page</h3>


	<%-- <% String str = "abcd"; %> --%> 
	<!-- 在A 页中包含 B 页面 -->
	<!-- 静态引入: 两个JSP 文件生成一个 JSP， 而且可以用 变量 -->
	<%--    <%@include file="b.jsp" %> --%>
	
	<!-- 动态引入: 并不是像 include 指令生成一个 Servlet 源文件
				 而是生成两个 Servlet 源文件，然后通过一个方法的方式
				 把目标页面包含起来的 
				 
				 -->
				 
<%-- 	<jsp:forward page="/include/b.jsp">
		<jsp:param value="abcd" name="username"/>
	</jsp:forward>
	--%>			 
	
	<jsp:include page="b.jsp">
		<jsp:param value="879798" name="username"/>
	</jsp:include>
	<%--  <% request.getRequestDispatcher("/include/b.jsp").forward(request, response); %>--%>
	
</body>
</html>