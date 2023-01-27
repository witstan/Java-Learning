package com.witstan.java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 了解类的加载器
 * @author witstan
 * @create 2023-01-27 22:07
 */
public class ClassLoaderTest {

    @Test
    public void test1(){

        //对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        //调用系统类加载器的getParent(): 获取扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        //调用系统类加载器的getParent(): 无法获取引导类加载器
        //引导类加载器主要负责加载java的核心类库，无法加载自定义类。
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);


    }

    /*
    Properties: 用来读取配置文件。

     */
    @Test
    public void test2() throws IOException {

        Properties pros = new Properties();
        //此时的文件默认在当前的module下。
        //读取配置文件的方式一：
//        FileInputStream fis = new FileInputStream("jdbc.properties");
        FileInputStream fis = new FileInputStream("src\\jdbc1.properties");
        pros.load(fis);


        //读取配置文件的方式二：使用ClassLoader
        //配置文件默认识别为：当前module的src下
//        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
//        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
//        pros.load(is);

        String user = pros.getProperty("user");
        String pw = pros.getProperty("password");
        System.out.println("user = " + user + ", password = " + pw);


    }
}
