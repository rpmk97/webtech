package com.example.jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			// Load JDBC Driver
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			// Make a Connection
			connection = DriverManager.getConnection("jdbc:derby://localhost:4444/training");
			System.out.println("Connected to DB!!");
			
			// Create a Statement to run SQL queries

			// Execute SQL queries

			// Handle result set
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			// Close DB Connection and other resources
			try {
				if(connection != null) {
					connection.close();
					System.out.println("Disconnected from DB!!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
