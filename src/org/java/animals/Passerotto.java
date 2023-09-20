package org.java.animals;

public class Passerotto extends Animal {

	public Passerotto(int legs, String name) {
		super(legs, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verso() {
		System.out.println("Fa - Cip Cip");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangia - Vermi");
		
	}

}
