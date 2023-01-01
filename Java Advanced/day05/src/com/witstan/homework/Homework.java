package com.witstan.homework;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * @author witstan
 * @create 2023-01-01 15:12
 */
public class Homework {

    //1.将字符串”2017-08-16”转换为对应的java.sql.Date类的对象。
    @Test
    public void q1() throws ParseException {
        //方式一：
        String s = "2017-08-16";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date date = new java.sql.Date(format.parse(s).getTime());

        System.out.println(date);

        //格式化
        Date date1 = new Date(date.getTime());
        String s1 = format.format(date1);

    }

    public static void main(String[] args) {
        Person[] arr = new Person[4];
        arr[0] = new Person("Tom",19);
        arr[1] = new Person("Jerry",18);
        arr[2] = new Person("Yerry",14);
        arr[3] = new Person("Herry",29);

        Comparator com = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person)o1;
                    Person p2 = (Person)o2;
                    return p2.getAge() - p1.getAge();
                }

                throw new RuntimeException("输入的数据不符");
            }
        };

//        Arrays.sort(arr);
        Arrays.sort(arr,com);

        System.out.println(Arrays.toString(arr));





    }

}

class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Object obj){
        if(obj instanceof Person){
            Person p = (Person)obj;
            return this.name.compareTo(p.name);
        }
        throw new RuntimeException("输入的数据类型不符");
    }
}

