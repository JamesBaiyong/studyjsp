<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=IUTF-8">
<title>新增会员失败</title>
</head>
<body>
	<h1>新增会员失败</h1>
	<ul style="color: rgb(255, 0, 0);">
		<%
			List<String> errors = (List<String>) request.getAttribute("errors");
			for  (String error : errors) {
		%>
		<%
			<li><%= error %></li>
		<%
		}
		%>
	</ul>
	<a href='register.html'>返回注册页面</a>
</body>
</html>