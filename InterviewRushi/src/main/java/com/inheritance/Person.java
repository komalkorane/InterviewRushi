package com.inheritance;

public abstract class Person {
	
	static int age;
	static double weight;
	static String gender;
	public Person() {
		super();
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", weight=" + weight + ", gender=" + gender + "]";
	}
	
	
	

}
