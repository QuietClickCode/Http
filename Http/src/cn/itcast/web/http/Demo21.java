package cn.itcast.web.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo21 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw=response.getWriter();
		pw.write("<form acton='#' method='post'>");
		pw.write("用户名:<input type='text' name='username'/><br/>");
		pw.write("密码:<input type='password' name='password'/><br/>");
		pw.write("<select name='role'>");
		pw.write("<option value='普通用户' selected>普通用户</option>");
		pw.write("<option value='管理员'>管理员</option>");
		pw.write("</select><br/>");
		pw.write("<input type='submit' value='提交'/>");
		pw.write("</form>");
	}
}
