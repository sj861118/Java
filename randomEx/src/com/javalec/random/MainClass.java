package com.javalec.random;

import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);
		
		Random random = new Random();
		int i = random.nextInt(100);
		System.out.println(i);
	}
}
