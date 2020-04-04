package com.czy.strategy.pay;

/**
 * @author yangyonglong
 * @version 1.0
 * @className JDPay
 * @date 2020-04-03 22:56
 **/
public class JDPay extends Payment {
	@Override
	public String getName() {
		return "京东";
	}

	@Override
	public double queryBalance(String uid) {
		return 300;
	}
}
