package com.javalec.robotex;

import com.javalec.robotex.inter.FlyNo;
import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.KnifeLazer;
import com.javalec.robotex.inter.MissileYes;

public class MainClass {

	public static void main(String[] args) {
		Robot superrobot = new SuperRobot();
		superrobot.setFly(new FlyYes());
		superrobot.setKnife(new KnifeLazer());
		superrobot.setMissile(new MissileYes());
		
		superrobot.shape();
		superrobot.actionFly();
		superrobot.actionKnife();
		superrobot.actionMissile();
		superrobot.actionWalk();
		superrobot.actionRun();
		
		superrobot.setFly(new FlyNo());
		superrobot.actionFly();
	}
}
