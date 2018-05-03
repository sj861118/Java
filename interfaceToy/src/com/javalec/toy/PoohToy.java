package com.javalec.toy;

public class PoohToy implements IMoveArmLeg{

	public PoohToy() {
		// TODO Auto-generated constructor stub
		System.out.println("곰돌이 입니다");
		canMoveArmLeg();
		System.out.println("=============================");
	}
	
	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔다리야 움직여");
	}

}
