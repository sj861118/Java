package com.javalec.network;

import java.net.InetAddress;
import java.util.Scanner;

public class inetAddressEx {
	Scanner scanner;
	
	public inetAddressEx() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Host �̸��� �Է��ϼ���.");
		
		scanner = new Scanner(System.in);
		
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
			
			System.out.println("Computer Name : " + inetAddress.getHostName());
			System.out.println("Computer IP : " + inetAddress.getHostAddress());
		}catch(Exception e) {
			
		}
		
	}
}
