package com.revature.pretraining.labs;

public class ExerciseOne {
	
public static void main(String[] args) {
		
		char letter = 'z';
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
'v', 'w', 'x', 'y', 'z'};
		//call methods here
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.findIndex(letter,  letters));
		}
	//create 1st method
public int findIndexBackwards(char target, char[] data) {
	if (data == null ) return -1;
	
	int result = -1;
	
	//loop through the data
	for (int i = data.length - 1; i > -1; i--) {
		
		char temp = data[i];
		
		//test current element against target
		if (temp == target) {
			return i;
		}
	}
	
	return result;
}
}
