package com.czy.enumutil;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yangyonglong
 * @date 2020/01/12
 */
@Getter
@AllArgsConstructor
public enum HeroTyeEnum {
	NAME(1,"yagyonglong"),
	HERO_TYE_ENUM(2,"yunxiadeyun");

	public int index;

	public String name;


}
