package com.revature.pretraining.labs;

public class A {

	public static int staticCount = 0;
	
	public int instanceCount = 0;
	
	public A() {
		staticCount++;
		this.instanceCount++;
		
	}
	
	public static int getStaticCount() {
		return A.staticCount;
	}
	
	public static void setStaticCount(int staticCount) {
		A.staticCount=staticCount;
	}
	
	public int getInstanceCount() {
		return this.instanceCount;
	}
	
	public void setInstanceCount(int instanceCount) {
		this.instanceCount = instanceCount;
	}
}
