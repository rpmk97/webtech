package com.example.io.size;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileDemo {

	public static void main(String[] args) {

		String path = "C:/files/personalDetails.txt";

		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		try {
			inputStream = new FileInputStream(path);
			dataInputStream = new DataInputStream(inputStream);

			int a = dataInputStream.readInt();
			String b= dataInputStream.readUTF();
			int c  = dataInputStream.readInt();
			double d = dataInputStream.readDouble();
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			
			System.out.println("Finished File Writing!!!!!");

		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (dataInputStream != null) {
					dataInputStream.close();
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
