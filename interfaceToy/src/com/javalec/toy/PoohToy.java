package com.javalec.toy;

public class PoohToy implements IMoveArmLeg{

	public PoohToy() {
		// TODO Auto-generated constructor stub
		System.out.println("������ �Դϴ�");
		canMoveArmLeg();
		System.out.println("=============================");
	}
	
	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("�ȴٸ��� ������");
	}

}
