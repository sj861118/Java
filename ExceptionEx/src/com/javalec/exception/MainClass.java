package com.javalec.exception;

public class MainClass {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		System.out.println(i*j);
		try {
			System.out.println(i/j);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("무적권 실행");
		}
		System.out.println(i+j);
		System.out.println(i-j);
		
		ThrowsExClass throwsEx = new ThrowsExClass();
	}
}
