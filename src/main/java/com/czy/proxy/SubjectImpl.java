package com.czy.proxy;

/**
 * @ClassName SubjectImpl
 * @Author yangyonglong
 * @Date 2019-05-26 16:49
 * @Version 1.0
 **/
public class SubjectImpl implements Subject {


    @Override
    public void doSomething() {
        System.out.println("实体类操作。。");
    }
}
