package com.czy.template.course;

/**
 * @author yangyonglong
 * @version 1.0
 * @className JavaCourse
 * @date 2020-04-04 21:55
 **/
public class JavaCourse extends NetworkSource {

	@Override
	protected void finishWork() {
		System.out.println("Java收尾");
	}

	@Override
	protected void checkHomeWork() {
		System.out.println("Java架构课件");
	}

	@Override
	protected boolean needHomeWork() {
		return false;
	}
}
