<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<%
		request.setCharacterEncoding("euc-kr");
	%>
<meta charset="EUC-KR">
<title>�α���</title>
	<link href='join_style.css' rel='stylesheet' style='text/css'/>
	
	<script type="text/javascript">
	
		function checkValue()
		{
			inputFrom = eval("document.loginInfo");
			if(!inputForm.id.value)
			{
				alert("���̵� �Է�");
				inputForm.id.focus();
				return false;
			}
			if(!inputForm.password.value)
			{
				alert("��й�ȣ �Է�");
				inputForm.password.focus();
				return false;
			}
		}
		//ȸ������ ��ư ������ JoinForm���� �̵�
		function goJoinForm() {
			location.href="JoinForm.jsp";
		}
	</script>
	
</head>
<body>
	<div id="wrap">
		<form name="loginInfo" method="post" action="LoginPro.jsp" onsubmit="return checkValue()">
		<table>
			<tr>
				<td bgcolor="skyblue">���̵�</td>
				<td><input type="text" name="id" maxlength="50"></td>
			</tr>
			<tr>
				<td bgcolor="yellow">��й�ȣ</td>
				<td><input type="password" name="password" maxlength="50"></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="�α���"/>
		<input type="button" value="ȸ������" onclick="goJoinForm()" />
		</form>
		
		<%
			String msg=request.getParameter("msg");
			if(msg!=null && msg.equals("0"))
			{
				out.println("<br>");
				out.println("<font color='red' size='5'>��й�ȣ�� Ȯ���� �ּ���.</font>");
			} else if(msg!=null && msg.equals("-1"))
			{
				out.println("<br>");
				out.println("<font color='red' size='5'>���̵� Ȯ���� �ּ���.</font>");
			}
		%>
	</div>
</body>
</html>