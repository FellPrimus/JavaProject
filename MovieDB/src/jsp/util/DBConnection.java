package jsp.util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

// Ŀ�ؼ��� ������ Ŭ���� - JNDI
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
	