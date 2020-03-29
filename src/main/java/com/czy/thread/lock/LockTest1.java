package com.czy.thread.lock;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class LockTest1 {

    private Lock lock = new ReentrantLock();


    private void method(Thread thread) throws InterruptedException {

        // 1.使用完毕释放后其他线程才能获取锁
//        lock.lock();
//        try{
//            System.out.println("线程名"+thread.getName() + "获得了锁");
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("线程名"+thread.getName() + "释放了锁");
//            lock.unlock();
//        }



        // 2.尝试获取锁 tryLock() 它表示用来尝试获取锁，如果获取成功，则返回true，
        // 如果获取失败（即锁已被其他线程获取），则返回false
        if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
            try {
                System.out.println("线程名" + thread.getName() + "获得了锁");
                Thread.sleep(2000);//为看出执行效果，是线程此处休眠2秒
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
            @SneakyThrows
            @Override
            public void run() {
                lockTest.method(Thread.currentThread());
            }
        }, "t1");

        Thread thread2 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                lockTest.method(Thread.currentThread());
            }
        }, "t2");

        thread1.start();
        thread2.start();
    }
}
