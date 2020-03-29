package com.czy.thread.lock;

import com.czy.thread.lock.AtomicTest;
import com.czy.thread.lock.LockTest;
import com.czy.thread.lock.SyncTest;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * https://www.cnblogs.com/nsw2018/p/5821738.html
 */
public class TestSyncMethods {

    public static void test(int round, int threadNum, CyclicBarrier cyclicBarrier){
        new SyncTest("Sync",round,threadNum,cyclicBarrier).testTime();
        new LockTest("Lock",round,threadNum,cyclicBarrier).testTime();
        new AtomicTest("Atom",round,threadNum,cyclicBarrier).testTime();
    }

    public static void main(String args[]){

        for(int i=0;i<5;i++){
            int round=100000*(i+1);
            int threadNum=5*(i+1);
            CyclicBarrier cb= new CyclicBarrier(threadNum*2+1);
            System.out.println("==========================");
            System.out.println("round:"+round+" thread:"+threadNum);
            test(round,threadNum,cb);

        }
    }

}
