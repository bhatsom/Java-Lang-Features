package com.somnath.apps.thread;

import java.util.Date;

public class MyTestThreadOne {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			try{
				System.out.println(new Date().toString() + "Child Thread - Start");
				Thread.sleep(2 * 1000);
				System.out.println(new Date().toString() + "Child Thread - Finish");
			} catch (Exception ex){
				System.out.println("Child Thread was interrupted");
			}

		});

		System.out.println(new Date().toString() + "Main Thread - Start");

		t1.sleep(10 * 1000); // this will make Main thread to sleep not t1

		t1.start();

		t1.sleep(10 * 1000); // this will also make Main thread to sleep not t1

		System.out.println(new Date().toString() + "Main Thread - Finish");

	}

}
