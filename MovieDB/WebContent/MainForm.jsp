<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>임시 메인 페이지</title>
<script type="text/javascript">
	//로그아웃 jsp로 이동
	function logoutPro() {
		location.href="LogoutPro.jsp";
	}
</script>
</head>
<body>
	메인화면 임시 페이지
	<%
		if(session.getAttribute("sessionID") == null)//세션 접속 못했을 때(로그인 못했을 때)
		{
			//LoginForm으로 리다이렉트
			response.sendRedirect("LoginForm.jsp");
		} else {
	%>		
	
	<h2>
		<font color="blue"><%=session.getAttribute("sessionID") %></font> 회원님! 어서오세요.
	</h2>
	
	<br><br>
	<input type="button" value="로그아웃" onclick="logoutPro()"/>
	<%} %>
	
</body>
</html>