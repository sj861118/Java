package com.javalec.toy;

public class AirPlaneToy implements IMissile, ILight{

	public AirPlaneToy() {
		// TODO Auto-generated constructor stub
		System.out.println("����� �Դϴ�");
		canLight();
		canMissile();
		System.out.println("=============================");
	}
	
	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("�Һ� �߻�");
		
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� �߻�");
	}

	
}
