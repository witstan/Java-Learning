package com.witstan.java1;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * lambda表达式的使用
 *
 * 1. 举例：(o1,o2) -> Integer.compare(o1,o2)
 * 2. 格式：
 *      -> : lambda操作符 或 箭头操作符
 *      ->左边：lambda的形参列表（其实就是接口中的抽象方法的形参列表）
 *      ->右边：lambda体（其实就是重写的抽象方法的方法体）
 *
 * 3. Lambda表达式的使用：分为6种情况
 *
 *      总结：
 *      ->左边：Lambda形参列表的参数类型可以省略（类型推断）；如何lambda形参列表只有一个参数，小括号可以省略
 *      ->右边：Lambda体使用一对{}包裹；如果Lambda体只有一条执行语句（可能是return语句），省略这一对{}和return
 *
 * 4. Lambda表达式的本质：作为函数式接口的实例
 *
 * 5. 如果一个接口种，只声明的一个抽象方法，则此接口称为函数式接口，我们可以在一个接口上使用 @FunctionalInterface 注解，
 * 这样做可以检查它是否是一个函数式接口。
 *
 * 6. 所以以前用匿名实现类表示的现在都可以用Lambda表达式来写。
 *
 *
 *
 *
 * @author witstan
 * @create 2023-02-11 15:52
 */
public class LambdaTest1 {

    //语法格式一：无参、无返回值
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("abc");
            }
        };

        r1.run();

        System.out.println("**********");

        Runnable r2 = () -> System.out.println("abcd");

        r2.run();
    }

    //语法格式二：Lambda需要一个参数、无返回值
    @Test
    public void test2(){
        Consumer<String> c1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        c1.accept("abc");

        System.out.println("**********");

        Consumer<String> c2 = (String s) -> {
            System.out.println(s);
        };

        c2.accept("123");
    }

    //语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
    @Test
    public void test3(){
        Consumer<String> c2 = (s) -> {
            System.out.println(s);
        };

        c2.accept("123");

    }

    @Test
    public void test4(){

        ArrayList<String> list = new ArrayList<>();//类型推断

        int[] arr = {1,2,3};//类型推断
    }

    //语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test5(){
        Consumer<String> c1 = (s) -> {
            System.out.println(s);
        };

        c1.accept("123");

        Consumer<String> c2 = s -> {
            System.out.println(s);
        };

        c2.accept("123");

    }

    //语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test6(){

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };

        int com = com1.compare(1, 2);
        System.out.println(com);


        System.out.println("**********");

        Comparator<Integer> comparator2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };

        int compare = comparator2.compare(12, 1);
        System.out.println(compare);

    }

    //语法格式六：当  Lambda 体只有一条语句时，return 与大括号若有，都可以省略
    @Test
    public void test7(){

        Comparator<Integer> comparator2 = (o1, o2) -> o1.compareTo(o2);

        int compare = comparator2.compare(12, 121);
        System.out.println(compare);
    }


    @Test
    public void test8(){
        Consumer<String> c1 = s -> {
            System.out.println(s);
        };

        c1.accept("123");

        System.out.println("*********");

        Consumer<String> c2 = s -> System.out.println(s);

        c2.accept("1234");
    }



}
