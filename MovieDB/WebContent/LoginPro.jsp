<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jsp.member.model.MemberDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인 처리</title>
</head>
<body>
	<%
	request.setCharacterEncoding("euc-kr");
	//MemberDAO에서 id password 가져오기
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	
	MemberDAO dao = MemberDAO.getInstance();
	int check = dao.loginCheck(id, pw);
	
	String msg = "";
	
	if(check == 1)//로그인 성공 시
	{
		session.setAttribute("sessionID", id);//세션에 아이디 세팅
		msg = "MainForm.jsp";//메인 페이지로 이동
	} else if(check == 0)//비번 틀릴 경우
	{
		msg = "LoginForm.jsp?msg=0";
	} else { //아이디 틀릴 경우
		msg = "LoginForm.jsp?msg=-1";
	}
	
	response.sendRedirect(msg);
	%>
</body>
</html>