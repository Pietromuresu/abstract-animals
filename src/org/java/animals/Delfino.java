package org.java.animals;

public class Delfino extends Animal {


	public Delfino(int legs, String name) {
		super(legs, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verso() {
		
		System.out.println("Fa - Tic Tic");
	}

	@Override
	public void mangia() {
		
		System.out.println("Mangia - Pesci");
	}

}
