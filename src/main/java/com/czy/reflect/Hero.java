package com.czy.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Hero
 * @date 2020-01-12 22:00
 **/
@Data
@AllArgsConstructor
public class Hero {

	private String name;
	private String age;
	public float hp;
	public int damage;
	public int id;


	public Hero(){

	}
	public Hero(String string) {
		name =string;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + "]";
	}
	public boolean isDead() {
		// TODO Auto-generated method stub
		return false;
	}
	public void attackHero(Hero h2) {
		System.out.println(this.name+ " 正在攻击 " + h2.getName());
	}
}
