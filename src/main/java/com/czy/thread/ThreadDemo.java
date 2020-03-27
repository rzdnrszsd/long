package com.czy.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public  class ThreadDemo {

    public static void main(String[] args) {

         Thread thread =new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("222");
             }
         });
        ReadWriteLock readLock = new ReentrantReadWriteLock();
        readLock.readLock();
        Lock lock = readLock.readLock();
        lock.lock();
        lock.unlock();

    }

}
