package com.czy.enumutil;

/**
 * @author yangyonglong
 * @version 1.0
 * @className HeroTypeTest
 * @date 2020-01-12 12:41
 **/
public class HeroTypeTest {
	public static void main(String[] args) {
		HeroType heroType = HeroType.TANK;
		HeroTyeEnum heroTypeEnum = HeroTyeEnum.HERO_TYE_ENUM;
		switch (heroType) {
			case PUSH:
				System.out.println("推挤");
				break;
			case TANK:
				System.out.println("坦克");
				break;
			default:
				System.out.println("没有这个英雄属性");
		}

		System.out.println(heroTypeEnum.getIndex());
	}
}
