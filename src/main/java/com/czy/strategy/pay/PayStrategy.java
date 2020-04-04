package com.czy.strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangyonglong
 * @version 1.0
 * @className PayStrategy
 * @date 2020-04-03 22:57
 **/
public class PayStrategy {

	public static final String ALI_PAY = "alipay";
	public static final String WECHAT_PAY = "wechatpay";
	public static final String UNION_PAY = "unionpay";
	public static final String JD_PAY = "jdpay";
	public static final String DEFUALT = UNION_PAY;


	private static Map<String,Payment> paymentMap = new HashMap<>();

	static {
		paymentMap.put(ALI_PAY,new AliPay());
		paymentMap.put(WECHAT_PAY,new WeChatPay());
		paymentMap.put(UNION_PAY,new UnionPay());
		paymentMap.put(JD_PAY,new JDPay());
	}

	public static Payment getPay(String payKey){
		if(!paymentMap.containsKey(payKey)){
			return paymentMap.get(DEFUALT);
		}
		return paymentMap.get(payKey);

	}



}
