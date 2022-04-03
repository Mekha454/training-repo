package com.mike;

public class classA {
	int id;
	
	public classA() {
		System.out.println("Inside the constructor.");
		id = 1;
}
	public classA(int inputId) {
		System.out.println("Inside the constructor. " + id);
		id = inputId;
	}
	
	
	public static void main(String[] args) {
		classA a = new classA();
		System.out.println("After instantiation." + a.id);
		
		classA a2 = new classA(4);
		System.out.println("After instantiation." + a2.id);
	}
		
}
