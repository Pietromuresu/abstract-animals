package org.java.animals;

public class Cane extends Animal {

	public Cane(int legs, String name) {
			super(legs, name);
			// TODO Auto-generated constructor stub
		}

	@Override
	public void verso() {
		System.out.println("Fa - Bau Bau");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangia - Crocchette");
		
	}

}
