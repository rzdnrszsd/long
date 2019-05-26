package com.czy.proxy;

/**
 * @ClassName HandProxy
 * @Author yangyonglong
 * @Date 2019-05-26 16:50
 * @Version 1.0
 **/
public class HandProxy implements Subject {

    Subject subject;

    public HandProxy(SubjectImpl subject) {
        this.subject = subject;
    }

    @Override
    public void doSomething() {
        System.out.println("代理类操作");
        subject.doSomething();
    }
}
