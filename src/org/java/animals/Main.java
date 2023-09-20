package org.java.animals;

public class Main {
	
	public static void main(String[] args) {
		
		Animal[] animali = new Animal[5];
		
		Cane cane1 = new Cane(2, "Bobbi");
		System.out.println(cane1);
		cane1.dormi();
		cane1.verso();
		cane1.mangia();
	}
}
