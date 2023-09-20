package org.java.animals;

public abstract class Animal {
	
	 private int legs;
	 
	 public Animal(int legs ) {
		 setLegs(legs);
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello World";
	}
}
