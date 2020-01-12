package com.czy.singleton;

/**
 * @author yangyonglong
 * @version 1.0
 * @className TestGiantGragon
 * @date 2020-01-12 12:31
 **/
public class TestGiantGragon {
	public static void main(String[] args) {
		GiantGragon giantGragon = GiantGragon.getInatance();
		GiantGragon giantGragon2 = GiantGragon.getInatance();
		GiantGragon giantGragon3 = GiantGragon.getInatance();
		GiantGragon giantGragon4 = GiantGragon.getInatance();
		System.out.println(giantGragon==giantGragon2);
		System.out.println(giantGragon3==giantGragon4);
	}
}
