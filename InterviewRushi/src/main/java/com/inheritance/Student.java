package com.inheritance;

public class Student extends Person {

	private int roll;
	private String name;

	public Student() {
		super();
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student=: "+this.getAge()+" "+this.getWeight()+" "+this.getGender()+" "+this.getRoll()+" "+this.getName();
	}


}
