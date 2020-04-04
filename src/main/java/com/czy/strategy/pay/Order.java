package com.czy.strategy.pay;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Order
 * @date 2020-04-03 23:05
 **/
public class Order {
	private String uid;
	private String orderId;
	private double amout;

	public Order(String uid, String orderId, double amout) {
		this.uid = uid;
		this.orderId = orderId;
		this.amout = amout;
	}

	public void pay(String payKey){
		Payment payment = PayStrategy.getPay(payKey);
		payment.pay(uid,amout);
	}
}
