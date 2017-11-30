package cn.itcast.web.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo13 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw=response.getWriter();
		pw.write("<ol>");
		pw.write("<li>JavaServlet</li>");
		pw.write("<li>JavaJsp</li>");
		pw.write("<li>JavaStructs</li>");
		pw.write("</ol>");
		
	}
}
