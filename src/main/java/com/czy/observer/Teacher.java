package com.czy.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Teacher
 * @date 2020-04-04 23:54
 **/

public class Teacher implements Observer {

	private String name;

	public Teacher(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
//		GPer gPer = (GPer)o;
//		Question question =(Question) arg; 
//		System.out.println("============================");
//		System.out.println(name+"你好!\n 你收到一个来自"+gPer.getName()+"的提问，" +
//				"希望你能回答，问题的内容是：\n"+question.getQuestionContent()+
//				"\n 提问者："+question.getUserName());
		System.out.println(name+":老师你好");

	}
}
