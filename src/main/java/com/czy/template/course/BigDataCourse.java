package com.czy.template.course;

/**
 * @author yangyonglong
 * @version 1.0
 * @className BigDataCourse
 * @date 2020-04-04 22:07
 **/
public class BigDataCourse extends NetworkSource {

	private boolean needHomeWorkFlag;

	public BigDataCourse(boolean needHomeWorkFlag) {
		this.needHomeWorkFlag = needHomeWorkFlag;
	}

	@Override
	protected void finishWork() {
		System.out.println("大数据收尾");
	}

	@Override
	protected void checkHomeWork() {
		System.out.println("bigdate checkHomeWork");
	}

	@Override
	protected boolean needHomeWork() {
		return this.needHomeWorkFlag;
	}

}
