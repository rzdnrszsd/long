package com.czy.singleton;

/**
 * @author yangyonglong
 * @version 1.0
 * @className LazySingletonTest
 * @date 2020-03-02 20:28
 **/
public class LazySingletonTest {
	public static void main(String[] args) {
//		Thread thread = new Thread(new ExectorThread());
//		Thread thread1 = new Thread(new ExectorThread());
//		thread.start();
//		thread1.start();
		for (int i=0;i<7000;i++){
			Thread thread = new Thread(new ExectorThread());
			thread.start();
		}
		System.out.println("end");

	}
}
