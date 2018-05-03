package com.javalec.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			
			is = new FileInputStream("D:\\GitHub\\Java\\FileIOEx\\a.txt");
			while(true) {
				int i = is.read();
				
				System.out.println("데이터 : " + i);
				if(i == -1) break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		OutputStream os = null;
		
		try {
			 os = new FileOutputStream("D:\\GitHub\\Java\\FileIOEx\\a.txt");
			String str = "오늘 날씨는 아주 좋습니다.";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			try {
				if(os!=null) {
					os.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		InputStream iss = null;
		DataInputStream dis = null;
		
		OutputStream oss = null;
		DataOutputStream dos = null;
		
		try {
			iss = new FileInputStream("D:\\GitHub\\Java\\FileIOEx\\a.txt");
			dis = new DataInputStream(iss);
			String str = dis.readUTF();
			System.out.println(str);
			oss = new FileOutputStream("D:\\GitHub\\Java\\FileIOEx\\a.txt");
			dos = new DataOutputStream(oss);
			dos.writeUTF(str);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} 
	}
}
