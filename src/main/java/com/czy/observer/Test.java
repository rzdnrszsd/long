package com.czy.observer;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Test
 * @date 2020-04-04 23:59
 **/
public class Test {

	public static void main(String[] args) {
		GPer gPer = GPer.getPer();
		Teacher tomTeacher = new Teacher("tom");
		Teacher micTeacher = new Teacher("mic");

		Captor captor = new Captor();
		Question question = new Question();
		question.setQuestionContent("请问观察者模式怎样运行?");
		question.setUserName("张三");

		gPer.addObserver(captor);
		gPer.addObserver(tomTeacher);
		gPer.addObserver(micTeacher);
		gPer.deleteObserver(captor);



//		OtherGPer otherGPer = new OtherGPer();
//		otherGPer.addObserver(captor);
//		otherGPer.addObserver(tomTeacher);
//		otherGPer.addObserver(micTeacher);
//		otherGPer.notifyAllObServer();

		gPer.publishQuestion(question);

	}
}
