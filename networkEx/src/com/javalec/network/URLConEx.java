package com.javalec.network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConEx {

	public URLConEx() {
		// TODO Auto-generated constructor stub
		
		String code = null;
		System.out.println("웹 주소를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String address = scanner.next();
		System.out.println(address);
		
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = new FileWriter("D:\\GitHub\\Java\\networkEx\\file.html",false);
			while((code = webData.readLine())!= null) {
				fw.write(code);
			}
			System.out.println("The End");
			fw.close();
			webData.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}








