package com.czy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 方式1：
 * 通过join方法去保证多线程执行的顺序，wait方法（Object）
 * join：让主线程等待子线程执行完毕之后才能继续执行
 * <p>
 * 方式2：
 * ExecutorService executorService = Executors.newSingleThreadExecutor();
 * 通过创建一个只有一个线程的线程池，加入需要执行的线程，FIFO 先进先出的
 *
 * @author yangyonglong
 */
public class ThreadOrderTest {

    // native 调用本地方法，为了兼容每个  Java Native Interface (JNI)标准就成为java平台的一部分，它允许Java代码和其他语言写的代码进行交互
    private final native int getAge();

    // volatile synchronized
    private static volatile  int index = 1;


    static Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread1");
            index = index*7;
        }
    });

    static Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread2");
            index = index*4;
        }
    });

    static Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread3");
            index = index*2;
        }
    });


    static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws InterruptedException {
//        thread1.start();
//        thread1.join();
//        thread2.start();
//        thread2.join();
//        thread3.start();
//        thread3.join();
        System.out.println(index);

        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);
        executorService.shutdown();
        System.out.println(index);
    }



}
