package com.czy.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class LockTest1 {

    private Lock lock = new ReentrantLock();


    private void method(Thread thread) {
//        lock.lock();
//        try{
//            System.out.println("线程名"+thread.getName() + "获得了锁");
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("线程名"+thread.getName() + "释放了锁");
//            lock.unlock();
//        }

        if (lock.tryLock()) {
            try {
                System.out.println("线程名" + thread.getName() + "获得了锁");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("线程名" + thread.getName() + "释放了锁");
                lock.unlock();
            }
        }else{
            System.out.println("我是" + Thread.currentThread().getName() + "有人占着锁。");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        final LockTest1 lockTest = new LockTest1();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lockTest.method(Thread.currentThread());
            }
        }, "t1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lockTest.method(Thread.currentThread());
            }
        }, "t2");

        thread1.start();
//        thread1.join();
        thread2.start();
    }
}
