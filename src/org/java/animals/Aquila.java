package org.java.animals;

import org.java.abs.Animal;
import org.java.interfaces.IVolante;

public class Aquila extends Animal implements IVolante{



	public Aquila(int legs, String name) {
		super(legs, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verso() {
		System.out.println("Fa - Ahh AHhh ");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangia - Topi");
		
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
		
	}

}
