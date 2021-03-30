package com.example.table.info;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.example.util.ConnectionUtil;

public class Main {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
		
			connection = ConnectionUtil.open();
			System.out.println("Connected to DB!!");

			statement = connection.prepareStatement("SELECT * FROM COURSE_MASTER");

			resultSet = statement.executeQuery();
			
			ResultSetMetaData metaData = resultSet.getMetaData();
			
			System.out.println(metaData.getColumnCount());
			
			System.out.println(metaData.getColumnName(1));
			System.out.println(metaData.getColumnName(2));
			System.out.println(metaData.getColumnName(3));
			
			System.out.println(metaData.getColumnTypeName(1));
			System.out.println(metaData.getColumnTypeName(2));
			System.out.println(metaData.getColumnTypeName(3));
					
			System.out.println(metaData.getTableName(1));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
					System.out.println("Disconnected from DB!!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
