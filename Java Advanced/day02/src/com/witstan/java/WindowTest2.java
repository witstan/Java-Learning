package com.witstan.java;

/**
 *
 * 例子：创建3个窗口卖票，总票数为100张,使用继承Thread类的方式
 *
 * 使用同步代码块解决继承Thread类的方式的线程安全
 *
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器。
 *
 * @author witstan
 * @create 2022-12-25 13:54
 */

class Window2 extends Thread{

    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            //正确的
//            synchronized(obj){
            synchronized(Window2.class){
            //错误的方式：this代表着t1，t2，t3
            //synchronized(this){
                if(ticket > 0){
                    System.out.println(getName() + ": 卖票，票号为" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }

        }
    }
}



public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
}
