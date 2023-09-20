package org.java.animals;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("\n ------------Cane-------------- ");
		Cane cane1 = new Cane(2, "Bobbi");
		System.out.println(cane1);
		cane1.dormi();
		cane1.verso();
		cane1.mangia();
		
		System.out.println("\n -----------Passerotto------------- ");
		Passerotto passerotto1 = new Passerotto(2, "Cip Ciop");
		System.out.println(passerotto1);
		passerotto1.dormi();
		passerotto1.verso();
		passerotto1.mangia();
		
		System.out.println("\n ------------Aquila------------- ");
		Aquila aquila1 = new Aquila(2, "Eagle");
		System.out.println(aquila1);
		aquila1.dormi();
		aquila1.verso();
		aquila1.mangia();
		
		System.out.println("\n -----------Delfino--------------- ");
		Delfino delfino1 = new Delfino(0, "SQL");
		System.out.println(delfino1);
		delfino1.dormi();
		delfino1.verso();
		delfino1.mangia();
		
		
		System.out.println("\n -------------Volano e Nuotano------------ ");
		Main.faiVolare(aquila1);
		Main.faiNuotare(delfino1);
	}
	
	
	public static void faiVolare(IVolante animale) {
		System.out.println(animale);
		animale.vola();
	}
	

	public static void faiNuotare(INuotante animale) {
		System.out.println("\n ------------------------- ");
		System.out.println(animale);
		animale.nuota();
	}
	
	
}
