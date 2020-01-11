package com.czy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yangyonglong
 * @version 1.0
 * @className NewSingleThreadPoolTest
 * @date 2019-11-01 22:45
 **/
public class NewSingleThreadPoolTest {
	public static void main(String[] args) {
		ExecutorService singleExecutorService = Executors.newSingleThreadExecutor();

		for (int i = 0; i < 7; i++) {
			final int number = i;
			singleExecutorService.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("现在的时间:" + System.currentTimeMillis() + "第" + number + "个线程");
				}
			});
		}
	}
}
