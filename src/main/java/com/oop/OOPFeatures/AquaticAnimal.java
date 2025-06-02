package com.oop.OOPFeatures;

/*
 * QB.1
 * 
 * abstracting all functions related to aquatic animals 
 * 
 */
public abstract class AquaticAnimal extends Animal {
	
	public void swim() {
		System.out.print("I am swiming");
	}

	public void sing() {
		throw new UnsupportedOperationException();
	}

	public void walk() {
		throw new UnsupportedOperationException();
	}
}