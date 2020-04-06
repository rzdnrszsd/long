package com.czy.observer;

import java.util.Observable;

/**
 * 观察者模式
 *
 * @author yangyonglong
 * @version 1.0
 * @className GPer
 * @date 2020-04-04 23:44
 **/
public class GPer extends Observable {
	private String name = "GP生态圈";
	private static GPer per = null;

	private GPer() {
	}

	public static GPer getPer() {
		if (null == per) {
			per = new GPer();
		}

		return per;
	}

	public String getName() {
		return name;
	}

	public void publishQuestion(Question question) {
		System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题");
		setChanged();
		notifyObservers(question);
	}

}
