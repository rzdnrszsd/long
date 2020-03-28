package com.czy.singleton;

import java.io.Serializable;

/**
 * @author yangyonglong
 * @version 1.0
 * @className SeriableSingleton
 * @date 2020-03-02 21:38
 **/
public class SeriableSingleton implements Serializable {
	private static final SeriableSingleton INSTANCE = new SeriableSingleton();
	private SeriableSingleton(){}

	public static SeriableSingleton getINSTANCE() {
		return INSTANCE;
	}
	private Object readResolve(){
		return INSTANCE;
	}


}
