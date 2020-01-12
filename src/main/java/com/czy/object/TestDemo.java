package com.czy.object;

/**
 * @author yangyonglong
 * @version 1.0
 * @className TestDemo
 * @date 2020-01-12 13:09
 **/
public class TestDemo {
	public static void main(String[] args) {
		TestClass testClass = TestClass.builder()
				.age("18")
				.name("fsafs").build();
		testClass.sex="1";
		testClass.setSex("2");
		System.out.println(testClass);
	}
}
