package com.czy.strategy.pay;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Payment
 * @date 2020-04-03 22:52
 **/
public abstract class Payment {

	// 支付类型
	public abstract String getName();

	// 查询余额
	public abstract double queryBalance(String uid);

	public void pay(String uid,double amout){
		if(queryBalance(uid) < amout){
			System.out.println("余额不足，支付失败");
			return;
		}

		System.out.println(getName()+":支付成功！");

	}

}
