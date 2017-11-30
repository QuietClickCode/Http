package cn.itcast.dbutils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import cn.itcast.jdbcutil.JDBCUtilsConfig;

public class QueryRunnerDemo{
	private static Connection con=JDBCUtilsConfig.getConnection();
	public static void main(String[] args)throws SQLException{
		//insert();
		//update();
		delete();
	}
	public static void insert()throws SQLException{
		QueryRunner qr=new QueryRunner();
		String sql="insert into sort(sname,sprice,sdesc)values(?,?,?)";
		Object[] params={"篮球",1000.0,"斯伯丁"};
		int row=qr.update(con,sql,params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}
	public static void update()throws SQLException{
		QueryRunner qr=new QueryRunner();
		String sql="update sort set sname=?,sprice=?,sdesc=? where sid=?";
		Object[] params={"盆栽",30,"仙人掌",17};
		int row =qr.update(con,sql,params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}
	public static void delete()throws SQLException{
		QueryRunner qr=new QueryRunner();
		String sql="delete from sort where sid=?";
		int row=qr.update(con,sql,18);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}
}