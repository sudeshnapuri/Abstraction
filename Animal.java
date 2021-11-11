package com.qa.qacommunity5;

public abstract class Animal {

	public abstract void animalNoise();
	
	public abstract void animalFood();
	
	public void eukaryotes() {
	 System.out.println("Animals are eukaryotes");
	}
	 
	public void internalDisgestion() {
		System.out.println("Animals have an internal digestion");
	}
}
