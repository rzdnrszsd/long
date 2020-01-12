package com.czy.reflect;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sun.tools.corba.se.idl.StringGen;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Demo
 * @date 2020-01-12 22:05
 **/
public class Demo {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setName("111");
		readObjectValue(hero);

		System.out.println(hero);

		Object o = JSON.toJSON(hero);
		String s = JSON.toJSONString(hero);
		System.out.println(s);
//			Field[] declaredFields = hero.getClass().getDeclaredFields();
//
//			Object type;
//			for (Field declaredField : declaredFields) {
//				AnnotatedType annotatedType = declaredField.getAnnotatedType();
//				type = declaredField.getType();
//				if(type instanceof java.lang.String){
//					System.out.println("String 类型");
//				}
//				System.out.println(type.toString());
//			}


	}

	public static void readObjectValue(Object obj) {
		Class class1 = obj.getClass();
		Field[] declaredFields = class1.getDeclaredFields();
		String methodName = "";
		Object o = null;
		for (Field declaredField : declaredFields) {
			declaredField.setAccessible(true);

			Object type = declaredField.getType();
//			if(!type.toString().equals("class java.lang.String")){
//				continue;
//			}
			methodName = declaredField.getName();

			try {
				o = declaredField.get(obj);
				if(o==null){
					continue;
				}
				if (o.equals("111")) {
					declaredField.set(obj, "222");
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

			System.out.println("name:" + methodName + "," + "value:" + o);
		}
	}
}
