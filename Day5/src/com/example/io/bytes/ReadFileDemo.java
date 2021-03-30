package com.example.io.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileDemo {

	public static void main(String[] args) {

		String path = "C:/files/holidays.txt";

		InputStream inputStream = null;
		try {
			// File will open in read mode
			inputStream = new FileInputStream(path);

			// Read data from file
			int asciiCode = inputStream.read();

			while (asciiCode > -1) {
				System.out.print((char) asciiCode);
				asciiCode = inputStream.read();
			}
			System.out.println("\nFinished File Reading!!!!!");

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			// After File reading is done, release the file resource
			try {
				if (inputStream != null) {
					inputStream.close();
					System.out.println("Released file resource!!!!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
