package cn.itcast.web.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo2 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String data="ssssssssssssssssssssssssssssssssssss";
		System.out.println("压缩前:"+data.length());
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		GZIPOutputStream gout=new GZIPOutputStream(bout);
		gout.write(data.getBytes());
		gout.flush();
		gout.close();
		byte[] bytes=bout.toByteArray();
		System.out.println("压缩后:"+bytes.length);
		response.setHeader("content-encoding","gzip");
		response.setHeader("content-length",""+bytes.length);
		response.getOutputStream().write(bytes);


	}
}


