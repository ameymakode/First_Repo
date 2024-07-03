
package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.util.DButil;

public class UserDaoImp implements UserDao {

	@Override
	public boolean isValidUser(String username, String password) {
		String query = "SELECT * FROM info WHERE username =? AND password =?";

		try {
			Connection connection = DButil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);

			ResultSet resultset = preparedStatement.executeQuery();
			System.out.println("Query run ");
			return resultset.next();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override

	public boolean addUser(user us) {

		String query = "INSERT INTO info (username, email, password) VALUES (?, ?, ?)";

		
		try (Connection connection = DButil.getConnection();
				
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, us.getUsername());
			preparedStatement.setString(2, us.getEmail());
			preparedStatement.setString(3, us.getPassword());

			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Add ho rha hai");

			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}





