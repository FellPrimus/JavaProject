<%@page import="jsp.member.model.SignupDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	SignupDAO dao = SignupDAO.getInstance();
	boolean result = dao.confirmId(id);
	
	if(result) { %>
		<center>
		<br><br>
		<h4>이미 사용중인 ID 입니다.</h4>
		</center>
		<%} else { %>
		<center>
		<br><br>
		<h4>입력하신 <%=id%>는 사용하실 수 있는 ID 입니다.</h4>
		</center>
<%}%>
</body>
</html>