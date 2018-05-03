package com.javalec.lunch;

public class MainClass {

	public static void main(String[] args) {
		LunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.MILK, PriceTable.BANANA, PriceTable.ALMOND);
		LunchMenu child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.MILK, PriceTable.BANANA, PriceTable.ALMOND);
		
		System.out.println("child 1 : " + child1.calculating());
		System.out.println("child  2: " + child2.calculating());
	}
}
