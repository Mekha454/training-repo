package com.mike;

public class dogHouse {
	Dog d;
	
	public dogHouse() {
		d = new Dog();
		d.setName("ralph");
		
	}
	
	public String getOwner() {
		return d.getName();
		
	}
	
	public static void main(String[] args) {
		dogHouse house = new dogHouse();
		
		house.d.talk();
		System.out.println("THis house belongs to: " + house.getOwner());
	}
}
