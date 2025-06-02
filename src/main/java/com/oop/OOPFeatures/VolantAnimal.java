package com.oop.OOPFeatures;

/**
 * QD.1
 * 
 * abstracting same function of birds and flies
 *
 */
public abstract class VolantAnimal extends Animal {

	public void fly() {
		System.out.print("I am flying");
	}

	public void sing() {
		System.out.print("I am singing");		
	}
}

