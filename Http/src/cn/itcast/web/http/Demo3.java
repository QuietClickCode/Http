package cn.itcast.web.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo3 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setHeader("content-type","image/jpeg");
		InputStream is=new FileInputStream("d:\\t.jpg");
		OutputStream os=response.getOutputStream();
		int len=0;
		byte[] bytes=new byte[1024];
		while((len=is.read(bytes))!=-1){
			os.write(bytes,0,len);
		}
		os.close();
		is.close();
	}
}
