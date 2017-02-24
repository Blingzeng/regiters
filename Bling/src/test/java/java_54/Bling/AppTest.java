package java_54.Bling;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testconsql() throws SQLException{
		App app = new App();
		String namej = app.consql();
		assertEquals(namej,"李涛");
	}
}
