package com.example.io.objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ReadFileDemo {

	public static void main(String[] args) {

		String path = "C:/files/employeeDetails.txt";

		InputStream inputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			inputStream = new FileInputStream(path);
			objectInputStream = new ObjectInputStream(inputStream);
			
			Employee employee = (Employee) objectInputStream.readObject();
			System.out.println(employee);
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			
			
			System.out.println("Finished File Reading!!!!!");

		} catch (IOException exception) {
			exception.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (objectInputStream != null) {
					objectInputStream.close();
				}
				if (inputStream != null) {
					inputStream.close();
				}
				System.out.println("Released file resource!!!!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
