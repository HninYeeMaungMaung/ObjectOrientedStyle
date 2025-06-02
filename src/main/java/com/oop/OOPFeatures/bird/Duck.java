package com.oop.OOPFeatures.bird;

//QA.2
public class Duck extends Bird {

	@Override
	public void sing() {
		System.out.print("Quack, quack");		
	}
	
	public void swim() {
		System.out.print("I am swiming");		
	}

	@Override
	public String toString() {
		return "Duck : can swim and sing";
	}	
}
