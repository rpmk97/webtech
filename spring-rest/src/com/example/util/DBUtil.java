package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.exception.DBException;

public class DBUtil {

	static Connection connection = null;

	public static void open() throws DBException {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			connection = DriverManager.getConnection("jdbc:derby:C:/HSBC-DB/EMS");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DBException("Driver class not found!!");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("DB URL is not correct!!");
		}
	}
	
	public static Connection get() throws DBException {
		return connection;
	}
	
}
