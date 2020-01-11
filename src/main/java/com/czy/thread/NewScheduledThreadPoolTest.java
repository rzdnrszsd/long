package com.czy.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author yangyonglong
 * @version 1.0
 * @className NewScheduledThreadPoolTest
 * @date 2019-11-01 22:05
 **/
public class NewScheduledThreadPoolTest {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

		System.out.println("进入时间："+System.currentTimeMillis());


		// 延迟4秒执行
//		scheduledExecutorService.schedule(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 500; i++) {
//					System.out.println("第"+i+"个，执行当前时间："+System.currentTimeMillis());
//				}
//			}
//		},4, TimeUnit.SECONDS);


		// 延迟2秒 没3秒执行一次
		scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out.println("执行时间："+System.currentTimeMillis());
			}
		},2,3,TimeUnit.SECONDS);


	}
}
