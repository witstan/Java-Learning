package com.witstan.exer;

/**
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 *
 *
 * @author witstan
 * @create 2022-12-25 10:43
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        findEven fe = new findEven();
//        findOdd fo = new findOdd();
//        fe.start();
//        fo.start();

        //创建Thread类的匿名子类的方式
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if(i % 2 != 0){
                        System.out.println("Odd " + i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if(i % 2 == 0){
                        System.out.println("Even " + i);
                    }
                }
            }
        }.start();



    }
}

class findOdd extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println("Odd " + i);
            }
        }
    }
}

class findEven extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println("Even " + i);
            }
        }
    }
}
