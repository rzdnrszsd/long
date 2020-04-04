package com.czy.strategy;

/**
 * @author yangyonglong
 * @version 1.0
 * @className PromotionActivity
 * @date 2020-04-03 22:37
 **/
public class PromotionActivity {

	private PromotionStrategy promotionStrategy;

	public PromotionActivity(PromotionStrategy promotionStrategy) {
		this.promotionStrategy = promotionStrategy;
	}

	public void execute() {
		promotionStrategy.doPromotion();
	}
}
