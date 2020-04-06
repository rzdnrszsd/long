package com.czy.observer;

import java.util.Observable;

/**
 * @author yangyonglong
 * @version 1.0
 * @className OtherGPer
 * @date 2020-04-06 00:11
 **/
public class OtherGPer extends Observable {


	public void notifyAllObServer(){
		setChanged();
		notifyObservers();
	}
}
