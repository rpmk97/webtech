package com.example.io.chars;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileEasyDemo {

	public static void main(String[] args) {

		String path = "C:/files/cricket.txt";

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(path, true);
			String name = "Cricket is a good business.\n";
			fileWriter.write(name);

			System.out.println("Finished File Writing!!!!!");

		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (fileWriter != null) {
					fileWriter.close();
				}
				System.out.println("Released file resource!!!!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
