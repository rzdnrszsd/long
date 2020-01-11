package com.czy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程数量不确定的线程池 可用线程的最大数量为Interger.MAX_VALUE
 * @author yangyonglong
 * @version 1.0
 * @className NewCachedThreadPoolTest
 * @date 2019-11-01 21:43
 **/
public class NewCachedThreadPoolTest {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();

		for (int i = 0; i < 7; i++) {
			final int index = i;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			executorService.execute(new Runnable() {
				@Override
				public void run() {
					// 执行第二个任务时候不会新建一个新的线程
					System.out.println("第"+index+"个线程，线程名为"+Thread.currentThread().getName());
				}
			});

		}

	}
}
