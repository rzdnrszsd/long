package com.czy.interfac;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Hero
 * @date 2020-01-12 20:25
 **/
public class Hero {
	String name;

	public Hero(String name) {
		this.name = name;
		System.out.println("Hero的构造方法！");
	}

	public String getName(){
		return this.name;
	}
}
