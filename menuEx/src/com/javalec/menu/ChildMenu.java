package com.javalec.menu;

public class ChildMenu extends ParentMenu {
	public ChildMenu() {
		
	}
	
	public void makeBeefChungGukJang() {
		System.out.println("���� û����");
	}
	
	public void makeHotDoenJangGuk() {
		System.out.println("��ū ���屹");
	}
	
	public void makeKongNaMool() {
		System.out.println("�ᳪ����");
	}
	
	@Override
	public void makeChungGukJang() {
		// TODO Auto-generated method stub
		//super.makeChungGukJang();
		System.out.println("�������� û����");
	}

}
