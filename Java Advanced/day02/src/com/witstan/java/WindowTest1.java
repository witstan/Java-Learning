package com.witstan.java;

/**
 * 例子：创建3个窗口卖票，总票数为100张,使用实现Runnable接口的方式
 *
 * 1.问题：卖票过程中，出现了重票、错票 -->出现了线程的安全问题
 * 2.问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程也参与操作车票。
 * 3.如何解决：当一个线程A在操作ticket的时候，其他线程不能参与，直到当线程A操作完成后，其他线程才
 *   才可以开始操作ticket。这种情况即使线程A出现了阻塞，也不能被改变。
 * 4.在Java中，通过同步机制，解决线程安全问题。
 *
 *  方式一：同步代码块
 *
 *   synchronized(同步监视器){
 *      //需要被同步的代码
 *   }
 *   说明：1.操作共享数据的代码，即为需要被同步的代码
 *        2.共享数据：多个数据共同操作的变量。比如：ticket就是共享数据。
 *        3.同步监视器，俗称：锁。任何一个类的对象，都可以充当锁
 *          要求：多个线程必须要共用同一把锁。
 *
 *  方式二：同步方法
 *
 * 5.同步的方式，解决了线程的安全问题。---好处
 *   操作同步代码时，只能有一个线程参与，其他线程等待。相当于时一个单线程的操作，效率低。 --- 局限性
 *
 *
 *
 * @author witstan
 * @create 2022-12-25 17:29
 */

class Window1 implements Runnable{

    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized(obj){
                if(ticket > 0){

//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                    System.out.println(Thread.currentThread().getName() + "，票号为：" + ticket);
                    ticket--;
                }else{
                    break;
                }
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

        t.setName("窗口1");
        t1.setName("窗口2");
        t2.setName("窗口3");

        t.start();
        t1.start();
        t2.start();

    }
}
