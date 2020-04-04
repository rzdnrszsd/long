package com.czy.proxy;

/**
 * @author yangyonglong
 * @version 1.0
 * @className Demo
 * @date 2019-05-26 16:52
 **/
public class Demo {
	public static void main(String[] args) {
		SubjectImpl subject = new SubjectImpl();
		HandProxy handProxy = new HandProxy(subject);
		handProxy.doSomething();

		// InvocationHandler实现类，里面有一个object对象，指向真正的实现类
		AutoProxy handler = new AutoProxy();
		// 代理类，是有Proxy生成的，根据这点代码，已知的是，它实现了被代理类的接口，而且它有个参数为InvocationHandler作为参数的构造函数
		Subject subject1 = (Subject) handler.newProxyInstance(new SubjectImpl());
		subject1.doSomething();


		SubjectImpl cgLibProxy = (SubjectImpl) new CGLibProxy().getInstance(SubjectImpl.class);
		cgLibProxy.doSomething();


	}

}
