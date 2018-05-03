package com.javalec.menu;

public class ChildMenu extends ParentMenu {
	public ChildMenu() {
		
	}
	
	public void makeBeefChungGukJang() {
		System.out.println("쇠고기 청국장");
	}
	
	public void makeHotDoenJangGuk() {
		System.out.println("얼큰 된장국");
	}
	
	public void makeKongNaMool() {
		System.out.println("콩나물국");
	}
	
	@Override
	public void makeChungGukJang() {
		// TODO Auto-generated method stub
		//super.makeChungGukJang();
		System.out.println("냄새없는 청국장");
	}

}
