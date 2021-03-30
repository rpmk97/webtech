package com.example.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;

		try {
			// Load JDBC Driver
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			// Make a Connection
			connection = DriverManager.getConnection("jdbc:derby://localhost:4444/training");
			System.out.println("Connected to DB!!");

			// Create a Statement to run SQL queries
			statement = connection.createStatement();

			// Execute SQL queries
			statement.executeUpdate("CREATE TABLE COURSE_MASTER(ID BIGINT PRIMARY KEY,TITLE VARCHAR(20),DURATION INT)");
			System.out.println("Table Created Successfully!!");

			// Handle result set
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			// Close DB Connection and other resources
			try {
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
