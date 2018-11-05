package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;


public class ItemListDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();


	public ArrayList<ItemListDTO> select(){

		String sql = "SELECT * FROM item_info_transaction";

		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				ItemListDTO dto = new ItemListDTO();

				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getInt("item_price"));
				dto.setItemStock(rs.getInt("item_stock"));

				itemList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return itemList;
	}


}
