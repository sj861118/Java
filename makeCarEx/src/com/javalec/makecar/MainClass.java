package com.javalec.makecar;

public class MainClass {

	public static void main(String[] args) {
		StarCar starCarLowGrade = new StarCarLowGrade(CarSpec.COLOR_BLUE, CarSpec.TIRE_NORMAL, CarSpec.DISPLACEMENT_2000, CarSpec.HANDLE_NORMAL);
		StarCar starCarHighGrade = new StarCarHighGrade(CarSpec.COLOR_RED, CarSpec.TIRE_WILD, CarSpec.DISPLACEMENT_2200, CarSpec.HANDLE_POWER);
		
		starCarLowGrade.getSpec();
		starCarHighGrade.getSpec();

	}
}
