package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

//	1101add
	List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword){

		String sql = "SELECT * FROM login_user_transaction WHERE login_id=? AND login_pass=?";

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){

				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));

//				1101add
//				loginDTOList.add(loginDTO);

				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return loginDTO;

	}

	public LoginDTO getLoginDTO(){
		return loginDTO;
	}

//	1101add ======================================================
//     DBを読んでユーザー情報をリストにまとめるためだけのメソッド
	public List<LoginDTO> select(){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM login_user_transaction";

		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));

				loginDTOList.add(loginDTO);
			}

	    } catch (SQLException e){
		e.printStackTrace();
	    }
	     try {
		      con.close();
	     } catch (SQLException e){
		e.printStackTrace();
	    }
	return loginDTOList;
	}
//	1101add ======================================================

}
