package com.revature.pretraining.keywords;

public class Trumpet extends Instrument {

	@Override
	public void makeSound() {
		System.out.println("toot toot");
		
	}
	
	public static void main(String[] args) {
		Trumpet trumpet = new Trumpet();
		trumpet.makeSound();
	}
}
