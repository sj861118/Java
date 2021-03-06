package com.javalec.list;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("str1");
		arrList.add("str2");
		arrList.add("str3");
		arrList.add("str4");
		
		System.out.println(arrList.toString());
		
		String index3 = arrList.get(3);
		System.out.println("index3 = " + index3);
		
		arrList.set(2, "str2222");
		System.out.println(arrList.toString());
		
		int size = arrList.size();
		System.out.println("size : " + size);
		
		arrList.remove(2);
		System.out.println(arrList.toString());
		
		arrList.clear();
		System.out.println(arrList.toString());
		
		arrList = null;
		System.out.println(arrList);
		System.out.println(arrList.size());
		
	}
}
