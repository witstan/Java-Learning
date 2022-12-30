package com.witstan.java;

import org.junit.Test;

import java.time.*;
import java.util.Date;

/**
 * jdk 8中日期时间API测试
 * @author witstan
 * @create 2022-12-30 17:32
 */
public class JDK8DateTimeTest {

    @Test
    public void test(){
        //偏移量
        Date d1 = new Date(2020 - 1900,9 - 1,8);
        System.out.println(d1);//Tue Sep 08 00:00:00 CST 2020


    }

    /*
    LocalDate、LocalTime、LocalDateTime 类
    说明：1. LocalDateTime相较于LocalDate/LocalTime/LocalDateTime,使用频率更高
         2. 类似于Calendar
     */
    @Test
    public void test1(){
        //now()：获取当前的日期、时间、日期+时间
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(now);

        //0f()：设置指定的年月日时分秒没有偏移量
        LocalDateTime ldt = LocalDateTime.of(2020,10,20, 3,33,33);
        System.out.println(ldt);

        //getXxx()
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getMinute());
        System.out.println(now.getMonth());

        //体现不可变性
        LocalDate ld = date.withDayOfMonth(22);
        System.out.println(date);
        System.out.println(ld);

        LocalDateTime now1 = now.withHour(3);
        System.out.println(now);
        System.out.println(now1);


        //
        LocalDateTime now3 = now.plusMonths(2);
        System.out.println(now);
        System.out.println(now3);

        LocalDateTime now4 = now.minusDays(3);
        System.out.println(now);
        System.out.println(now4);


    }

   /*
    Instant的使用
    类似于 java.util.Date类
     */
    @Test
    public void test2(){
        //now()：获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2022-12-30T10:37:42.708Z

        //添加时间的偏移量
        OffsetDateTime time = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(time);//2022-12-30T18:39:12.646+08:00

        //获取对应的毫秒数（1970-1-1 00:00:00 UTC）开始
        long l = instant.toEpochMilli();
        System.out.println(l);

        //ofEpochMilli()：通过给定的毫秒数，获取Instant实例 --> Date(Long millis)
        Instant ins = Instant.ofEpochMilli(83293749273L);
        System.out.println(ins);
    }
}
