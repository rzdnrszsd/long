package com.czy.object;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Hero
 * @date 2020-01-11 23:45
 **/
public class Hero {

	String name; //姓名

	float hp; //血量

	float armor; //护甲

	int moveSpeed; //移动速度

	public Hero(){

	}

	public Hero(String name,float hp){
		this.name = name;
		this.hp = hp;
	}
	//复活
	public void revive(Hero h){
		h = new Hero("提莫",383);
	}
	public void attack(Hero... heroes){
		for (Hero hero : heroes) {
			
		}

	}

	//打印内存中的虚拟地址
	public void showAddressInMemory(){
		System.out.println("打印this看到的虚拟地址："+this);
	}
	public static void main(String[] args) {
		Hero teemo =  new Hero("提莫",383);

		//受到400伤害，挂了
		teemo.hp = teemo.hp - 400;

		teemo.revive(teemo);
		System.out.println(teemo.hp);
		// h3指向了h1 h4指向了h3  所以h1 h3 h4都是指向h1 同一个对象
		Hero hero1 = new Hero();
		Hero hero2 = new Hero();
		Hero hero3 = new Hero();
		Hero hero4 = null;
		hero3 = hero1;
		hero3 = hero4;
		System.out.println(hero1);
		hero1.showAddressInMemory();
		System.out.println(hero2);
		System.out.println(hero3);
		System.out.println(hero4);


		Hero hero = new Hero();
		System.out.println(hero);
		hero = new Hero();
		System.out.println(hero);

		Integer integer = new Integer(1);
		Integer integer1 = new Integer(1);

		System.out.println(integer);
		System.out.println(integer1);


	}
}
