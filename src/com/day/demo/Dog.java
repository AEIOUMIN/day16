package com.day.demo;

public class Dog extends Pet {
	private String clazz = "";

	public Dog(String name,int health,int love,String clazz) {
		super(name, health, love);
		this.clazz = clazz;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public void print() {
		super.print();
		System.out.println("我是一只" + this.getClazz());
	}

}
