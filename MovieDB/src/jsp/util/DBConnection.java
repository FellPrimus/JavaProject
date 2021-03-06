package jsp.util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

// 커넥션을 얻어오는 클래스 - JNDI
public class DBConnection 
{
	public static Connection getConnection() throws SQLException, NamingException, 
	ClassNotFoundException{
			Context initCtx = new InitialContext();
			
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			
			DataSource ds = (DataSource) envCtx.lookup("jdbc/orcl");
			
			Connection conn = ds.getConnection();
			return conn;
	}
}	
	
