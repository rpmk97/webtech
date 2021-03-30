package com.example.io.chars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFileDemo {

	public static void main(String[] args) {

		String path = "C:/files/holidays.txt";

		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		try {
			inputStream = new FileInputStream(path);
			inputStreamReader = new InputStreamReader(inputStream);

			char[] array = new char[256]; //will be used as a buffer
			
			inputStreamReader.read(array);
			
			System.out.println(array);
			
			System.out.println("\nFinished File Reading!!!!!");

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (inputStreamReader != null) {
					inputStreamReader.close();
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
