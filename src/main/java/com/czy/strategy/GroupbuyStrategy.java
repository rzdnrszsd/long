package com.czy.strategy;

/**
 * @author yangyonglong
 * @version 1.0
 * @className GroupbuyStrategy
 * @date 2020-04-03 22:36
 **/
public class GroupbuyStrategy  implements PromotionStrategy{
	@Override
	public void doPromotion() {
		System.out.println("拼团，满20人成团");
	}
}
