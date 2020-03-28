package com.czy.interfac;

/**
 * @author yangyonglong
 * @version 1.0
 * @className ADHero
 * @date 2020-01-12 20:26
 **/
public class ADHero extends Hero {

	public ADHero(String name) {
		super(name);

		System.out.println("父类的name值:"+super.getName());
		System.out.println("父类的name:"+super.name);
		System.out.println("AD Hero的构造方法");
	}

	public ADHero() {
		super(null);
	}

	public static void main(String[] args) {
		new ADHero("22");
	}
}
