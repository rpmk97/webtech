package com.example.exercise;

public class ERikshaw extends Vehicle implements Brakable, Repairable {

	public void start() {
		System.out.println("ERikshaw started with button press!!!");
	}

	public void speedDown() {
		System.out.println("ERikshaw is slowing down!!!");
	}

	public void repair() {
		System.out.println("ERikshaw is being repaired!!!");
	}
}
