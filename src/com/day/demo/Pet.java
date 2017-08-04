package com.day.demo;

public class Pet {
	private String name = "";
	private int health = 60;
	private int love = 0;
	
	public Pet(String name) {
		this.name = name;
	}

	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
	}

	public String getName() {
		return name;
	}

	public int getHealth() { 
		return health;
	}

	public int getLove() {
		return love;
	}	
	public void print() {
		System.out.println("我的名字是" + this.getName() + ",健康值是" + this.getHealth() + "和主人的亲密度是" + this.getLove());
	}
}
