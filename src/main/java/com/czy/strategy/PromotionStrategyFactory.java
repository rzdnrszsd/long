package com.czy.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangyonglong
 * @version 1.0
 * @className PromotionStrategyFactory
 * @date 2020-04-03 22:41
 **/
public class PromotionStrategyFactory {
	private static Map<String,PromotionStrategy> promotionStrategyMap = new HashMap<>();

	static {
		promotionStrategyMap.put("coupon",new CouponStrategy());
		promotionStrategyMap.put("groupbuy",new GroupbuyStrategy());
		promotionStrategyMap.put("cashback",new GroupbuyStrategy());
	}

	private PromotionStrategyFactory(){}

	public  static PromotionStrategy getStrategy(String key){
		return promotionStrategyMap.get(key);
	}


}
