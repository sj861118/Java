package com.javalec.thread;

public class ThreadTestSync implements Runnable{

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThradTest");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}

}
