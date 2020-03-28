package com.czy.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Demo
 * @date 2020-02-03 15:41
 **/
public class Demo {


	public static void main(String[] args) {
		User user  = new User();
		List<User> userList = new ArrayList<>();
		// List转Map
		Map<String, Integer> collect = userList.stream().collect(Collectors.toMap(User::getName, User::getAge));

		Map<String, User> collect1 = userList.stream().collect(Collectors.toMap(User::getName, v -> v));

		// List 转 List<XXX>
		List<String> collect2 = userList.stream().map(user1 -> {
			return user1.getName();
		}).collect(Collectors.toList());

		// 数组转List
		List<Long> collect3 = Arrays.stream(user.getName().split(",")).map(name->Long.parseLong(name)).collect(Collectors.toList());

		// 数据过滤
		List<User> collect4 = userList.stream().filter(u -> u.getAge() > 10).collect(Collectors.toList());




	}
}
