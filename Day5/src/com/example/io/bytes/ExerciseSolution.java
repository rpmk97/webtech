package com.example.io.bytes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ExerciseSolution {

	public static void main(String[] args) {

		String path = "C:/files/personalDetails.txt";

		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(path,true);
			//String name = "Ritesh Tyagi";
			//char[] array = name.toCharArray();
			
			char[] array = {'R','i','t','e','s','h'};
			
			for(int idx = 0; idx < array.length; idx++) {
				int asciiCode = (int) array[idx];
				outputStream.write(asciiCode);
			}
		
			System.out.println("\nFinished File Writing!!!!!");

		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
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
