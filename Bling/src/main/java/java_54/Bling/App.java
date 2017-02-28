package java_54.Bling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;





/**
 * Hello world!
 *
 */
public class App 
{
    public static String consql() throws SQLException
    {
    	String name = "chenggong";
        DriverManager.registerDriver(new Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://104.194.91.53:3306/register","root","BlingZeng");
        Statement statement = con.createStatement();
        
        //前期的简单连接测试
//        ResultSet rset =  statement.executeQuery("select * from register_beijing");
//        rset.next();
//        name = rset.getString("student_name");
        
        
        //测试一下不关闭连接池的时候，在Main函数里写1000个循环调用会出现什么情况。
//        for (int i = 0;i<1000;i++){
//        	statement.executeUpdate("insert into register_beijing (student_name) values ("+"'name"+i+"');");
//        }
        //结果：Out of range value for column 'id' at row 1
        //分析：id是tinyint,最大的数是255，将id改为int——实验
        
//      for (int i = 0;i<1000;i++){
//    	statement.executeUpdate("insert into register_beijing (student_name) values ("+"'name"+i+"');");
//    }
        //实验结果：成功了，但是耗时220.415sec
        
        //再次实验：将这一千条数据放在语句中
//        String data = "";
//        for(int i=0;i<1000;i++){
//        	data+="name"+i+",";
//        }
//        data=data.substring(0, data.length()-1);
//        statement.executeUpdate("insert into register_beijing (student_name) values ('"+data+"');");
//        return name;
        //结果：Data too long for column 'student_name' at row 1
        
        return name;
        
    }
}
