package com.czy.singleton;

/**
 * @author yangyonglong
 * @version 1.0
 * @className GiantGragon
 * @date 2020-01-12 12:29
 **/
public class GiantGragon {

	/**
	 * 私有构造方法 不允许其他地方通过new实例
	 */
	private GiantGragon(){

	}

	private static GiantGragon giantGragon = new GiantGragon();

	public static GiantGragon getInatance(){
		return giantGragon;
	}
}
