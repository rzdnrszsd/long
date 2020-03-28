package com.czy.interfac;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Mortal
 * @date 2020-01-12 21:19
 **/
public interface Mortal {
	public String name();

	default public void revive() {
		System.out.println("本英雄复活了");
	}
	default public String getName(){
		System.out.println("");
		return "";
	}

}
