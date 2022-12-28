package com.witstan.java2;

/**
 * 线程通信的例子：使用两个线程打印 1-100。线程1, 线程2 交替打印
 *
 * 涉及到的三个方法：
 * wait():一旦执行此方法，当前线程进入阻塞状态，并释放同步监视器
 * notify():一旦执行此方法，就唤醒被wait的线程。如果有多个线程被wait，就唤醒优先级高的那个。
 * notifyAll():一旦执行此方法，就唤醒所有被wait的线程。
 *
 * 说明：
 * 1.wait()，notify()，notifyAll()三个方法必须使用在同步代码块或同步方法中。
 * 2.wait()，notify()，notifyAll()三个方法的调用者必须是同步代码块或同步方法中的同步监视器
 *   否则，会出现IllegalMonitorStateException异常
 * 3.wait()，notify()，notifyAll()三个方法是定义在java.lang.Object类中。
 *
 * 面试题：sleep() 和 wait()的异同？
 * 相同点：一旦执行方法，都可以使得当前线程进入阻塞状态
 * 不同点：① 两个方法声明的位置不一样：Thread类中声明sleep()，Object类中声明wait()
 *        ② 调用的范围不同：sleep()可以在任何需要的情况下调用，wait()必须使用在同步代码块或同步方法中
 *        ③ 是否释放同步监视器：如果两个方法都使用在同步代码块或同步方法中，sleep()不会释放锁，wait()会释放锁。
 *
 * @author witstan
 * @create 2022-12-26 22:15
 */

class Number implements Runnable{

    private int number = 1;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true){

            synchronized (obj) {

                obj.notify();

                if (number <= 100){
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //使得调用如下wait()的线程进入阻塞状态
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else{
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number n = new Number();

        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}