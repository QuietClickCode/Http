package cn.itcast.web.http;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo55 extends HttpServlet{
	private ServletConfig config;
	public void init(ServletConfig config)throws ServletException{
		this.config=config;
		Enumeration<String> enums=config.getInitParameterNames();
		while(enums.hasMoreElements()){
			String key=enums.nextElement();
			String value=config.getInitParameter(key);
			
		System.out.println(key+"-"+value);
		}
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String encoding=this.config.getInitParameter("encoding");
		response.setContentType("text/html;charset="+encoding);
		response.getWriter().write("ServletContext对象");
	}
}