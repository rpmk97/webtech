package com.example.io.chars;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriteFileDemo {

	public static void main(String[] args) {

		String path = "C:/files/cricket.txt";

		OutputStream outputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		try {
			outputStream = new FileOutputStream(path, true);
			outputStreamWriter = new OutputStreamWriter(outputStream);

			String name = "Cricket is a good business.\n";
			
			//outputStreamWriter.write(name.toCharArray());
			outputStreamWriter.write(name);
			
			
			System.out.println("Finished File Writing!!!!!");

		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (outputStreamWriter != null) {
					outputStreamWriter.close();
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
