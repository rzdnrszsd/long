package com.czy.template.course;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Test
 * @date 2020-04-04 22:24
 **/
public class Test {

	public static void main(String[] args) {
		NetworkSource javaCourse = new JavaCourse();
		javaCourse.createCourse();

		NetworkSource bigDataCourse = new BigDataCourse(false);
		bigDataCourse.createCourse();




	}
}
