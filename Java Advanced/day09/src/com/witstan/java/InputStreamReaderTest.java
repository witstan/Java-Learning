package com.witstan.java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 处理流之二：转换流的使用
 * 1. 转换流：属于字符流
 *  InputStreamReader： 将一个字节的输入流转换为字符的输入流
 *  OutputStreamWriter：将一个字符的输出流转换为字节的输出流
 *
 * 2. 作用：提供字节流与字符流之间的转换
 *
 * 3. 解码：字节、字节数组 ---> 字符数组、字符串
 *    编码：字符数组、字符串 ---> 字节、字节数组
 *
 * 4. 字符集
 *
 *
 *
 * @author witstan
 * @create 2023-01-14 23:53
 */
public class InputStreamReaderTest {

    /*
    此处处理异常仍然应使用try-catch-finally
    InputStreamReader的使用，实现字节的输入流到字符的输入流的转换
     */
    @Test
    public void test1() throws IOException {

        FileInputStream fis = new FileInputStream("dbcp.txt");
//        InputStreamReader isr = new InputStreamReader(fis);//使用系统默认的字符集
        //参数2指明字符集：具体使用取决于文件保存时使用的字符集
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

        char[] cbuf = new char[20];
        int len;
        while ((len = isr.read(cbuf)) != -1){
            System.out.print(new String(cbuf, 0, len));
        }

        isr.close();



    }
}
