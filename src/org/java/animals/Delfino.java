package org.java.animals;

import org.java.abs.Animal;
import org.java.interfaces.INuotante;

public class Delfino extends Animal implements INuotante {


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

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
		
	}

}
