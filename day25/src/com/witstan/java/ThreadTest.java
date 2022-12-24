package com.witstan.java;

/**
 * 多线程的创建：方式一：继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类中的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()
 * <p>
 * 例子：遍历100以内的所有偶数
 *
 * @author witstan
 * @create 2022-12-24 23:21
 */

//1. 创建一个继承于Thread类的子类
class MyThread extends Thread {
//2. 重写Thread类中的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3. 创建Thread类的子类的对象
        MyThread t = new MyThread();

        //4. 通过此对象调用start()
        t.start();

        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i + "******");
            }
        }
    }
}
