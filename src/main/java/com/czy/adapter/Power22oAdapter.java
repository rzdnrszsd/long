package com.czy.adapter;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Power22oAdapter
 * @date 2020-04-04 22:56
 **/
public class Power22oAdapter  implements DC5{

	private AC220 ac220;

	public Power22oAdapter(AC220 ac220) {
		this.ac220 = ac220;
	}

	@Override
	public int outputDC5V() {
		int ac200 = ac220.output220();
		System.out.println("转换电压："+ac200/5+"V");
		return ac200/5;
	}
}
