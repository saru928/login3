package com.diworksdev.login3.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.diworksdev.login3.dto.LoginDTO;
import com.diworksdev.login3.util.DBConnector;

public class LoginDAO {

	public LoginDTO select(String name,String password) throws SQLException{
		LoginDTO dto = new LoginDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql = "selecl * from user where user_name=? and password=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				dto.setName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return dto;
	}
}
