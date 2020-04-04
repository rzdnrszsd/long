package com.czy.strategy.pay;

/**
 * @author yangyonglong
 * @version 1.0
 * @className WeChatPay
 * @date 2020-04-03 22:56
 **/
public class WeChatPay extends Payment {
	@Override
	public String getName() {
		return "微信";
	}

	@Override
	public double queryBalance(String uid) {
		return 100;
	}
}
