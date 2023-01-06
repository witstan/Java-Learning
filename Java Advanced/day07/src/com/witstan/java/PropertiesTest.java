package com.witstan.java;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author witstan
 * @create 2023-01-06 21:41
 */
public class PropertiesTest {

    //Properties:常用来处理配置文件。key和value都是String类型
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        FileInputStream f = new FileInputStream("jdbc.properties");
        p.load(f);//加载流对应的文件

        String name = p.getProperty("name");
        String password = p.getProperty("password");

        System.out.println( "name = " + name + ", password = " + password);

        f.close();
    }
}
