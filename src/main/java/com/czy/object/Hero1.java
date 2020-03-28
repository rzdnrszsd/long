package com.czy.object;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Hero1
 * @date 2020-01-12 11:48
 **/
public class Hero1 {
	public String name = "";
	protected float hp;
	float maxHP;

	//物品栏的容量
	public static int itemCapacity=8; //声明的时候 初始化

	static{
		itemCapacity = 6;//静态初始化块 初始化
	}


	public Hero1(){
		itemCapacity = 76;
	}

	public static void main(String[] args) {
		System.out.println(Hero1.itemCapacity);
	}
}
