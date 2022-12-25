package com.witstan.java;

/**
 * 例子：创建3个窗口卖票，总票数为100张,使用实现Runnable接口的方式
 *
 * 存在线程安全问题，待解决
 *
 * @author witstan
 * @create 2022-12-25 17:29
 */

class Window1 implements Runnable{

    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }
        }

    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

        Thread t = new Thread(w);
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);

        t.setName("窗口一");
        t1.setName("窗口二");
        t2.setName("窗口三");

        t.start();
        t1.start();
        t2.start();

    }
}
