package com.example.io.size;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteFileDemo {

	public static void main(String[] args) {

		String path = "C:/files/personalDetails.txt";

		OutputStream outputStream = null;
		DataOutputStream  dataOutputStream = null;
		
		try {
			outputStream = new FileOutputStream(path, true);
			dataOutputStream = new DataOutputStream(outputStream);

			int id = 100;
			String name = "Jaggu";
			int age = 20;
			double salary = 450000.00;
			
			dataOutputStream.writeInt(id);
			dataOutputStream.writeUTF(name);
			dataOutputStream.writeInt(age);
			dataOutputStream.writeDouble(salary);
			
			System.out.println("Finished File Writing!!!!!");

		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (dataOutputStream != null) {
					dataOutputStream.close();
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
