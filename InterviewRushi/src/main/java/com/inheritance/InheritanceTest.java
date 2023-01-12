package com.inheritance;

import java.util.Scanner;

public class InheritanceTest {

	public static Student inheritance() {

		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter age :=");
		s1.setAge(sc.nextInt());
		System.out.println("Enter weight :=");
		s1.setWeight(sc.nextDouble());
		System.out.println("Enter Gender :=");
		
		s1.setGender(sc.next());
		System.out.println("Enter Roll :=");
		s1.setRoll(sc.nextInt());
		System.out.println("Enter Name :=");
		s1.setName(sc.next());

		return s1;
	}

}
