package com.example.tx;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.util.ConnectionUtil;

public class Main {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;

		try {

			connection = ConnectionUtil.open();
			System.out.println("Connected to DB!!");

			//Begin transaction
			connection.setAutoCommit(false);
			
			statement = connection.createStatement();
		
			statement.executeUpdate("INSERT INTO COURSE_MASTER VALUES(106,'ANGULAR',48)");
			statement.executeUpdate("INSERT INTO COURSE_MASTER VALUES(107,'REACT',20)");
			statement.executeUpdate("INSERT INTO COURSE_MASTER VALUES(108,'CORE JAVA',24)");
			statement.executeUpdate("UPDATE COURSE_MASTER SET DURATION='Hi' WHERE ID=100");
			statement.executeUpdate("DELETE FROM COURSE_MASTER WHERE ID=102");

			//Commit transaction
			connection.commit();
		
			System.out.println("Done!!!!!!!!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			//Rollback transaction
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {

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
