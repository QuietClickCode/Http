package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo{
	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mybase";
		String username="root";
		String password="123";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stat=con.createStatement();
		String sql="insert into sort(sname,sprice,sdesc)values('小米手机',1099.99,'红米note3')";
		int row=stat.executeUpdate(sql);
		System.out.println(row);
		stat.close();
		con.close();
	}
}