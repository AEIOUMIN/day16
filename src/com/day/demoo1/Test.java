package com.day.demoo1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入狗狗的名字：");
		String name = input.next();
		System.out.print("请输入狗狗的品种：");
		String breed = input.next();
		Dog dog =new Dog(name,breed);
		System.out.print("请输入企鹅的名字：");
		String name1 = input.next();
		System.out.print("请输入企鹅的性别：");
		String sex = input.next();
		Penguin pig =new Penguin(name1,sex);		
		dog.print();
		pig.print();
	}
}
