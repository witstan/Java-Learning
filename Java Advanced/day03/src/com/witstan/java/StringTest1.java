package com.witstan.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author witstan
 * @create 2022-12-28 15:46
 */
public class StringTest1 {

    /*
    String 与byte[]之间的转换
    String --> byte[]：调用String的getByte()

    编码：字符串 --> 字节 （ 看得懂--->看不懂的二进制数据）
    解码：编码的逆过程，字节--->字符串（看不懂的二进制数据--->看得懂）

    说明：解码时，要求解码使用的字符集必须与编码时使用的字符集一致，否则出现乱码
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String s1 = "abc123上海";
        byte[] b = s1.getBytes();//使用默认的字符集进行编码
        System.out.println(Arrays.toString(b));

        byte[] b1 = s1.getBytes("gbk");//使用gbk的字符集进行编码
        System.out.println(Arrays.toString(b1));

        String s2 = new String(b);
        System.out.println(s2);

        String s3 = new String(b1);
        System.out.println(s3);

        String s4 = new String(b1,"gbk");
        System.out.println(s4);


    }


    /*
    String 与 char[]之间的转换

    String --> char[]:调用String的toCharArray()
    char[] --> String:调用String的构造器
     */
    @Test
    public void test2(){
        String s1 = "acb1312";//题目：abc1123
        char[] charArray = s1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        char[] c1 = new char[]{'h','e','l','l','o'};
        String s2 = new String(c1);
        System.out.println(s2);
    }


    /*
    复习：
    String与基本数据类型、包装类之间的转换。

    String --> 基本数据类型、包装类：调用包装类的静态方法：parseXxx(str)

    基本数据类型、包装类 --> String：调用String 重载的valueOf(xxx)
     */
    @Test
    public void test1(){
        String s1 = "22";
        int num = Integer.parseInt(s1);

        String s2 = String.valueOf(num);
        String s3 = num + "";

        System.out.println(s1 == s3);
    }
}
