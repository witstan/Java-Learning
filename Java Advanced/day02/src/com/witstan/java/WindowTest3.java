package com.witstan.java;

/**
 *
 * 使用同步方法解决实现Runnable接口的线程安全问题
 * @author witstan
 * @create 2022-12-26 16:16
 */

class Window3 implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            show();
        }

    }

    private synchronized void show(){//同步监视器：this
        if(ticket > 0){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "，票号为：" + ticket);
            ticket--;
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window1 w = new Window1();

        Thread t = new Thread(w);
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);

        t.setName("窗口1");
        t1.setName("窗口2");
        t2.setName("窗口3");

        t.start();
        t1.start();
        t2.start();

    }
}
