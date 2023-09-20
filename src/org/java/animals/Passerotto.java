package org.java.animals;

import org.java.abs.Animal;
import org.java.interfaces.IVolante;

public class Passerotto extends Animal implements IVolante {

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

	@Override
	public void vola() {
		
		System.out.println("Sto nuotando!!!");
	}

}
