package com.revature.pretraining.labs;

public class SomeClass {

	long serialNumber;
	
	public SomeClass() {
		this(10l);
		System.out.println("Inside default no-arg constructor.");
}
	
	public SomeClass(long serialNumbber) {
		this.serialNumber = serialNumber;
		System.out.println("Inside constructor with parameter");
		
	}
	
	public static void main(String[] args ) {
		SomeClass sc= new SomeClass();
		
	}
}