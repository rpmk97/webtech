package com.example.io.objects;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class WriteFileDemo {

	public static void main(String[] args) {

		String path = "C:/files/employeeDetails.txt";

		OutputStream outputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			outputStream = new FileOutputStream(path, true);
			objectOutputStream = new ObjectOutputStream(outputStream);
			
			Employee employee = new Employee(1, "Raju", 25, 780000.00, "Developer", "SW Support");

			objectOutputStream.writeObject(employee);
			
			System.out.println("Finished File Writing!!!!!");

		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (objectOutputStream != null) {
					objectOutputStream.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
				System.out.println("Released file resource!!!!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
