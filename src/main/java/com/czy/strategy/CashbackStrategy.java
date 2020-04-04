package com.czy.strategy;

/**
 * @author yangyonglong
 * @version 1.0
 * @className CashbackStrategy
 * @date 2020-04-03 22:36
 **/
public class CashbackStrategy implements PromotionStrategy {
	@Override
	public void doPromotion() {
		System.out.println("返现促销，，，");
	}
}
