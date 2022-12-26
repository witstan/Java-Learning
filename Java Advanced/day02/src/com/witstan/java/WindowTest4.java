package com.witstan.java;

/**
 *
 * 使用同步方法处理继承Thread类的
 *
 * 关于同步方法的总结：
 * 1. 同步方法仍然涉及到同步监视器，只是不需要显式声明。
 * 2. 非静态的同步方法，同步监视器是：this
 *    静态的同步方法，同步监视器是：当前类本身（Xxxx.class）
 *
 * @author witstan
 * @create 2022-12-25 13:54
 */

class Window4 extends Thread{

    private static int ticket = 100;

    @Override
    public void run() {
        while(true){

            show();

        }
    }

    private static synchronized void show() {//同步监视器：Window4.class
        if(ticket > 0){
            System.out.println(Thread.currentThread().getName() + ": 卖票，票号为" + ticket);
            ticket--;
        }
    }
}


public class WindowTest4 {
    public static void main(String[] args) {
        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
}
