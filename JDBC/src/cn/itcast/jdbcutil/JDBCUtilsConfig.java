package cn.itcast.jdbcutil;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtilsConfig{
	private static Connection con;
	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;
	static{
		try{
			readConfig();
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,username,password);
		}catch(Exception ex){
			throw new RuntimeException("数据库连接失败:"+ex);
		}
		
	}
	public static void readConfig()throws Exception{
		InputStream in=JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
		Properties prop=new Properties();
		prop.load(in);
	    driverClass=prop.getProperty("driverClass");
		url=prop.getProperty("url");
		username=prop.getProperty("username");
		password=prop.getProperty("password");
		
	}
	public static Connection getConnection(){
		return con;
	}
}