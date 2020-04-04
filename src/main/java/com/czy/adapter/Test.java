package com.czy.adapter;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Test
 * @date 2020-04-04 22:59
 **/
public class Test {

	public static void main(String[] args) {
		DC5 dc5 = new Power22oAdapter(new AC220());
		dc5.outputDC5V();

	}
}
