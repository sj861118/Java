package com.javalec.toy;

public class MazingerToy implements IMissile, IMoveArmLeg{

	public MazingerToy() {
		// TODO Auto-generated constructor stub
		System.out.println("��¡�� �Դϴ�");
		canMoveArmLeg();
		canMissile();
		System.out.println("=============================");
	}
	
	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("�ȴٸ��� ������");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��Ϲ߻�");
	}

	
}
