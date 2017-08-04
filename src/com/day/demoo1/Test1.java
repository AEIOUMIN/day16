package com.day.demoo1;

public class Test1 {
	public static void main(String[] args) {
		String name1 = "aa";
		String name2 = "aa";
		String name3 = new String("aa");
		String name4 = new String("aa");
		System.out.println(name1.equals(name2)); //true
		System.out.println(name1==name2); //true
		System.out.println(name1==name3);//false
		System.out.println(name3==name4);//false
		System.out.println(name3.equals(name4));//true
	}
}
