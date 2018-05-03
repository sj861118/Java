package com.javalec.interfacephone;

public class APhone implements IFunction{

	@Override
	public void callSenderReceive() {
		// TODO Auto-generated method stub
		System.out.println("가능합니다.");
	}

	@Override
	public void canLTE() {
		// TODO Auto-generated method stub
		System.out.println("불가능합니다.");
		
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("불가능합니다.");
	}

}
