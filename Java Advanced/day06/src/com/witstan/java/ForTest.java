package com.witstan.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author witstan
 * @create 2023-01-03 17:37
 */
public class ForTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);


        //for(集合中元素的类型 局部变量 : 集合对象)
        //内部仍然调用迭代器
        for(Object obj : coll){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};
        //for(数组元素的类型 局部变量 : 数组对象)
        for(int i : arr){
            System.out.println(i);
        }
    }

    //练习题
    @Test
    public void test3(){

        String[] arr = new String[]{"aa","aa","aa"};

        //方式一：普通for赋值
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "bb";
//        }
        //方式二：增强for赋值
        for(String s : arr){
            s = "bb";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

}
