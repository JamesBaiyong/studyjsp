package cc.openhome.controller;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cc.openhome.model.Blah;
import cc.openhome.model.UserService;

@WebServlet(urlPatterns = {
		"/message.do"},
initParams = {
		@WebInitParam(
				name = "MEMBER_VIEW",value = "member.jsp"
				)
}
)
public class Message extends HttpServlet {
	private String MEMBER_VIEW;
	@Override
	public void init() throws ServletException{
		MEMBER_VIEW=
				getServletConfig().getInitParameter("MEMBER_VIEW");
	}
protected void processRequest(HttpServletRequest request,
					HttpServletResponse response)
					throws ServletException  IOException {
	String username =
			(String) request.getSession().getAttribute("logo");
	UserService userService = (UserService) getServletContext().getAttribute("userService");
	Blah blah = new Blah();
	blah.setUsername(username);
	
	String  blabla = request.getParameter("blabla");
	if (blabla != null && blabla.length() !=0) {
		if (blabla.length() <140) {
			blah.setDate(new Date());
			blah.setTxt(blabla);
			userService.addBlah(blah);
		}
		else{
			request.setAttribute("blabla", blabla);
		}
	}
	List<Blah> blans = userService.getBlahs(blah);
	request.setAttribute("blabla", blabla);
	request.getRequestDispatcher(MEMBER_VIEW).forward(request, response);

}
protected void doGet(HttpServletRequest request,
					HttpServletResponse response)
					throws ServletException  IOException{
	processRequest(request,response);
}
protected void doPost(HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException  IOException{
	processRequest(request,response);
}
}

	



