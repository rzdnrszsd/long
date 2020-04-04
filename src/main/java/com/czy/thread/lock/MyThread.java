package com.czy.thread.lock;

/**
 * @author yangyonglong
 * @version 1.0
 * @className MyThread
 * @date 2020-03-29 16:13
 **/
public class MyThread extends Thread {

	private Test test = null;

	public MyThread(Test test){
		this.test = test;
	}

	@Override
	public void run() {
		try {
			test.insert(Thread.currentThread());
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+"被中断");
		}
	}
}
