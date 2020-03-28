package com.czy.object;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Hero2
 * @date 2020-01-12 12:20
 **/
public class Hero2 {

	public String name = Hero2.getName("属性声明");

	public Hero2() {
		name = Hero2.getName("构造方法");
	}

	{
		name = Hero2.getName("初始化块");
	}

	public static String getName(String pos) {
		String result = "name " + pos;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		Hero2 hero2 = new Hero2();
		System.out.println(hero2.name);
	}

}
