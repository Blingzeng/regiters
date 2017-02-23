package until;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyUntil {

	/**
	 * 这个方法返回一个statement，方便dao层对数据库的使用
	 * @return
	 */
	public static Statement getStatement(){
		try {
			DriverManager.registerDriver(new Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","admin");
	        Statement statement = con.createStatement();
	        return statement;
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return null;
	}
	
	/**
	 * 这个方法提供关闭连接，避免没有必要的浪费
	 * @param con
	 * @param sta
	 */
	public static void closeConAndStm(Connection con,Statement sta){
		if(sta!=null){
			try {
				sta.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
