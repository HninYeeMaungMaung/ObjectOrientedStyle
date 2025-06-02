package com.oop.OOPFeatures.fly;

import com.oop.OOPFeatures.VolantAnimal;

/**
 * 
 * QD.1
 *
 */
public class Butterfly extends VolantAnimal {

	private String stage;

	public Butterfly() {}

	public Butterfly(String stage) {
		this.stage = stage;
	}

	@Override
	public void sing() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void fly() {
		switch (stage) {
		case "adult":
			super.fly(); break;
		case "immature":
			throw new UnsupportedOperationException();
		default : 
			super.fly(); break;
		}

	}
	
	@Override
	public String toString() {
		return "Butterfly : can fly";
	}	
}
