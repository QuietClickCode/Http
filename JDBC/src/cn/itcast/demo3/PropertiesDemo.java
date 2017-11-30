package cn.itcast.demo3;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesDemo{
	public static void main(String[] args)throws Exception{
		InputStream in=PropertiesDemo.class.getClassLoader().getResourceAsStream("database.properties");
		Properties prop=new Properties();
		prop.load(in);
		String driverClass=prop.getProperty("driverClass");
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println(con);
	}
}