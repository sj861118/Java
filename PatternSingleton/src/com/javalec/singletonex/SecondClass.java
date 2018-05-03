package com.javalec.singletonex;

public class SecondClass {

	public SecondClass() {
		// TODO Auto-generated constructor stub
		SingletonClass singleton = SingletonClass.getSingletonClass();
		System.out.println("Second Class");
		System.out.println("i = " + singleton.getI());
	}
}
