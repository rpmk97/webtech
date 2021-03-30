package com.example.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraphicsService {
	
	@Autowired
	FileWriter fileWriter;
	
	@Autowired
	List<String> colors;
	
	public void info() {
		try {
			fileWriter.write("====== Inside GraphicsService.info() ======\n");
			fileWriter.flush();
			System.out.printf("Available Colors  : %s%n", colors);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
