package com.javalec.network;

import java.net.InetAddress;
import java.util.Scanner;

public class inetAddressEx {
	Scanner scanner;
	
	public inetAddressEx() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Host 이름을 입력하세요.");
		
		scanner = new Scanner(System.in);
		
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
			
			System.out.println("Computer Name : " + inetAddress.getHostName());
			System.out.println("Computer IP : " + inetAddress.getHostAddress());
		}catch(Exception e) {
			
		}
		
	}
}
