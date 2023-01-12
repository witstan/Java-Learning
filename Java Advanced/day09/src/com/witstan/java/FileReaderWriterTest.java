package com.witstan.java;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 一、流的分类：
 * 1. 操作的数据单位：字节流、字符流
 * 2. 数据的流向：输入流、输出流
 * 3. 流的角色：节点流、处理流
 *
 * 二、 流的体系就够
 * 抽象基类          节点流                    缓冲流（处理流的一种）
 * InputStream      FileInputStream          BufferedInputStream
 * OutputStream     FileOutputStream         BufferedOutputStream
 * Reader           FileReader               BufferedReader
 * Reader           FileReader               BufferedWriter
 *
 *
 *
 * @author witstan
 * @create 2023-01-12 23:30
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前工程
        System.out.println(file.getAbsolutePath());

        File file1 = new File("day09\\hello.txt");
        System.out.println(file1.getAbsolutePath());
    }

    /*
    将day09下的hello.txt文件读入程序中，并输出倒控制台

    说明点：
    1. read(): 返回读入的一个字符，如果达到文件末尾，返回-1
    2. 异常的处理：为了保证流资源一定可以执行关闭操作，可以使用try-catch-finally
    3. 读入的文件一定要存在，否则会报FileNotFoundException

     */
    @Test
    public void testFileReader() {
        //1. 实例化File类的对象，指明要操作的文件
        FileReader fr = null;
        try {
            File file = new File("hello1.txt");//相较于当前Module

            //2. 提供具体的流
            fr = new FileReader(file);

            //3. 数据的读入
            //read(): 返回读入的一个字符，如果达到文件末尾，返回-1
            //方式一：
//        int data = fr.read();
//        while (data != -1){
//            System.out.print((char) data);
//            data = fr.read();
//        }

            //方式二：
            int data;
            while((data = fr.read()) != -1){
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流的关闭操作
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
