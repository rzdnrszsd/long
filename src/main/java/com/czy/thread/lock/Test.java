package com.czy.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Test
 * @date 2020-03-29 16:13
 **/
public class Test {

	private Lock lock = new ReentrantLock();


	public static void main(String[] args) {
		Test test = new Test();
		MyThread thread1 = new MyThread(test);
		MyThread thread2 = new MyThread(test);
		thread1.start();
		thread2.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.interrupt();
	}

	public void insert(Thread thread) throws InterruptedException {
		lock.lockInterruptibly();

		try {
			System.out.println(thread.getName()+"得到了锁");
			long startTime = System.currentTimeMillis();
			for(    ;     ;) {
				if(System.currentTimeMillis() - startTime >= Integer.MAX_VALUE){
					break;
				}
				//插入数据
			}
		}
		finally {
			System.out.println(Thread.currentThread().getName()+"执行finally");
			lock.unlock();
			System.out.println(thread.getName()+"释放了锁");
		}
	}
}
