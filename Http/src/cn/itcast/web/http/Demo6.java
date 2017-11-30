package cn.itcast.web.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo6 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setHeader("expires","-1");
		response.setHeader("cache-control","no-cache");
		response.setHeader("pragma","no-cache");
		response.getWriter().write("haha");
	}
}
