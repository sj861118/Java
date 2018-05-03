package com.javalec.thread;

public class ThreadTest3 implements Runnable{

	int testNum = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++)
		{
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("=====================");
				testNum++;
			}
			System.out.println("Thread NAme : " + Thread.currentThread().getName() + ", TestNum : " + testNum);
			try {
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}

}
