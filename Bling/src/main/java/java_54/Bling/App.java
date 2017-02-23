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
    	String name = "";
        DriverManager.registerDriver(new Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","admin");
        Statement statement = con.createStatement();
        
        ResultSet rset =  statement.executeQuery("select * from register_beijing");
        rset.next();
        name = rset.getString("student_name");
        	
    
        return name;
        
    }
}
