package com.czy.strategy;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Test
 * @date 2020-04-03 22:38
 **/
public class Test {
	public static void main(String[] args) {
		PromotionActivity couponActivity = new PromotionActivity(new CouponStrategy());
		couponActivity.execute();

		PromotionActivity groupbuyActivity = new PromotionActivity(new GroupbuyStrategy());
		groupbuyActivity.execute();


		String key = "coupon";
		PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getStrategy(key));
		activity.execute();
	}
}
