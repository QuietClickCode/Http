package cn.itcast.datasource;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

public class QueryRunnerDemo{
	public static void main(String[] args){
		//insert();
		select();
	}
	private static QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
	public static void insert(){
		String sql="insert into sort(sname,sprice,sdesc)values(?,?,?)";
		Object[] params={"桃子",19.8,"水蜜桃"};
		try{
			int row=qr.update(sql,params);
			System.out.println(row);
		}catch(SQLException ex){
			throw new RuntimeException("数据添加失败:"+ex);
		}
	}
	public static void select(){
		String sql="select * from sort";
		try{
			List<Object[]> list=qr.query(sql,new ArrayListHandler());
			for(Object[] objs:list){
				for(Object obj:objs){
					System.out.print(obj+"\t");
				}
				System.out.println();
			}
		}catch(SQLException ex){
			throw new RuntimeException("数据查询失败:"+ex);
		}
	}
	
}