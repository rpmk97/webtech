package com.example.service;

import java.util.ArrayList;
import java.util.List;

/**
 *  This UserRatingService utility class is having all the data and functionalities
 *   required to hold ratings given by each user as well having logic to calculate
 *   total feedbacks given so far and calculating average ratings of them.
 */
public class UserRatingService {

	private int userCount = 0;
	private List<Integer> ratings = new ArrayList<>();
	
	public UserRatingService() {
		System.out.println("===== UserRatingService initialized =====");
	}
	
	public void increaseUserCount() {
		System.out.println("===== Inside UserRatingService.increaseUserCount() =====");
		this.userCount++;
		System.out.println("===== Total Users : "+this.userCount+" =====");
	}
	
	public int readUserCount() {
		return this.userCount;
	}
	
	public void addRating(int rating) {
		System.out.println("===== Inside UserRatingService.addRating() =====");
		this.ratings.add(rating);
	}
	
	public double averageRating() {
		System.out.println("===== Inside UserRatingService.averageRating() =====");
		int total = 0;
		for(int rating : this.ratings){
			total = total + rating;
		}
		return (total/this.userCount);
	}
}
