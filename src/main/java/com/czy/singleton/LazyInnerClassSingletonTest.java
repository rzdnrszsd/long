package com.czy.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yangyonglong
 * @version 1.0
 * @className LazyInnerClassSingletonTest
 * @date 2020-03-02 21:28
 **/
public class LazyInnerClassSingletonTest {
	public static void main(String[] args) throws Exception {
		Class<?> aClass = LazyInnerClassSingleton.class;
		Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(null);
		declaredConstructor.setAccessible(true);

		Object o = declaredConstructor.newInstance();
		Object o1 = declaredConstructor.newInstance();

		System.out.println(o==o1);
	}

}
