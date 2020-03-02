package com.czy.hex;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.*;
import cn.hutool.cron.CronUtil;
import com.czy.stream.User;

/**
 * @author yangyonglong
 * @version 1.0
 * @className TestHex
 * @date 2020-02-05 15:05
 **/
public class TestHex {


	public void test1() {

		String s = "how2j.cn- java教程";
		int number = 12;
		long hash1 = HashUtil.additiveHash(s, Integer.MAX_VALUE);


		NumberUtil.decimalFormat("",11.1);
//		StrUtil.trim();


//		CronUtil.schedule("*/2 * * * * ", new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("....");
//			}
//		});

		Object object = new User();
		ReflectUtil.setFieldValue(object, "name", "盖伦");
		System.out.println(object.toString());

	}

	public static void main(String[] args) {
//		Object object = new User();
//		ReflectUtil.setFieldValue(object, "name", "盖伦");
//		System.out.println(object.toString());

		User user = new User();
		user.setAge(22);
		user.setName("3232");
		user.setFlag(true);

		User copyUser = new User();
		BeanUtil.copyProperties(user,copyUser,"name","age");

		System.out.println(copyUser.toString());


	}
}
