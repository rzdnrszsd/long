package com.czy.template.course;

/**
 * @author yangyonglong
 * @version 1.0
 * @className NetworkSource
 * @date 2020-04-04 21:49
 **/
public abstract class NetworkSource {

	  final void createCourse() {
		// 发布预习资料
		this.prepare();
		// 制作PPT课件
		this.createPPT();
		// 在线直播
		this.inlineTeaching();
		// 做笔记
		this.postNote();
		// 布置作业
		if (needHomeWork()) {
			checkHomeWork();
		}
		
		this.finishWork();
	}

	protected abstract void finishWork();

	abstract void checkHomeWork();

	protected boolean needHomeWork() {
		return true;
	}

	final void postNote() {
		System.out.println("postNote");
	}

	final void inlineTeaching() {
		System.out.println("inlineTeaching");
	}

	final void createPPT() {
		System.out.println("createPPT");
	}

	final void prepare() {
		System.out.println("prepare");
	}


}
