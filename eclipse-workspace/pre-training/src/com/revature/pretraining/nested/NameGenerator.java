package com.revature.pretraining.nested;

public class NameGenerator {
	public static void main(String args[]) {
		String[] firstNames = {"Adam","Alexis","Dennis","Jose","Jessica"};
		String[] lastNames = {"Smith","Thompson","Perez","Snow","Tran"};
		
		for(int firstNameIndex=0; firstNameIndex<firstNames.length; firstNameIndex++) {
			String currentFirstName= firstNames[firstNameIndex];
			
			for(int lastNameIndex = 0; lastNameIndex<lastNames.length; lastNameIndex++) {
				String currentLastName= lastNames[lastNameIndex];
				System.out.println(currentFirstName+" "+currentLastName);
				}
		}
	}
}

