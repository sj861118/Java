package com.javalec.toy;

public class MainClass {

	public static void main(String[] args) {
		IToy pooh = new PoohToy();
		IToy mazinger = new MazingerToy();
		IToy airplain = new AirPlaneToy();
		
		IMissile airplain2 = new AirPlaneToy();
		airplain2.canMissile();
	}
}
