package com.czy.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Captor
 * @date 2020-04-05 15:08
 **/
public class Captor implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("校长");
//		GPer gPer = (GPer) o;
//		Question question = (Question) arg;
//		System.out.println("报告校长："+gPer.getName()+"回答了问题："+question.getQuestionContent());
	}
}
