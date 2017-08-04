package com.day.demoo1;

public class Dog extends Pet{
	private String breed ;

	public Dog(String name,String breed) {
		super(name);
		this.breed = breed;
	}
	public String getBreed() {
		return breed;
	}	
	public void print(){
		super.print();
		System.out.println("我是一只"+this.getBreed());
	}
	
	
}
