package com.javalec.stringex;

public class MainClass {

	public static void main(String[] args) {
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.substring(3));
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str1.charAt(3));
		System.out.println(str1.indexOf('c'));
		
		String str4 = "abcdefg";
		System.out.println(str1.equals(str4));
		
		String str5 = " abc def ghi";
		System.out.println(str5.trim());
		
		System.out.println(str1.replace('a', 'Z'));
		System.out.println(str1.replaceAll("abcd", "ZZZZZ"));
		System.out.println(str1);
		
		
		StringBuilder stringBuilder = new StringBuilder("abcdef");
		
		stringBuilder.append("ghijklm");
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3,  "AAA");
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3, 5);
		System.out.println(stringBuilder);
		
		stringBuilder.deleteCharAt(10);
		System.out.println(stringBuilder);
		
	}
}
