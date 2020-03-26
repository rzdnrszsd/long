package com.czy.singleton.enumsingleton;

import com.czy.singleton.SingletonEntity;

import java.io.*;

/**
 * @author yangyonglong
 * @version 1.0
 * @className EnumSingletonTest
 * @date 2020-03-15 20:01
 **/
public class EnumSingletonTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		EnumSingleton instance1 = null;
//		EnumSingleton instance2 = EnumSingleton.INSTANCE;
//		instance2.setData(new SingletonEntity());
//
//		FileOutputStream fileInputStream = new FileOutputStream("EnumSingleton.obj");
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream);
//		objectOutputStream.writeObject(instance2);
//		objectOutputStream.flush();
//		objectOutputStream.close();
//
//
//		FileInputStream fileInputStream1 = new FileInputStream("EnumSingleton.obj");
//		ObjectInputStream objectInputStream  = new ObjectInputStream(fileInputStream1);
//		instance1  = (EnumSingleton)objectInputStream.readObject();
//
//		System.out.println(instance1.getData());
//		System.out.println(instance2.getData());
//		System.out.println(instance1==instance2);

//		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		EnumSingleton.INSTANCE.setData(new SingletonEntity());
		System.out.println(EnumSingleton.INSTANCE.getData());

		System.out.println(EnumSingleton.INSTANCE.getData());
		if (1 == 2) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}

	}
}
