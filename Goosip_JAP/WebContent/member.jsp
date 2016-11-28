<%@ page import="java.util.*,java.text.*"%>
<%
	String username = (String) request.getSession().getAttribute("login");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gossip 微博</title>
<link rel='stylesheet' href='css/member.css' type='text/css'>
</head>
<body>
	<div class='leftPanel'>
		<img src='images/chaterpillar.jpg' alt='Gossip微博' /> <br></br> <a
			href='logout.do?username=<%username%>'>注销<%=username %>
		</a>

	</div>
	<from method='post' action='message.do'> 分享新鲜事。。<br>
	<%
	String blabla = request.getParameter("blabla");
	if (blabla == null) {
		blabla = "";
	}else{
%> 信息要在140字以内<br>
	<%
	}
%> <textarea cols='60' rows='4' name='blabla'>
		<%= blabla %></textarea>
	<br>
	<button type='submit'>送出</button>
	</from>
	<table style='text-align: left; width: 510px; height: 88px;' broder='0'
		cellpading='2' cellspacing='2'>
		<thead>
			<tr>
				<th><hr></th>
			</tr>
		</thead>
		<tbody>
			<%
	UserSerivce userService=
		(UserService) getServletContext().getAttribute("userService");
Map<Date,String> messages = userService.readMessage(username);
DateFormat dateFormat = DateFormat.getDateTimeInstance( 
DateFormat.FULL, Locale.TAIWAN);
for (Date date : messages.keySet()){
%>
			<tr>
				<td style='vertical-align: top;'><%=username %><br> <%=messages.get(date) %><br>
					<%=dateFormat.format(date) %> <a
					href='delte.dp?message=<%=date.getTime() %>'>删除</a>
					<hr>
					</td>
			</tr>
<%
}
%>
		</tbody>
	</table>
	<hr style ='width:100%; height:1px;'>
</body>
</html>