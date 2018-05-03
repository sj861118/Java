package com.javalec.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("str0");
		hashSet.add("str1");
		hashSet.add("str2");
		hashSet.add("str3");
		hashSet.add("str2");
		System.out.println(hashSet.toString());
		
		hashSet.remove("str0");
		System.out.println(hashSet.toString());
		
		int i = hashSet.size();
		System.out.println("사이즈 : " + i);
		
		
		HashSet<Student> hashSet1 = new HashSet<Student>();
		hashSet1.add(new Student("홍길동",3));
		hashSet1.add(new Student("이순신",6));
		hashSet1.add(new Student("장보고",1));
		
		Student student = new Student("이순신", 6);
		hashSet1.remove(student);
		System.out.println(hashSet1.toString());
		
		Iterator<Student> iterator = hashSet1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
}
