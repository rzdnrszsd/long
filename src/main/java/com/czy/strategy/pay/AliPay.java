package com.czy.strategy.pay;

/**
 * @author yangyonglong
 * @version 1.0
 * @className AliPay
 * @date 2020-04-03 22:55
 **/
public class AliPay extends Payment {
	@Override
	public String getName() {
		return "支付宝";
	}

	@Override
	public double queryBalance(String uid) {
		return 200;
	}
}
