package com.czy.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yangyonglong
 * @version 1.0
 * @className CGLibProxy
 * @date 2020-04-03 14:55
 **/
public class CGLibProxy implements MethodInterceptor {

	public Object getInstance(Class<?> clazz){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// before

		return methodProxy.invokeSuper(o,objects);
		// after
	}
}
