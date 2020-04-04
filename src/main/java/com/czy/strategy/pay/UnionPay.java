package com.czy.strategy.pay;

/**
 * @author yangyonglong
 * @version 1.0
 * @className UnionPay
 * @date 2020-04-03 22:57
 **/
public class UnionPay extends Payment {
	@Override
	public String getName() {
		return "银联支付";
	}

	@Override
	public double queryBalance(String uid) {
		return 400;
	}
}
