package com.javalec.timeMillis;

public class MainClass {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		String str = "A";
		
		long startNum = System.currentTimeMillis();
		
		for(int i = 0; i < 50000; i++) {
			str = str + "A";
		}
		
		long endNum = System.currentTimeMillis();
		
		System.out.println("경과시간" + (endNum - startNum));
	}
}
