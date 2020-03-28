package com.czy.singleton;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author yangyonglong
 * @version 1.0
 * @className SeriableSingletonTest
 * @date 2020-03-02 21:39
 **/
public class SeriableSingletonTest {
	public static void main(String[] args) throws Exception {
		SeriableSingleton seriableSingleton = null;
		SeriableSingleton seriableSingleton1 = SeriableSingleton.getINSTANCE();


		FileOutputStream fileOutputStream  = new FileOutputStream("SeriableSingleton.obj");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

	}
}
