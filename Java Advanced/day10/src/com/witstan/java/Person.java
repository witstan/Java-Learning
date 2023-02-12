package com.witstan.java;

import java.io.Serializable;

/**
 * Person序列化需要满足以下要求
 * 1. 需要实现接口：Serializable
 * 2. 需要当前类提供一个全局常量：serialVersionUID
 * 3. 除了当前Person类需要实现Serializable接口之外，还必须保证其内部所有属性可序列化。
 * （默认情况下，基本数据类型可序列化）
 *
 * @author witstan
 * @create 2023-01-21 16:23
 */
public class Person implements Serializable{

    public static final long serialVersionUID = 476855744664L;

    private String name;
    private int age;
    private int id;
    private Account acct;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name, int age, int id, Account acct) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.acct = acct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", acct=" + acct +
                '}';
    }
}

class Account implements Serializable{

    public static final long serialVersionUID = 476865744664L;

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
