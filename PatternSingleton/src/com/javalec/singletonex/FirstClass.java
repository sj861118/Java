package com.javalec.singletonex;

public class FirstClass {

	public FirstClass() {
		// TODO Auto-generated constructor stub
		SingletonClass singleton = SingletonClass.getSingletonClass();
		System.out.println("First Class");
		System.out.println("i = " + singleton.getI());
		singleton.setI(200);
		System.out.println("i = " + singleton.getI());
		
	}
}
