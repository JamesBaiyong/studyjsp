package cc.openhome.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Member
 */
@WebServlet("/member.view")
public class Member extends HttpServlet {
	protected void doPost (HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html PUBLIC "+"'-//W3C//DTD HTML 4.01 Transitional//EN'>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
		out.println("<title>会员</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>会员" + request.getParameter("username") + "你好</h1>");
		out.println("</body>");
		out.close();
	}
}
