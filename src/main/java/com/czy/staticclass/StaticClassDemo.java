package com.czy.staticclass;

/**
 * @author yangyonglong
 * @version 1.0
 * @className StaticClassDemo
 * @date 2020-03-15 16:30
 **/
public class StaticClassDemo {
	private String name = "parentName";

	public  class InnerClass {

		private String name = "innerName";
		private int age;
		public void print(){
			System.out.println("name:"+name);
			System.out.println("name:"+this.name);
			System.out.println("name:"+StaticClassDemo.this.name);
		}

	}

	public static void main(String[] args) {
		// 虽不小心见了血，换的以后有家回。
		StaticClassDemo staticClassDemo  = new StaticClassDemo();
		StaticClassDemo.InnerClass innerClass  = staticClassDemo.new InnerClass();
		innerClass.print();
	}
}
