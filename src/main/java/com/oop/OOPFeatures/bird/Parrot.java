package com.oop.OOPFeatures.bird;

//QA.4
public class Parrot extends Bird {
	private String friend;

	public Parrot() {
	}

	public Parrot(String friend) {
		this.friend = friend;
	}

	/*
	 * QA.4.a,b,c => singing accordingly nearby friend
	 * 
	 * QA.4.d => to adding future nearby friends can be done by adding new case
	 */
	@Override
	public void sing() {
		switch (friend) {
		case "cat":
			System.out.print("Meow");
			break;
		case "dog":
			System.out.print("Woof, woof");
			break;
		case "rooster":
			System.out.print("Cock-a-doodle-doo");
			break;
		default:
			super.sing();
			break;
		}
	}

	@Override
	public String toString() {
		return "Parrot : can sing and fly";
	}	
}
