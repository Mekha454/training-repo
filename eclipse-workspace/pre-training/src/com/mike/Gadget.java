package com.mike;

public class Gadget {

	long serialNumber;
	
	public Gadget() {
		serialNumber = (long) (Math.random() * 10000000);
	}
}
