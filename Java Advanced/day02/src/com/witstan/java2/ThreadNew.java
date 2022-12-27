package com.witstan.java2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *
 * 创建线程的方式三：实现Callable接口 --- JDK5.0
 *
 * 如何理解实现Callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大？
 * 1. call()可以有返回值。
 * 2. call()可以抛出异常，被外层方法捕获，获取异常信息
 * 3. Callable是支持泛型的
 *
 * @author witstan
 * @create 2022-12-27 9:53
 */

//1.创建Callable的实现类
class  NumThread implements Callable{

    @Override
    //2.实现call方法，将此线程需要执行的操作声明在call()中
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                sum+=i;
            }
        }
        return sum;
    }
}


public class ThreadNew {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumThread numThread = new NumThread();
        //4.创建FutureTask对象，将Callable接口实现类的对象传入FutureTask构造器中
        FutureTask futureTask = new FutureTask(numThread);
        //5.创建Thread对象，将FutureTask的对象传入Thread构造器中，并调用start方法
        new Thread(futureTask).start();

        try {
            //6.获取Callable中call()的返回值
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call()方法的返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
