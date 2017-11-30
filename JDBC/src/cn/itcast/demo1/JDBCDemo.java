package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDemo{
	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mybase";
		String username="root";
		String password="123";
		Connection con=DriverManager.getConnection(url,username,password);
		String sql="update sort set sname=?,sprice=?,sdesc=? where sid=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setObject(1,"荣耀手机");
		pst.setObject(2,3999.88);
		pst.setObject(3,"性价比高");
		pst.setObject(4,16);
		int row=pst.executeUpdate();
		System.out.println(row);
		pst.close();
		con.close();
		
		
	}
}