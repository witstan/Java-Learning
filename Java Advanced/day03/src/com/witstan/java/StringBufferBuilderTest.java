package com.witstan.java;

import org.junit.Test;

/**
 *
 * StringBuffer和StringBuilder的使用
 *
 * @author witstan
 * @create 2022-12-28 22:09
 */
public class StringBufferBuilderTest {

    /*
    对比String/StringBuffer/StringBuilder三者效率

    从高到低：StringBuilder > StringBuffer > String
     */
    @Test
    public void test3(){
        //初始设置
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
        //开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }

    /*
    StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
    StringBuffer delete(int start,int end)：删除指定位置的内容
    StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
    StringBuffer insert(int offset, xxx)：在指定位置插入xxx
    StringBuffer reverse() ：把当前字符序列逆转

    public int indexOf(String str)
    public String substring(int start,int end)
    public int length()
    public char charAt(int n )
    public void setCharAt(int n ,char ch)

    总计：
    增：append(xxx)
    删：delete(int start, int end)
    改：setCharAt(int n, char ch) / StringBuffer replace(int start, int end, String str)
    查：charAt(int n)
    插：insert(int offset, xxx)
    长度：length()
    遍历：for() + charAt() / toString()


     */
    @Test
    public void test2(){

        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1);

//        s1.delete(2,4);
//        s1.replace(2,4,"hello");
//        s1.insert(2,false);
//        s1.reverse();
        String s2 = s1.substring(1,3);
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s2);


    }


    /*
    String/StringBuffer/StringBuilder三者异同？
    String：不可变的字符序列；底层使用char[]数组
    StringBuffer：可变的字符序列；线程安全的，效率低；底层使用char[]数组
    StringBuilder：可变的字符序列；JDK5.0新增，线程不安全的，效率高；底层使用char[]数组

    源码分析：
    String str = new String();//new char[0];
    String str1 = new String("abc");//new char[]{'a','b','c'};

    StringBuffer sb1 = new StringBuffer();//char[] value = new char[16];底层创建一个长度为16的char数组
    sb1.append('a');//value[0] = 'a';
    sb1.append('b');//value[1] = 'b';

    StringBuffer sb2 = new StringBuffer("abc");char[] value = new char["abc".length + 16];

    //问题1. System.out.println(sb2.length());//3
    //问题2. 扩容问题：如果要添加的数据底层数组装不下，就需要扩充底层的数组。
             默认情况下，扩容为原来的2倍+2，同时将原有数组复制到新的数组中。

             指导意义：开发中建议使用：StringBuffer(int capacity) 或 StringBuilder(int capacity)

     */
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length());//0
    }
}
