package com.example._final;

public class Main {

	public static void main(String[] args) {

		Generator generator = new Generator();
		System.out.println(generator.title);
		// generator.title = "Unique Number Generator"; //Will not compile

		System.out.println(generator.generate());

		SequenceGenerator sequenceGenerator = new SequenceGenerator();
		System.out.println(sequenceGenerator.title);
		System.out.println(sequenceGenerator.generate());

	}

}
