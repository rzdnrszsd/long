package com.czy.strategy.pay;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Test
 * @date 2020-04-03 23:07
 **/
public class Test {
	public static void main(String[] args) {
		Order order = new Order("1","u32992332",3333);

		order.pay(PayStrategy.ALI_PAY);
	}
}
