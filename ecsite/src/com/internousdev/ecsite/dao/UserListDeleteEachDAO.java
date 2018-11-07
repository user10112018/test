package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;


public class UserListDeleteEachDAO {



	public void DeleteEach(String id, String userName) throws SQLException {

	 DBConnector db = new DBConnector();
	 Connection con = db.getConnection();

	 String sql = "DELETE FROM login_user_transaction WHERE login_id = ? AND user_name = ?";

	 PreparedStatement ps;
//	 int result = 0;

	 try {

		ps = con.prepareStatement(sql);
//		ps.setInt(1, id);
		ps.setString(1, id);
		ps.setString(2, userName);

//		result = ps.executeUpdate();
		ps.executeUpdate();

	    } catch (SQLException e) {
		    e.printStackTrace();
	    } finally {
	    	con.close();
	    }
//	    return result;
  }
}
