package com.oop.OOPFeatures.fish;

import com.oop.OOPFeatures.AquaticAnimal;

/**
 * QB.1
 * 
 * can be done abstract functions for specializations 
 * but keep it as normal class
 * since *TestAnimal(QE) class want to include Fish in *new object creation
 *
 */
public class Fish extends AquaticAnimal {

	@Override
	public String toString() {
		return "Fish : can swim";
	}	
}
