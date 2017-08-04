package com.day.demoo1;

public class Student {
	private int id;
	private String name;
	private int age;
	private double weight;

	public Student() {
		this.name = "无名氏";
		this.age = 18;
		this.weight = 0;
	}

	public Student(int id, String name, int age, double weight) {		
		this.id = id;
		this.name = name;
		if(age<18||age>30){
			System.out.println("******输入年龄为"+age+"该年龄不合法，将重置***");
			this.age=18;
		}
		this.age = age;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18||age>30){
			System.out.println("******输入年龄为"+age+"该年龄不合法，将重置***");
			return;
		}
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Student)){
			return false;
		}
		Student student = (Student)obj;
		if(this.id==student.id &&this.name.equals(student.name)){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		Student s1 =new  Student(1,"张三",18,40);
		Student s2 =new  Student(1,"张三",18,40);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}
	
}
