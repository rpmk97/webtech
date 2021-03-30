package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.util.ConnectionUtil;

//CRUD Demo
public class CourseDAO {
	
	public void deleteCourse() {

		Connection connection = null;
		PreparedStatement statement = null;

		try {

			connection = ConnectionUtil.open();
			System.out.println("Connected to DB!!");

			statement = connection.prepareStatement("DELETE FROM COURSE_MASTER WHERE ID=?");
			statement.setInt(1, 103);
			
			statement.executeUpdate();
			System.out.println("Course Deleted!!!!");
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

	
	public void updateCourse() {

		Connection connection = null;
		PreparedStatement statement = null;

		try {

			connection = ConnectionUtil.open();
			System.out.println("Connected to DB!!");

			statement = connection.prepareStatement("UPDATE COURSE_MASTER SET DURATION=? WHERE ID=?");
			statement.setInt(1, 55);
			statement.setInt(2, 100);
			
			statement.executeUpdate();
			System.out.println("Course Updated!!!!");
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


	public void readData() {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {

			connection = ConnectionUtil.open();
			System.out.println("Connected to DB!!");

			// Create a Statement to run SQL queries
			statement = connection.prepareStatement("SELECT * FROM COURSE_MASTER");

			// Execute SQL queries
			resultSet = statement.executeQuery();

			// Handle result set
			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1) + "\t");
				System.out.print(resultSet.getString(2) + "\t");
				System.out.print(resultSet.getInt(3) + "\t");
				System.out.println();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			// Close DB Connection and other resources
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

	// Using paramateric queries
	public void saveMoreData() {

		Connection connection = null;
		PreparedStatement statement = null;

		try {

			connection = ConnectionUtil.open();
			System.out.println("Connected to DB!!");

			// Create a Statement to run SQL queries
			// statement = connection.prepareStatement("INSERT INTO COURSE_MASTER
			// VALUES(102,'EJB',24)");
			statement = connection.prepareStatement("INSERT INTO COURSE_MASTER VALUES(?,?,?)");

			statement.setInt(1, 103);
			statement.setString(2, "Spring");
			statement.setInt(3, 80);

			// Execute SQL queries
			statement.executeUpdate();
			System.out.println("Data Saved Successfully!!");

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

	public void saveDynamicData() {

		Connection connection = null;
		Statement statement = null;

		try {
			connection = ConnectionUtil.open();
			System.out.println("Connected to DB!!");

			// Create a Statement to run SQL queries
			statement = connection.createStatement();

			int courseId = 101;
			String title = "Hibernate";
			int duration = 60; // Hours

			// Execute SQL queries
			statement.executeUpdate(
					"INSERT INTO COURSE_MASTER VALUES(" + courseId + ",'" + title + "'," + duration + ")");
			System.out.println("Data Saved Successfully!!");

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

	public void save() {

		Connection connection = null;
		Statement statement = null;

		try {
			connection = ConnectionUtil.open();
			System.out.println("Connected to DB!!");

			// Create a Statement to run SQL queries
			statement = connection.createStatement();

			// Execute SQL queries
			statement.executeUpdate("INSERT INTO COURSE_MASTER VALUES(100,'JSP',40)");
			System.out.println("Data Saved Successfully!!");

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
