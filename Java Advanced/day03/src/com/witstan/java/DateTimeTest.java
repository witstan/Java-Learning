package com.witstan.java;

import org.junit.Test;

import java.util.Date;

/**
 * JDK 8 之前的日期和时间API测试
 * @author witstan
 * @create 2022-12-28 23:07
 */
public class DateTimeTest {

    /*
    java.util.Date类
        |--java.sql.Date类

    1.两个构造器的使用

    2.两个方法的使用
        > toString()：显式当前的年月日时分秒
        > getTime()：获取当前Date对象对应的毫秒数。（时间戳）

    3. java.sql.Date对应着数据库中的日期类型的变量
        >如何实例化
        >java.util.Date---> java.sql.Date如何转？

     */
    @Test
    public void test2(){
        //构造器一：Date()：创建一个对应当前时间的Date对象
        Date d1 = new Date();
        System.out.println(d1.toString());//Wed Dec 28 23:17:28 CST 2022

        System.out.println(d1.getTime());//1672240648606

        //构造器二：创建指定毫秒数的Date对象
        Date d2 = new Date(322321312323l);
        System.out.println(d2);

        //创建java.sql.Date对象
        java.sql.Date d3 = new java.sql.Date(845982345394l);
        System.out.println(d3);//1996-10-22

        //如何将java.util.Date对象转换为java.sql.Date对象
        //情况一：
        Date d4 = new java.sql.Date(837529841891l);
        java.sql.Date d5 = (java.sql.Date) d4;
        //情况二：
        Date d6 = new Date();
        java.sql.Date d7 = new java.sql.Date(d6.getTime());


    }




    //1.System类中的currentTimeMillis()
    @Test
    public void test1(){
        Long time = System.currentTimeMillis();
        //返回1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
        //称为时间戳
        System.out.println(time);
    }
}
