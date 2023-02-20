package com.witstan.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author witstan
 * @create 2023-02-20 21:21
 */
public class Java9Test {

    //java9新特性十：Stream API的加强
    @Test
    public void test1(){
        List<Integer> list = Arrays.asList(23, 1, 44, 6, 3, 345, 7, 6);
        //takeWhile 返回从开头开始的按照指定规则的尽量多的元素
        list.stream().takeWhile(x -> x > 20).forEach(System.out::println);
        //dropWhile()：与takeWhile相反，返回剩余元素
        list.stream().dropWhile(x -> x < 20).forEach(System.out::println);
    }

    @Test
    public void tets2(){
        //of()参数种的多个元素，可以包含null值
        Stream<Integer> stream = Stream.of(1, 2, 4,null);
        stream.forEach(System.out::println);
        //of()参数不能存储单个null值，否则报异常（可以多个）
//        Stream<Integer> stream1 = Stream.of(null);
//        stream1.forEach(System.out::println);

        Integer i = 10;
        i = null;
        //ofNullable(): 形参变量是可以为null值的单个元素
        Stream<Object> stream2 = Stream.ofNullable(i);
        long count = stream2.count();
        System.out.println(count);


    }

    @Test
    public void test3(){

        Stream.iterate(0,x -> x + 1).limit(10).forEach(System.out::println);

        //java9中新增的重载的方法
        Stream.iterate(0, x -> x < 100, x -> x + 1).forEach(System.out::println);
    }

    //java9新特性十一：Optional提供了新的方法stream()
    @Test
    public void test4(){
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Tim");

        Optional<List<String>> optional = Optional.ofNullable(list);
        Stream<List<String>> stream = optional.stream();
        long count = stream.count();
        System.out.println(count);

        stream.flatMap(x -> x.stream()).forEach(System.out::println);

    }
}
