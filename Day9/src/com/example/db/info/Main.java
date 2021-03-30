package com.example.db.info;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		Connection connection = null;
		ResultSet resultSet = null;

		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			connection = DriverManager.getConnection("jdbc:derby://localhost:4444/training");
			System.out.println("Connected to DB!!");

			DatabaseMetaData metaData = connection.getMetaData();

			System.out.println(metaData.getDatabaseProductName());
			System.out.println(metaData.getDatabaseProductVersion());
			System.out.println(metaData.getDriverName());

			
			resultSet = metaData.getTables("*", "APP", "*", null);
			while (resultSet.next()) {
				System.out.println(resultSet.getString(3));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
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
