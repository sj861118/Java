package com.javalec.interfacephone;

public class MainClass {

	public static void main(String[] args) {
		IFunction aPhone = new APhone();
		IFunction bPhone = new BPhone();
		IFunction cPhone = new CPhone();
		
		IFunction[] iFunctions = {aPhone, bPhone, cPhone};
		
		for(int i = 0; i < iFunctions.length; i++) {
			iFunctions[i].callSenderReceive();
			iFunctions[i].canLTE();
			iFunctions[i].tvRemoteController();
			System.out.println("=============================================");
		}
	}
}
