package com.javalec.toy;

public class MazingerToy implements IMissile, IMoveArmLeg{

	public MazingerToy() {
		// TODO Auto-generated constructor stub
		System.out.println("마징가 입니다");
		canMoveArmLeg();
		canMissile();
		System.out.println("=============================");
	}
	
	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔다리야 움직여");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일발사");
	}

	
}
