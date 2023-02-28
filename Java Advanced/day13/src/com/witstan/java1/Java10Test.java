package com.witstan.java1;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author witstan
 * @create 2023-02-21 17:16
 */
public class Java10Test {

    /*
    java10新特性一：局部变量的类型推断
     */
    @Test
    public void test1(){
        //声明变量时，根据所赋的值，推断变量的类型
        var num = 10;

        ArrayList<String> list = new ArrayList<>();
        var list1 = new ArrayList<>();
        list1.add(new Object());

        var list2 = new ArrayList<String>();
        list2.add("abc");

        //2.遍历操作
        for (var i : list2){
            System.out.println(i);
            System.out.println(i.getClass());
        }

        //3.普通的遍历操作
        for (var i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }

    @Test
    public void test2(){
        //1.局部变量不赋值，就不能实现类型推断
//        var num;

        //2.Lambda表达式中，左边的函数式接口不能声明为var
//        var sup = () -> Math.random();
        Supplier<Double> sup = () -> Math.random();

        //3.方法引用中，左边的函数式接口不能声明为var
//        var con = System.out::println;
        Consumer<String> con = System.out::println;

        //4.数组的静态初始化当中，
        int[] arr = new int[]{1,2,4,5};
        var arr1 = new int[]{1,2,4,5};
//        var arr2 = {1,2,4,5};



    }

    @Test
    public void test3(){

//        情况1：没有初始化的局部变量声明
//        var s = null;

//        情况6：catch块
//        try{
//
//        }catch (var e){
//            e.printStackTrace();
//        }
    }

//        情况2：方法的返回类型
//    public var method1(){
//        return 0;
//    }

//    情况3：方法的参数类型
//    public void method2(var num){
//
//    }

//    情况4：构造器的参数类型
//    public Java10Test(var i){
//
//    }

//    情况5：属性
//    var num = 10;

    @Test
    public void test4() throws IOException {
        var url = new URL("http://www.atguigu.com");
        var connection = url.openConnection();
        var reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
    }

    //java10新特性一：集合中新增的copyOf(), 用于创建一个只读的集合
    @Test
    public void test5(){
        //示例1：
        var list1 = List.of("Java", "Python", "C");
        var copy1 = List.copyOf(list1);
        System.out.println(list1 == copy1); // true

        //示例2：
        var list2 = new ArrayList<String>();
        list2.add("abc");
        var copy2 = List.copyOf(list2);
        System.out.println(list2 == copy2); // false

        //示例1和2代码基本一致，为什么一个为true,一个为false?
        //结论：copyOf(Xxx coll):如果参数coll本身就是一个只读集合，则copyOf()返回值即为当前coll
        //如果当前参数coll不是一个只读集合，则copyOf()返回一个新的集合，这个集合是只读的。
    }

}
