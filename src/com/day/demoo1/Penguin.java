package com.day.demoo1;

public class Penguin extends Pet{
	static final String SEX_MALE="Q仔";
	static final String SEX_FLMALE="Q妹";
	private String sex;
	
	public Penguin(String name,String sex) {
		super(name);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void print(){
		super.print();
		System.out.println("我是一只"+this.getSex());
	}
}
