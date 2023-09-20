package org.java.abs;

public abstract class Animal {
	
	 private int legs;
	 private String name;
	 
	 public Animal(int legs, String name ) {
		 setLegs(legs);
		 setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public abstract void verso();
	public abstract void mangia();
	
	public void dormi() {
		System.out.println("Zzz");
	}
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + getName() + "] \n " 
				+ "- N° zampe " + getLegs() + "\n";
		


	}
}
