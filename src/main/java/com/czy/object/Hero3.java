package com.czy.object;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Hero3
 * @date 2020-01-12 15:01
 **/
public class Hero3 {
	String name; //姓名

	float hp; //血量

	float armor; //护甲

	int moveSpeed; //移动速度



	public Hero3(){
		System.out.println("Hero的无参的构造方法 ");
	}

	public Hero3(String name){
		System.out.println("Hero的有一个参数的构造方法 ");
		this.name = name;
	}

	public static void main(String[] args) {
		new Hero3();
	}
}
