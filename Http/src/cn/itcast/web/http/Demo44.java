package cn.itcast.web.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo44 extends HttpServlet implements SingleThreadModel{
	private int counter=0;
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		this.counter++;
		System.out.println("counter:"+this.counter);
	}
	
}