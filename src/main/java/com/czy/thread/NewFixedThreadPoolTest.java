package com.czy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yangyonglong
 * @version 1.0
 * @className NewFixedThreadPoolTest
 * @date 2019-11-01 21:54
 **/
public class NewFixedThreadPoolTest {
	public static void main(String[] args) {
		/**
		 * 	创建一个指定工作线程数量的线程池，每当递交一个任务的时候就创建一个线程，当他们处于空闲的时候
		 * 也并不会被回收，除非线程被回收了，如果工作线程的数量达到线程池的最大数
		 * ，则将提交的任务将会被存入到缓存队列中
		 */
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 7; i++) {
			final int index = i;
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("时间是:" + System.currentTimeMillis() + "第" + index + "个线程" + Thread.currentThread().getName());

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}
