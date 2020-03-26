package com.czy.singleton.threadlocal;

/**
 * @author yangyonglong
 * @version 1.0
 * @className ThreadLocalSingleton
 * @date 2020-03-16 21:39
 **/
public class ThreadLocalSingleton {

	private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
		@Override
		protected ThreadLocalSingleton initialValue() {
			return new ThreadLocalSingleton();
		}
	};

	private ThreadLocalSingleton(){}

	private static  ThreadLocalSingleton getInstance(){
		return threadLocalInstance.get();
	}
}
