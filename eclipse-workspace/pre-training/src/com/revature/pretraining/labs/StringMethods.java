package com.revature.pretraining.labs;

public class StringMethods {
	public static void main(String[] args) {
		String str="Hello";
		String s= new String("Hello");
		
		System.out.println(str.equals(s));
		
		System.out.println(str.length());
		
		System.out.println(str.indexOf('H'));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.equalsIgnoreCase(s));
		
		System.out.println(str.substring(2));
		
	}
}
