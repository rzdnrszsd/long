package com.util;

/**
 * 多线程测试demo2
 *
 * @author yangyonglong
 * @date 2019/4/01
 */
public class TestDemo2 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("print" + i);
                }
            }
        });


        String str = "";


        thread.start();


    }
}
