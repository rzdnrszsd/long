package com.czy.singleton;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Test
 * @date 2020-03-02 20:24
 **/
public class Test {
	public static void main(String[] args) {

		HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();

		LazySingleton lazySingleton  = LazySingleton.getInstance();




	}
}
