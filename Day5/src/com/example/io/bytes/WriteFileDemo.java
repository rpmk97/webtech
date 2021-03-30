package com.example.io.bytes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteFileDemo {

	public static void main(String[] args) {

		String path = "C:/files/cricket.txt";

		OutputStream outputStream = null;
		try {
			// File will open in write mode
			//outputStream = new FileOutputStream(path);

			// File will open in append mode
			outputStream = new FileOutputStream(path,true);

			// Write data to file
			int asciiCode = 90;
			outputStream.write(asciiCode);
		
			System.out.println("\nFinished File Writing!!!!!");

		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			// After File writing is done, release the file resource
			try {
				if (outputStream != null) {
					outputStream.close();
					System.out.println("Released file resource!!!!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
