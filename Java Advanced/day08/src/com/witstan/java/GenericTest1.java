package com.witstan.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 如何自定义泛型结构：泛型类、泛型接口、泛型方法。
 *
 * 1. 关于自定义泛型类、泛型接口
 *
 *
 * @author witstan
 * @create 2023-01-07 21:36
 */
public class GenericTest1 {
    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指明泛型类型，则认为泛型类型为Object
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指明泛型的类型。
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("abc");

        //建议：实例化时，指明类的泛型
        Order<String> order1 = new Order("orderAA",1001,"order:A");

        order1.setOrderT("order:BB");
    }

    @Test
    public void test2(){
        SubOrder subOrder = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型。则实例化子类对象时，不再需要指明泛型。
        subOrder.setOrderT(121);

        SubOrder1<String> order1 = new SubOrder1<>();
        order1.setOrderT("order2");
    }

    @Test
    public void test3(){

        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        //泛型不同的引用不能互相赋值
//        list1 = list2;

        Person p1 = null;
        Person p2 = null;
        p1 = p2;
    }

    @Test
    public void test4(){
        Order<String> o = new Order();
        Integer[] arr = new Integer[]{1,2,3};

        //泛型方法在调用时, 指明泛型参数的类型
        List<Integer> list = o.copyFromArrayToList(arr);
        System.out.println(list);
    }

}
