package com.czy.singleton;

import cn.hutool.core.bean.BeanUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Test
 * @date 2020-03-02 20:24
 **/
public class Test {
	public static void main(String[] args) {

		HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();

		LazySingleton lazySingleton = LazySingleton.getInstance();
		Map map = new HashMap<>();

		map.put(null, null);
//		BeanUtil.copyProperties();

	}
}
