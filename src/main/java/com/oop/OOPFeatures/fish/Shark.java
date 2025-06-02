package com.oop.OOPFeatures.fish;

//QB.2
public class Shark extends Fish implements FishSpecialization{
	
	@Override
	public void getSize() {
		System.out.print("I am so big");
	}

	@Override
	public void getColor() {
		System.out.print("My color is grey");
	}

	@Override
	public void getHabit() {
		System.out.print("I like to eat other fish");
	}

	@Override
	public String toString() {
		return "Shark :  large and grey";
	}	
}