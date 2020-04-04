package com.czy.singleton.enumsingleton;

import com.czy.singleton.SingletonEntity;

/**
 *
 * @author yangyonglong
 * @date 2020/3/15
 */
public enum EnumSingleton {

	INSTANCE;

	private SingletonEntity data;

	public SingletonEntity getData(){
		return data;
	}

	public void setData(SingletonEntity data) {
		this.data = data;
	}

	 EnumSingleton(){
		data = new SingletonEntity();
	}

	public SingletonEntity getInstance(){
		return  data;
	}
}

