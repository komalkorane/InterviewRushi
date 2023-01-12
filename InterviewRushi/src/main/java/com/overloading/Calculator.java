package com.overloading;

public class Calculator {
	
	public static int add(int num1,int num2) {
		int res=num1+num2;
		return res;
		
	}
	public static int add(int num1,int num2,int num3) {
		int res=num1+num2+num3;
		return res;
		
	}
	public static int add(int num1,int num2,int num3,int num4) {
		int res=num1+num2+num3+num4;
		return res;
		
	}
	public static int add(int...i) {
		int res=0;
		
		for(int n: i)
			res=res+n;
		return res;
		
	}

}
