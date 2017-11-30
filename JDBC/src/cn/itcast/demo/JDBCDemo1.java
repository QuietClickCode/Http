package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1{
	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mybase";
		String username="root";
		String password="123";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stat=con.createStatement();
		String sql="select * from sort";
		ResultSet rs=stat.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getInt("sid")+".."+rs.getString("sname")+".."+rs.getDouble("sprice")+".."+rs.getString("sdesc"));
		}
		rs.close();
		stat.close();
		con.close();
		
	}
}