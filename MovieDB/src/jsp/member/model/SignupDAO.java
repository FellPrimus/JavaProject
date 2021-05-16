package jsp.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jsp.util.DBConnection;

public class SignupDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private static SignupDAO signupdao = new SignupDAO();
	
	public static SignupDAO getInstance() {
		return signupdao;
	}
	
	public boolean confirmId(String id) {
		boolean result = false;
		try {
			conn = DBConnection.getConnection();
			String sql = "select id from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {rs.close();}catch(SQLException s) {}
			try {pstmt.close();}catch(SQLException s) {}
			try {conn.close();}catch(SQLException s) {}
		}

	return result;
	}
}
