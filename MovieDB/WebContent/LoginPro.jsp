<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jsp.member.model.MemberDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α��� ó��</title>
</head>
<body>
	<%
	request.setCharacterEncoding("euc-kr");
	//MemberDAO���� id password ��������
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	
	MemberDAO dao = MemberDAO.getInstance();
	int check = dao.loginCheck(id, pw);
	
	String msg = "";
	
	if(check == 1)//�α��� ���� ��
	{
		session.setAttribute("sessionID", id);//���ǿ� ���̵� ����
		msg = "MainForm.jsp";//���� �������� �̵�
	} else if(check == 0)//��� Ʋ�� ���
	{
		msg = "LoginForm.jsp?msg=0";
	} else { //���̵� Ʋ�� ���
		msg = "LoginForm.jsp?msg=-1";
	}
	
	response.sendRedirect(msg);
	%>
</body>
</html>