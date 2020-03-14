package com.czy.singleton;

/**
 * @author yangyonglong
 * @version 1.0
 * @className LazyInnerClassSingleton
 * @date 2020-03-02 21:14
 **/
public class LazyInnerClassSingleton {
	private LazyInnerClassSingleton(){
		// 如果没使用，就不会加载；如果加载了一次就要抛出异常
		if(LazyHolder.lazy!=null){
			throw new RuntimeException("不允许创建多个实例");
		}
	}

	public static LazyInnerClassSingleton getInstance() {

		return LazyHolder.lazy;
	}

	private static class LazyHolder{
		private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
	}

	private static class LazyHolder1{
		private static final LazyInnerClassSingleton lazydouble = new LazyInnerClassSingleton();
	}
}
