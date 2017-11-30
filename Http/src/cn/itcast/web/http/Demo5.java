package cn.itcast.web.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo5 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException{
		response.setHeader("refresh","3;url=/Http/index.html");
	}
}