<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ӽ� ���� ������</title>
<script type="text/javascript">
	//�α׾ƿ� jsp�� �̵�
	function logoutPro() {
		location.href="LogoutPro.jsp";
	}
</script>
</head>
<body>
	����ȭ�� �ӽ� ������
	<%
		if(session.getAttribute("sessionID") == null)//���� ���� ������ ��(�α��� ������ ��)
		{
			//LoginForm���� �����̷�Ʈ
			response.sendRedirect("LoginForm.jsp");
		} else {
	%>		
	
	<h2>
		<font color="blue"><%=session.getAttribute("sessionID") %></font> ȸ����! �������.
	</h2>
	
	<br><br>
	<input type="button" value="�α׾ƿ�" onclick="logoutPro()"/>
	<%} %>
	
</body>
</html>