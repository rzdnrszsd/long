package com.czy.object;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangyonglong
 * @version 1.0
 * @className TestClass
 * @date 2020-01-12 13:08
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestClass {
	String name;
	String age;
	String sex;
}
