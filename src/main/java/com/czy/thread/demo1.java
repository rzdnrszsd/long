package com.czy.thread;


import java.util.Objects;

/**
 * 多线程测试demo
 *
 * @Author yangyonglong
 * @Date 2019-04-08
 * @Param
 * @return
 **/
public class demo1 {
    public static void main(String[] args) throws Exception {
        Error error = new Error();

        Objects.requireNonNull(args);
        String fdsa = "";


        Integer integer = new Integer(2);
        integer.doubleValue();

    }
    /* 测试方法
     * @author yangyonglong
     * @date 2019-05-26
     * @param
     * @return
     **/

    public void test(String name,String age){

        if(true){
            System.out.println("来吃饭");
        }else{
            System.out.println("原因：....");
        }

    }

}
