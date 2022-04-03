package com.revature.pretraining.labs;

public class ReverseOrder {

	public static void main(String [] args) {
		String[] cities= {"Atlanta", "Charlotte", "Dallas", "Los Angeles", "New York", "Orlando", "Philiadelphia", "Seattle"};
		
		for (int i = 0; i < cities.length/2; i++) {
			String city = cities[i];
			
			cities[i] = cities[cities.length-1 - i];
			cities[cities.length-1-i] = city;
		}
		for (int i = 0; i < cities.length; i++) {	
		System.out.println(cities[i]);
		}	
		
	}
}
