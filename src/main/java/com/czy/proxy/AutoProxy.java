package com.czy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 /**
 * @className Demo
 * @author yangyonglong
 * @date 2019-05-26 16:52
 * @version 1.0
 **/
public class AutoProxy implements InvocationHandler {


    private Object obj;

    public Object newProxyInstance(Object tar){
        this.obj = tar;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        System.out.println("动态代理执行前");
        object = method.invoke(obj,args);
        System.out.println("动态代理执行完成");
        return object;
    }
}
