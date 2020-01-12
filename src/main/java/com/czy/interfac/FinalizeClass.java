package com.czy.interfac;

/**
 * @author yangyonglong
 * @version 1.0
 * @className FinalizeClass
 * @date 2020-01-12 20:47
 **/
public class FinalizeClass {
	public String name;
	protected float hp;

	@Override
	public String toString(){
		return name;
	}

	@Override
	public void finalize(){
		System.out.println("这个英雄正在被回收");
	}

	public static void main(String[] args) {
		//只有一引用
		FinalizeClass h;
		for (int i = 0; i < 1000000; i++) {
			//不断生成新的对象
			//每创建一个对象，前一个对象，就没有引用指向了
			//那些对象，就满足垃圾回收的条件
			//当，垃圾堆积的比较多的时候，就会触发垃圾回收
			//一旦这个对象被回收，它的finalize()方法就会被调用
			h = new FinalizeClass();
		}

	}
}
