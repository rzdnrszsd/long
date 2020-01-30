package com.czy.reflect;

import java.lang.reflect.Field;

/**
 * @author yangyonglong
 * @version 1.0
 * @className TestReflection
 * @date 2020-01-12 22:00
 **/
public class TestReflection {
	public static void main(String[] args) {
		Hero hero = new Hero();
//		hero.name="111";
		System.out.println(hero);

		try {
			Field name = hero.getClass().getDeclaredField("name");
			name.setAccessible(true);
			name.set(hero,"aaa");
			System.out.println(hero);

			Field[] declaredFields = hero.getClass().getDeclaredFields();
			for (Field declaredField : declaredFields) {
				System.out.println("类的属性名："+declaredField);
			}


		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
