package com.witstan.java;

import org.junit.Test;

import java.util.Optional;

/**
 * @author witstan
 * @create 2023-02-19 17:40
 */
public class OptionalTest {

    @Test
    public void test1(){
        Optional<Object> op1 = Optional.empty();
        //empty():创建的Optional对象内部的value为null；
        if(!op1.isPresent()){//Optional封装的数据是否为空
            System.out.println("数据为空");
        }
        System.out.println(op1);
        System.out.println(op1.isPresent());
        //如果Optional封装的数据value为空，则get()报错，否则，value不为空时，返回value
//        System.out.println(op1.get());
    }

    @Test
    public void test2(){
        String s = "hello";
        s = null;
        //of(T t): 封装数据要求生成Optional对象。要求t非空，否则报错
        Optional<String> s1 = Optional.ofNullable(s);

        //get()通常与of()方法搭配使用，用于获取内部封装的数据value
        String s2 = s1.get();
        System.out.println(s2);
    }

    @Test
    public void test3(){
        String str = "abc";
        str = null;
        //ofNullable(T t):封装数据t赋给Optional内部的value。不要求t非空
        Optional<String> optional = Optional.ofNullable(str);
        //orElse(T t1):如果Optional内部的value非空，则返回此value值。如果value为空，则返回t1
        String s = optional.orElse("123");
        System.out.println(s);

    }
}
