package com.example.io.chars;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ExerciseSolution {

	public static void main(String[] args) {

		String path = "C:/files/personalDetails.txt";

		OutputStream outputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		try {
			outputStream = new FileOutputStream(path, true);
			outputStreamWriter = new OutputStreamWriter(outputStream);

			String name = "Ritesh Tyagi\n";
			String address = "Dwarka, New Delhi\n";
			String phone = "9999030199\n";

			outputStreamWriter.write(name.toCharArray());
			outputStreamWriter.write(address.toCharArray());
			outputStreamWriter.write(phone.toCharArray());

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
