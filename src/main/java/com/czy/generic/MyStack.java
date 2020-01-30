package com.czy.generic;


import com.czy.interfac.ADHero;
import com.czy.interfac.Hero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yangyonglong
 * @version 1.0
 * @className MyStack
 * @date 2020-01-29 23:00
 **/
public class MyStack<T> {
	LinkedList<T> values = new LinkedList<>();

	public void push(T t) {
		values.addLast(t);
	}

	public T pull() {
		return values.removeLast();
	}

	public T peek() {
		return values.getLast();
	}

	public static void main(String[] args) {
		MyStack<Hero> myStack = new MyStack<>();
		myStack.push(new Hero());

		MyStack<ADHero> adHeroMyStack = new MyStack<>();
		adHeroMyStack.push(new ADHero());

		// 如果只取出，不插入就用? extends XXX TODO
		List<ADHero> adHeroes = new ArrayList<>();
		List<? extends Hero> heroStack = adHeroes;
		Hero hero = heroStack.get(0);

		//如果只插入。不取出那就用? super XXX
		List<? super Hero> heroList = new ArrayList<>();
		heroList.add(new Hero());
		heroList.add(new ADHero());
		Object object = heroList.get(0);

		//如果🈶不插入，又不取出就用？
		List<?> anyList = new ArrayList<>();
		Object o = anyList.get(0);

		// 子类转父类是可以的
		ADHero adHero = new ADHero();
		Hero hero1 = new Hero();
		hero1 = adHero;

		//子类泛型转父类泛型就不能 因为有可能是APHero
		List<Hero> heroes = new ArrayList<>();
		List<ADHero> adHeroes1 = new ArrayList<>();
//		heroes = adHeroes1;
	}

}
