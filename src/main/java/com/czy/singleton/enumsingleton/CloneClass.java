package com.czy.singleton.enumsingleton;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yangyonglong
 * @version 1.0
 * @className CloneClass
 * @date 2020-04-03 14:06
 **/
@Setter
@Getter
public class CloneClass implements Cloneable {

	private int age;
	String name;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneClass cloneClass = new CloneClass();
		cloneClass.setAge(2);
		cloneClass.setName("yangyonglong");
		CloneClass clone = (CloneClass) cloneClass.clone();
		System.out.println(clone.getAge()+clone.getName());
	}
}
