package com.witstan.java1;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 *
 * @author witstan
 * @create 2022-12-26 16:34
 */
public class BankTest {

}

class Bank{

    private Bank(){
    }

    private static Bank instance = null;

    public static Bank getInstance(){
        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if (instance == null){
//                instance = new Bank();
//                return instance;
//            }
//            return instance;
//        }

        //方式二：效率更高
        if (instance == null){
            synchronized (Bank.class) {
                if (instance == null){
                    instance = new Bank();
                    return instance;
                }

            }
        }
        return instance;
    }

    }
